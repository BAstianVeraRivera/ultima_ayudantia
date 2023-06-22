<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="estilos.css">
    <title>Buscar artículo</title>
    <script>
        function mostrarCampo() {
            var criterio = document.getElementById("criterio").value;
            var campo = document.getElementById("campo");
            if (criterio == "nombre" || criterio == "precio") {
                campo.style.display = "block";
            } else {
                campo.style.display = "none";
            }
        }
    </script>
</head>
<body class="fondo">
<div class="contenedor">
    <div class="titulo">
        <h1 class="titulo-texto" style="text-align: center;">
            Buscar artículo
        </h1>
    </div>
    <div class="formulario">
        <form action="BuscarArticuloServlet" method="post">
            <div class="campo" style="text-align: center">
                <label for="criterio" style="color: white">Criterio de búsqueda:</label>
                <select id="criterio" name="criterio" required onchange="mostrarCampo()">
                    <option value="">Seleccione una opción</option>
                    <option value="nombre">Nombre</option>
                    <option value="precio">Precio</option>
                </select>
            </div>
            <br>
            <div class="campo" style="text-align: center; display: none;" id="campo">
                <label for="valor" style="color: white">Ingrese información seleccionada:</label>
                <input type="text" id="valor" name="valor" required>
            </div>
            <br>
            <div class="boton" style="text-align: center">
                <input type="submit" value="Buscar">
            </div>
        </form>
    </div>
</div>
</body>
</html>

