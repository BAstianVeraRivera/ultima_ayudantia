<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="estilos.css">
    <title>Agregar cliente</title>
</head>
<body class="fondo">
<div class="contenedor">
    <div class="titulo">
        <h1 class="titulo-texto" style="text-align: center;">
            Agregar cliente
        </h1>
    </div>
    <div class="formulario">
        <form action="AgregarClienteServlet" method="post">
            <div class="campo" style="text-align: center">
                <label for="nombreCliente" style="color: white">Nombre del cliente:</label>
                <input type="text" id="nombreCliente" name="nombreCliente" required>
            </div>
            <br>
            <div class="campo" style="text-align: center">
                <label for="rut" style="color: white">Rut:</label>
                <input type="text" id="rut" name="rut" required>
            </div>
            <br>
            <div class="campo" style="text-align: center">
                <label for="correo" style="color: white">Correo:</label>
                <input type="email" id="correo" name="correo" required>
            </div>
            <br>
            <br>
            <div class="boton" style="text-align: center">
                <input type="submit" value="Agregar">
            </div>
        </form>
    </div>
</div>
</body>
</html>
