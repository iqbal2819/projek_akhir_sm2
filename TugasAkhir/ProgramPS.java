package TugasAkhir;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class ProgramPS extends javax.swing.JFrame {
//    membuat var instance diskon (variabel yang dideklarasikan di dalam kelas tetapi di luar metode atau konstruktor apa pun.)
//    variabel tersebut dapat di akses ke semua method dalam kelas yg sama
    private double diskon ;
    private int num ;
    private int [] bilik = new int [10];

    private void bilikRuang(){
        boolean Full = true;
        for (int i = 0; i < bilik.length; i++) {
// default array bernilai 0 sampai panjang/length array
//  jadi akan mencari array yg sma dengan bernilai 0
         if (bilik[i] == 0){
//  jika ketemu var i akan di tambah 1, ini yg akan mengisi arraynya
             bilik[i] = i + 1;
// dan menampilkannya di tf no bilik
             tfNo.setText(Integer.toString(bilik[i]));
// dan merubah full menjadi false(Menandakan tidak full)            
             Full = false;
// berhenti 
             break;
         }
        }
// jika bilik array penuh
        if (Full){
            // menapilkan message dialog
             JOptionPane.showMessageDialog(null, "Bilik full");
             
        }
    }
    
    private void runningText(){
        // act listener ini, digunakan untuk menangani ivent yg ada di action performed
        ActionListener act = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 // Mendapatkan teks dari JTextField tfRunT
                String a = LRunT.getText();
                 // Mengambil karakter pertama dari teks tersebut
                String b = a.substring(0, 1);
                // Mengambil sisa teks setelah karakter pertama
                String c = a.substring(1, a.length());
                // Menggabungkan sisa teks dengan karakter pertama dan mengatur hasilnya kembali ke JTextField
                LRunT.setText(c+b);
            }
 // Membuat dan memulai Timer dengan interval 100 milidetik yang memanggil ActionListener yang baru dibuat
        };
        new javax.swing.Timer(100, act).start();
    }
//    method untuk menampilkan dialog message 
    private void mDialog() {
     JOptionPane.showMessageDialog(null, "Masukan Waktu / Jam terlebih dahulu");
     tfJam.requestFocus();//untuk meminta fokus ke text field jam
    }
    
//    membuat method clear
    private void clear(){
        tfHarga.setText("");//mengubah text menjadi kosong
        tfJam.setText("");
        tfNama.setText("");
        tfWaktuMulai.setText("");
        tfWaktuMulai1.setText("");
        tfWaktuSelesai.setText("");
        tfNo.setText("");
        cbTypePs.setSelectedIndex(0);// mengubah combobox type ps menjadi index0(jadi comboboxnya mensorot pilihan pertama)
    }
    
    private void waktuMulai(){
       String jam = tfWaktuMulai.getText();
       String menit = tfWaktuMulai1.getText();
       String textfield = tfJam.getText();
        if (textfield.equals("")){
           mDialog();
       }
        else{
            num = Integer.parseInt(textfield);
            int b = Integer.parseInt(jam);
            if (num > 0 ){
                 b += num;
                if (b >= 24){
                    b = b%24;  
                }
                tfWaktuSelesai.setText(Integer.toString(b)+":"+menit);
            }
        }
    }
    private void updateData(){
        double harga = 0;
        double total = 0;

// merubah cb type ps dan tf jam menjadi string 
        String comboBox1 = cbTypePs.getSelectedItem().toString();
        String textfield2 = tfJam.getText();
        if(comboBox1.equals("PS 2")){
                    harga = 3000;
// Jika textfielnya sama dengan kosong("") akan menampilkan message dialog 
// return untuk menghindari terjadinya error
            if (textfield2.equals("")){
                mDialog();
                return;
                }
            }
        
        else if(comboBox1.equals("PS 3")){
            harga = 5000;
            if (textfield2.equals("")){
                mDialog();
                return;
            }
        }
        
        else if(comboBox1.equals("PS 4")){
                harga = 10000;
            if (textfield2.equals("")){
                mDialog();
                return;
            }
        }
        
        else {
           
             return;
                
        }
        
        num = Integer.parseInt(textfield2);
        total = harga * num;
        tfHarga.setText(Double.toString(total)); // menampilkan var total ke  tf harga dan merubahnya var total menjadi string
       //Menghitung diskon
        if (num >=5){
            diskon =  total*0.2;
            total -= diskon;
            
        }
        else {
            diskon = 0;
        }
        
        tfHarga.setEditable(false); // agar textfield  harga tidak bisa di edit
    }
   
    public ProgramPS() {
        initComponents();
        runningText();
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cbTypePs = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        tfJam = new javax.swing.JTextField();
        tfNama = new javax.swing.JTextField();
        jLNama = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfHarga = new javax.swing.JTextField();
        bSelesai = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cbGame = new javax.swing.JComboBox<>();
        tfNo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfWaktuMulai1 = new javax.swing.JTextField();
        tfWaktuMulai = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfWaktuSelesai = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea1 = new javax.swing.JTextArea();
        bHapus = new javax.swing.JButton();
        bLogout = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        LRunT = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("APLIKASI KASIR  PS");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(700, 300));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("STATION");
        jLabel1.setToolTipText("");
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setFocusable(false);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 90, 60));

        jPanel2.setBackground(new java.awt.Color(243, 243, 243));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Menu", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Viner Hand ITC", 1, 18), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbTypePs.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        cbTypePs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "PS 2", "PS 3", "PS 4" }));
        cbTypePs.setToolTipText("Pilih Tipe");
        cbTypePs.setName(""); // NOI18N
        cbTypePs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTypePsActionPerformed(evt);
            }
        });
        jPanel2.add(cbTypePs, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 80, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Type PS ");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 240, 50));

        tfJam.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfJam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfJam.setToolTipText("Masukan angka");
        tfJam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfJamActionPerformed(evt);
            }
        });
        tfJam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfJamKeyPressed(evt);
            }
        });
        jPanel2.add(tfJam, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 100, 40));

        tfNama.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfNama.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNama.setToolTipText("Nama Panggilan");
        tfNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNamaActionPerformed(evt);
            }
        });
        tfNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfNamaKeyPressed(evt);
            }
        });
        jPanel2.add(tfNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 120, 40));

        jLNama.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNama.setText("Nama ");
        jLNama.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 240, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Rp.");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 30, 30));

        tfHarga.setEditable(false);
        tfHarga.setBackground(new java.awt.Color(243, 243, 243));
        tfHarga.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        tfHarga.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfHarga.setToolTipText("Total Harga");
        tfHarga.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        tfHarga.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfHarga.setName(""); // NOI18N
        tfHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHargaActionPerformed(evt);
            }
        });
        jPanel2.add(tfHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 130, 40));
        tfHarga.getAccessibleContext().setAccessibleName("");

        bSelesai.setText("Selesai");
        bSelesai.setToolTipText("");
        bSelesai.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bSelesai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bSelesaiMouseClicked(evt);
            }
        });
        bSelesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSelesaiActionPerformed(evt);
            }
        });
        jPanel2.add(bSelesai, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 110, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Harga   :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, 30));

        cbGame.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cbGame.setToolTipText("Pilih Game");
        cbGame.setName(""); // NOI18N
        cbGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGameActionPerformed(evt);
            }
        });
        jPanel2.add(cbGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 120, 40));

        tfNo.setBackground(new java.awt.Color(243, 243, 243));
        tfNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNo.setToolTipText("Room");
        tfNo.setBorder(null);
        tfNo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNoActionPerformed(evt);
            }
        });
        jPanel2.add(tfNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 110, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Bilik No :");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 230, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Waktu/Jam ");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 230, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText(":");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 10, 40));

        tfWaktuMulai1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tfWaktuMulai1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfWaktuMulai1.setToolTipText("Menit");
        tfWaktuMulai1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfWaktuMulai1ActionPerformed(evt);
            }
        });
        tfWaktuMulai1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfWaktuMulai1KeyPressed(evt);
            }
        });
        jPanel2.add(tfWaktuMulai1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 50, 40));

        tfWaktuMulai.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tfWaktuMulai.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfWaktuMulai.setToolTipText("Jam");
        tfWaktuMulai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfWaktuMulaiActionPerformed(evt);
            }
        });
        tfWaktuMulai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfWaktuMulaiKeyPressed(evt);
            }
        });
        jPanel2.add(tfWaktuMulai, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 50, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Waktu Mulai");
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 240, 50));

        tfWaktuSelesai.setEditable(false);
        tfWaktuSelesai.setBackground(new java.awt.Color(243, 243, 243));
        tfWaktuSelesai.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfWaktuSelesai.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfWaktuSelesai.setToolTipText("Waktu selesai");
        tfWaktuSelesai.setBorder(null);
        tfWaktuSelesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfWaktuSelesaiActionPerformed(evt);
            }
        });
        tfWaktuSelesai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfWaktuSelesaiKeyPressed(evt);
            }
        });
        jPanel2.add(tfWaktuSelesai, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 110, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Waktu Selesai");
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 230, 50));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Game");
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 230, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 510, 470));

        textArea1.setEditable(false);
        textArea1.setColumns(20);
        textArea1.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        textArea1.setRows(5);
        textArea1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "KEY PLAYSTATION", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jScrollPane1.setViewportView(textArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 290, 310));

        bHapus.setText("Hapus");
        bHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bHapusMouseClicked(evt);
            }
        });
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });
        jPanel1.add(bHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 100, 40));

        bLogout.setText("Keluar");
        bLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bLogoutMouseClicked(evt);
            }
        });
        bLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(bLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 100, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TugasAkhir/KEY PlayStation1.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 90, 80));

        jLabel13.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("KEY ");
        jLabel13.setToolTipText("");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel13.setFocusable(false);
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 50, 60));

        jLabel14.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("PLAY");
        jLabel14.setToolTipText("");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel14.setFocusable(false);
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 60));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("===========================================================>");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        LRunT.setBackground(new java.awt.Color(255, 255, 255));
        LRunT.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LRunT.setForeground(new java.awt.Color(255, 51, 51));
        LRunT.setText(".......Bermain lebih dari 5 Jam, Akan mendapatkan diskon......");
        jPanel1.add(LRunT, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 490, 250, 40));

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Note", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 258, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, 270, 60));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/copper-icosahedron-pattern-black1.jpg"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 380));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/copper-icosahedron-pattern-black1.jpg"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 840, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHargaActionPerformed
        // TODO add your handling code here:    
    }//GEN-LAST:event_tfHargaActionPerformed

    private void bSelesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSelesaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bSelesaiActionPerformed

    private void cbTypePsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTypePsActionPerformed
//
// membuat combobox game sesuai dengan tipe psnya
//Combo box game

        updateData(); // memanggil method update data
        // kegunaannya : agar ketika milih tipe ps akan langsung menampilkan harganya.
        
         cbGame.removeAllItems();// untuk menghapus semua item cbGame 
         //kegunaannya : agar ketika memilih ulang cbtipePs nya, item di cbgamenya  tidak menumpuk(langsung mereset/menghapus yg ada di cbgamenya)
         
        String comboBox1 = cbTypePs.getSelectedItem().toString(); //merubah cbTypePs menjadi String combobox1
/*
   ketika combobox typePs di ganti, 
   akan menambahkan game ps sesuai dengan tipe psnya ke dalam combobox game
*/
        if (comboBox1.equals("PS 2")){
            cbGame.addItem("GTA SA");// ini cara menambahkan item ke dalam cbGame
            cbGame.addItem("Bully");
            cbGame.addItem("Basara 2");
            cbGame.addItem("God Hand");
        }
        // untuk cara yg di bawah ini sama dengan cara if ps2 diatas
        else if (comboBox1.equals("PS 3")){
            cbGame.addItem("GTA V");
            cbGame.addItem("FIFA 19");
            cbGame.addItem("RDR");
            cbGame.addItem("COD Black Ops II");
    }
        else if (comboBox1.equals("PS 4")){
            cbGame.addItem("RDR II");
            cbGame.addItem("Far Cry 6");
            cbGame.addItem("Elden Ring ");
            cbGame.addItem("Hogwarts Legacy");
    }   
    }//GEN-LAST:event_cbTypePsActionPerformed

    private void bSelesaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSelesaiMouseClicked
// Ketika Button selesai di klik akan menjalan program ini
        updateData(); // memanggil method
//        bilikRuang();
        waktuMulai();
        
        //merubah cbTypePs dan cbGame menjadi string 
        String tipePs = cbTypePs.getSelectedItem().toString();
        String game = cbGame.getSelectedItem().toString();        
        String harga = tfHarga.getText();   //mengambil teks  tf harga 

        double harga1 = Double.parseDouble(harga);
        double t = harga1 - diskon;
        String total = Double.toString(t);
        int x;// agar nilai yang dikembalikan oleh JOptionPane.showConfirmDialog dapat digunakan dalam pernyataan if-else.
        x = JOptionPane.showConfirmDialog(null, "Yakin dengan pilihan?","confirm",JOptionPane.YES_NO_OPTION);// membuat message dialog(yes dan no)
        if (x==JOptionPane.YES_OPTION){// jika memilih yes
        JOptionPane.showMessageDialog(null,"Transaksi berhasil","SUKSES",JOptionPane.INFORMATION_MESSAGE);
        
        textArea1.append("===== KEY PLAYSTATION =======\n");
        // menambahkan cbTypePs, cbGame, tfJam, var diskon, dan tfHarga ke dalam textArea1
        textArea1.append("Nama Penyewa  : " + tfNama.getText()+"\n");
        textArea1.append("Tipe PS       : " + cbTypePs.getSelectedItem()+"\n");
        textArea1.append("Game          : " + cbGame.getSelectedItem()+"\n");
        textArea1.append("waktu Main    : " + tfJam.getText()+" Jam\n");
        textArea1.append("Waktu Selesai : Jam "+tfWaktuSelesai.getText()+"\n");
        textArea1.append("Diskon 20%    : Rp." + diskon+"\n");
        textArea1.append("Total Harga   : Rp." + total+"\n");
        textArea1.append("Bilik No      : " + tfNo.getText()+"\n");
        textArea1.append("=============================\n");
        textArea1.append("\n");
        clear();
        } 
        
        else{ //jika memilih no akan kembali
            return;
        }         
    }//GEN-LAST:event_bSelesaiMouseClicked

    private void tfJamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfJamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfJamActionPerformed

    private void tfJamKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfJamKeyPressed
//    jika texfield jam menekan enter akan menjalankan method updatedata()
//text field
    if (evt.getKeyCode() == KeyEvent.VK_ENTER){
        updateData();
        tfWaktuMulai.requestFocus();
    }
    }//GEN-LAST:event_tfJamKeyPressed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bHapusActionPerformed

    private void bHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bHapusMouseClicked
        // TODO add your handling code here:
// button 2 
    String text = textArea1.getText();
    if (text.isEmpty()){//mengecek text area kosong atau tidak
        JOptionPane.showMessageDialog(null, "tidak ada data");
         System.out.println("data kosong");
         return;
        }
    else
        textArea1.setText("");
        JOptionPane.showMessageDialog(null, "berhasil dihapus");
        System.out.println("Data Berhasil Di Hapus");
    }//GEN-LAST:event_bHapusMouseClicked

    private void cbGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGameActionPerformed

    private void tfNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNamaActionPerformed

    private void tfNamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNamaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
             tfJam.requestFocus();
    }//GEN-LAST:event_tfNamaKeyPressed

    private void tfWaktuMulaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfWaktuMulaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfWaktuMulaiActionPerformed

    private void tfWaktuMulaiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfWaktuMulaiKeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == KeyEvent.VK_ENTER)
             tfWaktuMulai1.requestFocus();
        
    }//GEN-LAST:event_tfWaktuMulaiKeyPressed

    private void tfWaktuSelesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfWaktuSelesaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfWaktuSelesaiActionPerformed

    private void tfWaktuSelesaiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfWaktuSelesaiKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfWaktuSelesaiKeyPressed

    private void tfWaktuMulai1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfWaktuMulai1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfWaktuMulai1ActionPerformed

    private void tfWaktuMulai1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfWaktuMulai1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            waktuMulai();
    }//GEN-LAST:event_tfWaktuMulai1KeyPressed

    private void tfNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNoActionPerformed

    private void bLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bLogoutMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bLogoutMouseClicked

    private void bLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLogoutActionPerformed
        // TODO add your handling code here:
        // akan mengeluarkan jframe ini dan memanggil from login
        FromLogin ps = new FromLogin();
        this.dispose();
        ps.setVisible(true);
    }//GEN-LAST:event_bLogoutActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProgramPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProgramPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProgramPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProgramPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProgramPS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LRunT;
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bLogout;
    private javax.swing.JButton bSelesai;
    private javax.swing.JComboBox<String> cbGame;
    private javax.swing.JComboBox<String> cbTypePs;
    private javax.swing.JLabel jLNama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea textArea1;
    private javax.swing.JTextField tfHarga;
    private javax.swing.JTextField tfJam;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfNo;
    private javax.swing.JTextField tfWaktuMulai;
    private javax.swing.JTextField tfWaktuMulai1;
    private javax.swing.JTextField tfWaktuSelesai;
    // End of variables declaration//GEN-END:variables
        
    private String getSelectedItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
