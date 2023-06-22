package controller;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.Articulo;
import model.GestorDatos;

@WebServlet(name = "ActualizarArticuloServlet", value = "/ActualizarArticulo")
public class ActualizarArticuloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nombreArticuloOriginal = request.getParameter("nombreArticuloOriginal");
        String tipoArticuloOriginal = request.getParameter("tipoArticuloOriginal");
        String pesoOriginal = request.getParameter("pesoOriginal");
        int precioOriginal = Integer.parseInt(request.getParameter("precioOriginal"));
        String nombreArticuloModificado = request.getParameter("nombreArticuloModificado");
        String tipoArticuloModificado = request.getParameter("tipoArticuloModificado");
        String pesoModificado = request.getParameter("pesoModificado");
        int precioModificado = Integer.parseInt(request.getParameter("precioModificado"));
        Articulo original = new Articulo(nombreArticuloOriginal, tipoArticuloOriginal, pesoOriginal, precioOriginal);
        Articulo modificado = new Articulo(nombreArticuloModificado, tipoArticuloModificado, pesoModificado, precioModificado);
        GestorDatos gd = new GestorDatos();
        gd.actualizarArticulo(original, modificado);
        response.sendRedirect("confirmacion.jsp");
    }
}
