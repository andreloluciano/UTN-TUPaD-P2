package fabricadeinstrumentos;

import java.sql.Array;
import java.util.ArrayList;

public class Sucursal {

    private ArrayList<Instrumento> instrumentos;
    private String nombre;

    public Sucursal(String nombre) {
        this.nombre = nombre;
        this.instrumentos = new ArrayList<>();
    }

    public String getNombre() {return nombre;}

    public void agregarInstrumento(Instrumento ins){
        this.instrumentos.add(ins);
    }

    public double[] porcInstrumentosPorTipo(){
        final int CANT_INSTRUMENTOS = TipoInstrumento.values().length;
        double[] porcentajes = new double[CANT_INSTRUMENTOS];
        for(Instrumento instrumento : instrumentos){
            porcentajes[ instrumento.getTipo().ordinal() ] ++;
        }
        absolutoAPorcetaje(porcentajes);
        return porcentajes;
    }

    private void absolutoAPorcetaje(double[] porcentajes){
        for(int i=0; i<porcentajes.length; i++){
            porcentajes[i] = (porcentajes[i] * 100) / TipoInstrumento.values().length;
        }
    }

    public Instrumento borrarInstrumento(String ID) {
        Instrumento insABorrar = buscarInstrumento(ID);
        this.instrumentos.remove(insABorrar);
        return insABorrar;
    }

    private Instrumento buscarInstrumento(String ID){
        int i = 0;
        Instrumento insEncontrado = null;
        while(i < instrumentos.size() && !this.instrumentos.get(i).getID().equals(ID)){
            i++;
        }
        if(i < instrumentos.size()){
            insEncontrado = this.instrumentos.get(i);
        }
        return insEncontrado;
    }

    public ArrayList<Instrumento> instrumentosPorTipo(TipoInstrumento tipo){
        ArrayList<Instrumento> instEcontrados = new ArrayList<>();
        for (Instrumento instrumento : instrumentos){
            if(instrumento.getTipo() == tipo){
                instEcontrados.add(instrumento);
            }
        }
        return instEcontrados;
    }

    public void listarInstrumentos() {
        for (Instrumento instrumento : instrumentos){
            System.out.println(instrumento);
        }
    }

}
