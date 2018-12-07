<%--
    Document   : Catalogo
    Created on : 22-11-2018, 20:27:25
    Author     : xzur
--%>
<%@page import="Controlador.Control_Session"%>
<%!
    
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../assets/css/catalogo.css">
        <link rel="stylesheet" href="../assets/css/bootstrap.min.css">
        <title>Bienvenido al Catalogo</title>
    </head>
    <body>
      <!-- header -->
      <div class="container-fluid header">
        <header>
          CATALOGO DE CABAÑAS
          <p>Bienvenido Usuario</p>
          <a type="button" name="button" class="btn btn-success" href="#">ingresar cabaña</a>
        </header>
      </div>
  <!-- end header -->

  <!-- content -->
      <div class="container-fluid">
        <div class="content row">
          <div class="container">
            <img src="../assets/img/cabana-2.jpg" alt="imagen1" width="850px">
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
              <br><br><a type="button" name="button" class="btn btn-success" href="#">Arrendar</a>
            </p>
          </div>
          <div class="container">
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
              <br><br><a type="button" name="button" class="btn btn-success" href="#">Arrendar</a>
            </p>
            <img src="../assets/img/img-2.jpg" alt="imagen2">
          </div>
          <div class="container">
            <img src="../assets/img/img-3.jpg" alt="imagen3">
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
              <br><br><a type="button" name="button" class="btn btn-success" href="#">Arrendar</a>
            </p>
          </div>
        </div>
      </div>

   <!-- footer -->
      <footer>©2019</footer>


        <script type="text/javascript" src="../assets/js/jquery-3.3.1.min.js"></script>
        <script type="text/javascript" src="../assets/js/bootstrap.min.js"></script>
    </body>
</html>
