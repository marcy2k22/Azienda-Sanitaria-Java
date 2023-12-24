package azienda_sanitaria;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Grafica_Applicazione_Azienda_Sanitaria extends javax.swing.JFrame {

    Gestione_Liste g;
    Gestione_File gest;
    ArrayList<String> specializzazioni;
    private ArrayList<Medico> m;
    Login l;

    public Grafica_Applicazione_Azienda_Sanitaria() throws IOException {
        gest = new Gestione_File();
        g = new Gestione_Liste();
        specializzazioni = new ArrayList<String>(51);
        if (g.medicoConPiuPazienti() == null) {

        } else {
            m = g.medicoConPiuPazienti();

        }

        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("Failed to initialize LaF");
        }
        ImageIcon icon = new ImageIcon("src/cardiogram.png");
        this.setIconImage(icon.getImage());
        l = new Login();
        initComponents();
        Errore.setVisible(false);
        Errore2.setVisible(false);
        jPanel1.setVisible(true);
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
        jLabel1.setVisible(false);
        jScrollPane3.getVerticalScrollBar().setValue(0);
        AggiornaMedicoConPiuPazienti();

        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        testoID = new javax.swing.JTextField();
        AziendaSanitaria = new javax.swing.JLabel();
        LabelD = new javax.swing.JLabel();
        testoPassword = new javax.swing.JPasswordField();
        LabelPassword = new javax.swing.JLabel();
        BottonLogin = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        showPassword = new javax.swing.JCheckBox();
        jScrollPane5 = new javax.swing.JScrollPane();
        Errore = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        JTcerca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        aggiungiPaziente = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton8 = new javax.swing.JButton();
        AggiungiD = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        risultato1 = new javax.swing.JPanel();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        risultato = new javax.swing.JPanel();
        rslt = new javax.swing.JTextArea();
        nuovoAccount = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nomeP = new javax.swing.JTextField();
        codiceP = new javax.swing.JTextField();
        registraP = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Errore2 = new javax.swing.JTextArea();
        Esci2 = new javax.swing.JButton();
        cognomeP1 = new javax.swing.JTextField();
        rimuoviP = new javax.swing.JButton();
        medicoS = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nomeM = new javax.swing.JTextField();
        codiceM = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        registraM = new javax.swing.JButton();
        Errore3 = new javax.swing.JTextArea();
        Esci3 = new javax.swing.JButton();
        cognomeM = new javax.swing.JTextField();
        rimuoviM = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();
        jCheckBox25 = new javax.swing.JCheckBox();
        jCheckBox26 = new javax.swing.JCheckBox();
        jCheckBox27 = new javax.swing.JCheckBox();
        jCheckBox28 = new javax.swing.JCheckBox();
        jCheckBox29 = new javax.swing.JCheckBox();
        jCheckBox30 = new javax.swing.JCheckBox();
        jCheckBox31 = new javax.swing.JCheckBox();
        jCheckBox32 = new javax.swing.JCheckBox();
        jCheckBox33 = new javax.swing.JCheckBox();
        jCheckBox34 = new javax.swing.JCheckBox();
        jCheckBox35 = new javax.swing.JCheckBox();
        jCheckBox36 = new javax.swing.JCheckBox();
        jCheckBox37 = new javax.swing.JCheckBox();
        jCheckBox38 = new javax.swing.JCheckBox();
        jCheckBox39 = new javax.swing.JCheckBox();
        jCheckBox40 = new javax.swing.JCheckBox();
        jCheckBox41 = new javax.swing.JCheckBox();
        jCheckBox42 = new javax.swing.JCheckBox();
        jCheckBox43 = new javax.swing.JCheckBox();
        jCheckBox44 = new javax.swing.JCheckBox();
        jCheckBox45 = new javax.swing.JCheckBox();
        jCheckBox46 = new javax.swing.JCheckBox();
        jCheckBox47 = new javax.swing.JCheckBox();
        jCheckBox48 = new javax.swing.JCheckBox();
        jCheckBox49 = new javax.swing.JCheckBox();
        jCheckBox50 = new javax.swing.JCheckBox();
        jCheckBox51 = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Esci4 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        nomeP1 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        Errore4 = new javax.swing.JTextArea();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        registraP1 = new javax.swing.JButton();
        idTXT = new javax.swing.JTextField();
        idA = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Azienda Sanitaria");
        setLocation(new java.awt.Point(450, 150));
        setMaximumSize(new java.awt.Dimension(610, 520));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(610, 520));
        jPanel1.setMinimumSize(new java.awt.Dimension(610, 520));
        jPanel1.setPreferredSize(new java.awt.Dimension(610, 520));
        jPanel1.setLayout(null);

        testoID.setForeground(new java.awt.Color(153, 153, 153));
        testoID.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        testoID.setSelectionColor(new java.awt.Color(102, 102, 102));
        testoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testoIDActionPerformed(evt);
            }
        });
        jPanel1.add(testoID);
        testoID.setBounds(250, 240, 150, 22);

        AziendaSanitaria.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        AziendaSanitaria.setForeground(new java.awt.Color(153, 153, 153));
        AziendaSanitaria.setText("AZIENDA SANITARIA");
        AziendaSanitaria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AziendaSanitaria.setOpaque(true);
        jPanel1.add(AziendaSanitaria);
        AziendaSanitaria.setBounds(230, 40, 170, 22);

        LabelD.setForeground(new java.awt.Color(153, 153, 153));
        LabelD.setText("ID");
        jPanel1.add(LabelD);
        LabelD.setBounds(200, 240, 41, 20);

        testoPassword.setForeground(new java.awt.Color(102, 102, 102));
        testoPassword.setInheritsPopupMenu(true);
        testoPassword.setSelectionColor(new java.awt.Color(102, 102, 102));
        testoPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testoPasswordActionPerformed(evt);
            }
        });
        testoPassword.setVisible(false);
        jPanel1.add(testoPassword);
        testoPassword.setBounds(250, 240, 150, 22);

        LabelPassword.setForeground(new java.awt.Color(153, 153, 153));
        LabelPassword.setText("PASSWORD");
        LabelPassword.setVisible(false);
        jPanel1.add(LabelPassword);
        LabelPassword.setBounds(150, 240, 70, 20);

        BottonLogin.setForeground(new java.awt.Color(153, 153, 153));
        BottonLogin.setText("AVANTI");
        BottonLogin.setBorderPainted(false);
        BottonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BottonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BottonLoginMouseClicked(evt);
            }
        });
        BottonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottonLoginActionPerformed(evt);
            }
        });
        jPanel1.add(BottonLogin);
        BottonLogin.setBounds(250, 330, 80, 23);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(-10, 63, 630, 10);

        jButton4.setForeground(new java.awt.Color(153, 153, 153));
        jButton4.setText("ESCI");
        jButton4.setBorderPainted(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(340, 330, 60, 23);

        showPassword.setBorderPainted(true);
        ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/occhio.png"));
        Image img = icon.getImage();
        img = img.getScaledInstance(25, 25, 300);
        icon.setImage(img);
        showPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        showPassword.setIcon(icon);
        showPassword.setIconTextGap(1);
        ImageIcon icon2 = new javax.swing.ImageIcon(getClass().getResource("/occhioAperto.png"));
        Image img2 = icon2.getImage();
        img2 = img2.getScaledInstance(25, 25, 300);
        icon2.setImage(img2);
        showPassword.setSelectedIcon(icon2);
        showPassword.setVisible(false);
        showPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showPasswordMouseClicked(evt);
            }
        });
        jPanel1.add(showPassword);
        showPassword.setBounds(410, 240, 30, 20);

        jScrollPane5.setBorder(null);
        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setToolTipText("");
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane5.setFocusable(false);

        Errore.setEditable(false);
        Errore.setColumns(20);
        Errore.setRows(5);
        Errore.setBorder(null);
        Errore.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Errore.setFocusable(false);
        jScrollPane5.setViewportView(Errore);

        jPanel1.add(jScrollPane5);
        jScrollPane5.setBounds(250, 270, 170, 50);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 520));

        jPanel2.setMaximumSize(new java.awt.Dimension(610, 455));
        jPanel2.setMinimumSize(new java.awt.Dimension(610, 455));
        jPanel2.setPreferredSize(new java.awt.Dimension(610, 455));
        jPanel2.setLayout(null);

        JTcerca.setForeground(new java.awt.Color(153, 153, 153));
        JTcerca.setSelectionColor(new java.awt.Color(102, 102, 102));
        JTcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTcercaActionPerformed(evt);
            }
        });
        JTcerca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTcercaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTcercaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTcercaKeyTyped(evt);
            }
        });
        jPanel2.add(JTcerca);
        JTcerca.setBounds(210, 150, 300, 22);

        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("CERCA");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(150, 150, 50, 20);

        jLabel5.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("AZIENDA SANITARIA");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel5.setOpaque(true);
        jPanel2.add(jLabel5);
        jLabel5.setBounds(230, 40, 170, 22);
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(-10, 63, 670, 10);

        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("RISULTATI");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(130, 200, 70, 16);

        aggiungiPaziente.setForeground(new java.awt.Color(153, 153, 153));
        aggiungiPaziente.setText("AGGIUNGI PAZIENTE");
        aggiungiPaziente.setBorderPainted(false);
        aggiungiPaziente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        aggiungiPaziente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aggiungiPazienteMouseClicked(evt);
            }
        });
        aggiungiPaziente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggiungiPazienteActionPerformed(evt);
            }
        });
        jPanel2.add(aggiungiPaziente);
        aggiungiPaziente.setBounds(210, 400, 150, 23);

        jButton5.setForeground(new java.awt.Color(153, 153, 153));
        jButton5.setText("ESCI");
        jButton5.setBorderPainted(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(370, 400, 140, 23);

        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("MEDICI CON PIÙ PAZIENTI");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(40, 300, 160, 16);

        jToggleButton1.setBackground(new java.awt.Color(60, 63, 65));
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dark.png"))); // NOI18N
        jToggleButton1.setBorder(null);
        jToggleButton1.setBorderPainted(false);
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jToggleButton1.setFocusPainted(false);
        jToggleButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/metà.png"))); // NOI18N
        jToggleButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/metà2.png"))); // NOI18N
        jToggleButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/light.png"))); // NOI18N
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });
        jPanel2.add(jToggleButton1);
        jToggleButton1.setBounds(540, 70, 60, 60);

        jButton8.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(153, 153, 153));
        jButton8.setText("←");
        jButton8.setBorder(null);
        jButton8.setContentAreaFilled(false);
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton8MouseExited(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8);
        jButton8.setBounds(10, 80, 40, 23);

        AggiungiD.setForeground(new java.awt.Color(153, 153, 153));
        AggiungiD.setText("AGGIUNGI DOTTORE");
        AggiungiD.setBorderPainted(false);
        AggiungiD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AggiungiDMouseClicked(evt);
            }
        });
        AggiungiD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AggiungiDActionPerformed(evt);
            }
        });
        jPanel2.add(AggiungiD);
        AggiungiD.setBounds(210, 430, 150, 23);

        risultato1.setLayout(new java.awt.GridLayout(1, 0));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setForeground(new java.awt.Color(153, 153, 153));
        jTextArea2.setRows(5);
        jTextArea2.setBorder(null);
        jTextArea2.setEnabled(false);
        jTextArea2.setInheritsPopupMenu(true);
        risultato1.add(jTextArea2);

        jScrollPane3.setViewportView(risultato1);

        jScrollPane3.getVerticalScrollBar().setUnitIncrement(8);
        jScrollPane3.getVerticalScrollBar().setValue(0);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(210, 300, 300, 80);

        risultato.setLayout(new java.awt.GridLayout(1, 0));

        rslt.setEditable(false);
        rslt.setColumns(20);
        rslt.setForeground(new java.awt.Color(153, 153, 153));
        rslt.setRows(5);
        rslt.setBorder(null);
        rslt.setEnabled(false);
        rslt.setInheritsPopupMenu(true);
        risultato.add(rslt);

        jScrollPane2.setViewportView(risultato);

        jScrollPane2.getVerticalScrollBar().setUnitIncrement(8);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(210, 200, 300, 80);

        nuovoAccount.setForeground(new java.awt.Color(153, 153, 153));
        nuovoAccount.setText("NUOVO ACCOUNT");
        nuovoAccount.setBorderPainted(false);
        nuovoAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuovoAccountMouseClicked(evt);
            }
        });
        jPanel2.add(nuovoAccount);
        nuovoAccount.setBounds(370, 430, 140, 23);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 520));

        jPanel3.setMaximumSize(new java.awt.Dimension(610, 455));
        jPanel3.setMinimumSize(new java.awt.Dimension(610, 455));
        jPanel3.setRequestFocusEnabled(false);
        jPanel3.setLayout(null);

        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("NOME");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(170, 140, 50, 20);

        jLabel7.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("AZIENDA SANITARIA");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel7.setOpaque(true);
        jPanel3.add(jLabel7);
        jLabel7.setBounds(230, 40, 170, 22);
        jPanel3.add(jSeparator3);
        jSeparator3.setBounds(-10, 63, 630, 10);

        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("COGNOME");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(140, 190, 70, 16);

        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("CODICE FISCALE");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(110, 240, 100, 20);
        jPanel3.add(nomeP);
        nomeP.setBounds(230, 140, 170, 22);
        jPanel3.add(codiceP);
        codiceP.setBounds(230, 240, 170, 22);

        registraP.setForeground(new java.awt.Color(153, 153, 153));
        registraP.setText("REGISTRA");
        registraP.setBorderPainted(false);
        registraP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registraPMouseClicked(evt);
            }
        });
        registraP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registraPActionPerformed(evt);
            }
        });
        jPanel3.add(registraP);
        registraP.setBounds(270, 380, 100, 23);

        jButton6.setForeground(new java.awt.Color(153, 153, 153));
        jButton6.setText("ESCI");
        jButton6.setBorderPainted(false);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);
        jButton6.setBounds(380, 380, 60, 23);

        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("MEDICO SCELTO");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(110, 290, 120, 20);

        Errore2.setEditable(false);
        Errore2.setColumns(20);
        Errore2.setForeground(new java.awt.Color(255, 51, 51));
        Errore2.setRows(5);
        Errore2.setBorder(null);
        Errore2.setFocusable(false);
        Errore2.setSelectionColor(new java.awt.Color(102, 102, 102));
        jPanel3.add(Errore2);
        Errore2.setBounds(230, 320, 220, 50);

        Esci2.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        Esci2.setForeground(new java.awt.Color(153, 153, 153));
        Esci2.setText("←");
        Esci2.setBorder(null);
        Esci2.setBorderPainted(false);
        Esci2.setContentAreaFilled(false);
        Esci2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Esci2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Esci2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Esci2MouseExited(evt);
            }
        });
        Esci2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Esci2ActionPerformed(evt);
            }
        });
        jPanel3.add(Esci2);
        Esci2.setBounds(10, 80, 40, 23);
        jPanel3.add(cognomeP1);
        cognomeP1.setBounds(230, 190, 170, 22);

        rimuoviP.setForeground(new java.awt.Color(153, 153, 153));
        rimuoviP.setText("RIMUOVI");
        rimuoviP.setBorderPainted(false);
        rimuoviP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rimuoviPMouseClicked(evt);
            }
        });
        jPanel3.add(rimuoviP);
        rimuoviP.setBounds(180, 380, 80, 23);

        medicoS.setForeground(new java.awt.Color(153, 153, 153));
        medicoS.setModel(new javax.swing.DefaultComboBoxModel<>(g.aggiornamento()));
        jPanel3.add(medicoS);
        medicoS.setBounds(230, 290, 210, 22);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 520));

        jPanel4.setMaximumSize(new java.awt.Dimension(610, 455));
        jPanel4.setMinimumSize(new java.awt.Dimension(610, 455));
        jPanel4.setPreferredSize(new java.awt.Dimension(610, 520));
        jPanel4.setLayout(null);

        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("NOME");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(170, 110, 50, 20);

        jLabel11.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("AZIENDA SANITARIA");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel11.setOpaque(true);
        jPanel4.add(jLabel11);
        jLabel11.setBounds(230, 40, 170, 22);
        jPanel4.add(jSeparator4);
        jSeparator4.setBounds(-10, 63, 630, 10);

        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("COGNOME");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(140, 160, 70, 16);

        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("CODICE FISCALE");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(112, 210, 100, 20);
        jPanel4.add(nomeM);
        nomeM.setBounds(230, 110, 170, 22);
        jPanel4.add(codiceM);
        codiceM.setBounds(230, 210, 170, 22);

        jButton9.setForeground(new java.awt.Color(153, 153, 153));
        jButton9.setText("ESCI");
        jButton9.setBorderPainted(false);
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton9);
        jButton9.setBounds(390, 470, 60, 23);

        registraM.setForeground(new java.awt.Color(153, 153, 153));
        registraM.setText("REGISTRA");
        registraM.setBorderPainted(false);
        registraM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registraMMouseClicked(evt);
            }
        });
        registraM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registraMActionPerformed(evt);
            }
        });
        jPanel4.add(registraM);
        registraM.setBounds(280, 470, 100, 23);

        Errore3.setEditable(false);
        Errore3.setColumns(20);
        Errore3.setForeground(new java.awt.Color(255, 51, 51));
        Errore3.setRows(5);
        Errore3.setBorder(null);
        Errore3.setFocusable(false);
        Errore3.setSelectionColor(new java.awt.Color(102, 102, 102));
        jPanel4.add(Errore3);
        Errore3.setBounds(230, 400, 220, 50);

        Esci3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        Esci3.setForeground(new java.awt.Color(153, 153, 153));
        Esci3.setText("←");
        Esci3.setBorder(null);
        Esci3.setContentAreaFilled(false);
        Esci3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Esci3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Esci3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Esci3MouseExited(evt);
            }
        });
        Esci3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Esci3ActionPerformed(evt);
            }
        });
        jPanel4.add(Esci3);
        Esci3.setBounds(10, 80, 40, 23);
        jPanel4.add(cognomeM);
        cognomeM.setBounds(230, 160, 170, 22);

        rimuoviM.setForeground(new java.awt.Color(153, 153, 153));
        rimuoviM.setText("RIMUOVI");
        rimuoviM.setBorderPainted(false);
        rimuoviM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rimuoviMMouseClicked(evt);
            }
        });
        jPanel4.add(rimuoviM);
        rimuoviM.setBounds(180, 470, 90, 23);

        jScrollPane1.setFocusable(false);

        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.PAGE_AXIS));

        jCheckBox1.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox1.setText("Medicina interna");
        jPanel6.add(jCheckBox1);

        jCheckBox2.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox2.setText("Medicina d'emergenza");
        jPanel6.add(jCheckBox2);

        jCheckBox3.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox3.setText("Geriatria");
        jPanel6.add(jCheckBox3);

        jCheckBox4.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox4.setText("Medicina dello sport e dell’esercizio fisico");
        jPanel6.add(jCheckBox4);

        jCheckBox5.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox5.setText("Medicina termale");
        jPanel6.add(jCheckBox5);

        jCheckBox6.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox6.setText("Oncologia medica");
        jPanel6.add(jCheckBox6);

        jCheckBox7.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox7.setText("Medicina di comunità e delle cure primarie");
        jPanel6.add(jCheckBox7);

        jCheckBox8.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox8.setText("Allergologia e Immunologia clinica");
        jPanel6.add(jCheckBox8);

        jCheckBox9.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox9.setText("Dermatologia e Venereologia");
        jPanel6.add(jCheckBox9);

        jCheckBox10.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox10.setText("Ematologia");
        jPanel6.add(jCheckBox10);

        jCheckBox11.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox11.setText("Endocrinologia e malattie del metabolismo");
        jPanel6.add(jCheckBox11);

        jCheckBox12.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox12.setText("Scienza dell’alimentazione");
        jPanel6.add(jCheckBox12);

        jCheckBox13.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox13.setText("Malattie dell’apparato digerente");
        jPanel6.add(jCheckBox13);

        jCheckBox14.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox14.setText("Malattie dell’apparato cardiovascolare");
        jPanel6.add(jCheckBox14);

        jCheckBox15.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox15.setText("Malattie dell’apparato respiratorio");
        jPanel6.add(jCheckBox15);

        jCheckBox16.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox16.setText("Malattie Infettive e Tropicali");
        jPanel6.add(jCheckBox16);

        jCheckBox17.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox17.setText("Nefrologia");
        jPanel6.add(jCheckBox17);

        jCheckBox18.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox18.setText("Reumatologia");
        jPanel6.add(jCheckBox18);

        jCheckBox19.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox19.setText("Medicina e Cure Palliative");
        jPanel6.add(jCheckBox19);

        jCheckBox20.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox20.setText("Neurologia");
        jPanel6.add(jCheckBox20);

        jCheckBox21.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox21.setText("Neuropsichiatria infantile");
        jPanel6.add(jCheckBox21);

        jCheckBox22.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox22.setText("Psichiatria");
        jPanel6.add(jCheckBox22);

        jCheckBox23.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox23.setText("Pediatria");
        jPanel6.add(jCheckBox23);

        jCheckBox24.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox24.setText("Chirurgia Generale");
        jPanel6.add(jCheckBox24);

        jCheckBox25.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox25.setText("Chirurgia pediatrica");
        jPanel6.add(jCheckBox25);

        jCheckBox26.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox26.setText("Chirurgia plastica, ricostruttiva ed estetica");
        jPanel6.add(jCheckBox26);

        jCheckBox27.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox27.setText("Ginecologia ed Ostetricia");
        jPanel6.add(jCheckBox27);

        jCheckBox28.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox28.setText("Ortopedia e traumatologia");
        jPanel6.add(jCheckBox28);

        jCheckBox29.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox29.setText("Urologia");
        jPanel6.add(jCheckBox29);

        jCheckBox30.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox30.setText("Chirurgia Maxillo-Facciale");
        jPanel6.add(jCheckBox30);

        jCheckBox31.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox31.setText("Neurochirurgia");
        jPanel6.add(jCheckBox31);

        jCheckBox32.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox32.setText("Oftalmologia");
        jPanel6.add(jCheckBox32);

        jCheckBox33.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox33.setText("Otorinolaringoiatria");
        jPanel6.add(jCheckBox33);

        jCheckBox34.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox34.setText("Cardiochirurgia");
        jPanel6.add(jCheckBox34);

        jCheckBox35.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox35.setText("Chirurgia Toracica");
        jPanel6.add(jCheckBox35);

        jCheckBox36.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox36.setText("Chirurgia Vascolare");
        jPanel6.add(jCheckBox36);

        jCheckBox37.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox37.setText("Anatomia Patologica");
        jPanel6.add(jCheckBox37);

        jCheckBox38.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox38.setText("Microbiologia e Virologia");
        jPanel6.add(jCheckBox38);

        jCheckBox39.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox39.setText("Patologia Clinica e Biochimica Clinica");
        jPanel6.add(jCheckBox39);

        jCheckBox40.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox40.setText("Radiodiagnostica");
        jPanel6.add(jCheckBox40);

        jCheckBox41.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox41.setText("Radioterapia");
        jPanel6.add(jCheckBox41);

        jCheckBox42.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox42.setText("Medicina nucleare");
        jPanel6.add(jCheckBox42);

        jCheckBox43.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox43.setText("Anestesia Rianimazione, Terapia Intensiva e del dolore");
        jPanel6.add(jCheckBox43);

        jCheckBox44.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox44.setText("Audiologia e foniatria");
        jPanel6.add(jCheckBox44);

        jCheckBox45.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox45.setText("Medicina fisica e riabilitativa");
        jPanel6.add(jCheckBox45);

        jCheckBox46.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox46.setText("Genetica medica");
        jPanel6.add(jCheckBox46);

        jCheckBox47.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox47.setText("Farmacologia e Tossicologia Clinica");
        jPanel6.add(jCheckBox47);

        jCheckBox48.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox48.setText("Igiene e Medicina Preventiva");
        jPanel6.add(jCheckBox48);

        jCheckBox49.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox49.setText("Medicina del Lavoro");
        jPanel6.add(jCheckBox49);

        jCheckBox50.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox50.setText("Medicina Legale");
        jPanel6.add(jCheckBox50);

        jCheckBox51.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox51.setText("Statistica sanitaria e Biometria");
        jPanel6.add(jCheckBox51);

        jScrollPane1.setViewportView(jPanel6);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(150, 300, 340, 90);

        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("SCEGLI LE SPECIALIZZAZIONI");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(230, 260, 160, 16);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 520));

        jPanel5.setMaximumSize(new java.awt.Dimension(610, 520));
        jPanel5.setMinimumSize(new java.awt.Dimension(610, 520));
        jPanel5.setPreferredSize(new java.awt.Dimension(610, 520));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });
        jPanel5.setLayout(null);

        Esci4.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        Esci4.setForeground(new java.awt.Color(153, 153, 153));
        Esci4.setText("←");
        Esci4.setBorder(null);
        Esci4.setContentAreaFilled(false);
        Esci4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Esci4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Esci4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Esci4MouseExited(evt);
            }
        });
        Esci4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Esci4ActionPerformed(evt);
            }
        });
        jPanel5.add(Esci4);
        Esci4.setBounds(10, 80, 40, 23);

        jLabel18.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 153, 153));
        jLabel18.setText("AZIENDA SANITARIA");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel18.setOpaque(true);
        jPanel5.add(jLabel18);
        jLabel18.setBounds(230, 40, 170, 22);
        jPanel5.add(nomeP1);
        nomeP1.setBounds(230, 200, 170, 22);

        jButton7.setForeground(new java.awt.Color(153, 153, 153));
        jButton7.setText("ESCI");
        jButton7.setBorderPainted(false);
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton7);
        jButton7.setBounds(340, 360, 60, 23);

        Errore4.setEditable(false);
        Errore4.setColumns(20);
        Errore4.setForeground(new java.awt.Color(255, 51, 51));
        Errore4.setRows(5);
        Errore4.setBorder(null);
        Errore4.setFocusable(false);
        Errore4.setSelectionColor(new java.awt.Color(102, 102, 102));
        jPanel5.add(Errore4);
        Errore4.setBounds(230, 270, 220, 80);
        jPanel5.add(jSeparator5);
        jSeparator5.setBounds(-10, 63, 630, 10);

        jLabel19.setForeground(new java.awt.Color(153, 153, 153));
        jLabel19.setText("MAIL");
        jPanel5.add(jLabel19);
        jLabel19.setBounds(170, 200, 50, 20);

        registraP1.setForeground(new java.awt.Color(153, 153, 153));
        registraP1.setText("REGISTRATI");
        registraP1.setBorderPainted(false);
        registraP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registraP1MouseClicked(evt);
            }
        });
        registraP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registraP1ActionPerformed(evt);
            }
        });
        jPanel5.add(registraP1);
        registraP1.setBounds(230, 360, 100, 23);

        idTXT.setEditable(false);
        idTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTXTActionPerformed(evt);
            }
        });
        idTXT.setVisible(false);
        jPanel5.add(idTXT);
        idTXT.setBounds(230, 240, 170, 22);

        idA.setForeground(new java.awt.Color(153, 153, 153));
        idA.setText("ID ASSOCIATO");
        idA.setVisible(false);
        jPanel5.add(idA);
        idA.setBounds(120, 240, 80, 20);

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void AggiornaMedicoConPiuPazienti() {
        String righe = "NESSUN MEDICO";
        if (g.medicoConPiuPazienti() == null) {

        } else {
            m = g.medicoConPiuPazienti();
            int x = 0;
            int y = 0;

            for (int i = 0; i < m.size(); i++) {
                if (i == 0) {
                    righe = "";
                }
                righe += "NOME: " + m.get(i).nome.toUpperCase() + "\n" + "COGNOME: " + m.get(i).cognome.toUpperCase() + "\n" + "CODICE FISCALE: " + m.get(i).getCodice().toUpperCase() + "\n" + "NUMERO PAZIENTI: " + m.get(i).NPazienti + "\n\n";
            }
        }
        jTextArea2.setText(righe);
        jTextArea2.setCaretPosition(0);
    }
    private void testoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testoIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testoIDActionPerformed

    private void testoPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testoPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testoPasswordActionPerformed

    private void BottonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottonLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BottonLoginActionPerformed

    private void JTcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTcercaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTcercaActionPerformed

    private void aggiungiPazienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggiungiPazienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aggiungiPazienteActionPerformed

    private void registraPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registraPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registraPActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButton6MouseClicked

    private void registraPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registraPMouseClicked
        Color c = new Color(59, 167, 79, 255);
        Color r = new Color(255, 51, 51);
        String ris;
        int check;
        if (medicoS.getSelectedItem() == null) {
            ris = "NMND";
            check = 0;
        } else {
            ris = g.CheckRegistrazione(nomeP.getText().toLowerCase(), cognomeP1.getText().toLowerCase(), codiceP.getText().toLowerCase(), (String) medicoS.getSelectedItem());
            check = g.checkDoppi(nomeP.getText().toLowerCase(), cognomeP1.getText().toLowerCase(), codiceP.getText().toLowerCase(), (String) medicoS.getSelectedItem());
        }

        switch (check) {
            case 0:
                switch (ris) {
                    case "check":
                        Errore2.setVisible(true);
                        Errore2.setForeground(c);
                        Errore2.setText("Registrazione avvenuta\ncon successo!");
                         {
                            try {

                                g.NuovoPaziente(nomeP.getText().toLowerCase(), cognomeP1.getText().toLowerCase(), codiceP.getText().toLowerCase(), (String) medicoS.getSelectedItem());
                            } catch (IOException ex) {
                                Logger.getLogger(Grafica_Applicazione_Azienda_Sanitaria.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        nomeP.setText("");
                        cognomeP1.setText("");
                        codiceP.setText("");
                        medicoS.setSelectedIndex(0);
                        medicoS.setModel(new javax.swing.DefaultComboBoxModel<>(g.aggiornamento()));
                        AggiornaMedicoConPiuPazienti();
                        break;

                    case "nome":
                        Errore2.setVisible(true);
                        Errore2.setForeground(r);
                        Errore2.setText("Il nome non può contenere\ncaratteri numerici!");
                        break;
                    case "cognome":
                        Errore2.setVisible(true);
                        Errore2.setForeground(r);
                        Errore2.setText("Il cognome non può contenere\ncaratteri numerici!");
                        break;
                    case "codice":
                        Errore2.setVisible(true);
                        Errore2.setForeground(r);
                        Errore2.setText("Il codice fiscale\nè errato!");
                        break;
                    case "medico":
                        Errore2.setVisible(true);
                        Errore2.setForeground(r);
                        Errore2.setText("Medico non trovato!");
                        break;
                    case "MNT":
                        Errore2.setVisible(true);
                        Errore2.setForeground(r);
                        Errore2.setText("Medico non trovato!\nsi prega di inserire\nprima il nome e poi il cognome");
                        break;
                    case "vuoto":
                        Errore2.setVisible(true);
                        Errore2.setForeground(r);
                        Errore2.setText("Riempire tutti i campi!");
                        break;
                    case "nonC":
                        Errore2.setVisible(true);
                        Errore2.setForeground(r);
                        Errore2.setText("Il codice fiscale \nnon corrisponde al nome \ne al cognome!");
                        break;
                    case "Nspazio":
                        Errore2.setVisible(true);
                        Errore2.setForeground(r);
                        Errore2.setText("Attenzione! \nrimuovere spazio dal campo nome");
                        break;
                    case "Cspazio":
                        Errore2.setVisible(true);
                        Errore2.setForeground(r);
                        Errore2.setText("Attenzione! \nrimuovere spazio dal campo cognome");
                        break;
                    case "lungN":
                        Errore2.setVisible(true);
                        Errore2.setForeground(r);
                        Errore2.setText("Lunghezza del nome \ntroppo corta!");
                        break;
                    case "lungC":
                        Errore2.setVisible(true);
                        Errore2.setForeground(r);
                        Errore2.setText("Lunghezza del cognome \ntroppo corta!");
                        break;
                    case "NMND":
                        Errore2.setVisible(true);
                        Errore2.setForeground(r);
                        Errore2.setText("Nessun medico presente\nnel database. Aggiungine uno");
                        break;
                }
                break;
            case 1:
                Errore2.setVisible(true);
                Errore2.setForeground(r);
                Errore2.setText("Il paziente è già\npresente nel database.");
                break;
        }
    }//GEN-LAST:event_registraPMouseClicked

    private void Esci2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Esci2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Esci2ActionPerformed

    private void Esci2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Esci2MouseClicked
        jPanel1.setVisible(false);
        jPanel2.setVisible(true);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        JTcerca.setText("");
        risultato.setVisible(true);
        jLabel1.setVisible(true);
        rslt.setText("");


    }//GEN-LAST:event_Esci2MouseClicked

    private void Esci2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Esci2MouseEntered
        Color c = new Color(70, 73, 75);
        Esci2.setBackground(c);
    }//GEN-LAST:event_Esci2MouseEntered

    private void Esci2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Esci2MouseExited
        Color c = new Color(60, 63, 65);
        Esci2.setBackground(c);
    }//GEN-LAST:event_Esci2MouseExited

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        jPanel1.setVisible(true);
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);

    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseEntered
        Color c = new Color(70, 73, 75);
        jButton8.setBackground(c);
    }//GEN-LAST:event_jButton8MouseEntered

    private void jButton8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseExited
        Color c = new Color(60, 63, 65);
        jButton8.setBackground(c);
    }//GEN-LAST:event_jButton8MouseExited

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void aggiungiPazienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aggiungiPazienteMouseClicked
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel3.setVisible(true);
        jPanel4.setVisible(false);
        nomeP.setText("");
        cognomeP1.setText("");
        codiceP.setText("");
        medicoS.setModel(new javax.swing.DefaultComboBoxModel<>(g.aggiornamento()));
        Errore2.setText("");
    }//GEN-LAST:event_aggiungiPazienteMouseClicked

    private void AggiungiDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AggiungiDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AggiungiDActionPerformed

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed
    private String SelezioneSpecializzazione() {
        specializzazioni.clear();
        JCheckBox j[] = {jCheckBox1, jCheckBox2, jCheckBox3, jCheckBox4, jCheckBox5, jCheckBox6, jCheckBox7, jCheckBox8,
            jCheckBox9, jCheckBox10, jCheckBox11, jCheckBox12, jCheckBox13, jCheckBox14, jCheckBox15, jCheckBox16, jCheckBox17,
            jCheckBox18, jCheckBox19, jCheckBox20, jCheckBox21, jCheckBox22, jCheckBox23, jCheckBox24, jCheckBox25, jCheckBox26,
            jCheckBox27, jCheckBox28, jCheckBox29, jCheckBox30, jCheckBox31, jCheckBox32, jCheckBox33, jCheckBox34, jCheckBox35, jCheckBox36,
            jCheckBox37, jCheckBox38, jCheckBox39, jCheckBox40, jCheckBox41, jCheckBox42, jCheckBox43, jCheckBox44, jCheckBox45, jCheckBox46,
            jCheckBox47, jCheckBox48, jCheckBox49, jCheckBox50, jCheckBox51};
        for (int i = 0; i < j.length; i++) {
            controlloSelezione(j[i]);
        }
        if (specializzazioni.size() == 0) {
            return "0";
        }
        return "check";
    }

    private void controlloSelezione(JCheckBox c) {
        if (c.isSelected() == true) {
            specializzazioni.add(c.getText());
        }
    }
    private void registraMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registraMMouseClicked
        String s = SelezioneSpecializzazione();
        Color c = new Color(59, 167, 79, 255);
        Color r = new Color(255, 51, 51);
        String ris = "EG";
        String med;
        try {
            ris = g.CheckRegistrazione(nomeM.getText().toLowerCase(), cognomeM.getText().toLowerCase(), codiceM.getText().toLowerCase());
            int check = g.checkDoppi(nomeM.getText().toLowerCase(), cognomeM.getText().toLowerCase(), codiceM.getText().toLowerCase());
        } catch (IOException ex) {
            Logger.getLogger(Grafica_Applicazione_Azienda_Sanitaria.class.getName()).log(Level.SEVERE, null, ex);
        }
        int check = g.checkDoppi(nomeM.getText().toLowerCase(), cognomeM.getText().toLowerCase(), codiceM.getText().toLowerCase());
        switch (check) {
            case 0:
                switch (ris) {
                    case "check":
                        switch (s) {
                            case "check":
                                
                                try {
                                med = g.NuovoMedico(nomeM.getText().toLowerCase(), cognomeM.getText().toLowerCase(), codiceM.getText().toLowerCase(), specializzazioni);
                                switch (med) {
                                    case "check":
                                        Errore3.setVisible(true);
                                        Errore3.setForeground(c);
                                        Errore3.setText("Registrazione avvenuta\ncon successo!");
                                        nomeM.setText("");
                                        cognomeM.setText("");
                                        codiceM.setText("");
                                        resetPulsanti();
                                        medicoS.setModel(new javax.swing.DefaultComboBoxModel<>(g.aggiornamento()));
                                        AggiornaMedicoConPiuPazienti();
                                        break;
                                    case "diversi":
                                        Errore3.setVisible(true);
                                        Errore3.setForeground(c);
                                        Errore3.setText("Registrazione avvenuta\ncon successo!");
                                        nomeM.setText("");
                                        cognomeM.setText("");
                                        codiceM.setText("");
                                        break;
                                    case "errore":
                                        Errore3.setVisible(true);
                                        Errore3.setForeground(r);
                                        Errore3.setText("Errore!\nLa invitiamo a riprovare");
                                        break;
                                    case "doppi":
                                        Errore3.setVisible(true);
                                        Errore3.setForeground(r);
                                        Errore3.setText("è stata riscontrata una \ncorrispondenza con un'altro medico");
                                        break;
                                    case "vuoto":
                                        Errore3.setVisible(true);
                                        Errore3.setForeground(r);
                                        Errore3.setText("Specializzazione non caricata!");
                                        break;
                                    case "doppio":
                                        Errore3.setVisible(true);
                                        Errore3.setForeground(r);
                                        Errore3.setText("Specializzazione non valida, \ncorrisponde con ad un'altra");
                                        break;
                                }
                            } catch (IOException ex) {

                            }

                            break;
                            case "0":
                                Errore3.setVisible(true);
                                Errore3.setForeground(r);
                                Errore3.setText("Selezionare almeno \nuna specializzazione!");
                                break;
                        }

                        break;

                    case "Nspazio":
                        Errore3.setVisible(true);
                        Errore3.setForeground(r);
                        Errore3.setText("Il nome non può contenere\nspazi!");
                        break;
                    case "Nnumeri":
                        Errore3.setVisible(true);
                        Errore3.setForeground(r);
                        Errore3.setText("Il nome non può contenere\ncaratteri numerici!");
                        break;
                    case "Cspazio":
                        Errore3.setVisible(true);
                        Errore3.setForeground(r);
                        Errore3.setText("Il cognome non può contenere\nspazi!");
                        break;
                    case "Cnumeri":
                        Errore3.setVisible(true);
                        Errore3.setForeground(r);
                        Errore3.setText("Il cognome non può contenere\ncaratteri numerici!");
                        break;
                    case "codice":
                        Errore3.setVisible(true);
                        Errore3.setForeground(r);
                        Errore3.setText("Il codice fiscale\nè errato!");
                        break;
                    case "EG":
                        Errore3.setVisible(true);
                        Errore3.setForeground(r);
                        Errore3.setText("Errore nell'apertura\ndella specializzazione");
                        break;
                    case "vuoto":
                        Errore3.setVisible(true);
                        Errore3.setForeground(r);
                        Errore3.setText("Riempire tutti i campi!");
                        break;
                    case "lungN":
                        Errore3.setVisible(true);
                        Errore3.setForeground(r);
                        Errore3.setText("Lunghezza nome troppo corta!");
                        break;
                    case "lungC":
                        Errore3.setVisible(true);
                        Errore3.setForeground(r);
                        Errore3.setText("Lunghezza cognome troppo corta!");
                        break;
                    case "nonC":
                        Errore3.setVisible(true);
                        Errore3.setForeground(r);
                        Errore3.setText("Il codice fiscale \nnon corrisponde al nome \ne al cognome!");
                        break;

                }

                break;
            case 2:
                Errore3.setVisible(true);
                Errore3.setForeground(r);
                Errore3.setText("Il medico è già\npresente nel database.");
                break;

        }

    }//GEN-LAST:event_registraMMouseClicked

    private void registraMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registraMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registraMActionPerformed

    private void Esci3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Esci3MouseClicked
        jPanel1.setVisible(false);
        jPanel2.setVisible(true);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        JTcerca.setText("");
        risultato.setVisible(true);
        jLabel1.setVisible(true);
        rslt.setText("");
        Errore3.setText("");
        resetPulsanti();


    }//GEN-LAST:event_Esci3MouseClicked

    private void Esci3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Esci3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Esci3MouseEntered

    private void Esci3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Esci3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Esci3MouseExited

    private void Esci3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Esci3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Esci3ActionPerformed

    private void AggiungiDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AggiungiDMouseClicked
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(true);
        nomeM.setText("");
        cognomeM.setText("");
        codiceM.setText("");


    }//GEN-LAST:event_AggiungiDMouseClicked
    private void resetPulsanti() {
        specializzazioni.clear();
        JCheckBox j[] = {jCheckBox1, jCheckBox2, jCheckBox3, jCheckBox4, jCheckBox5, jCheckBox6, jCheckBox7, jCheckBox8,
            jCheckBox9, jCheckBox10, jCheckBox11, jCheckBox12, jCheckBox13, jCheckBox14, jCheckBox15, jCheckBox16, jCheckBox17,
            jCheckBox18, jCheckBox19, jCheckBox20, jCheckBox21, jCheckBox22, jCheckBox23, jCheckBox24, jCheckBox25, jCheckBox26,
            jCheckBox27, jCheckBox28, jCheckBox29, jCheckBox30, jCheckBox31, jCheckBox32, jCheckBox33, jCheckBox34, jCheckBox35, jCheckBox36,
            jCheckBox37, jCheckBox38, jCheckBox39, jCheckBox40, jCheckBox41, jCheckBox42, jCheckBox43, jCheckBox44, jCheckBox45, jCheckBox46,
            jCheckBox47, jCheckBox48, jCheckBox49, jCheckBox50, jCheckBox51};
        for (int i = 0; i < j.length; i++) {
            j[i].setSelected(false);
        }
    }
    private void rimuoviMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rimuoviMMouseClicked

        Color c = new Color(59, 167, 79, 255);
        Color r = new Color(255, 51, 51);
        String ris = "EG";
        try {
            ris = g.CheckRegistrazione(nomeM.getText().toLowerCase(), cognomeM.getText().toLowerCase(), codiceM.getText().toLowerCase());
        } catch (IOException ex) {
            Logger.getLogger(Grafica_Applicazione_Azienda_Sanitaria.class.getName()).log(Level.SEVERE, null, ex);
        }

        switch (ris) {
            case "check":
                        
                    try {
                Medico m = new Medico(nomeM.getText().toLowerCase(), cognomeM.getText().toLowerCase(), codiceM.getText().toLowerCase());
                File f = new File("E:\\Scuola\\Netbeansprojects\\azienda_sanitaria\\Licenze\\" + nomeM.getText().toLowerCase() + "_" + cognomeM.getText().toLowerCase() + "_" + codiceM.getText().toLowerCase() + ".txt");
                m.setSpecializzazione(f);
                String ris2 = gest.TogliDalDatabase(m, g.getM(), g.getP());

                switch (ris2) {
                    case "errore":
                        Errore3.setVisible(true);
                        Errore3.setForeground(r);
                        Errore3.setText("Errore nel rimuovere\ndal database!");
                        break;
                    case "check":
                        Errore3.setVisible(true);
                        Errore3.setForeground(c);
                        Errore3.setText("Rimozione avvenuta\ncon successo!");
                        AggiornaMedicoConPiuPazienti();
                        break;
                    case "associato":
                        Errore3.setVisible(true);
                        Errore3.setForeground(r);
                        Errore3.setText("Impossibile rimuovere!\nIl medico è associato ad un paziente");
                        break;
                }
            } catch (IOException ex) {
                Errore3.setVisible(true);
                Errore3.setForeground(r);
                Errore3.setText("Errore nel rimuovere\ndal database!");
            }
            nomeM.setText("");
            cognomeM.setText("");
            codiceM.setText("");
            resetPulsanti();

            break;

            case "Nspazio":
                Errore3.setVisible(true);
                Errore3.setForeground(r);
                Errore3.setText("Il nome non può contenere\nspazi");
                break;
            case "Nnumeri":
                Errore3.setVisible(true);
                Errore3.setForeground(r);
                Errore3.setText("Il nome non può contenere\ncaratteri numerici!");
                break;
            case "Cspazio":
                Errore3.setVisible(true);
                Errore3.setForeground(r);
                Errore3.setText("Il cognome non può contenere\nspazi");
                break;
            case "Cnumeri":
                Errore3.setVisible(true);
                Errore3.setForeground(r);
                Errore3.setText("Il cognome non può contenere\ncaratteri numerici!");
                break;
            case "EG":
                Errore3.setVisible(true);
                Errore3.setForeground(r);
                Errore3.setText("Errore nell'apertura\ndella licenza");
                break;
            case "vuoto":
                Errore3.setVisible(true);
                Errore3.setForeground(r);
                Errore3.setText("Riempire tutti i campi!");
                break;
            case "lungN":
                Errore3.setVisible(true);
                Errore3.setForeground(r);
                Errore3.setText("Lunghezza nome troppo corta!");
                break;
            case "lungC":
                Errore3.setVisible(true);
                Errore3.setForeground(r);
                Errore3.setText("Lunghezza cognome troppo corta!");
                break;
            case "nonC":
                Errore3.setVisible(true);
                Errore3.setForeground(r);
                Errore3.setText("Il codice fiscale \nnon corrisponde al nome \ne al cognome!");
                break;
            case "codice":
                Errore3.setVisible(true);
                Errore3.setForeground(r);
                Errore3.setText("Il codice fiscale\nè errato!");
                break;

        }


    }//GEN-LAST:event_rimuoviMMouseClicked

    private void rimuoviPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rimuoviPMouseClicked

        Color c = new Color(59, 167, 79, 255);
        Color r = new Color(255, 51, 51);
        String ris = "EG";
        if (medicoS.getSelectedItem() == null) {
            ris = "NMND";

        } else {
            ris = g.CheckRegistrazione(nomeP.getText().toLowerCase(), cognomeP1.getText().toLowerCase(), codiceP.getText().toLowerCase(), (String) medicoS.getSelectedItem());

        }
        switch (ris) {
            case "check":
                        
                        try {
                String ris2 = gest.TogliDalDatabase(new Paziente(nomeP.getText().toLowerCase(), cognomeP1.getText().toLowerCase(), codiceP.getText().toLowerCase(), medicoS.getSelectedItem().toString().toLowerCase().split(" ")), g.getP(), g.getM());
                switch (ris2) {
                    case "errore":
                        Errore2.setVisible(true);
                        Errore2.setForeground(r);
                        Errore2.setText("Errore nel rimuovere\ndal database!");
                        break;
                    case "check":
                        Errore2.setVisible(true);
                        Errore2.setForeground(c);
                        Errore2.setText("rimozione avvenuta\ncon successo!");
                        nomeP.setText("");
                        cognomeP1.setText("");
                        codiceP.setText("");
                        medicoS.setSelectedIndex(0);
                        AggiornaMedicoConPiuPazienti();
                        break;
                    case "nonTrovato":
                        Errore2.setVisible(true);
                        Errore2.setForeground(r);
                        Errore2.setText("Paziente non trovato!");
                        break;
                }
            } catch (IOException ex) {
                Errore2.setVisible(true);
                Errore2.setForeground(r);
                Errore2.setText("Errore nel rimuovere\ndal database!");
            }
            nomeM.setText("");
            cognomeM.setText("");
            codiceM.setText("");

            break;

            case "nome":
                Errore3.setVisible(true);
                Errore3.setForeground(r);
                Errore3.setText("Il nome non può contenere\nspazi e caratteri numerici!");
                break;
            case "cognome":
                Errore3.setVisible(true);
                Errore3.setForeground(r);
                Errore3.setText("Il cognome non può contenere\nspazi e caratteri numerici!");
                break;
            case "codice":
                Errore3.setVisible(true);
                Errore3.setForeground(r);
                Errore3.setText("Il codice fiscale\nè errato!");
                break;
            case "MNT":
                Errore3.setVisible(true);
                Errore3.setForeground(r);
                Errore3.setText("Medico non trovato!");
                break;
            case "vuoto":
                Errore3.setVisible(true);
                Errore3.setForeground(r);
                Errore3.setText("Riempire tutti i campi!");
                break;
            case "medicoS":
                Errore3.setVisible(true);
                Errore3.setForeground(r);
                Errore3.setText("Inserire nel campo \n\"REGISTRA MEDICO\" \nCOGNOME spazio NOME del medico ");
                break;
            case "nonC":
                Errore2.setVisible(true);
                Errore2.setForeground(r);
                Errore2.setText("Il codice fiscale \nnon corrisponde al nome \ne al cognome!");
                break;
            case "Nspazio":
                Errore2.setVisible(true);
                Errore2.setForeground(r);
                Errore2.setText("Attenzione! \nrimuovere spazio dal campo nome");
                break;
            case "Cspazio":
                Errore2.setVisible(true);
                Errore2.setForeground(r);
                Errore2.setText("Attenzione! \nrimuovere spazio dal campo cognome");
                break;
            case "lungN":
                Errore2.setVisible(true);
                Errore2.setForeground(r);
                Errore2.setText("Lunghezza nome troppo corta!");
                break;
            case "lungC":
                Errore2.setVisible(true);
                Errore2.setForeground(r);
                Errore2.setText("Lunghezza cognome troppo corta!");
                break;
            case "NMND":
                Errore2.setVisible(true);
                Errore2.setForeground(r);
                Errore2.setText("Nessun medico presente\nnel database. Aggiungine uno");
                break;

        }


    }//GEN-LAST:event_rimuoviPMouseClicked

    private void JTcercaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTcercaKeyPressed


    }//GEN-LAST:event_JTcercaKeyPressed

    private void JTcercaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTcercaKeyTyped

    }//GEN-LAST:event_JTcercaKeyTyped

    private void JTcercaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTcercaKeyReleased
        ArrayList<Medico> risM = g.ricercaM(JTcerca.getText().toLowerCase());
        ArrayList<Paziente> risP = g.ricercaP(JTcerca.getText().toLowerCase());
        String rigaM = "";
        String rigaP = "";
        String rigaG = "";
        if (risM.isEmpty() && risP.isEmpty()) {
            rslt.setText("NESSUN RISULTATO");
        } else {
            for (int i = 0; i < risM.size(); i++) {
                rigaM += "TIPO: MEDICO \nNOME: " + risM.get(i).nome.toUpperCase() + "\nCOGNOME: " + risM.get(i).cognome.toUpperCase() + "\nCODICE FISCALE: " + risM.get(i).getCodice().toUpperCase() + "\nNUMERO PAZIENTI: " + risM.get(i).NPazienti + "\n\n";

            }
            for (int i = 0; i < risP.size(); i++) {
                rigaP += "TIPO: PAZIENTE \nNOME: " + risP.get(i).nome.toUpperCase() + "\nCOGNOME: " + risP.get(i).cognome.toUpperCase() + "\nCODICE FISCALE: " + risP.get(i).getCodiceFiscale().toUpperCase() + "\nMEDICO CURANTE: " + risP.get(i).getMedico()[1].toUpperCase() + " " + risP.get(i).getMedico()[0].toUpperCase() + "\n\n";
            }
            rigaG = rigaM + rigaP;
            rslt.setText(rigaG);
            rslt.setCaretPosition(0);
        }

    }//GEN-LAST:event_JTcercaKeyReleased

    private void showPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPasswordMouseClicked
        testoPassword.setEchoChar(showPassword.isSelected() ? '\0' : '*');
    }//GEN-LAST:event_showPasswordMouseClicked

    private void BottonLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BottonLoginMouseClicked
        Color r = new Color(255, 51, 51);
        Color c = new Color(59, 167, 79, 255);
        if (BottonLogin.getText().equals("LOGIN")) {
            String ris = "";
            ris = l.ControllaPassword(testoPassword.getText());
            switch (ris) {
                case "check":
                    if (l.getId().equals("ADMIN1") || l.getId().equals("ADMIN2") || l.getId().equals("ADMIN3") || l.getId().equals("ADMIN4") ) {
                        jPanel1.setVisible(false);
                        jPanel2.setVisible(true);
                        jPanel3.setVisible(false);
                        jPanel4.setVisible(false);
                        JTcerca.setText("");
                        risultato.setVisible(true);
                        jLabel1.setVisible(true);
                        rslt.setText("");
                        Errore3.setText("");
                        resetPulsanti();
                        Errore.setVisible(true);
                        Errore.setForeground(c);
                        Errore.setText("Login eseguito \ncon successo");
                    }
                    else{
                        jPanel1.setVisible(false);
                        jPanel2.setVisible(true);
                        jPanel3.setVisible(false);
                        jPanel4.setVisible(false);
                        JTcerca.setText("");
                        risultato.setVisible(true);
                        jLabel1.setVisible(true);
                        rslt.setText("");
                        Errore3.setText("");
                        resetPulsanti();
                        Errore.setVisible(true);
                        Errore.setForeground(c);
                        Errore.setText("Login eseguito \ncon successo");
                        nuovoAccount.setVisible(false);
                    }

                    break;
                case "password":
                    Errore.setVisible(true);
                    Errore.setForeground(r);
                    Errore.setText("Password errata!");
                    break;
            }
        }
        if (BottonLogin.getText().equals("AVANTI")) {
            String ris = "";

            try {
                ris = l.ControllaId(testoID.getText());
            } catch (IOException ex) {
                System.out.println("Errore di lettura");
                return;
            }
            switch (ris) {
                case "check":
                    testoPassword.setVisible(true);
                    showPassword.setVisible(true);
                    LabelPassword.setVisible(true);
                    testoID.setVisible(false);
                    LabelD.setVisible(false);
                    Errore.setVisible(true);
                    Errore.setForeground(c);
                    Errore.setText("Utente trovato \nINSERIRE LA PASSWORD \nINVIATA ALLA \nMAIL ASSOCIATA");
                    BottonLogin.setText("LOGIN");
                    break;
                case "errore":
                    Errore.setVisible(true);
                    Errore.setForeground(r);
                    Errore.setText("Errore di lettura \nsi prega di riavviare \nl'applicazione");
                    break;
                case "NV":
                    Errore.setVisible(true);
                    Errore.setForeground(r);
                    Errore.setText("Utente non trovato");
                    break;

            }

        }
    }//GEN-LAST:event_BottonLoginMouseClicked

    private void nuovoAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuovoAccountMouseClicked
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(true);
    }//GEN-LAST:event_nuovoAccountMouseClicked

    private void Esci4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Esci4MouseClicked
        jPanel1.setVisible(false);
        jPanel2.setVisible(true);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
        nomeP1.setText("");
        idTXT.setText("");
        idTXT.setVisible(false);
        idA.setVisible(false);
        Errore4.setText("");
    }//GEN-LAST:event_Esci4MouseClicked

    private void Esci4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Esci4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Esci4MouseEntered

    private void Esci4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Esci4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Esci4MouseExited

    private void Esci4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Esci4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Esci4ActionPerformed

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void registraP1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registraP1MouseClicked
        try {
            Color r = new Color(255, 51, 51);
            Color c = new Color(59, 167, 79, 255);
            String check = "";
            String ris = "";
            String id = "";
            ris = l.ControllaMail(nomeP1.getText().toLowerCase());
            check = l.CheckDoppi(nomeP1.getText().toLowerCase());
            switch (check) {
                case "check":
                    switch (ris) {
                        case "check":

                            Errore4.setForeground(c);
                            id = l.generaID(nomeP1.getText().toLowerCase());
                            if (id.equals("")) {
                                Errore4.setVisible(true);
                                Errore4.setForeground(r);
                                Errore4.setText("Errore di generazione ID");
                            } else {
                                idTXT.setText(id);
                                Errore4.setText("Mail Confermata \nnuovo id associato \na questa mail");
                                idTXT.setVisible(true);
                                idA.setVisible(true);
                                nomeP1.setText("");
                                idTXT.setText("");
                            }

                            break;
                        case "NV":
                            Errore4.setVisible(true);
                            Errore4.setForeground(r);
                            Errore4.setText("mail non valida");
                            break;

                    }
                    break;
                case "uguali":
                    Errore4.setVisible(true);
                    Errore4.setForeground(r);
                    Errore4.setText("Mail già registrata!");
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(Grafica_Applicazione_Azienda_Sanitaria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_registraP1MouseClicked

    private void registraP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registraP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registraP1ActionPerformed

    private void idTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTXTActionPerformed

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
        if (jToggleButton1.isSelected()) {
            try {
                UIManager.setLookAndFeel(new FlatLightLaf());
                SwingUtilities.updateComponentTreeUI(this);
            } catch (UnsupportedLookAndFeelException ex) {
                System.out.println("errore");
            }
            Errore.setVisible(false);
            Errore.setBorder(null);
        } else {
            try {
                UIManager.setLookAndFeel(new FlatDarkLaf());
                SwingUtilities.updateComponentTreeUI(this);
            } catch (UnsupportedLookAndFeelException ex) {
                System.out.println("errore");
            }
            Errore.setVisible(false);
            Errore.setBorder(null);
        }
    }//GEN-LAST:event_jToggleButton1MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked

    }//GEN-LAST:event_jPanel5MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AggiungiD;
    private javax.swing.JLabel AziendaSanitaria;
    private javax.swing.JButton BottonLogin;
    private javax.swing.JTextArea Errore;
    public javax.swing.JTextArea Errore2;
    public javax.swing.JTextArea Errore3;
    public javax.swing.JTextArea Errore4;
    private javax.swing.JButton Esci2;
    private javax.swing.JButton Esci3;
    private javax.swing.JButton Esci4;
    private javax.swing.JTextField JTcerca;
    private javax.swing.JLabel LabelD;
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JButton aggiungiPaziente;
    public javax.swing.JTextField codiceM;
    public javax.swing.JTextField codiceP;
    public javax.swing.JTextField cognomeM;
    public javax.swing.JTextField cognomeP1;
    private javax.swing.JLabel idA;
    private javax.swing.JTextField idTXT;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox25;
    private javax.swing.JCheckBox jCheckBox26;
    private javax.swing.JCheckBox jCheckBox27;
    private javax.swing.JCheckBox jCheckBox28;
    private javax.swing.JCheckBox jCheckBox29;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox30;
    private javax.swing.JCheckBox jCheckBox31;
    private javax.swing.JCheckBox jCheckBox32;
    private javax.swing.JCheckBox jCheckBox33;
    private javax.swing.JCheckBox jCheckBox34;
    private javax.swing.JCheckBox jCheckBox35;
    private javax.swing.JCheckBox jCheckBox36;
    private javax.swing.JCheckBox jCheckBox37;
    private javax.swing.JCheckBox jCheckBox38;
    private javax.swing.JCheckBox jCheckBox39;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox40;
    private javax.swing.JCheckBox jCheckBox41;
    private javax.swing.JCheckBox jCheckBox42;
    private javax.swing.JCheckBox jCheckBox43;
    private javax.swing.JCheckBox jCheckBox44;
    private javax.swing.JCheckBox jCheckBox45;
    private javax.swing.JCheckBox jCheckBox46;
    private javax.swing.JCheckBox jCheckBox47;
    private javax.swing.JCheckBox jCheckBox48;
    private javax.swing.JCheckBox jCheckBox49;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox50;
    private javax.swing.JCheckBox jCheckBox51;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JComboBox<String> medicoS;
    public javax.swing.JTextField nomeM;
    public javax.swing.JTextField nomeP;
    public javax.swing.JTextField nomeP1;
    private javax.swing.JButton nuovoAccount;
    private javax.swing.JButton registraM;
    private javax.swing.JButton registraP;
    private javax.swing.JButton registraP1;
    private javax.swing.JButton rimuoviM;
    private javax.swing.JButton rimuoviP;
    private javax.swing.JPanel risultato;
    private javax.swing.JPanel risultato1;
    private javax.swing.JTextArea rslt;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JTextField testoID;
    private javax.swing.JPasswordField testoPassword;
    // End of variables declaration//GEN-END:variables
}
