package com.buswe;

import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import static com.buswe.Constants.ENV_DEVELOPMENT;
import static com.buswe.Constants.ENV_PRODUCTION;


/**
 * @author Raysmond<i@raysmond.com>.
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
  
    @Autowired
    private Environment env;

    public String getApplicationEnv(){
        return this.env.acceptsProfiles(ENV_PRODUCTION) ? ENV_PRODUCTION : ENV_DEVELOPMENT;
    }
    
  
 
    
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        StatViewServlet DruidStatView = new StatViewServlet();
        return new ServletRegistrationBean(DruidStatView,"/druid//*");
    }
    
//    @Bean
//    public FilterRegistrationBean siteMeshFilter() {
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//        filterRegistrationBean.setFilter(new ConfigurableSiteMeshFilter() {
//            protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
//                builder.addDecoratorPath("/*.jsp", "/sitemesh/layout.html");
//                builder.addExcludedPath("*login*");
//            }
//        });
//        filterRegistrationBean.setDispatcherTypes(EnumSet.allOf(DispatcherType.class));
//        return filterRegistrationBean;
//    }
    

//    @Bean
//    public FilterableHandlerMethodArgumentResolver filterableHandlerMethodArgumentResolver()
//    {
//    	return new FilterableHandlerMethodArgumentResolver();
//    }
    
    
}
