
package jframegui;

import javax.swing.JOptionPane;

public class rental_mobil extends javax.swing.JFrame {

   private int avansa1=12500, xenia1=17500,ferrari1=25000,jaguar1=35000,jmhjam,bayar1,potongan1,bonus1,ppn1,totalbayar1,uangkembali1,uangbayar2,hargaperjam2;
   private String hargaperjam1;
    public rental_mobil() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        panel1 = new java.awt.Panel();
        avansa = new javax.swing.JButton();
        xenia = new javax.swing.JButton();
        ferrari = new javax.swing.JButton();
        jaguar = new javax.swing.JButton();
        label1 = new java.awt.Label();
        panel2 = new java.awt.Panel();
        jenismobil = new javax.swing.JLabel();
        hargaperjam = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bayar = new javax.swing.JLabel();
        bonus = new javax.swing.JLabel();
        jmhjam1 = new javax.swing.JTextField();
        panel3 = new java.awt.Panel();
        potongan = new javax.swing.JLabel();
        PPN = new javax.swing.JLabel();
        totalbayar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        uangkambali = new javax.swing.JLabel();
        uangbayar1 = new javax.swing.JTextField();
        hitung = new javax.swing.JButton();
        uangkembali = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        Help = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jTextPane1.setText("Selamat Datang di ");
        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(153, 153, 153));
        panel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        avansa.setText("Avanza");
        avansa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avansaActionPerformed(evt);
            }
        });

        xenia.setText("Xenia");
        xenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xeniaActionPerformed(evt);
            }
        });

        ferrari.setText("Ferrari");
        ferrari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ferrariActionPerformed(evt);
            }
        });

        jaguar.setText("Jaguar");
        jaguar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaguarActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Goudy Old Style", 1, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 0, 0));
        label1.setText("Pilihan Mobil");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(avansa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xenia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ferrari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jaguar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(avansa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xenia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ferrari)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jaguar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jenismobil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jenismobil.setText("Jenis Mobil            : ");

        hargaperjam.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        hargaperjam.setText("Harga perJam        :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Jumlah Jam           :");

        bayar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bayar.setText("Bayar                    :");

        bonus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bonus.setText("Bonus                   : ");

        jmhjam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmhjam1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jenismobil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hargaperjam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bonus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jmhjam1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jenismobil, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hargaperjam, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jmhjam1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bonus, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        potongan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        potongan.setText("Potongan         :");

        PPN.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PPN.setText("PPN                  :");

        totalbayar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        totalbayar.setText("Total Bayar       :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Uang Bayar       :");

        uangkambali.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        uangkambali.setText("Uang Kembali    :");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(potongan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PPN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalbayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(uangkambali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uangbayar1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(potongan, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PPN, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uangbayar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uangkambali, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        hitung.setText("Hitung Total");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });

        uangkembali.setText("Uang Kembali");
        uangkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uangkembaliActionPerformed(evt);
            }
        });

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        Help.setText("Help");
        Help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpActionPerformed(evt);
            }
        });

        jButton1.setText("Peraturan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Persyaratan");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(204, 0, 0));

        jTextField2.setBackground(new java.awt.Color(204, 0, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Welcome to Rent car");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jTextField1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(41, 41, 41)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Help, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hitung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(uangkembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(139, 139, 139)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(Help)
                    .addComponent(exit))
                .addGap(10, 10, 10)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hitung, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(uangkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void avansaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avansaActionPerformed
      jenismobil.setText("Jenis Mobil            : Avansa ");
      hargaperjam.setText("Harga perJam        : "+avansa1);
      hargaperjam1="Avansa";
      hargaperjam2=avansa1;
      
    }//GEN-LAST:event_avansaActionPerformed

    private void xeniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xeniaActionPerformed
        jenismobil.setText("Jenis Mobil            : Xenia");
      hargaperjam.setText("Harga perJam        : "+xenia1);
      hargaperjam1="Xenia";
      hargaperjam2=xenia1;
    }//GEN-LAST:event_xeniaActionPerformed

    private void ferrariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ferrariActionPerformed
        jenismobil.setText("Jenis Mobil            : Ferrari ");
      hargaperjam.setText("Harga perJam        : "+ferrari1);
      hargaperjam1="Ferrari";
      hargaperjam2=ferrari1;
    }//GEN-LAST:event_ferrariActionPerformed

    private void jaguarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaguarActionPerformed
       jenismobil.setText("Jenis Mobil            : Jaguar ");
      hargaperjam.setText("Harga perJam        : "+jaguar1);
      hargaperjam1="Jaguar";
      hargaperjam2=jaguar1;
    }//GEN-LAST:event_jaguarActionPerformed

    private void jmhjam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmhjam1ActionPerformed
        
        
    }//GEN-LAST:event_jmhjam1ActionPerformed

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
      jmhjam=Integer.parseInt(jmhjam1.getText());
        if("Avansa".equals(hargaperjam1)){
            bayar1=jmhjam*avansa1;
            bayar.setText("Bayar                    : "+bayar1); 
            
        }else if("Xenia".equals(hargaperjam1)){
            bayar1=jmhjam*xenia1;
            bayar.setText("Bayar                    : "+bayar1); 
        }else if("Ferrari".equals(hargaperjam1)){
            bayar1=jmhjam*ferrari1;
            bayar.setText("Bayar                    : "+bayar1); 
        }else if("Jaguar".equals(hargaperjam1)){
            bayar1=jmhjam*jaguar1;
            bayar.setText("Bayar                    : "+bayar1); 
        } 
        
       
        
        
        if(bayar1>1200000){
            potongan1=50000;
            potongan.setText("Potongan         : "+potongan1);
        }else{
            potongan1=0;
            potongan.setText("Potongan         : 0 ");
        }
        
        if(jmhjam>144){
            bonus1=24;
            bonus.setText("Bonus                   : "+bonus1+" Jam");
        }else if (jmhjam>72){
            bonus1=10;
            bonus.setText("Bonus                   : "+bonus1+" Jam");
        }else{
            bonus1=0;
            bonus.setText("Bonus                   : 0 Jam");
        }
        ppn1=bayar1*3/1000;
        PPN.setText("PPN                  : "+ppn1);
        
        totalbayar1=bayar1+ppn1-potongan1;
        totalbayar.setText("Total Bayar       : "+totalbayar1);
        
    }//GEN-LAST:event_hitungActionPerformed

    private void uangkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uangkembaliActionPerformed
      
        uangbayar2=Integer.parseInt(uangbayar1.getText());                    
        if(uangbayar2>=totalbayar1){
        uangkembali1=uangbayar2-totalbayar1;
        uangkambali.setText("Uang Kembali    : "+uangkembali1);
           JOptionPane.showMessageDialog(rootPane, " Nota pembayaran \n "
                                                  +" 1. jenis Mobil                 : "+hargaperjam1+"\n"
                                                  +" 2. Harga PerJam             : "+hargaperjam2+"\n"
                                                  +" 3. Jumlah jam sewa         : "+jmhjam+"\n"
                                                  +" 4. Bayar                          : "+bayar1+"\n"
                                                  +" 5. Bonus                          : "+bonus1+"\n"
                                                  +" 6. Potongan                     : "+potongan1+"\n"
                                                  +" 7. PPN                            : "+ppn1+"\n"
                                                  +" 8. Total Bayar              : "+totalbayar1+"\n" 
                                                  +" 9. Uang Bayar              : "+uangbayar2+"\n"
                                                  +" 10. Uang Kembali           : "+uangkembali1+"\n");
           
        }else{
           JOptionPane.showMessageDialog(rootPane, " Maaf uang anda kurang ");
           
           
        }
   
    }//GEN-LAST:event_uangkembaliActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
      jenismobil.setText("Jenis Mobil            : ");
      hargaperjam.setText("Harga perJam        : ");  
      uangkambali.setText("Uang Kembali    : ");
      totalbayar.setText("Total Bayar       : ");
      bonus.setText("Bonus                   : ");
      PPN.setText("PPN                  : ");
      bayar.setText("Bayar                    : ");
      potongan.setText("Potongan         : ");
      uangbayar1.setText("");
      jmhjam1.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_formPropertyChange

    private void HelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpActionPerformed
        JOptionPane.showMessageDialog(rootPane, " 1. Pilih salah satu jenis Mobil yang akan disewa \n"
                                              + " 2. Masukkan jumlah Jam lama Mobil yang akan disewa \n"
                                              + " 3. jika Bayar lebih dari 120000 maka dapat potongan harga 50000 \n "
                                              + "    jika sewa Mobil lebih dari 144 jam maka dapat bonus 24 jam \n"
                                              + "    jika sewa Mobil lebih dari 72 jam maka dapat bonus 10 jam \n"
                                              + " 4. tekan tombol (Hitung total) untuk menghitung total bayar \n"
                                              + " 5. Masukkan uang bayar. kemudian tekan tombol (Uang kembali) untuk melihat uang kembali dan nota pembayaran");
    }//GEN-LAST:event_HelpActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       JOptionPane.showMessageDialog(rootPane, " 1. Penyewa bersedia mematuhi,  menyetujui & menandatangani syarat & \n"
                                              + "    Ketentuan di dalam Surat Perjanjian Sewa Mobil \n"                                             
                                              + " 2. Pemesanan/booking mobil paling lambat 3 hari sebelumnya & \n"
                                              + "    melakukan pembayaran booking fee 30% dari total harga sewa \n "
                                              + " 3. Untuk luar kota minimal sewa 2 hari / 48 jam \n"
                                              + " 4. Penyewa wajib mengembalikan mobil dengan keadaan sama ketika mobil itu ketika diambil \n"
                                              + " 5. Penyewa wajib mengembalikan mobil tepat waktu");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       JOptionPane.showMessageDialog(rootPane, " 1.  FC KTP suami dan istri\n"
                                              + " 2. FC KK \n"                                             
                                              + " 3. FC Rekening listrik /Telp Rumah\n"
                                              + " 4. FC Surat Tanda Bukti Kepemilikan Rumah\n "
                                             + " 5. FC Kartu identitas pegawai \n"
                                              + " 6. FC SIM \n"
                                              + " 7. Dicocokkan dengan dokumen aslinya dan bersedia disurvey");
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(rental_mobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rental_mobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rental_mobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rental_mobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new rental_mobil().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Help;
    private javax.swing.JLabel PPN;
    private javax.swing.JButton avansa;
    private javax.swing.JLabel bayar;
    private javax.swing.JLabel bonus;
    private javax.swing.JButton clear;
    private javax.swing.JButton exit;
    private javax.swing.JButton ferrari;
    private javax.swing.JLabel hargaperjam;
    private javax.swing.JButton hitung;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton jaguar;
    private javax.swing.JLabel jenismobil;
    private javax.swing.JTextField jmhjam1;
    private java.awt.Label label1;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private javax.swing.JLabel potongan;
    private javax.swing.JLabel totalbayar;
    private javax.swing.JTextField uangbayar1;
    private javax.swing.JLabel uangkambali;
    private javax.swing.JButton uangkembali;
    private javax.swing.JButton xenia;
    // End of variables declaration//GEN-END:variables
}
