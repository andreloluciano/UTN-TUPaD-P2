package SistemaStock;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario(){
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public void listarProductos(){
        for(Producto producto : productos){
            producto.mostrarInfo();
        }
    }

    public Producto buscarProductoPorId(String id){
        Producto encontrado = null;
        int i = 0;
        while (i < productos.size() && encontrado == null) {
            Producto p = productos.get(i);
            System.out.println("Viendo producto: " + p.getId());
            if (p.getId().equalsIgnoreCase(id)){
                encontrado = p;
            }
            i++;
        }
        return encontrado;
    }

    public Producto eliminarProducto(String id){
        Producto borrado = buscarProductoPorId(id);
        productos.remove(borrado);
        return borrado;
    }

    public void actualizarStock(String id, int nuevaCantidad){
        Producto p = buscarProductoPorId(id);
        if (p != null){ p.setCantidad(nuevaCantidad);
        } else{
        System.out.println("No se encontro el producto con ID " + id);}
    }

    public void filtrarPorCategoria(CategoriaProducto categoria){
        for(Producto p : productos){
            if(p.getCategoria() == categoria){ p.mostrarInfo(); }
        }
    }

    public int obtenerTotalStock(){
        int total = 0;
        for (Producto p : productos){
            total += p.getCantidad();
        }
        return total;
    }

    public Producto obtenerProductoConMayorStock(){
        Producto mayor = productos.getFirst(); // reemplazo de .get(0), por recomendacion de IntelliJ
        for(Producto p : productos) {
            if(p.getCantidad() > mayor.getCantidad()){
                mayor = p;
            }
        }
        return mayor;
    }

    public void filtrarProductosPorPrecio(double min, double max){
        for (Producto p : productos) {
            if(p.getPrecio() >= min && p.getPrecio() <= max){
                p.mostrarInfo();
            }
        }
    }

    public void mostrarCategoriasDisponibles(){
        for(CategoriaProducto c : CategoriaProducto.values()){
            System.out.println(c + ", " + c.getDescripcion());
        }
    }

}
