package fabricadeinstrumentos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Sucursal s1 = new Sucursal("Sucursal A");
        Sucursal s2 = new Sucursal("Sucusal B");

        s1.agregarInstrumento( new Instrumento("ABC123", 1234, TipoInstrumento.CUERDA));
        s1.agregarInstrumento( new Instrumento("BCA321", 4321, TipoInstrumento.VIENTO));
        s1.agregarInstrumento( new Instrumento("CBA132", 1432, TipoInstrumento.PERCUSION));

        s2.agregarInstrumento( new Instrumento("ASD678", 3245, TipoInstrumento.CUERDA));
        s2.agregarInstrumento( new Instrumento("FSA324", 5676, TipoInstrumento.VIENTO));

        Fabrica f = new Fabrica();
        f.agregarSucursal(s1);
        f.agregarSucursal(s2);


       f.listarInstrumentos();
       ArrayList<Instrumento> lista = f.instrumentosPorTipo(TipoInstrumento.VIENTO);
       for(Instrumento i : lista){
           System.out.println(i);
       }

        Instrumento borrado = f.borrarInstrumento("ABC123");
        System.out.println("Se borró: " + borrado);



    }
}
