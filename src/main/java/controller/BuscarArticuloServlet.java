package controller;
import java.io.*;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.Articulo;
import model.GestorDatos;
@WebServlet(name = "BuscarArticuloServlet", value = "/BuscarArticulo")
public class BuscarArticuloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String criterio = request.getParameter("criterio");
        GestorDatos gd = new GestorDatos();
        List<Articulo> articulosEncontrados = gd.buscarArticulo(criterio);
        request.setAttribute("articulosEncontrados", articulosEncontrados);
        request.getRequestDispatcher("resultados.jsp").forward(request, response);
    }
}
