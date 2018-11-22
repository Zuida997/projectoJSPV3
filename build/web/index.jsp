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
            <link rel="stylesheet" href="Vista/assets/css/login.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="contenedorL">
            <img src="Vista/assets/img/iconUsuario.png" alt="icono_usuario.png" id="icono">
            <form class="" action="Control_Session" method="post">
                <div class="miniCont">
                    <label id="usuario">nombre de usuario</label><br>
                    <input type="text" name="usuario" value=""><br><br>
                    <label id="clave">clave</label><br>
                    <input type="password" name="clave" value=""><br><br>
                </div>
                <p id="registrate">no tienes cuenta? Entonces <a href="Registro.jsp">registrate!!</a> </p><br>
                <input type="submit" name="enviar" value="ingresar">
                <p>hola</p>
            </form>
        </div>
    </body>
</html>
