package documentoUsuario;

public class Main {
    public static void main(String[] args) {

                Usuario u1 = new Usuario("Luciano", "luciano@gmil.com");
                Documento d1 = new Documento(
                        "Carta de Despido",
                        "Despedicion",
                        "ABC123HASH",
                        "20-09-2025",
                        u1);

                System.out.println(d1);
                System.out.println(d1.getFirmaDigital());
                System.out.println(d1.getFirmaDigital().getUsuario());
            }
        }

