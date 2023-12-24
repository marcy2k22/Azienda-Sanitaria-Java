package azienda_sanitaria;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Gestione_File {

    public File registroP;
    public File registroM;
    public ArrayList<File> Specializzazioni;

    public Gestione_File() {
        registroP = new File("registroP.txt");
        registroM = new File("registroM.txt");
        Specializzazioni = new ArrayList<File>(10);
    }

    protected void RecuperoInformazioniM(ArrayList<Medico> m) throws FileNotFoundException, IOException {
        int righe = 0;
        try ( BufferedReader r = new BufferedReader(new FileReader(registroM))) {
            while (r.readLine() != null) {
                righe++;
            }
            r.close();
        } catch (IOException e) {

        }
        if (righe == 0) {
            return;
        }

        BufferedReader r = new BufferedReader(new FileReader(registroM));
        String riga;
        String c[];
        Medico med;
        for (int i = 0; i < righe; i++) {
            riga = r.readLine();
            if (riga.equals("")) {
                continue;
            }
            c = riga.split("-");
            med = new Medico(c[0], c[1], c[2]);
            med.setSpecializzazione(cercaSpecializzazione(c[0], c[1], c[2]));
            med.m = Integer.parseInt(c[3]);
            med.NPazienti = Integer.parseInt(c[5]);
            String ris = CheckSpecializzazione(med.getSpecializzazione(), c[0], c[1], c[2], m, 0);
            if (ris.equals("vuoto") || ris.equals("errore")) {
                System.out.println("errore nella lettura della licenza");
            } else {
                m.add(med);
            }
            if (ris.equals("doppio")) {
                System.out.println("Errore, ci sono dei doppi nel database");
            }

        }
    }

    protected File cercaSpecializzazione(String nome, String cognome, String codice) throws IOException {
        File f = new File("Licenze/" + nome + "_" + cognome + "_" + codice + ".txt");
        return f;
    }
    
    protected void RecuperoInformazioniP(ArrayList<Paziente> p) throws FileNotFoundException, IOException {
        int righe = 0;
        try ( BufferedReader r = new BufferedReader(new FileReader(registroP))) {
            while (r.readLine() != null) {
                righe++;
            }
            r.close();
        } catch (IOException e) {

        }
        if (righe == 0) {
            return;
        }
        BufferedReader r = new BufferedReader(new FileReader(registroP));
        String riga;
        String c[];
        Paziente pa;
        for (int i = 0; i < righe; i++) {
            riga = r.readLine();
            if (riga.equals("")) {
                continue;
            }
            c = riga.split("-");
            String medico[] = {c[3], c[4], c[5]};
            pa = new Paziente(c[0], c[1], c[2], medico);
            pa.m = Integer.parseInt(c[6]);
            p.add(pa);
        }
    }

    protected File NuovaSpecializzazione(String nome, String cognome, String codice, ArrayList<String> specializzazione, ArrayList<Medico> m) throws IOException {
        String path = "Licenze/" + nome + "_" + cognome + "_" + codice + ".txt";
        File f = new File(path);
        System.out.println(f.getCanonicalFile());
        String primaRiga = nome + "_" + cognome + "_";
        for (int i = 0; i < codice.length(); i++) {

            primaRiga += codice.charAt(i);

        }

        primaRiga += '\n';
        try {
            BufferedWriter w = new BufferedWriter(new FileWriter(f, true));
            w.write(primaRiga);
            for (int i = 0; i < specializzazione.size(); i++) {
                w.write(specializzazione.get(i) + "\n");
            }
            w.close();
        } catch (IOException ex) {
            System.out.println("ERRORE");
        }
        return f;
    }

    protected String CheckSpecializzazione(File f, String nome, String cognome, String codice, ArrayList<Medico> m, int n) throws FileNotFoundException, IOException {
        int righe = 0;
        try ( BufferedReader r = new BufferedReader(new FileReader(f))) {
            while (r.readLine() != null) {
                righe++;
            }
            r.close();
        } catch (IOException e) {
            return "errore";
        }
        try {
            BufferedReader r = new BufferedReader(new FileReader(f));
            if (f == null && n == 0) {
                return "vuoto";
            } else {
                String riga = r.readLine();

                if (riga.split("_")[0].equals(nome) && riga.split("_")[1].equals(cognome) && f.getName().split("_")[2].split("\\.")[0].equals(codice)) {

                    for (int i = 0; i < codice.length(); i++) {
                        if (riga.split("_")[2].charAt(i) == codice.charAt(i)) {

                        } else {
                            if (n == 1) {
                                return "diversi";
                            } else {
                                return "errore";
                            }
                        }
                    }
                } else {
                    return "errore";
                }
                riga = r.readLine();
                for (int i = 1; i < righe - 1; i++) {
                    riga = r.readLine();
                    switch (riga) {
                        case "Medicina interna":
                            break;
                        case "Medicina d'emergenza":
                            break;
                        case "Geriatria":
                            break;
                        case "Medicina dello sport e dell’esercizio fisico":
                            break;
                        case "Medicina termale":
                            break;
                        case "Oncologia medica":
                            break;
                        case "Medicina di comunità e delle cure primarie":
                            break;
                        case "Allergologia e Immunologia clinica":
                            break;
                        case "Dermatologia e Venereologia":
                            break;
                        case "Ematologia":
                            break;
                        case "Endocrinologia e malattie del metabolismo":
                            break;
                        case "Scienza dell’alimentazione":
                            break;
                        case "Malattie dell’apparato digerente":
                            break;
                        case "Malattie dell’apparato cardiovascolare":
                            break;
                        case "Malattie dell’apparato respiratorio":
                            break;
                        case "Malattie Infettive e Tropicali":
                            break;
                        case "Nefrologia":
                            break;
                        case "Reumatologia":
                            break;
                        case "Medicina e Cure Palliative":
                            break;
                        case "Neurologia":
                            break;
                        case "Neuropsichiatria infantile":
                            break;
                        case "Psichiatria":
                            break;
                        case "Pediatria":
                            break;
                        case "Chirurgia Generale":
                            break;
                        case "Chirurgia pediatrica":
                            break;
                        case "Chirurgia plastica, ricostruttiva ed estetica":
                            break;
                        case "Ginecologia ed Ostetricia":
                            break;
                        case "Ortopedia e traumatologia":
                            break;
                        case "Urologia":
                            break;
                        case "Chirurgia Maxillo-Facciale":
                            break;
                        case "Neurochirurgia":
                            break;
                        case "Oftalmologia":
                            break;
                        case "Otorinolaringoiatria":
                            break;
                        case "Cardiochirurgia":
                            break;
                        case "Chirurgia Toracica":
                            break;
                        case "Chirurgia Vascolare":
                            break;
                        case "Anatomia Patologica":
                            break;
                        case "Microbiologia e Virologia":
                            break;
                        case "Patologia Clinica e Biochimica Clinica":
                            break;
                        case "Radiodiagnostica":
                            break;
                        case "Radioterapia":
                            break;
                        case "Medicina nucleare":
                            break;
                        case "Anestesia Rianimazione, Terapia Intensiva e del dolore":
                            break;
                        case "Audiologia e foniatria":
                            break;
                        case "Medicina fisica e riabilitativa":
                            break;
                        case "Genetica medica":
                            break;
                        case "Farmacologia e Tossicologia Clinica":
                            break;
                        case "Igiene e Medicina Preventiva":
                            break;
                        case "Medicina del Lavoro":
                            break;
                        case "Medicina Legale":
                            break;
                        case "Statistica sanitaria e Biometria":
                            break;
                        default:
                            return "vuoto";

                    }
                }

            }
            BufferedReader read;
            String rig;
            for (int i = 0; i < m.size(); i++) {
                read = new BufferedReader(new FileReader(m.get(i).getSpecializzazione()));
                rig = read.readLine();
                if (rig.split("_")[0].equals(nome) && rig.split("_")[1].equals(cognome) && rig.split("_")[2].equals(codice)) {
                    return "doppio";
                }
            }
            return "check";
        } catch (NullPointerException err) {
            return "vuoto";
        }

    }

    protected void AggiungiNelDatabase(Paziente e) throws IOException {
        String riga = e.nome + "-" + e.cognome + "-" + e.getCodiceFiscale() + "-" + e.getMedico()[0] + "-" + e.getMedico()[1] + "-" + e.getMedico()[2] + "-" + Paziente.matricolaP + "\n";
        System.out.println(riga);
        BufferedWriter w = new BufferedWriter(new FileWriter(registroP, true));
        w.write(riga);
        w.close();
    }

    protected String AggiornaMedico(String[] medico, ArrayList<Medico> med) throws IOException {
        String riga = "";
        boolean c = false;
        String ris = "";
        for (int i = 0; i < med.size(); i++) {
            if (med.get(i).nome.equals(medico[0]) && med.get(i).cognome.equals(medico[1]) && med.get(i).getCodice().equals(medico[2])) {
                if (med.get(i).NPazienti > 0) {
                    ris = rimuoviRiga("registroM.txt", ("" + med.get(i).nome + "-" + med.get(i).cognome + "-" + med.get(i).getCodice() + "-" + med.get(i).m + "-" + med.get(i).getSpecializzazione() + "-" + String.valueOf(med.get(i).NPazienti) + "\n"));
                    if (ris.equals("check")) {
                        riga = "" + med.get(i).nome + "-" + med.get(i).cognome + "-" + med.get(i).getCodice() + "-" + med.get(i).m + "-" + med.get(i).getSpecializzazione() + "-" + String.valueOf(med.get(i).NPazienti - 1) + "\n";
                        BufferedWriter w = new BufferedWriter(new FileWriter(registroM, true));
                        w.write(riga);
                        w.close();
                        c = true;
                    }

                }
            }
        }

        if (c = true) {
            return "check";
        } else {
            return "errore";
        }

    }

    protected String AggiornaMedico(String medico, ArrayList<Medico> med) throws IOException {
        String riga = "";
        boolean c = false;
        String ris = "";
        medico = medico.toLowerCase();
        for (int i = 0; i < med.size(); i++) {
            if (med.get(i).nome.equals(medico.split(" ")[0]) && med.get(i).cognome.equals(medico.split(" ")[1]) && med.get(i).getCodice().equals(medico.split(" ")[2])) {
                ris = rimuoviRiga("registroM.txt", ("" + med.get(i).nome + "-" + med.get(i).cognome + "-" + med.get(i).getCodice() + "-" + med.get(i).m + "-" + med.get(i).getSpecializzazione() + "-" + String.valueOf(med.get(i).NPazienti) + "\n"));
                if (ris.equals("check")) {
                    riga = "" + med.get(i).nome + "-" + med.get(i).cognome + "-" + med.get(i).getCodice() + "-" + med.get(i).m + "-" + med.get(i).getSpecializzazione() + "-" + String.valueOf(med.get(i).NPazienti + 1) + "\n";
                    BufferedWriter w = new BufferedWriter(new FileWriter(registroM, true));
                    w.write(riga);
                    w.close();
                    c = true;
                }

            }
        }

        if (c = true) {
            return "check";
        } else {
            return "errore";
        }

    }

    protected void AggiungiNelDatabase(Medico e) throws IOException {
        String riga = e.nome + "-" + e.cognome + "-" + e.getCodice() + "-" + Medico.matricolaM + "-" + e.getSpecializzazione() + "-" + String.valueOf(e.NPazienti) + "\n";
        System.out.println(riga);
        BufferedWriter w = new BufferedWriter(new FileWriter(registroM, true));
        w.write(riga);
        w.close();
    }

    protected String TogliDalDatabase(Medico e, ArrayList<Medico> m, ArrayList<Paziente> p) throws IOException {
        String riga = "";
        for (int i = 0; i < p.size(); i++) {
            if (p.get(i).getMedico()[0].equals(e.nome) && p.get(i).getMedico()[1].equals(e.cognome)) {
                return "associato";
            }
        }
        for (int i = 0; i < m.size(); i++) {

            if (m.get(i).nome.equals(e.nome) && m.get(i).cognome.equals(e.cognome) && m.get(i).getCodice().equals(e.getCodice()) && m.get(i).getSpecializzazione().equals(e.getSpecializzazione())) {
                riga = "" + e.nome + "-" + e.cognome + "-" + e.getCodice() + "-" + m.get(i).m + "-" + e.getSpecializzazione() + "-" + String.valueOf(e.NPazienti) + "\n";
                File f = new File(m.get(i).getSpecializzazione().getPath());
                System.out.println(m.get(i).getSpecializzazione().getPath());
                f.exists();
                f.delete();
                m.remove(i);
            }
        }
        if (riga.equals("")) {
            System.out.println("Errore");
            return "errore";
        }

        rimuoviRiga("registroM.txt", riga);

        return "check";
    }

    protected String TogliDalDatabase(Paziente e, ArrayList<Paziente> p, ArrayList<Medico> m) throws IOException {
        String riga = "";
        String ris2;
        for (int i = 0; i < p.size(); i++) {
            if (p.get(i).nome.equals(e.nome) && p.get(i).cognome.equals(e.cognome) && p.get(i).getCodiceFiscale().equals(e.getCodiceFiscale()) && p.get(i).getMedico()[0].equals(e.getMedico()[0].toLowerCase()) && p.get(i).getMedico()[1].equals(e.getMedico()[1].toLowerCase()) && p.get(i).getMedico()[2].equals(e.getMedico()[2].toLowerCase())) {
                riga = e.nome + "-" + e.cognome + "-" + e.getCodiceFiscale() + "-" + e.getMedico()[0].toLowerCase() + "-" + e.getMedico()[1].toLowerCase() + "-" + e.getMedico()[2].toLowerCase() + "-" + p.get(i).m + "\n";
                for (int j = 0; j < m.size(); j++) {

                    if (m.get(j).nome.equals(p.get(i).getMedico()[0]) && m.get(j).cognome.equals(p.get(i).getMedico()[1]) && m.get(j).getCodice().equals(p.get(i).getMedico()[2])) {
                        ris2 = AggiornaMedico(p.get(i).getMedico(), m);
                        m.get(i).AggiungiPaziente();
                        if (ris2.equals("errore")) {
                            System.out.println("Errore Nuovo Paziente");
                            return "errore";
                        }
                    }
                }
                p.remove(i);
            }
        }
        if (riga.equals("")) {
            System.out.println("Errore");
            return "nonTrovato";
        }

        System.out.println(riga);
        String ris = rimuoviRiga("registroP.txt", riga);

        return ris;
    }

    protected String rimuoviRiga(String file, String rigaDaRimuovere) throws FileNotFoundException, IOException {
        int righe = 0;
        try ( BufferedReader r = new BufferedReader(new FileReader(file))) {
            while (r.readLine() != null) {
                righe++;
            }
            r.close();
        } catch (IOException e) {
            return "errore";
        }
        BufferedReader r = new BufferedReader(new FileReader(file));

        ArrayList<String> s = new ArrayList<String>(10);
        for (int i = 0; i < righe; i++) {
            s.add(r.readLine() + "\n");
        }
        r.close();

        File f = new File(file);
        f.deleteOnExit();
        boolean c = f.exists();

        BufferedWriter w = new BufferedWriter(new FileWriter(file, true));
        if (c == true) {
            System.out.println("File eliminato");
        } else {
            System.out.println("File non eliminato");
            return "errore";
        }
        f = new File(file);
        w = new BufferedWriter(new FileWriter(file));
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).equals(rigaDaRimuovere)) {
                s.remove(i);
            }
        }

        if (!s.isEmpty()) {
            for (int i = 0; i < s.size(); i++) {
                w.write(s.get(i));
            }
        }
        w.close();
        r.close();
        return "check";
    }
}
