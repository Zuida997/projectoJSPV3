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
                <div class="copy-text">¿No tienes un cuenta? <a href="#" data-toggle="modal" data-target="#LoginModal">Registrate aquí</a></div>
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

        <!-- MODAL REGISTRAR -->
        <div class="modal fade" id="LoginModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
          <div class="modal-dialog" role="document">
            <div class="modal-content">
              <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Registro Usuario</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                  <span aria-hidden="true">&times;</span>
                </button>
              </div>
              <div class="modal-body">
                <form class="" action="index.html" method="post">
                  <div class="form-group">
                    <label for="lblNombre">Nombre:</label>
                    <input type="text" name="" value="" class="form-control" placeholder="Juan">
                  </div>
                  <div class="form-group">
                    <label for="lblApellido">Apellidos:</label>
                    <input type="text" name="" value="" class="form-control" placeholder="Perez Prado">
                  </div>
                  <div class="">
                      <label for="lblRut">RUT:</label>
                  </div>
                  <div class="form-group row">
                    <div class="col-7" id="rut"><input type="text" name="" value="" class="form-control" placeholder="12345678" ></div>
                    <div class="col-1" id="lblDV"><label for="lblDV">-</label></div>
                    <div class="col-4" id="dv"><input type="text" name="" value="" placeholder="DV" class="form-control"></div>
                  </div>
                  <div class="form-group">
                    <label for="lblDomicilio">Domicilio:</label>
                    <input type="text" name="" value="" class="form-control">
                  </div>
                  <div class="form-group">
                    <label for="lblRenta">Renta Liquida:</label>
                    <input type="text" name="" value="" class="form-control" placeholder="350000">
                  </div>
                  <div class="form-group">
                    <label for="lblFecha">Fecha de Nacimiento:</label>
                    <input type="date" name="" value="DD/MM/AAAA" class="form-control">
                  </div>
                  <div class="form-group">
                      <label for="">Tiene Familia:</label>
                      <div class="form-check">
                        <input type="radio" name="rdbFamilia" value="1" class="form-check-input">
                        <label for="">Si</label>
                        <input type="radio" name="rdbFamilia" value="0">
                        <label for="">No</label>
                      </div>
                  </div>
                  <div class="modal-footer">
                    <button type="submit" class="btn btn-success">Registrarme</button>
                  </div>
                </form>
              </div>
            </div>
          </div>
        </div>
      </section>
      <script type="text/javascript" src="Vista/assets/js/jquery-3.3.1.min.js"></script>
      <script type="text/javascript" src="Vista/assets/js/bootstrap.min.js"></script>
    </body>
</html>
