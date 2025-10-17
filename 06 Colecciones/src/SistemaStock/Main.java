package SistemaStock;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        Producto p1 = new Producto("P001", "Arroz",      500.0,  20, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Televisor", 150000.0, 5, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera",     2500.0, 15, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Silla",      8000.0, 10, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Notebook", 350000.0, 2, CategoriaProducto.ELECTRONICA);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        System.out.println("Listar productos");
        inventario.listarProductos();

        System.out.println("Buscar producto por ID: P003");
        Producto buscado = inventario.buscarProductoPorId("P003");
        if (buscado != null) buscado.mostrarInfo();

        System.out.println("Filtrar por categoría: ELECTRONICA ");
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        System.out.println("Eliminar producto con ID P001");
        Producto borrado = inventario.eliminarProducto("P001");
        System.out.println("Item borrado: " + borrado);
        inventario.listarProductos();

        System.out.println("Actualizar stock de P002 a 12 ");
        inventario.actualizarStock("P002", 12);
        inventario.listarProductos();

        System.out.println("Total stock ");
        System.out.println("Total: " + inventario.obtenerTotalStock());

        System.out.println("Producto con mayor stock ");
        Producto mayor = inventario.obtenerProductoConMayorStock();
        System.out.println(mayor);

        System.out.println("Productos entre $1000 y $3000 ");
        inventario.filtrarProductosPorPrecio(1000.0, 3000.0);

        System.out.println("Categorías disponibles ");
        inventario.mostrarCategoriasDisponibles();
    }
}


