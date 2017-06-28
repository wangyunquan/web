package com.buswe.core.domain;

import com.buswe.core.security.JPAUserDetails;
import com.buswe.module.core.entity.Userinfo;
import org.springframework.data.domain.Auditable;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Optional;

import static com.buswe.core.security.SecurityHelper.getCurrentUserDetails;


@MappedSuperclass
public abstract class AuditableEntity
  extends IdEntity
  implements Auditable<Userinfo,String,LocalDateTime>

{
  private static final long serialVersionUID = 5718183941573890588L;
  @ManyToOne(fetch=FetchType.LAZY)
  @JoinColumn(name="creat_user")
  private Userinfo createdBy;
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name="creat_date")
  private Date createdDate;
  @ManyToOne(fetch=FetchType.LAZY)
  @JoinColumn(name="last_modify_user")
  private Userinfo lastModifiedBy;
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name="last_modify_date")
  private Date lastModifiedDate;

    /**
     * Returns the user who created this entity.
     *
     * @return the createdBy
     */
   public Optional<Userinfo> getCreatedBy()
    {
        JPAUserDetails userDetails= (JPAUserDetails)getCurrentUserDetails();
        return Optional.of( userDetails.getUserinfo());
    }
public void setCreatedBy(Userinfo createdBy)
{
    this.createdBy=createdBy;
}

    /**
     * Returns the creation date of the entity.
     *
     * @return the createdDate
     */
  public   Optional<LocalDateTime> getCreatedDate()
  {
      if(createdDate==null)
      {
          return Optional.empty();
      }
      else
      {
          return Optional.of(LocalDateTime.now());
      }
  }

    /**
     * Sets the creation date of the entity.
     *
     * @param creationDate the creation date to set
     */
   public void setCreatedDate(LocalDateTime creationDate)
    {
  this.createdDate=new Date(createdDate.getTime());
    }

    /**
     * Returns the user who modified the entity lastly.
     *
     * @return the lastModifiedBy
     */
   public Optional<Userinfo> getLastModifiedBy()
   {
       return Optional.of(this.lastModifiedBy);
   }

    /**
     * Sets the user who modified the entity lastly.
     *
     * @param lastModifiedBy the last modifying entity to set
     */
   public void setLastModifiedBy(Userinfo lastModifiedBy)
    {
this.lastModifiedBy=lastModifiedBy;
    }

    /**
     * Returns the date of the last modification.
     *
     * @return the lastModifiedDate
     */
 public   Optional<LocalDateTime> getLastModifiedDate(){

     ZoneId zone = ZoneId.systemDefault();
       LocalDateTime localDateTime = LocalDateTime.ofInstant(this.lastModifiedDate.toInstant(), zone);
     return  Optional.of(LocalDateTime.from(localDateTime));

 }

    /**
     * Sets the date of the last modification.
     *
     * @param lastModifiedDate the date of the last modification to set
     */
    public void setLastModifiedDate(LocalDateTime lastModifiedDate)
    {
        ZoneId zone = ZoneId.systemDefault();
 Instant instant = lastModifiedDate.atZone(zone).toInstant();
Date date = Date.from(instant);
this.lastModifiedDate=date;
    }
}
