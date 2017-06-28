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
      <h1>内容管理<small>文章编辑</small> </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li><a href="#">内容管理</a></li>
        <li class="active">文章编辑</li>
      </ol>
    </section>
    <!-- Main content -->
    <section class="content">
    	       <form class="form-horizontal" enctype="multipart/form-data">
      <!-- Default box -->
    <div class="row">
    	
    	
        <div class="col-xs-6">
          <div class="box box-info">
            <div class="box-header with-border">
              <h3 class="box-title">概要信息</h3>
                   <div class="pull-right box-tools">
                <button type="button" class="btn  btn-sm" data-widget="collapse" data-toggle="tooltip" title="Collapse">
                  <i class="fa fa-minus"></i></button>
                <button type="button" class="btn  btn-sm" data-widget="remove" data-toggle="tooltip" title="Remove">
                  <i class="fa fa-times"></i></button>
              </div>
            </div>
            <!-- /.box-header -->     
              <div class="box-body">
                <div class="form-group">
                  <label for="title" class="col-sm-2 control-label">标题</label>
                  <div class="col-sm-10"><input type="text" class="form-control" id="title" placeholder="标题" name="title"></div>
                </div>
                <div class="form-group" >
                   <label for="title" class="col-sm-2 control-label"> 类别</label>
                   <div class="col-sm-10">
                  <select class="form-control">
                    <option>option 1</option>
                    <option>option 2</option>
                    <option>option 3</option>
                    <option>option 4</option>
                    <option>option 5</option>
                  </select>
                          </div>
                </div>
                
                <div class="form-group">
                      <label for="keyword" class="col-sm-2 control-label">关键字</label>
                  <div class="col-sm-10"><input type="text" class="form-control" id="keyword" placeholder="关键字" name="keyword"></div>
                </div>
                
            
                
                
                           <div class="form-group">
                           <label for="tag" class="col-sm-2 control-label">置顶</label>
                        <div class="col-sm-10">
                  <div class="radio">
                    <label>
                      <input type="radio" name="top" id="top1" value="false" checked>
                    不置顶
                    </label>
                  </div>
                  <div class="radio">
                    <label>
                      <input type="radio" name="top" id="top2" value="true">
                      置顶
                    </label> 
                  </div>
              </div>
                </div>
                
              </div>
              <!-- /.box-body -->
         
          
          </div>
          <!-- /.box -->
        </div>
        
        
        
         	
        <div class="col-xs-6">
          <div class="box box-info">
            <div class="box-header with-border">
              <h3 class="box-title">其它信息</h3>
                   <div class="pull-right box-tools">
                <button type="button" class="btn btn-info btn-sm" data-widget="collapse" data-toggle="tooltip" title="Collapse">
                  <i class="fa fa-minus"></i></button>
                <button type="button" class="btn btn-info btn-sm" data-widget="remove" data-toggle="tooltip" title="Remove">
                  <i class="fa fa-times"></i></button>
              </div>
            </div>
            <!-- /.box-header -->     
              <div class="box-body">
                <div class="form-group">
                  <label for="tag" class="col-sm-2 control-label">标签</label>
                  <div class="col-sm-10"><input type="text" class="form-control" id="tag" placeholder="标签" name="tag"></div>
                </div>
                <div class="form-group">
            <label for="title" class="col-sm-2 control-label">权重</label>
                       <div class="col-sm-10">
                  <select class="form-control" name="weight">
                    <option>option 1</option>
                    <option>option 2</option>
                    <option>option 3</option>
                    <option>option 4</option>
                    <option>option 5</option>
                  </select>
                    </div>
                </div>
                
                       <div class="form-group">
                      <label for="source" class="col-sm-2 control-label">来源</label>
                  <div class="col-sm-10"><input type="text" class="form-control" id="source" placeholder="来源" name="source"></div>
                </div>
         
                
                
                                    <div class="form-group">
                           <label for="tag" class="col-sm-2 control-label">评论</label>
                        <div class="col-sm-10">
                  <div class="radio">
                    <label>
                      <input type="radio" name="allowComment" id="top1" value="false" checked>
                   允许
                    </label>
                  </div>
                  <div class="radio">
                    <label>
                      <input type="radio" name="allowComment" id="top2" value="true">
                  不允许
                    </label>
                  </div>   
              </div>
                </div>
                
            
              </div>
              <!-- /.box-body -->
             
          
          </div>
          <!-- /.box -->
        </div>
        
        
        
        
      </div>
      <!-- /.box -->
      
       <div class="row">
        <div class="col-md-12">
        	
        	  </div>
        	    </div>
        	    
        	              <div class="box box-info">
            <div class="box-header">
              <h3 class="box-title">文章内容
                <small>内容编辑</small>
              </h3>
              <!-- tools box -->
              <div class="pull-right box-tools">
                <button type="button" class="btn btn-info btn-sm" data-widget="collapse" data-toggle="tooltip" title="Collapse">
                  <i class="fa fa-minus"></i></button>
                <button type="button" class="btn btn-info btn-sm" data-widget="remove" data-toggle="tooltip" title="Remove">
                  <i class="fa fa-times"></i></button>
              </div>
            </div>
            <!-- /.box-header -->
            <div class="box-body pad">
                    <textarea id="content" name="content" rows="10" cols="80">
                                            
                    </textarea>
            </div>
          </div>
          
       </form>
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
 <#include "incfoot.ftl"/>
</div>
<!-- ./wrapper -->
 <#include "incjs.ftl"/>
 <script type="text/javascript" charset="utf-8" src="/plugins/ueditor/ueditor.config.js"></script>
    <script type="text/javascript" charset="utf-8" src="/plugins/ueditor/ueditor.all.min.js"> </script>
    <!--建议手动加在语言，避免在ie下有时因为加载语言失败导致编辑器加载失败-->
    <!--这里加载的语言文件会覆盖你在配置项目里添加的语言类型，比如你在配置项目里配置的是英文，这里加载的中文，那最后就是中文-->
    <script type="text/javascript" charset="utf-8" src="/plugins/ueditor/lang/zh-cn/zh-cn.js"></script>
<script>
  $(function () {
  var ue = UE.getEditor('content');
  });
</script>
</body>
</html>
