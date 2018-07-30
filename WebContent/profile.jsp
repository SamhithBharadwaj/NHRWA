<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>NHRWA | Dashboard</title>
  
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <link rel="stylesheet" href="bower_components/bootstrap/dist/css/bootstrap.min.css">
  
  <link rel="stylesheet" href="bower_components/font-awesome/css/font-awesome.min.css">
 
  <link rel="stylesheet" href="bower_components/Ionicons/css/ionicons.min.css">
  
  <link rel="stylesheet" href="dist/css/AdminLTE.min.css">
  
  <link rel="stylesheet" href="dist/css/skins/skin-blue.min.css">

  <link rel="stylesheet"
        href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">
</head>

<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

  <!-- Main Header -->
  <header class="main-header">

    <!-- Logo -->
    <a href="#" class="logo">
      <!-- mini logo for sidebar mini 50x50 pixels -->
      <span class="logo-mini"><b>NHRWA</b></span>
      <!-- logo for regular state and mobile devices -->
      <span class="logo-lg"><b>NHRWA</b></span>
    </a>

    <!-- Header Navbar -->
    <nav class="navbar navbar-static-top" role="navigation">
      <!-- Sidebar toggle button-->
      <a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button">
        <span class="sr-only">Toggle navigation</span>
      </a>
      <!-- Navbar Right Menu -->
      <div class="navbar-custom-menu">
        <ul class="nav navbar-nav">
          <!-- Tasks Menu -->
          
          <!-- User Account Menu -->
          <li class="dropdown user user-menu">
            <!-- Menu Toggle Button -->
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <!-- The user image in the navbar-->
              <img src="dist/img/user2-160x160.jpg" class="user-image" alt="User Image">
              <!-- hidden-xs hides the username on small devices so only the image appears. -->
              <span class="hidden-xs">Abhinay Reddy</span>
            </a>
            <ul class="dropdown-menu">
              <!-- The user image in the menu -->
              <li class="user-header">
                <img src="dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">

                <p>
                  Abhinay Reddy - Web Developer
                  <small>Member since August 2015</small>
                </p>
              </li>
              <!-- Menu Footer-->
              <li class="user-footer">
                <div class="pull-left">
                  <a href="profile.php" class="btn btn-default btn-flat">Profile</a>
                </div>
                <div class="pull-right">
                  <a href="logout.php" class="btn btn-default btn-flat">Logout</a>
                </div>
              </li>
            </ul>
          </li>
          
        </ul>
      </div>
    </nav>
  </header>
  <!-- Left side column. contains the logo and sidebar -->
  <aside class="main-sidebar">

    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">

      <!-- Sidebar user panel (optional) -->
      <div class="user-panel">
        <div class="pull-left image">
          <img src="dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">
        </div>
        <div class="pull-left info">
          <p>Abhinay Reddy</p>
          <!-- Status -->
          <a href="#"> Web-Developer</a>
        </div>
      </div>

      <!-- Sidebar Menu -->
      <ul class="sidebar-menu" data-widget="tree">
        <li class="header">MAIN NAVIGATION</li>
        <!-- Optionally, you can add icons to the links -->
        <li class="active"><a href="dashboard.php"><i class="fa fa-dashboard"></i> <span>DASHBOARD</span></a></li>
        <li class="treeview">
          <a href="#"><i class="fa fa-edit"></i> <span>REGISTER/DEREGISTER</span>
            <span class="pull-right-container">
                <i class="fa fa-angle-left pull-right"></i>
              </span>
          </a>
          <ul class="treeview-menu">
              <li class="active"><a href="regDeregDrive.php"><i class="fa fa-briefcase"></i> <span>DRIVE REGISTRATION</span></a></li>
              <li class="active"><a href="regDeregEvent.php"><i class="fa fa-calendar-plus-o"></i> <span>EVENT REGISTRATION</span></a></li>        
          </ul>
        </li>
        <li><a href="companies.php"><i class="fa fa-bars"></i> <span>ALL COMPANIES</span></a></li>
        <li><a href="resume.php"><i class="fa fa-newspaper-o"></i> <span>RESUME</span></a></li>        
        <li class="header"></li>
        <li><a href="profile.php"><i class="fa fa-user"></i> <span>MY PROFILE</span></a></li>
        <li><a href="changePassword.php"><i class="fa fa-key"></i> <span>CHANGE PASSWORD</span></a></li>
        <li><a href="blog.php"><i class="fa fa-link"></i> <span>BLOG</span></a></li>
        <li><a href="logout.php"><i class="fa fa-sign-out"></i> <span>LOGOUT</span></a></li>        
      </ul>
      <!-- /.sidebar-menu -->
    </section>
    <!-- /.sidebar -->
  </aside>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li class="active">User Profile</li>
      </ol>
    </section>
    </br>

    <!-- Main content -->
    <section class="content">
    
    <div class="row">
        <div class="col-md-3">

          <!-- Profile Image -->
          <div class="box box-primary">
            <div class="box-body box-profile">
              <img class="profile-user-img img-responsive img-circle" src="dist/img/user2-160x160.jpg" alt="User profile picture">

              <h3 class="profile-username text-center">Abhinay Reddy</h3>

              <p class="text-muted text-center">Web Developer</p>
              <hr>
              <div class="box-body">
              <strong><i class="fa fa-book margin-r-5"></i> Education</strong>
              <p class="text-muted">
                B.E. in Information Science from the University Visvesvaraya College of Engineering
              </p>

              <strong><i class="fa fa-map-marker margin-r-5"></i> Location</strong>
              <p class="text-muted">Bangalore, India</p>

              <strong><i class="fa fa-pencil margin-r-5"></i> Skills</strong>
              <p>
                <span class="label label-danger">UI Design</span>
                <span class="label label-success">Coding</span>
                <span class="label label-info">Javascript</span>
                <span class="label label-warning">PHP</span>
                <span class="label label-primary">Node.js</span>
              </p>
            </div>

            </div>
            <!-- /.box-body -->
          </div>
          <!-- /.box -->
          
          </div>

          <div class="col-md-9">
          <div class="nav-tabs-custom">
            <ul class="nav nav-tabs">
              <li class="active"><a href="#pd" data-toggle="tab">Personal Details</a></li>
              <li><a href="#ed" data-toggle="tab">Education Details</a></li>
              <li><a href="#we" data-toggle="tab">Work Experience</a></li>
              <li><a href="#sk" data-toggle="tab">Skills</a></li>
              <li><a href="#od" data-toggle="tab">Other Details</a></li>
            </ul>
            <div class="tab-content">
              <div class="active tab-pane" id="pd">
              <form class="form-horizontal">
              <dl class="dl-horizontal">
                <dt>Full Name :</dt>
                <dd>Abhinay Kumar Reddy V</dd>
                <dt>First Name :</dt>
                <dd>Abhinay Kumar Reddy V</dd>
                <dt>Middle Name :</dt>
                <dd>Abhinay Kumar Reddy V</dd>
                <dt>Last Name :</dt>
                <dd>Abhinay Kumar Reddy V</dd>
                <dt>DOB :</dt>
                <dd>Abhinay Kumar Reddy V</dd>
                <dt>Current Address :</dt>
                <dd>Abhinay Kumar Reddy V</dd>
                <dt>Permanent Address :</dt>
                <dd>Abhinay Kumar Reddy V</dd>
                <dt>Email :</dt>
                <dd>Abhinay Kumar Reddy V</dd>
                <dt>Phone Number :</dt>
                <dd>Abhinay Kumar Reddy V</dd>
              </dl>                  
                  
                  <div class="form-group col-sm-20">
                  <div class="col-sm-offset-2 col-sm-10">
                  </br>     
                      <button type="submit" class="btn btn-danger">Submit</button>
                      <button type="submit" class="btn btn-success">Edit Details</button>                
                  </div>  
                  </div>
                </form>
              </div>
              <!-- /.tab-pane -->

              <div class="tab-pane" id="ed">
              <form class="form-horizontal">
              <dl class="dl-horizontal">
                <dt>10th % :</dt>
                <dt>10th YOP :</dt>
                <dt>School Name :</dt>
                <dt>12th % :</dt>
                <dt>12th YOP :</dt>
                <dt>College Name :</dt>
                <dt>UG % :</dt>
                <dt>UG YOP :</dt>
                <dt>College Name :</dt>
                <dt>PG % :</dt>
                <dt>PG YOP :</dt>
                <dt>College Name :</dt>
              </dl>

                <div class="form-group col-sm-20">
                <div class="col-sm-offset-2 col-sm-10">
                </br>  
                      <button type="submit" class="btn btn-danger">Submit</button>
                      <button type="submit" class="btn btn-success">Edit Details</button>                
                  </div>  
                </div>
              </form>
              </div>
              <!-- /.tab-pane -->
              
              <div class="tab-pane" id="we">
              <form class="form-horizontal">
              <dl class="dl-horizontal">
                <dt>Company 1</dt>
                <dt>10th YOP :</dt>
                <dt>Name :</dt>
                <dt>Designation :</dt>
                <dt>Duration :</dt>
                <dt>Job Description :</dt>
                                                
                <dt>Company 2</dt>
                <dt>10th YOP :</dt>
                <dt>Name :</dt>
                <dt>Designation :</dt>
                <dt>Duration :</dt>
                <dt>Job Description :</dt>
              </dl>

                <div class="form-group col-sm-20">
                  <div class="col-sm-offset-2 col-sm-10">
                  </br>
                      <button type="submit" class="btn btn-danger">Submit</button>
                      <button type="submit" class="btn btn-success">Edit Details</button>                
                  </div>  
                </div>
              </form>
              </div>
              
              <!-- /.tab-pane -->

              <div class="tab-pane" id="sk">
                <form class="form-horizontal">
                <div class="form-group">
                  <label for="inputName" class="col-sm-3 control-label">Technical Skills :</label>

                </div>
                </br>

                <div class="form-group col-sm-20">
                  <div class="col-sm-offset-2 col-sm-10">
                      <button type="submit" class="btn btn-success">Add</button>
                      <button type="submit" class="btn btn-danger">Delete</button>                
                  </div>  
                </div>

                </br>
                
                <div class="form-group">
                  <label for="inputName" class="col-sm-3 control-label">Professional Skills :</label>

                </div>

                </br>

                <div class="form-group col-sm-20">
                  <div class="col-sm-offset-2 col-sm-10">
                      <button type="submit" class="btn btn-success">Add</button>
                      <button type="submit" class="btn btn-danger">Delete</button>                
                  </div>  
                </div>
              </form>
              </div>
              
              <!-- /.tab-pane -->

              <div class="tab-pane" id="od">
              <form class="form-horizontal">
              <dl class="dl-horizontal">
                <dt>Father Name :</dt>
                <dt>Mother Name :</dt>
                <dt>Languages Known</dt>
                <dt>Read :</dt>
                <dt>Write :</dt>
                <dt>Category :</dt> 
                <dt>Permanent Address :</dt>                                   
                <dt>LinkedIn Profile Link :</dt>
                <dt>Hobbies :</dt>
              </dl>
                  <div class="form-group col-sm-20">
                  <div class="col-sm-offset-2 col-sm-10">
                  </br>
                      <button type="submit" class="btn btn-danger">Submit</button>
                      <button type="submit" class="btn btn-success">Edit Details</button>                
                  </div>  
                </div>
                </form>
              </div>
              <!-- /.tab-pane -->
            </div>
            <!-- /.tab-content -->
          </div>
          <!-- /.nav-tabs-custom -->
        </div>
        <!-- /.col -->
      </div>
      <!-- /.row -->

    </section>
  </div>
  <!-- /.content-wrapper -->

  <!-- Main Footer -->
  <footer class="main-footer">
    <!-- Default to the left -->
    <strong>Copyright &copy; 2018 <a href="#">NHRWA</a>.</strong> All rights reserved.
  </footer>

<!-- REQUIRED JS SCRIPTS -->

<!-- jQuery 3 -->
<script src="bower_components/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap 3.3.7 -->
<script src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- AdminLTE App -->
<script src="dist/js/adminlte.min.js"></script>

<!-- Optionally, you can add Slimscroll and FastClick plugins.
     Both of these plugins are recommended to enhance the
     user experience. -->
</body>
</html>