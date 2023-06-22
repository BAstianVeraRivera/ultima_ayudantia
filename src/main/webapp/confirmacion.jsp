<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Confirmación</title>
</head>
<body>
<h1>Confirmación</h1>

<% String operacion = request.getParameter("operacion"); %>
<% String resultado = request.getParameter("resultado"); %>

<% if (operacion.equals("agregar") && resultado.equals("exitoso")) { %>
<p>Se ha agregado el artículo correctamente.</p>
<% } else if (operacion.equals("agregar") && resultado.equals("fallido")) { %>
<p>Ha ocurrido un error al agregar el artículo.</p>
<% } else if (operacion.equals("actualizar") && resultado.equals("exitoso")) { %>
<p>Se ha actualizado el artículo correctamente.</p>
<% } else if (operacion.equals("actualizar") && resultado.equals("fallido")) { %>
<p>Ha ocurrido un error al actualizar el artículo.</p>
<% } else if (operacion.equals("buscar") && resultado.equals("exitoso")) { %>
<p>Se ha encontrado el artículo.</p>
<% } else if (operacion.equals("buscar") && resultado.equals("fallido")) { %>
<p>No se ha encontrado el artículo.</p>
<% } else { %>
<p>Operación inválida.</p>
<% } %>
</body>
</html>

