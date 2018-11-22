<%--
    Document   : index
    Created on : 15-11-2018, 20:21:23
    Author     : maxim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <link rel="stylesheet" href="Vista/assets/css/index2.css">
            <link rel="stylesheet" href="Vista/assets/css/bootstrap.min.css">
        <title>JSP Page</title>
    </head>
    <body>
    <section class="login-block">
        <div class="container">
          <!-- SECCION DE LOGIN -->
          <div class="login-sec">
              <h2 class="text-center">INGRESO</h2>
                <form class="login-form" method="post" action="#">
                <div class="form-group">
                  <label for="exampleInputEmail1" class="text-uppercase">Usuario</label>
                  <input type="text" name="usuario" class="form-control" placeholder="" size="30px">
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1" class="text-uppercase">Contraseña</label>
                  <input type="password" name="pass" class="form-control" placeholder="">
                </div>
                <div class="form-check">
                  <button type="submit" class="btn btn-login float-right">Ingresar</button>
                </div>
                </form>
                <div class="copy-text">¿No tienes un cuenta? <a href="#">Registrate aquí</a></div>
           </div>
           <!-- FIN SECCION DE login -->
           <!-- BANNER SLIDER -->
           <div class="banner-sec">
             <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
               <ol class="carousel-indicators">
                 <li data-target="#carouselExampleControls" data-slide-to="0" class="active"></li>
                 <li data-target="#carouselExampleControls" data-slide-to="1"></li>
                 <li data-target="#carouselExampleControls" data-slide-to="2"></li>
               </ol>
               <div class="carousel-inner">
                 <div class="carousel-item active">
                   <img class="d-flex w-100" src="Vista/assets/img/img-1.jpg" width="1000px" alt="First slide">
                 </div>
                 <div class="carousel-item">
                   <img class="d-block w-100" src="Vista/assets/img/img-2.jpg" width="1000px" alt="Second slide">
                   <div class="carousel-caption d-none d-md-block">
                     <div class="banner-text">
                       <h2>CABAÑA N°1</h2>
                      </div>
                    </div>
                 </div>
                 <div class="carousel-item">
                   <img class="d-block w-100" src="Vista/assets/img/img-3.jpg" alt="Third slide">
                    <div class="carousel-caption d-none d-md-block">
                       <div class="banner-text">
                         <h2>CABAÑA N°2</h2>
                       </div>
                    </div>
                 </div>
               </div>
               <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
                 <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                 <span class="sr-only"></span>
               </a>
               <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
                 <span class="carousel-control-next-icon" aria-hidden="true"></span>
                 <span class="sr-only">Siguiente</span>
               </a>
             </div>
           </div>
           <!-- FIN BANNER SLIDER -->
        </div>
      </section>
      <script type="text/javascript" src="Vista/assets/js/jquery-3.3.1.min.js"></script>
      <script type="text/javascript" src="Vista/assets/js/bootstrap.min.js"></script>
    </body>
</html>
