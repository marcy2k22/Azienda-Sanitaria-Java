package azienda_sanitaria;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Gestione_Liste {

    private ArrayList<Medico> m;
    private ArrayList<Paziente> p;
    Gestione_File gest;

    public Gestione_Liste() throws IOException {
        super();
        p = new ArrayList<Paziente>(10);
        m = new ArrayList<Medico>(10);
        gest = new Gestione_File();
        gest.RecuperoInformazioniP(p);
        gest.RecuperoInformazioniM(m);

    }

    public String CheckRegistrazione(String nome, String cognome, String codice, String medico) {
        if (nome.equals("") || cognome.equals("") || codice.equals("") || medico.equals("")) {
            return "vuoto";

        }
        for (int i = 0; i < nome.length(); i++) {
            if (((nome.charAt(i)) > 48 && (nome.charAt(i) < 57))) {
                return "nome";
            }
        }
        for (int i = 0; i < cognome.length(); i++) {
            if (((cognome.charAt(i)) > 48 && (cognome.charAt(i) < 57))) {
                return "cognome";
            }
        }
        for (int i = 0; i < nome.length(); i++) {
            if (nome.charAt(i) == ' ') {
                return "Nspazio";
            }

        }
        for (int i = 0; i < cognome.length(); i++) {
            if (cognome.charAt(i) == ' ') {
                return "Cspazio";
            }

        }
        if (nome.length() < 3) {
            return "lungN";
        }
        if (cognome.length() < 3) {
            return "lungC";
        }

        int s = 0;

        boolean c = false;
        for (int i = 0; i < m.size(); i++) {
            if (medico.toLowerCase().split(" ")[0].equals(m.get(i).nome) && medico.toLowerCase().split(" ")[1].equals(m.get(i).cognome) && medico.toLowerCase().split(" ")[2].equals(m.get(i).getCodice())) {
                c = true;
            }
        }
        if (c == false) {
            return "MNT";
        }

        if (checkCodiceF(codice) == true) {

        } else {
            return "codice";
        }
        if (ConfrontoCodice(codice, nome, cognome).equals("check")) {
            return "check";
        }
        if (ConfrontoCodice(codice, nome, cognome).equals("nonC")) {
            return "nonC";
        }
        if (checkCodiceF(codice) == true) {

        } else {
            return "codice";
        }

        return "check";
    }

    public String ConfrontoCodice(String codice, String nome, String cognome) {
        int countC = 0;
        int countV = 0;
        for (int i = 0; i < cognome.length(); i++) {
            if ((cognome.charAt(i) >= 98 && cognome.charAt(i) <= 100) || (cognome.charAt(i) >= 102 && cognome.charAt(i) <= 104) || (cognome.charAt(i) >= 106 && cognome.charAt(i) <= 110) || (cognome.charAt(i) >= 112 && cognome.charAt(i) <= 116) || (cognome.charAt(i) >= 118 && cognome.charAt(i) <= 122)) {
                countC++;
            }
            if (cognome.charAt(i) == 97 || cognome.charAt(i) == 101 || cognome.charAt(i) == 105 || cognome.charAt(i) == 111 || cognome.charAt(i) == 117) {
                countV++;
            }
        }
        String codiceF = "";
        int c = 3;
        if (countC >= 3) {
            for (int i = 0; i < cognome.length(); i++) {
                if ((cognome.charAt(i) >= 98 && cognome.charAt(i) <= 100) || (cognome.charAt(i) >= 102 && cognome.charAt(i) <= 104) || (cognome.charAt(i) >= 106 && cognome.charAt(i) <= 110) || (cognome.charAt(i) >= 112 && cognome.charAt(i) <= 116) || (cognome.charAt(i) >= 118 && cognome.charAt(i) <= 122)) {
                    if (c > 0) {
                        c--;
                        codiceF += cognome.charAt(i);
                    }
                    if (c == 0) {
                        break;
                    }
                }
            }
        }
        c = 3;
        c = 2;
        int c2 = 1;
        if (countC == 2) {
            for (int i = 0; i < cognome.length(); i++) {
                if ((cognome.charAt(i) >= 98 && cognome.charAt(i) <= 100) || (cognome.charAt(i) >= 102 && cognome.charAt(i) <= 104) || (cognome.charAt(i) >= 106 && cognome.charAt(i) <= 110) || (cognome.charAt(i) >= 112 && cognome.charAt(i) <= 116) || (cognome.charAt(i) >= 118 && cognome.charAt(i) <= 122)) {
                    if (c > 0) {
                        c--;
                        codiceF += cognome.charAt(i);
                    }
                    if (c == 0) {
                        break;
                    }

                }

            }
            for (int i = 0; i < cognome.length(); i++) {
                if (cognome.charAt(i) == 97 || cognome.charAt(i) == 101 || cognome.charAt(i) == 105 || cognome.charAt(i) == 111 || cognome.charAt(i) == 117) {
                    if (c2 > 0) {
                        c2--;
                        codiceF += cognome.charAt(i);
                    }
                    if (c2 == 0) {
                        break;
                    }
                }
            }
        }
        c = 1;
        c2 = 2;
        if (countC == 1) {
            for (int i = 0; i < cognome.length(); i++) {
                if ((cognome.charAt(i) >= 98 && cognome.charAt(i) <= 100) || (cognome.charAt(i) >= 102 && cognome.charAt(i) <= 104) || (cognome.charAt(i) >= 106 && cognome.charAt(i) <= 110) || (cognome.charAt(i) >= 112 && cognome.charAt(i) <= 116) || (cognome.charAt(i) >= 118 && cognome.charAt(i) <= 122)) {
                    if (c > 0) {
                        c--;
                        codiceF += cognome.charAt(i);
                    }
                    if (c == 0) {
                        break;
                    }

                }

            }
            for (int i = 0; i < nome.length(); i++) {
                if (cognome.charAt(i) == 97 || cognome.charAt(i) == 101 || cognome.charAt(i) == 105 || cognome.charAt(i) == 111 || cognome.charAt(i) == 117) {
                    if (c2 > 0) {
                        c2--;
                        codiceF += cognome.charAt(i);
                    }
                    if (c2 == 0) {
                        break;
                    }
                }
            }
        }
        c = 0;
        c2 = 3;
        if (countC == 0) {
            for (int i = 0; i < cognome.length(); i++) {
                if (cognome.charAt(i) == 97 || cognome.charAt(i) == 101 || cognome.charAt(i) == 105 || cognome.charAt(i) == 111 || cognome.charAt(i) == 117) {
                    if (c2 > 0) {
                        c2--;
                        codiceF += cognome.charAt(i);
                    }
                    if (c2 == 0) {
                        break;
                    }
                }
            }
        }
        countC = 0;
        countV = 0;
        for (int i = 0; i < nome.length(); i++) {
            if ((nome.charAt(i) >= 98 && nome.charAt(i) <= 100) || (nome.charAt(i) >= 102 && nome.charAt(i) <= 104) || (nome.charAt(i) >= 106 && nome.charAt(i) <= 110) || (nome.charAt(i) >= 112 && nome.charAt(i) <= 116) || (nome.charAt(i) >= 118 && nome.charAt(i) <= 122)) {
                countC++;
            }
            if (nome.charAt(i) == 97 || nome.charAt(i) == 101 || nome.charAt(i) == 105 || nome.charAt(i) == 111 || nome.charAt(i) == 117) {
                countV++;
            }
        }
        int countC2 = 0;
        c = 3;
        if (countC > 3) {
            for (int i = 0; i < nome.length(); i++) {
                if ((nome.charAt(i) >= 98 && nome.charAt(i) <= 100) || (nome.charAt(i) >= 102 && nome.charAt(i) <= 104) || (nome.charAt(i) >= 106 && nome.charAt(i) <= 110) || (nome.charAt(i) >= 112 && nome.charAt(i) <= 116) || (nome.charAt(i) >= 118 && nome.charAt(i) <= 122)) {
                    countC2++;
                    if (countC2 == 2) {
                        continue;
                    }
                    if (c > 0) {
                        c--;
                        codiceF += nome.charAt(i);
                    }
                    if (c == 0) {
                        break;
                    }
                }
            }
        }
        c = 3;
        if (countC == 3) {
            for (int i = 0; i < nome.length(); i++) {
                if ((nome.charAt(i) >= 98 && nome.charAt(i) <= 100) || (nome.charAt(i) >= 102 && nome.charAt(i) <= 104) || (nome.charAt(i) >= 106 && nome.charAt(i) <= 110) || (nome.charAt(i) >= 112 && nome.charAt(i) <= 116) || (nome.charAt(i) >= 118 && nome.charAt(i) <= 122)) {
                    if (c > 0) {
                        c--;
                        codiceF += nome.charAt(i);
                    }
                    if (c == 0) {
                        break;
                    }

                }

            }

        }

        c = 2;
        c2 = 1;
        if (countC == 2) {
            for (int i = 0; i < nome.length(); i++) {
                if ((nome.charAt(i) >= 98 && nome.charAt(i) <= 100) || (nome.charAt(i) >= 102 && nome.charAt(i) <= 104) || (nome.charAt(i) >= 106 && nome.charAt(i) <= 110) || (nome.charAt(i) >= 112 && nome.charAt(i) <= 116) || (nome.charAt(i) >= 118 && nome.charAt(i) <= 122)) {
                    if (c > 0) {
                        c--;
                        codiceF += nome.charAt(i);
                    }
                    if (c == 0) {
                        break;
                    }

                }

            }
            for (int i = 0; i < nome.length(); i++) {
                if (nome.charAt(i) == 97 || nome.charAt(i) == 101 || nome.charAt(i) == 105 || nome.charAt(i) == 111 || nome.charAt(i) == 117) {
                    if (c2 > 0) {
                        c2--;
                        codiceF += nome.charAt(i);
                    }
                    if (c2 == 0) {
                        break;
                    }
                }
            }
        }
        c = 1;
        c2 = 2;
        if (countC == 1) {
            for (int i = 0; i < nome.length(); i++) {
                if ((nome.charAt(i) >= 98 && nome.charAt(i) <= 100) || (nome.charAt(i) >= 102 && nome.charAt(i) <= 104) || (nome.charAt(i) >= 106 && nome.charAt(i) <= 110) || (nome.charAt(i) >= 112 && nome.charAt(i) <= 116) || (nome.charAt(i) >= 118 && nome.charAt(i) <= 122)) {
                    if (c > 0) {
                        c--;
                        codiceF += nome.charAt(i);
                    }
                    if (c == 0) {
                        break;
                    }

                }

            }
            for (int i = 0; i < nome.length(); i++) {
                if (nome.charAt(i) == 97 || nome.charAt(i) == 101 || nome.charAt(i) == 105 || nome.charAt(i) == 111 || nome.charAt(i) == 117) {
                    if (c2 > 0) {
                        c2--;
                        codiceF += nome.charAt(i);
                    }
                    if (c2 == 0) {
                        break;
                    }
                }
            }
        }
        c = 0;
        c2 = 3;
        if (countC == 0) {
            for (int i = 0; i < nome.length(); i++) {
                if (nome.charAt(i) == 97 || nome.charAt(i) == 101 || nome.charAt(i) == 105 || nome.charAt(i) == 111 || nome.charAt(i) == 117) {
                    if (c2 > 0) {
                        c2--;
                        codiceF += nome.charAt(i);
                    }
                    if (c2 == 0) {
                        break;
                    }
                }
            }
        }

        if (codice.substring(0, 6).equals(codiceF)) {
            return "check";
        } else {
            return "nonC";
        }

    }

    protected ArrayList<Medico> medicoConPiuPazienti() {
        ArrayList<Medico> medP = new ArrayList<Medico>(10);
        if (!m.isEmpty()) {
            Medico med = m.get(0);
            int max = 0;
            int p = 0;
            for (int i = 0; i < m.size(); i++) {
                if (m.get(i).NPazienti > med.NPazienti) {
                    med = m.get(i);
                    p = i;
                }
            }
            medP.add(med);
            for (int i = 0; i < m.size(); i++) {
                if (m.get(i).NPazienti == med.NPazienti && i != p) {

                    medP.add(m.get(i));
                }
            }
            return medP;
        }

        return null;
    }

    protected ArrayList<Medico> ricercaM(String ric) {
        String ris = "NESSUN RISULTATO";
        ArrayList<Medico> med = new ArrayList<Medico>(10);
        int n = 0;
        String medic[] = new String[2];
        char c;
        switch (ric.length()) {
            case 0:
                break;
            case 1:
                boolean l = false;
                c = ric.charAt(0);
                for (int i = 0; i < m.size(); i++) {

                    if (m.get(i).nome.charAt(0) == c) {
                        med.add(new Medico((sottolineato(m.get(i).nome.toUpperCase().substring(0, 1)) + m.get(i).nome.toUpperCase().substring(1)), m.get(i).cognome.toUpperCase(), m.get(i).getCodice().toUpperCase(), m.get(i).NPazienti));
                        n = i;

                    }

                    if (m.get(i).cognome.charAt(0) == c) {

                        if (m.get(n).nome.equals(m.get(i).nome) && m.get(n).cognome.equals(m.get(i).cognome) && m.get(n).getCodice().equals(m.get(i).getCodice()) && m.get(i).NPazienti == m.get(n).NPazienti) {
                            
                            for (int y = 0; y < med.size(); y++) {
                                if (y == med.size() - 1) {
                                    med.get(y).cognome = sottolineato(m.get(i).cognome.toUpperCase().substring(0, 1)) + m.get(i).cognome.toUpperCase().substring(1);
                                    l = true;
                                }
                            }
                        }

                        if (l == false) {
                            med.add(new Medico(m.get(i).nome.toUpperCase(), sottolineato(m.get(i).cognome.toUpperCase().substring(0, 1)) + m.get(i).cognome.toUpperCase().substring(1), m.get(i).getCodice().toUpperCase(), m.get(i).NPazienti));
                            l = true;
                            n = i;

                        }

                    }

                    if (m.get(i).getCodice().charAt(0) == c) {

                        if (m.get(n).nome.equals(m.get(i).nome) && m.get(n).cognome.equals(m.get(i).cognome) && m.get(n).getCodice().equals(m.get(i).getCodice()) && m.get(i).NPazienti == m.get(n).NPazienti) {
                            
                            for (int y = 0; y < med.size(); y++) {
                                if (y == med.size() - 1) {
                                    med.get(y).setCodice(sottolineato(m.get(i).getCodice().toUpperCase().substring(0, 1)) + m.get(i).getCodice().toUpperCase().substring(1));
                                    l = true;
                                }
                            }
                        }

                        if (l == false) {
                            l = true;
                            med.add(new Medico(m.get(i).nome.toUpperCase(), m.get(i).cognome.toUpperCase(), sottolineato(m.get(i).getCodice().toUpperCase().substring(0, 1)) + m.get(i).getCodice().toUpperCase().substring(1), m.get(i).NPazienti));

                        }

                    }

                    if (String.valueOf(m.get(i).NPazienti).charAt(0) == c) {

                        if (m.get(n).nome.equals(m.get(i).nome) && m.get(n).cognome.equals(m.get(i).cognome) && m.get(n).getCodice().equals(m.get(i).getCodice()) && m.get(i).NPazienti == m.get(n).NPazienti) {
                            
                            for (int y = 0; y < med.size(); y++) {
                                if (y == med.size() - 1) {
                                    med.get(y).NPazienti = med.get(i).NPazienti;
                                    l = true;
                                }
                            }
                        }

                        if (l == false) {
                            l = true;
                            n = i;
                            med.add(new Medico(m.get(i).nome.toUpperCase(), m.get(i).cognome.toUpperCase(), m.get(i).getCodice().toUpperCase(), m.get(i).NPazienti));

                        }

                    }

                }

                break;

            default:
                boolean o = false;
                for (int i = 0; i < m.size(); i++) {
                    if (m.get(i).nome.length() > ric.length()) {
                        if (m.get(i).nome.substring(0, ric.length()).equals(ric)) {
                            med.add(new Medico(sottolineato(m.get(i).nome.toUpperCase().substring(0, ric.length())) + m.get(i).nome.toUpperCase().substring(ric.length()), m.get(i).cognome.toLowerCase(), m.get(i).getCodice().toLowerCase(), m.get(i).NPazienti));
                            n = i;
                        }
                    }
                    if (m.get(i).nome.length() == ric.length()) {
                        if (m.get(i).nome.equals(ric)) {
                            med.add(new Medico(sottolineato(m.get(i).nome.toUpperCase()), m.get(i).cognome.toLowerCase(), m.get(i).getCodice().toLowerCase(), m.get(i).NPazienti));
                            n = i;
                        }
                    }

                    if (m.get(i).cognome.length() > ric.length()) {
                        if (m.get(i).cognome.substring(0, ric.length()).equals(ric)) {

                            if (m.get(n).nome.equals(m.get(i).nome) && m.get(n).cognome.equals(m.get(i).cognome) && m.get(n).getCodice().equals(m.get(i).getCodice()) && m.get(i).NPazienti == m.get(n).NPazienti) {
                                
                                for (int y = 0; y < med.size(); y++) {
                                    if (y == med.size() - 1) {
                                        med.get(y).cognome = sottolineato(m.get(i).cognome.toUpperCase().substring(0, ric.length())) + m.get(i).cognome.toUpperCase().substring(ric.length());
                                        o = true;
                                    }
                                }
                            }

                            if (o == false) {
                                o = true;
                                n = i;
                                med.add(new Medico(m.get(i).nome.toLowerCase(), sottolineato(m.get(i).cognome.toUpperCase().substring(0, ric.length())) + m.get(i).cognome.toUpperCase().substring(ric.length()), m.get(i).getCodice().toLowerCase(), m.get(i).NPazienti));

                            }

                        }
                    }
                        if (m.get(i).cognome.length() == ric.length()) {
                            if (m.get(i).cognome.equals(ric)) {

                                if (m.get(n).nome.equals(m.get(i).nome) && m.get(n).cognome.equals(m.get(i).cognome) && m.get(n).getCodice().equals(m.get(i).getCodice()) && m.get(i).NPazienti == m.get(n).NPazienti) {
                                    
                                    for (int y = 0; y < med.size(); y++) {
                                        if (y == med.size() - 1) {
                                            med.get(y).cognome = sottolineato(m.get(i).cognome.toUpperCase());
                                            o = true;
                                        }
                                    }
                                }

                                if (o == false) {
                                    o = true;
                                    n = i;
                                    med.add(new Medico(m.get(i).nome.toLowerCase(), sottolineato(m.get(i).cognome.toUpperCase()), m.get(i).getCodice().toLowerCase(), m.get(i).NPazienti));

                                }

                            }

                        }
                    

                    if (m.get(i).getCodice().length() > ric.length()) {
                        if (m.get(i).getCodice().substring(0, ric.length()).equals(ric)) {

                            if (m.get(n).nome.equals(m.get(i).nome) && m.get(n).cognome.equals(m.get(i).cognome) && m.get(n).getCodice().equals(m.get(i).getCodice()) && m.get(i).NPazienti == m.get(n).NPazienti) {
                                
                                for (int y = 0; y < med.size(); y++) {
                                    if (y == med.size() - 1) {
                                        med.get(y).setCodice(sottolineato(m.get(i).getCodice().toUpperCase().substring(0, ric.length())) + m.get(i).getCodice().toUpperCase().substring(ric.length()));
                                        o = true;
                                    }
                                }
                            }

                            if (o == false) {
                                o = true;
                                n = i;
                                med.add(new Medico(m.get(i).nome.toLowerCase(), m.get(i).cognome.toLowerCase(), sottolineato(m.get(i).getCodice().toUpperCase().substring(0, ric.length())) + m.get(i).getCodice().toUpperCase().substring(ric.length()), m.get(i).NPazienti));

                            }

                        }
                    }
                    if (m.get(i).getCodice().length() == ric.length()) {
                        if (m.get(i).getCodice().equals(ric)) {

                            if (m.get(i).getCodice().substring(0, ric.length()).equals(ric)) {

                                if (m.get(n).nome.equals(m.get(i).nome) && m.get(n).cognome.equals(m.get(i).cognome) && m.get(n).getCodice().equals(m.get(i).getCodice()) && m.get(i).NPazienti == m.get(n).NPazienti) {
                                    
                                    for (int y = 0; y < med.size(); y++) {
                                        if (y == med.size() - 1) {
                                            med.get(y).setCodice(sottolineato(m.get(i).getCodice().toUpperCase()));
                                            o = true;
                                        }
                                    }
                                }

                                if (o == false) {
                                    o = true;
                                    n = i;
                                    med.add(new Medico(m.get(i).nome.toLowerCase(), m.get(i).cognome.toLowerCase(), sottolineato(m.get(i).getCodice().toUpperCase()), m.get(i).NPazienti));

                                }

                            }
                        }

                    }

                    if (String.valueOf(m.get(i).NPazienti).length() > ric.length()) {
                        if (String.valueOf(m.get(i).NPazienti).substring(0, ric.length()).equals(ric)) {

                            if (m.get(n).nome.equals(m.get(i).nome) && m.get(n).cognome.equals(m.get(i).cognome) && m.get(n).getCodice().equals(m.get(i).getCodice()) && m.get(i).NPazienti == m.get(n).NPazienti) {
                                
                                for (int y = 0; y < med.size(); y++) {
                                    if (y == med.size() - 1) {
                                        med.get(y).NPazienti = m.get(i).NPazienti;
                                        o = true;
                                    }
                                }
                            }

                            if (o == false) {
                                o = true;
                                n = i;
                                med.add(new Medico(m.get(i).nome.toLowerCase(), m.get(i).cognome.toLowerCase(), m.get(i).getCodice().toUpperCase(), m.get(i).NPazienti));

                            }

                        }
                    }
                    if (String.valueOf(m.get(i).NPazienti).length() == ric.length()) {
                        if (String.valueOf(m.get(i).NPazienti).substring(0, ric.length()).equals(ric)) {

                            if (m.get(n).nome.equals(m.get(i).nome) && m.get(n).cognome.equals(m.get(i).cognome) && m.get(n).getCodice().equals(m.get(i).getCodice()) && m.get(i).NPazienti == m.get(n).NPazienti) {
                                
                                for (int y = 0; y < med.size(); y++) {
                                    if (y == med.size() - 1) {
                                        med.get(y).NPazienti = m.get(i).NPazienti;
                                        o = true;
                                    }
                                }
                            }

                            if (o == false) {
                                o = true;
                                n = i;
                                med.add(new Medico(m.get(i).nome.toLowerCase(), m.get(i).cognome.toLowerCase(), m.get(i).getCodice().toUpperCase(), m.get(i).NPazienti));

                            }

                        }

                    }

                }

        }
        return med;
    }

    private String sottolineato(String c) {
        String u[] = {"A̲", "B̲", "C̲", "D̲", "E̲", "F̲", "G̲", "H̲", "I̲", "J̲", "K̲", "L̲", "M̲", "N̲", "O̲", "P̲", "Q̲", "R̲", "S̲", "T̲", "U̲", "V̲", "W̲", "X̲", "Y̲", "Z̲"};
        String n[] = {"0̲", "1̲", "2͟", "3̲", "4̲", "5̲", "6̲", "7̲", "8̲", "9̲"};
        char g[] = new char[c.length()];

        String ris = "";
        for (int i = 0; i < c.length(); i++) {
            g[i] = c.charAt(i);
        }
        for (int i = 0; i < g.length; i++) {
            if (g[i] >= 65 && g[i] <= 90) {
                ris += u[g[i] - 65];
            }
            if (g[i] >= 48 && g[i] <= 57) {
                ris += n[g[i] - 48];
            }
        }
        return ris;
    }

    protected ArrayList<Paziente> ricercaP(String ric) {
        String ris = "NESSUN RISULTATO";
        ArrayList<Paziente> pa = new ArrayList<Paziente>(10);
        int contr[][] = new int[p.size()][5];
        int n = 0;
        int lo = 0;
        String medic[] = new String[2];
        char c;
        switch (ric.length()) {
            case 0:
                break;
            case 1:
                boolean l = false;
                c = ric.charAt(0);
                for (int i = 0; i < p.size(); i++) {

                    if (p.get(i).nome.charAt(0) == c) {
                        pa.add(new Paziente((sottolineato(p.get(i).nome.toUpperCase().substring(0, 1)) + p.get(i).nome.toUpperCase().substring(1)), p.get(i).cognome.toUpperCase(), p.get(i).getCodiceFiscale().toUpperCase(), p.get(i).getMedico()));
                        n = i;

                    }

                    if (p.get(i).cognome.charAt(0) == c) {

                        if (p.get(n).nome.equals(p.get(i).nome) && p.get(n).cognome.equals(p.get(i).cognome) && p.get(n).getCodiceFiscale().equals(p.get(i).getCodiceFiscale()) && Arrays.equals(p.get(n).getMedico(), p.get(i).getMedico())) {
                            
                            for (int y = 0; y < pa.size(); y++) {
                                if (y == pa.size() - 1) {
                                    pa.get(y).cognome = sottolineato(p.get(i).cognome.toUpperCase().substring(0, 1)) + p.get(i).cognome.toUpperCase().substring(1);
                                    l = true;
                                }
                            }
                        }

                        if (l == false) {
                            l = true;
                            n = i;
                            pa.add(new Paziente(p.get(i).nome.toUpperCase(), sottolineato(p.get(i).cognome.toUpperCase().substring(0, 1)) + p.get(i).cognome.toUpperCase().substring(1), p.get(i).getCodiceFiscale().toLowerCase(), p.get(i).getMedico()));

                        }

                    }

                    if (p.get(i).getCodiceFiscale().charAt(0) == c) {

                        if (p.get(n).nome.equals(p.get(i).nome) && p.get(n).cognome.equals(p.get(i).cognome) && p.get(n).getCodiceFiscale().equals(p.get(i).getCodiceFiscale()) && Arrays.equals(p.get(n).getMedico(), p.get(i).getMedico())) {
                            
                            for (int y = 0; y < pa.size(); y++) {
                                if (y == pa.size() - 1) {
                                    pa.get(y).setCodiceFiscale(sottolineato(p.get(i).getCodiceFiscale().toUpperCase().substring(0, 1)) + p.get(i).getCodiceFiscale().toUpperCase().substring(1));
                                    l = true;
                                }
                            }
                        }

                        if (l == false) {
                            l = true;
                            n = i;
                            pa.add(new Paziente(p.get(i).nome.toUpperCase(), p.get(i).cognome.toUpperCase(), sottolineato(p.get(i).getCodiceFiscale().toUpperCase().substring(0, 1)) + p.get(i).getCodiceFiscale().toUpperCase().substring(1), p.get(i).getMedico()));

                        }

                    }

                    if (p.get(i).getMedico()[0].charAt(0) == c) {

                        if (p.get(n).nome.equals(p.get(i).nome) && p.get(n).cognome.equals(p.get(i).cognome) && p.get(n).getCodiceFiscale().equals(p.get(i).getCodiceFiscale()) && Arrays.equals(p.get(n).getMedico(), p.get(i).getMedico())) {
                            
                            for (int y = 0; y < pa.size(); y++) {
                                if (y == pa.size() - 1) {
                                    medic[0] = sottolineato(p.get(i).getMedico()[0].toUpperCase().substring(0, 1)) + p.get(i).getMedico()[0].substring(1);
                                    medic[1] = p.get(i).getMedico()[1].toUpperCase();
                                    pa.get(y).setMedico(medic);
                                    l = true;
                                }
                            }
                        }

                        if (l == false) {
                            l = true;
                            n = i;
                            medic[0] = sottolineato(p.get(i).getMedico()[0].toUpperCase().substring(0, 1)) + p.get(i).getMedico()[0].substring(1);
                            medic[1] = p.get(i).getMedico()[1].toUpperCase();
                            pa.add(new Paziente(p.get(i).nome.toUpperCase(), p.get(i).cognome.toUpperCase(), p.get(i).getCodiceFiscale().toUpperCase(), medic));

                        }

                    }

                    if (p.get(i)
                            .getMedico()[1].charAt(0) == c) {

                        if (p.get(n).nome.equals(p.get(i).nome) && p.get(n).cognome.equals(p.get(i).cognome) && p.get(n).getCodiceFiscale().equals(p.get(i).getCodiceFiscale()) && Arrays.equals(p.get(n).getMedico(), p.get(i).getMedico())) {
                            
                            for (int y = 0; y < pa.size(); y++) {
                                if (y == pa.size() - 1) {
                                    medic[0] = p.get(i).getMedico()[0].toUpperCase();
                                    medic[1] = sottolineato(p.get(i).getMedico()[1].toUpperCase().substring(0, 1)) + p.get(i).getMedico()[1].toUpperCase().substring(1);
                                    pa.get(y).setMedico(medic);
                                    l = true;
                                }
                            }
                        }

                        if (l == false) {
                            medic[0] = p.get(i).getMedico()[0].toUpperCase();
                            medic[1] = sottolineato(p.get(i).getMedico()[1].toUpperCase().substring(0, 1)) + p.get(i).getMedico()[1].toUpperCase().substring(1);
                            pa.add(new Paziente(p.get(i).nome.toLowerCase(), p.get(i).cognome.toLowerCase(), p.get(i).getCodiceFiscale().toLowerCase(), medic));
                            l = true;
                            n = i;
                        }

                    }

                }

                break;

            default:
                boolean o = false;
                for (int i = 0; i < p.size(); i++) {
                    if (p.get(i).nome.length() > ric.length()) {
                        if (p.get(i).nome.substring(0, ric.length()).equals(ric)) {
                            pa.add(new Paziente(sottolineato(p.get(i).nome.toUpperCase().substring(0, ric.length())) + p.get(i).nome.toUpperCase().substring(ric.length()), p.get(i).cognome.toLowerCase(), p.get(i).getCodiceFiscale().toLowerCase(), p.get(i).getMedico()));
                            n = i;
                        }
                    }
                    if (p.get(i).nome.length() == ric.length()) {
                        if (p.get(i).nome.equals(ric)) {
                            pa.add(new Paziente(sottolineato(p.get(i).nome.toUpperCase().substring(0, ric.length())) + p.get(i).nome.toUpperCase().substring(ric.length()), p.get(i).cognome.toLowerCase(), p.get(i).getCodiceFiscale().toLowerCase(), p.get(i).getMedico()));
                            n = i;
                        }
                    }

                    if (p.get(i).cognome.length() > ric.length()) {
                        if (p.get(i).cognome.substring(0, ric.length()).equals(ric)) {

                            if (p.get(n).nome.equals(p.get(i).nome) && p.get(n).cognome.equals(p.get(i).cognome) && p.get(n).getCodiceFiscale().equals(p.get(i).getCodiceFiscale()) && Arrays.equals(p.get(n).getMedico(), p.get(i).getMedico())) {
                                
                                for (int y = 0; y < pa.size(); y++) {
                                    if (y == pa.size() - 1) {
                                        o = true;
                                        pa.get(y).cognome = sottolineato(p.get(i).cognome.toUpperCase().substring(0, ric.length())) + p.get(i).cognome.toUpperCase().substring(ric.length());
                                    }
                                }
                            }

                            if (o == false) {
                                o = true;
                                n = i;
                                pa.add(new Paziente(p.get(i).nome.toLowerCase(), sottolineato(p.get(i).cognome.toUpperCase().substring(0, ric.length())) + p.get(i).cognome.toUpperCase().substring(ric.length()), p.get(i).getCodiceFiscale().toLowerCase(), p.get(i).getMedico()));

                            }

                        }
                    }
                        if (p.get(i).cognome.length() == ric.length()) {
                            if (p.get(i).cognome.equals(ric)) {

                                if (p.get(n).nome.equals(p.get(i).nome) && p.get(n).cognome.equals(p.get(i).cognome) && p.get(n).getCodiceFiscale().equals(p.get(i).getCodiceFiscale()) && Arrays.equals(p.get(n).getMedico(), p.get(i).getMedico())) {
                                    
                                    for (int y = 0; y < pa.size(); y++) {
                                        if (y == pa.size() - 1) {
                                            o = true;
                                            pa.get(y).cognome = sottolineato(p.get(i).cognome.toUpperCase());
                                        }
                                    }
                                }

                                if (o == false) {
                                    o = true;
                                    n = i;
                                    pa.add(new Paziente(p.get(i).nome.toLowerCase(), sottolineato(p.get(i).cognome.toUpperCase()), p.get(i).getCodiceFiscale().toLowerCase(), p.get(i).getMedico()));

                                }

                            }

                        }
                    

                    if (p.get(i).getCodiceFiscale().length() > ric.length()) {
                        if (p.get(i).getCodiceFiscale().substring(0, ric.length()).equals(ric)) {

                            if (p.get(n).nome.equals(p.get(i).nome) && p.get(n).cognome.equals(p.get(i).cognome) && p.get(n).getCodiceFiscale().equals(p.get(i).getCodiceFiscale()) && Arrays.equals(p.get(n).getMedico(), p.get(i).getMedico())) {
                                
                                for (int y = 0; y < pa.size(); y++) {
                                    if (y == pa.size() - 1) {
                                        o = true;
                                        pa.get(y).setCodiceFiscale(sottolineato(p.get(i).getCodiceFiscale().toUpperCase().substring(0, ric.length())) + p.get(i).getCodiceFiscale().toUpperCase().substring(ric.length()));
                                    }
                                }
                            }

                            if (o == false) {
                                o = true;
                                n = i;
                                pa.add(new Paziente(p.get(i).nome.toLowerCase(), p.get(i).cognome.toLowerCase(), sottolineato(p.get(i).getCodiceFiscale().toUpperCase().substring(0, ric.length())) + p.get(i).getCodiceFiscale().toUpperCase().substring(ric.length()), p.get(i).getMedico()));

                            }

                        }
                    }
                    if (p.get(i).getCodiceFiscale().length() == ric.length()) {
                        if (p.get(i).getCodiceFiscale().equals(ric)) {

                            if (p.get(i).getCodiceFiscale().substring(0, ric.length()).equals(ric)) {

                                if (p.get(n).nome.equals(p.get(i).nome) && p.get(n).cognome.equals(p.get(i).cognome) && p.get(n).getCodiceFiscale().equals(p.get(i).getCodiceFiscale()) && Arrays.equals(p.get(n).getMedico(), p.get(i).getMedico())) {
                                    
                                    for (int y = 0; y < pa.size(); y++) {
                                        if (y == pa.size() - 1) {
                                            o = true;
                                            pa.get(y).setCodiceFiscale(sottolineato(p.get(i).getCodiceFiscale().toUpperCase()));
                                        }
                                    }
                                }

                                if (o == false) {
                                    o = true;
                                    n = i;
                                    pa.add(new Paziente(p.get(i).nome.toLowerCase(), p.get(i).cognome.toLowerCase(), sottolineato(p.get(i).getCodiceFiscale().toUpperCase()), p.get(i).getMedico()));

                                }

                            }
                        }

                    }

                    if (p.get(i).getMedico()[0].length() > ric.length()) {
                        if (p.get(i).getMedico()[0].substring(0, ric.length()).equals(ric)) {

                            if (p.get(n).nome.equals(p.get(i).nome) && p.get(n).cognome.equals(p.get(i).cognome) && p.get(n).getCodiceFiscale().equals(p.get(i).getCodiceFiscale()) && Arrays.equals(p.get(n).getMedico(), p.get(i).getMedico())) {
                                
                                for (int y = 0; y < pa.size(); y++) {
                                    if (y == pa.size() - 1) {
                                        o = true;
                                        medic[0] = sottolineato(p.get(i).getMedico()[0].toUpperCase().substring(0, ric.length())) + p.get(i).getMedico()[0].toUpperCase().substring(ric.length());
                                        medic[1] = p.get(i).getMedico()[1];
                                        pa.get(y).setMedico(medic);
                                    }
                                }
                            }

                            if (o == false) {
                                o = true;
                                n = i;
                                medic[0] = sottolineato(p.get(i).getMedico()[0].toUpperCase().substring(0, ric.length())) + p.get(i).getMedico()[0].toUpperCase().substring(ric.length());
                                medic[1] = p.get(i).getMedico()[1];
                                pa.add(new Paziente(p.get(i).nome.toLowerCase(), p.get(i).cognome.toLowerCase(), p.get(i).getCodiceFiscale().toLowerCase(), medic));

                            }

                        }
                    }
                    if (p.get(i).getMedico()[0].length() == ric.length()) {
                        if (p.get(i).getMedico()[0].equals(ric)) {

                            if (p.get(n).nome.equals(p.get(i).nome) && p.get(n).cognome.equals(p.get(i).cognome) && p.get(n).getCodiceFiscale().equals(p.get(i).getCodiceFiscale()) && Arrays.equals(p.get(n).getMedico(), p.get(i).getMedico())) {
                                
                                for (int y = 0; y < pa.size(); y++) {
                                    if (y == pa.size() - 1) {
                                        o = true;
                                        medic[0] = sottolineato(p.get(i).getMedico()[0].toUpperCase());
                                        medic[1] = p.get(i).getMedico()[1];
                                        pa.get(y).setMedico(medic);
                                    }
                                }
                            }

                            if (o == false) {
                                o = true;
                                n = i;
                                medic[0] = sottolineato(p.get(i).getMedico()[0].toUpperCase());
                                medic[1] = p.get(i).getMedico()[1];
                                pa.add(new Paziente(p.get(i).nome.toLowerCase(), p.get(i).cognome.toLowerCase(), p.get(i).getCodiceFiscale().toLowerCase(), medic));

                            }

                        }

                    }

                    if (p.get(i).getMedico()[1].length() > ric.length()) {
                        if (p.get(i).getMedico()[1].substring(0, ric.length()).equals(ric)) {

                            if (p.get(n).nome.equals(p.get(i).nome) && p.get(n).cognome.equals(p.get(i).cognome) && p.get(n).getCodiceFiscale().equals(p.get(i).getCodiceFiscale()) && Arrays.equals(p.get(n).getMedico(), p.get(i).getMedico())) {
                                
                                for (int y = 0; y < pa.size(); y++) {
                                    if (y == pa.size() - 1) {
                                        o = true;
                                        medic[1] = sottolineato(p.get(i).getMedico()[1].toUpperCase().substring(0, ric.length())) + p.get(i).getMedico()[1].toUpperCase().substring(ric.length());
                                        medic[0] = p.get(i).getMedico()[0];
                                        pa.get(y).setMedico(medic);
                                    }
                                }
                            }

                            if (o == false) {
                                o = true;
                                n = i;
                                medic[1] = sottolineato(p.get(i).getMedico()[1].toUpperCase().substring(0, ric.length())) + p.get(i).getMedico()[1].toUpperCase().substring(ric.length());
                                medic[0] = p.get(i).getMedico()[1];
                                pa.add(new Paziente(p.get(i).nome.toLowerCase(), p.get(i).cognome.toLowerCase(), p.get(i).getCodiceFiscale().toLowerCase(), medic));

                            }

                        }
                    }
                    if (p.get(i).getMedico()[1].length() == ric.length()) {
                        if (p.get(i).getMedico()[1].equals(ric)) {

                            if (p.get(n).nome.equals(p.get(i).nome) && p.get(n).cognome.equals(p.get(i).cognome) && p.get(n).getCodiceFiscale().equals(p.get(i).getCodiceFiscale()) && Arrays.equals(p.get(n).getMedico(), p.get(i).getMedico())) {
                                
                                for (int y = 0; y < pa.size(); y++) {
                                    if (y == pa.size() - 1) {
                                        o = true;
                                        medic[1] = sottolineato(p.get(i).getMedico()[1].toUpperCase());
                                        medic[0] = p.get(i).getMedico()[0];
                                        pa.get(y).setMedico(medic);
                                    }
                                }
                            }

                            if (o == false) {
                                o = true;
                                n = i;
                                medic[1] = sottolineato(p.get(i).getMedico()[1].toUpperCase());
                                medic[0] = p.get(i).getMedico()[0];
                                pa.add(new Paziente(p.get(i).nome.toLowerCase(), p.get(i).cognome.toLowerCase(), p.get(i).getCodiceFiscale().toLowerCase(), medic));

                            }

                        }

                    }

                }

        }
        return pa;
    }

    public String CheckRegistrazione(String nome, String cognome, String codice) throws IOException {
        if (nome.equals("") || cognome.equals("") || codice.equals("")) {
            return "vuoto";
        }
        for (int i = 0; i < nome.length(); i++) {
            if (nome.charAt(i) == ' ') {
                return "Nspazio";
            }
            if (((nome.charAt(i)) > 48 && (nome.charAt(i) < 57))) {
                return "Nnumeri";
            }
        }
        for (int i = 0; i < cognome.length(); i++) {
            if (cognome.charAt(i) == ' ') {
                return "Cspazio";
            }
            if (((cognome.charAt(i)) > 48 && (cognome.charAt(i) < 57))) {
                return "Cnumeri";
            }
        }
        if (nome.length() < 3) {
            return "lungN";
        }
        if (cognome.length() < 3) {
            return "lungC";
        }
        if (ConfrontoCodice(codice, nome, cognome).equals("check")) {

        }
        if (ConfrontoCodice(codice, nome, cognome).equals("nonC")) {
            return "nonC";
        }
        if (checkCodiceF(codice) == true) {

        } else {
            return "codice";
        }

        return "check";
    }

    private boolean checkCodiceF(String codice) {
        int countN = 0;
        if (codice.length() != 16) {
            return false;
        }
        for (int i = 0; i < codice.length(); i++) {
            if (codice.charAt(i) >= 48 && codice.charAt(i) <= 57) {
                countN++;
            }
            if (i >= 0 && i <= 5) {

                if (codice.toLowerCase().charAt(i) < 97 || codice.toLowerCase().charAt(i) > 122) {
                    return false;
                }
            }
            if (i >= 6 && i <= 7) {
                if (codice.toLowerCase().charAt(i) < 48 || codice.toLowerCase().charAt(i) > 57) {
                    return false;
                }
            }
            if (i == 8) {

                if (codice.toLowerCase().charAt(i) < 97 || codice.toLowerCase().charAt(i) > 122) {
                    return false;
                }
            }
            if (i >= 9 && i <= 10) {
                if (codice.toLowerCase().charAt(i) < 48 || codice.toLowerCase().charAt(i) > 57) {
                    return false;
                }
            }
            if (i == 11) {

                if (codice.toLowerCase().charAt(i) < 97 || codice.toLowerCase().charAt(i) > 122) {
                    return false;
                }
            }
            if (i >= 12 && i <= 14) {
                if (codice.toLowerCase().charAt(i) < 48 || codice.toLowerCase().charAt(i) > 57) {
                    return false;
                }
            }
            if (i == 15) {

                if (codice.toLowerCase().charAt(i) < 97 || codice.toLowerCase().charAt(i) > 122) {
                    return false;
                }
            }
        }
        if (countN != 7) {
            return false;
        }

        return true;
    }

    public String[] aggiornamento() {
        String[] medici = new String[m.size()];
        String n = "";
        for (int i = 0; i < m.size(); i++) {
            for (int j = 0; j < m.get(i).getCodice().length(); j++) {

                n += m.get(i).getCodice().charAt(j);

            }
            medici[i] = m.get(i).nome.toUpperCase() + " " + m.get(i).cognome.toUpperCase() + " " + n.toUpperCase();

            n = "";
        }
        return medici;
    }

    public String NuovoMedico(String nome, String cognome, String codice, ArrayList<String> specializzazione) throws IOException {

        if (CheckRegistrazione(nome, cognome, codice).equals("check")) {
            if (checkDoppi(nome, cognome, codice) == 0) {
                Medico med = new Medico(nome, cognome, codice);
                med.setSpecializzazione(gest.NuovaSpecializzazione(nome, cognome, codice, specializzazione, m));
                if (gest.CheckSpecializzazione(med.getSpecializzazione(), nome, cognome, codice, m, 1).equals("check")) {
                    m.add(med);
                    gest.AggiungiNelDatabase(med);
                    return "check";
                } else {
                    med.getSpecializzazione().delete();
                    return gest.CheckSpecializzazione(med.getSpecializzazione(), nome, cognome, codice, m, 1);
                }

            }
            return "doppi";
        } else {
            return "errore";
        }
    }

    public void NuovoPaziente(String nome, String cognome, String codice, String medico) throws IOException {
        String ris = "";
        if (Gestione_Liste.this.CheckRegistrazione(nome, cognome, codice, medico.toLowerCase()).equals("check")) {
            if (checkDoppi(nome, cognome, codice, medico.toLowerCase()) == 0) {
                Paziente pa = new Paziente(nome, cognome, codice, medico.toLowerCase().split(" "));
                for (int i = 0; i < m.size(); i++) {

                    if (m.get(i).nome.equals(medico.toLowerCase().split(" ")[0]) && m.get(i).cognome.equals(medico.toLowerCase().split(" ")[1]) && m.get(i).getCodice().equals(medico.toLowerCase().split(" ")[2])) {
                        ris = gest.AggiornaMedico(medico, m);
                        m.get(i).AggiungiPaziente();
                        if (ris.equals("errore")) {
                            System.out.println("Errore Nuovo Paziente");
                            return;
                        }
                    }
                }
                p.add(pa);
                gest.AggiungiNelDatabase(pa);
            }
        } else {

        }

    }

    public int checkDoppi(String nome, String cognome, String codice, String medico) {
        String nomeM = medico.split(" ")[0].toLowerCase();
        String cognomeM = medico.split(" ")[1].toLowerCase();
        String codiceM = medico.split(" ")[2].toLowerCase();
        for (int i = 0; i < p.size(); i++) {
            if (p.get(i).nome.equals(nome) && p.get(i).cognome.equals(cognome) && p.get(i).getMedico()[0].equals(nomeM) && p.get(i).cognome.equals(cognome) && p.get(i).getMedico()[1].equals(cognomeM) && p.get(i).getMedico()[2].equals(codiceM) && p.get(i).getCodiceFiscale().equals(codice)) {
                return 1;
            }
            if (p.get(i).getCodiceFiscale().equals(codice)) {
                return 1;
            }
        }
        return 0;
    }

    public int checkDoppi(String nome, String cognome, String codice) {

        for (int i = 0; i < m.size(); i++) {
            if (m.get(i).nome.equals(nome) && m.get(i).cognome.equals(cognome)) {
                if (m.get(i).getCodice().equals(codice)) {
                    return 2;
                }

            }

        }
        return 0;
    }

    public ArrayList<Medico> getM() {
        return m;
    }

    public void setM(ArrayList<Medico> m) {
        this.m = m;
    }

    public ArrayList<Paziente> getP() {
        return p;
    }

    public void setP(ArrayList<Paziente> p) {
        this.p = p;
    }

}
