public class Fila {

    private static Fila instanciaUnica;

    private Fila() {

    }

    public static Fila getInstancia() {
        if (instanciaUnica == null) {
            synchronized (Fila.class) {
                if (instanciaUnica == null) {
                    instanciaUnica = new Fila();
                }
            }
        }
        return instanciaUnica;
    }

    public void ImprimeDocumento() {
        System.out.println("Documento impresso.");
    }
    
    public void RemoveDocumento() {
        System.out.println("Documento removido.");
    }
    
    public void RemoveTodosDocumentos() {
        System.out.println("Todos os documentos removidos.");
    }
    
}
