package azienda_sanitaria;

import java.io.File;
import java.util.Date;

public class Medico extends Persona {

    private File specializzazione;
    private String codice;
    public int NPazienti;
    public static int matricolaM;
    public int m;

    public Medico(String nome, String cognome, String codice) {
        super(nome, cognome);
        this.codice = codice;
        m = assMatricola();
    }
    public Medico(String nome, String cognome, String codice, int pazienti) {
        super(nome, cognome);
        this.codice = codice;
        NPazienti = pazienti;
        m = assMatricola();
    }

    public File getSpecializzazione() {
        return specializzazione;
    }

    public void setSpecializzazione(File specializzazione) {
        this.specializzazione = specializzazione;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public void AggiungiPaziente() {
        NPazienti++;
    }

    private static int assMatricola() {
        matricolaM++;
        return matricolaM;
    }
}
