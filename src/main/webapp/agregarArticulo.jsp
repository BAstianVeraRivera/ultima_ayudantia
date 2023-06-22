<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="estilos.css">
    <title>Agregar artículo</title>
</head>
<body class="fondo">
<div class="contenedor">
    <div class="titulo">
        <h1 class="titulo-texto" style="text-align: center;">
            Agregar artículo
        </h1>
    </div>
    <div class="formulario">
        <form action="AgregarArticuloServlet" method="post">
            <div class="campo" style="text-align: center">
                <label for="nombreArticulo" style="color: white">Nombre del artículo:</label>
                <input type="text" id="nombreArticulo" name="nombreArticulo" required>
            </div>
            <br>
            <div class="campo" style="text-align: center">
                <label for="tipoArticulo" style="color: white">Tipo de artículo:</label>
                <input type="text" id="tipoArticulo" name="tipoArticulo" required>
            </div>
            <br>
            <div class="campo" style="text-align: center">
                <label for="peso" style="color: white">Peso:</label>
                <input type="text" id="peso" name="peso" required>
            </div>
            <br>
            <div class="campo" style="text-align: center">
                <label for="precio" style="color: white">Precio:</label>
                <input type="text" id="precio" name="precio" required>
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
