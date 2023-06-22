<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="estilos.css">
    <title>Actualizar artículo</title>
</head>
<body class="fondo-actualizar-articulo">
<div class="contenedor">
    <div class="titulo">
        <h1 class="titulo-texto" style="text-align: center;">
            Actualizar artículo
        </h1>
    </div>
    <div class="formulario">
        <form action="ActualizarArticuloServlet" method="post">
            <div class="campo" style="text-align: center">
                <p style="color: white">Datos originales del artículo:</p>
                <label for="nombreArticuloOriginal" style="color: white">Nombre del artículo:</label>
                <input type="text" id="nombreArticuloOriginal" name="nombreArticuloOriginal" required>
            </div>
            <br>
            <div class="campo" style="text-align: center">
                <label for="tipoArticuloOriginal" style="color: white">Tipo de artículo:</label>
                <input type="text" id="tipoArticuloOriginal" name="tipoArticuloOriginal" required>
            </div>
            <br>
            <div class="campo" style="text-align: center">
                <label for="pesoOriginal" style="color: white">Peso:</label>
                <input type="text" id="pesoOriginal" name="pesoOriginal" required>
            </div>
            <br>
            <div class="campo" style="text-align: center">
                <label for="precioOriginal" style="color: white">Precio:</label>
                <input type="text" id="precioOriginal" name="precioOriginal" required>
            </div>
            <br>
            <br>
            <div class="campo" style="text-align: center">
                <p style="color: white">Datos modificados del artículo:</p>
                <label for="nombreArticuloModificado" style="color: white">Nombre del artículo:</label>
                <input type="text" id="nombreArticuloModificado" name="nombreArticuloModificado" required>
            </div>
            <br>
            <div class="campo" style="text-align: center">
                <label for="tipoArticuloModificado" style="color: white">Tipo de artículo:</label>
                <input type="text" id="tipoArticuloModificado" name="tipoArticuloModificado" required>
            </div>
            <br>
            <div class="campo" style="text-align: center">
                <label for="pesoModificado" style="color: white">Peso:</label>
                <input type="text" id="pesoModificado" name="pesoModificado" required>
            </div>
            <br>
            <div class="campo" style="text-align: center">
                <label for="precioModificado" style="color: white">Precio:</label>
                <input type="text" id="precioModificado" name="precioModificado" required>
            </div>
            <br>
            <br>
            <div class="boton" style="text-align: center">
                <input type="submit" value="Actualizar">
            </div>
        </form>
    </div>
</div>
</body>
</html>
