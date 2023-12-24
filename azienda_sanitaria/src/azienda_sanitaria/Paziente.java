package azienda_sanitaria;

import static azienda_sanitaria.Medico.matricolaM;
import java.util.Date;

public class Paziente extends Persona {

    private String CodiceFiscale;
    private String[] Medico;
    public static int matricolaP;
    public int m;

    public Paziente(String nome, String cognome, String CodiceFiscale, String[] Medico) {
        super(nome, cognome);
        this.CodiceFiscale = CodiceFiscale;
        this.Medico = Medico;
        m = assMatricola();

    }

    private static int assMatricola() {
        matricolaP++;
        return matricolaP;
    }

    public String[] getMedico() {
        return Medico;
    }

    public void setMedico(String[] Medico) {
        this.Medico = Medico;
    }

    public String getCodiceFiscale() {
        return CodiceFiscale;
    }

    public void setCodiceFiscale(String CodiceFiscale) {
        this.CodiceFiscale = CodiceFiscale;
    }

}
