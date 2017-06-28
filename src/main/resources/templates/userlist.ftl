<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>buswe | Blank Page</title>
<#include "inchead.ftl"/>
</head>
<body class="hold-transition skin-blue sidebar-mini">
<!-- Site wrapper -->
<div class="wrapper">

<#include "inctopside.ftl"/>

  <!-- =============================================== -->

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        用户管理
        <small>系统用户管理</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li><a href="#">Examples</a></li>
        <li class="active">Blank page</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content">

      <!-- Default box -->
    <div class="row">
        <div class="col-xs-12">
          <div class="box box-primary">
            <div class="box-header">
              <h3 class="box-title">Responsive Hover Table</h3>

              
               <div class="box-tools pull-right">
      <button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
       <button class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button>
    </div><!-- /.box-tools -->
            </div>
            <!-- /.box-header -->
            <div class="box-body table-responsive no-padding">
            <form >
            <div class="input-group col-sm-4 " style="padding-left:10px;padding-bottom:5px;">
                  <input type="text" name="table_search" class="form-control" placeholder="用户名">
                  <div class="input-group-btn" style="padding-left:3px;">
                    <button type="submit" class="btn btn-default"><i class="fa fa-search"></i></button>
                  </div>
                <div class="input-group-btn" style="padding-left:10px;">
                    <button type="button" class="btn btn-default"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span>&nbsp;删除</button>
                  </div>
                      <div class="input-group-btn" style="padding-left:10px;">
                    <button type="button" class="btn btn-primary"> <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>&nbsp;新增</button>
                    
                  </div>
                </div>
                         <div class="input-group col-sm-8">
             
                          </div>
              
              <table class="table table-hover table-bordered">
                <tr>
                  <th></th>
                  <th>用户名</th>
                  <th>User</th>
                  <th>Date</th>
                  <th>Status</th>
                  <th>Reason</th>
                </tr>
                <#list page.content as item>
                <tr>
                   <td><input type="radio" name="id" class="minimal-red" value="${item.id}"/></td>
                  <td>${item.username}</td>
                  <td>John Doe</td>
                  <td>11-7-2014</td>
                  <td><span class="label label-success">Approved</span></td>
                  <td>Bacon ipsum dolor sit amet salami venison chicken flank fatback doner.</td>
                </tr>
             </#list>
              </table>
                </form>
            </div>
            <!-- /.box-body -->
          </div>
          <!-- /.box -->
        </div>
      </div>
      <!-- /.box -->

    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->

  <footer class="main-footer">
    <div class="pull-right hidden-xs">
      <b>Version</b> 2.3.6
    </div>
    <strong>Copyright &copy; 2014-2016 <a href="http://almsaeedstudio.com">Almsaeed Studio</a>.</strong> All rights
    reserved.
  </footer>

 <#include "incfoot.ftl"/>
</div>
<!-- ./wrapper -->

 <#include "incjs.ftl"/>
</body>
</html>
