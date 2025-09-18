package proyectoRender;

public class Main {
    public static void main(String[] args) {

        Proyecto p1 = new Proyecto("Diagrama UML", 400);
        EditorVideo e1 = new EditorVideo();

        e1.exportar("MP4", p1);



    }
}
