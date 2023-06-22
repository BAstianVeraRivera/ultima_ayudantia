package controller;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.Articulo;
import model.GestorDatos;

@WebServlet(name = "AgregarArticuloServlet", value = "/AgregarArticulo")

public class AgregarArticuloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombreArticulo = request.getParameter("nombreArticulo");
        String tipoArticulo = request.getParameter("tipoArticulo");
        String peso = request.getParameter("peso");
        int precio = Integer.parseInt(request.getParameter("precio"));
        Articulo articulo = new Articulo(nombreArticulo, tipoArticulo, peso, precio);
        GestorDatos gd = new GestorDatos();
        gd.agregarArticulo(articulo);
        response.sendRedirect("confirmacion.jsp");
    }
}
