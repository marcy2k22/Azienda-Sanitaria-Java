package azienda_sanitaria;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Login {

    private String id;
    private String password;
    private String mail;
    File log;

    public Login() {
        log = new File("log/log.txt");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String CheckDoppi(String mail) throws FileNotFoundException, IOException{
        int righe = 0;
        try ( BufferedReader r = new BufferedReader(new FileReader(log))) {
            while (r.readLine() != null) {
                righe++;
            }
            r.close();
        } catch (IOException e) {
            System.out.println("Errore");
        }
        String riga;
        BufferedReader r = new BufferedReader(new FileReader(log));
        for(int i=0; i<righe; i++){
            riga = r.readLine();
            if(mail.equals(riga.split("-")[1])){
                return "uguali";
            }
        }
        r.close();
        return "check";
    }
    
    public String ControllaMail(String mail) {
        int p = 0;
        int q = 0;
        int pos =0;
        int pos2 =0;
        for (int i = 0; i < mail.length(); i++) {
            if (mail.charAt(i) == '.') {
                p++;
                pos = i+1;
            }
            if (mail.charAt(i) == '@') {
                q++;
                pos2 = i+1;
            }
        }
        for (int i = 0; i < mail.split("@")[0].length(); i++) {
            if (!(mail.split("@")[0].charAt(i) >= 97 && mail.split("@")[0].charAt(i) <= 122) || (mail.split("@")[0].charAt(i) >= 48 && mail.split("@")[0].charAt(i) <= 57)) {
                return "NV";
            }
        }
        String e="";
        String dom = "";
        for(int i=pos; i<mail.length(); i++){
            e += mail.charAt(i);
            
        }
        for(int i=pos2; i<pos-1; i++){
            dom += mail.charAt(i);
        }
        
        if (!(e.equals("gov"))) {
            return "NV";
        }
        if (!(dom.equals("aziendasanitaria"))) {
            return "NV";
        }
        if (p != 1) {
            return "NV";
        }
        if (q != 1) {
            return "NV";
        }
        
        return "check";
    }

    private char LettereCasuali() {
        Random random = new Random();
        int num = random.nextInt(26) + 65;
        char c = (char) num;
        return c;
    }

    private char NumeriCasuali() {
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 48;
        char c = (char) randomNumber;
        return c;
    }

    public void GeneraPassword(String mail) {
        try {
            BufferedWriter w = new BufferedWriter(new FileWriter("mail/" + mail + ".txt"));
            String password = "";
            for (int i = 0; i < 3; i++) {
                password += LettereCasuali();
            }
            for (int i = 0; i < 2; i++) {
                password += NumeriCasuali();
            }
            for (int i = 0; i < 2; i++) {
                password += LettereCasuali();
            }
            for (int i = 0; i < 3; i++) {
                password += NumeriCasuali();
            }
            this.password = password;
            w.write("Mail: " + mail + "\nPassword: " + this.password);
            w.close();
        } catch (IOException ex) {
            System.out.println("Errore nella creazione di una password.");
        }

    }

    public String generaID(String mail) throws FileNotFoundException, IOException {
        String ID = "";
        int righe = 0;
        try ( BufferedReader r = new BufferedReader(new FileReader(log))) {
            while (r.readLine() != null) {
                righe++;
            }
            r.close();
        } catch (IOException e) {
            System.out.println("Errore");
        }
        BufferedReader r = new BufferedReader(new FileReader(log));
        String riga = "";
        boolean c = false;
        for (int i = 0; i < righe; i++) {
            riga = r.readLine();
            if (!(riga.split("-")[0].charAt(0) >= 48 && riga.split("-")[0].charAt(0) <= 57)) {
                c = true;
            }
            if ((riga.split("-")[0].charAt(0) >= 48 && riga.split("-")[0].charAt(0) <= 57)) {
                c = false;
            }
        }
        r.close();
        if (c == true) {
            ID = "0000";
        }
        if (c == false) {
            int n = Integer.valueOf(riga.split("-")[0]);
            n++;
            if (String.valueOf(n).length() == 1) {
                ID = "000" + n;
            }
            if (String.valueOf(n).length() == 2) {
                ID = "00" + n;
            }
            if (String.valueOf(n).length() == 3) {
                ID = "0" + n;
            }
            if (String.valueOf(n).length() == 4) {
                ID = "" + n;
            }

        }
        BufferedWriter w = new BufferedWriter(new FileWriter(log, true));
        w.write(ID + "-" + mail+"\n");
        w.close();
        
        return ID;
    }
    
    public String ControllaId(String id) throws FileNotFoundException, IOException {
        int righe = 0;
        try ( BufferedReader r = new BufferedReader(new FileReader(log))) {
            while (r.readLine() != null) {
                righe++;
            }
            r.close();
        } catch (IOException e) {
            return "errore";
        }
        BufferedReader r = new BufferedReader(new FileReader(log));
        String riga;
        for (int i = 0; i < righe; i++) {
            riga = r.readLine();
            if (riga.split("-")[0].equals(id)) {
                this.id = id;
                GeneraPassword(riga.split("-")[1]);

                return "check";
            }
        }
        return "NV";
    }

    public String ControllaPassword(String password) {
        password = password.toUpperCase();
        if (!(password.equals(this.password))) {
            return "password";
        }

        return "check";
    }

}
