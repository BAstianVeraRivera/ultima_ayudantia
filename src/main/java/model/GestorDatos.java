package model;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class GestorDatos {
    public void agregarArticulo(Articulo articulo) {
        try {
            FileWriter fw = new FileWriter("articulos.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(articulo.getNombreArticulo() + "," + articulo.getTipoArticulo() + "," + articulo.getPeso() + "," + articulo.getPrecio());
            pw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void agregarCliente(Cliente cliente) {
        try {
            FileWriter fw = new FileWriter("clientes.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(cliente.getNombreCliente() + "," + cliente.getRut() + "," + cliente.getCorreo());
            pw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<Articulo> buscarArticulo(String criterio) {
        List<Articulo> articulosEncontrados = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("articulos.txt");
            Scanner sc = new Scanner(fis);
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                String[] datos = linea.split(",");
                Articulo articulo = new Articulo(datos[0], datos[1], datos[2], Integer.parseInt(datos[3]));
                if (criterio.equalsIgnoreCase(articulo.getNombreArticulo()) || criterio.equalsIgnoreCase(articulo.getTipoArticulo())) {
                    articulosEncontrados.add(articulo);
                } else {
                    try {
                        double precio = Double.parseDouble(criterio);
                        if (sc.hasNextDouble() && sc.nextDouble() == precio) {
                            articulosEncontrados.add(articulo);
                        }
                    } catch (NumberFormatException e) {
                    }
                }
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return articulosEncontrados;
    }
    public void actualizarArticulo(Articulo original, Articulo modificado) {
        try {
            FileReader fr = new FileReader("articulos.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("temp.txt");
            PrintWriter pw = new PrintWriter(fw);
            String linea = br.readLine();
            while (linea != null) {
                String[] datos = linea.split(",");
                Articulo articulo = new Articulo(datos[0], datos[1], datos[2],Integer.parseInt(datos[3]));
                if (articulo.getNombreArticulo().equals(original.getNombreArticulo()) && articulo.getTipoArticulo().equals(original.getTipoArticulo()) && articulo.getPeso().equals(original.getPeso()) && articulo.getPrecio() == original.getPrecio()) {
                    pw.println(modificado.getNombreArticulo() + "," + modificado.getTipoArticulo() + "," + modificado.getPeso() + "," + modificado.getPrecio());
                } else {
                    pw.println(linea);
                }
                linea = br.readLine();
            }
            pw.close();
            fw.close();
            br.close();
            fr.close();
            File file = new File("articulos.txt");
            file.delete();
            File tempFile = new File("temp.txt");
            tempFile.renameTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
