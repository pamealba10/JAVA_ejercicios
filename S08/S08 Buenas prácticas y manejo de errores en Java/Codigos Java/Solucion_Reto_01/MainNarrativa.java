package Solucion_Reto_01;

public class MainNarrativa {
    public static void main(String[] args) {
        // Simulación inicial
        PaqueteNarrativo paquete = new PaqueteNarrativo("Inicio del viaje");

        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();

        dialogo.mostrarDialogo(paquete);
        String accion = decision.tomarDecision();
        transicion.realizarTransicion(accion);
    }
}
