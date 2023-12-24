package azienda_sanitaria;

import java.io.IOException;

public class Azienda_sanitaria {

    public static void main(String[] args) throws IOException {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                Grafica_Applicazione_Azienda_Sanitaria f = new Grafica_Applicazione_Azienda_Sanitaria();
            } catch (IOException ex) {

            }
        });
    }

}
