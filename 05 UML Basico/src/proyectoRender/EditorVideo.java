package proyectoRender;

public class EditorVideo {
    public void exportar(String formato, Proyecto proyecto){
      Render r1 = new Render(formato, proyecto);
        System.out.println("Renderizado en formato " + r1.getFormato()
                + ", pertenece al proyecto "
                 + r1.getProyecto().getNombre()
                + " el cual tiene una duracion de "
                + r1.getProyecto().getDuracionMin()
                + " minutos");
    }
}
