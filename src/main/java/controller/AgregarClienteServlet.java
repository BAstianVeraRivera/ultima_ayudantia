package controller;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.Cliente;
import model.GestorDatos;

@WebServlet(name = "AgregarClienteServlet", value = "/AgregarCliente")
public class AgregarClienteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombreCliente = request.getParameter("nombreCliente");
        String rut = request.getParameter("rut");
        String correo = request.getParameter("correo");
        Cliente cliente = new Cliente(nombreCliente, rut, correo);
        GestorDatos gd = new GestorDatos();
        gd.agregarCliente(cliente);
        response.sendRedirect("confirmacion.jsp");
    }
}
