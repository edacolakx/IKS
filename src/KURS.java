
import java.io.File;
import java.sql.Connection;
import java.sql.*;
import java.time.LocalDate;
import javafx.stage.FileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eda
 */
public class KURS extends javax.swing.JFrame {
Connection conn=null;
 PreparedStatement pst=null;
 ResultSet rs=null;
    /**
     * Creates new form KURS
     */
    public KURS() {
        initComponents();
         lbltarih.setText(String.valueOf(LocalDate.now()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbltarih = new javax.swing.JLabel();
        lbltoplamk = new javax.swing.JLabel();
        lbldoluk = new javax.swing.JLabel();
        lblbosk = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtadsoyad = new javax.swing.JTextField();
        txttc = new javax.swing.JTextField();
        txttel = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        cbdil = new javax.swing.JComboBox<>();
        kaydetbtn = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblucret = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txttaksitsayisi = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txttcpara = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        odemeyapildi = new javax.swing.JButton();
        lbltoplam = new javax.swing.JLabel();
        lblkalan = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tarea = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        lbltaksitsayisi = new javax.swing.JLabel();
        lblodenen = new javax.swing.JLabel();
        butonara = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LANGUAGE ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TARİH                                      :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 23, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BOŞ KONTENJAN                  :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 143, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TOPLAM KONTENJAN          :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 67, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("KULLANILAN KONTENJAN :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 104, -1, -1));

        lbltarih.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbltarih.setForeground(new java.awt.Color(255, 255, 255));
        lbltarih.setText("                                        ");
        lbltarih.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(lbltarih, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 24, -1, -1));

        lbltoplamk.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbltoplamk.setForeground(new java.awt.Color(255, 255, 255));
        lbltoplamk.setText("100");
        lbltoplamk.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(lbltoplamk, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 65, 164, -1));

        lbldoluk.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbldoluk.setForeground(new java.awt.Color(255, 255, 255));
        lbldoluk.setText("                         ");
        lbldoluk.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(lbldoluk, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 102, 164, -1));

        lblbosk.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblbosk.setForeground(new java.awt.Color(255, 255, 255));
        lblbosk.setText("                                     ");
        lblbosk.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(lblbosk, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 143, 164, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ADI-SOYADI                   :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(771, 40, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DİL SEVİYESİ                :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(773, 204, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("TC KİMLİK NUMARASI :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(771, 80, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("E-MAİL                            :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(773, 124, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("TELEFON                         :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(773, 164, -1, -1));

        txtadsoyad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtadsoyad, new org.netbeans.lib.awtextra.AbsoluteConstraints(1037, 44, 116, -1));

        txttc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txttc, new org.netbeans.lib.awtextra.AbsoluteConstraints(1037, 84, 116, -1));

        txttel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txttel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1037, 166, 116, -1));

        txtemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(1037, 128, 116, -1));

        cbdil.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbdil.setForeground(new java.awt.Color(255, 255, 255));
        cbdil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SEÇİNİZ", "A1", "A2", "B1", "B2", "C1", "C2" }));
        cbdil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbdilActionPerformed(evt);
            }
        });
        jPanel1.add(cbdil, new org.netbeans.lib.awtextra.AbsoluteConstraints(1035, 205, 160, -1));

        kaydetbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kaydetbtn.setText("KAYDET");
        kaydetbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        kaydetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaydetbtnActionPerformed(evt);
            }
        });
        jPanel1.add(kaydetbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 388, 299, 40));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("ÜCRET                                      :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 179, -1, -1));
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 179, 168, -1));

        lblucret.setForeground(new java.awt.Color(255, 255, 255));
        lblucret.setText("                                         ");
        lblucret.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(lblucret, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 179, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("TAKSİT SAYISI              :");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(773, 246, -1, -1));

        txttaksitsayisi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txttaksitsayisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(1035, 246, 120, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WhatsApp Image 2021-06-20 at 18.00.02.jpeg"))); // NOI18N
        jLabel21.setText("jLabel21");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 1470, 670));

        jTabbedPane1.addTab("ÖĞRENCİ KAYIT", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TC KİMLİK NUMARASI      :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 30, -1, -1));
        jPanel2.add(txttcpara, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 150, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TOPLAM ÜCRET    :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 110, 230, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ÖDENEN TAKSİT   :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("KALAN TAKSİT      :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, 16));

        odemeyapildi.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        odemeyapildi.setText("ÖDEME YAPILDI");
        odemeyapildi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        odemeyapildi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odemeyapildiActionPerformed(evt);
            }
        });
        jPanel2.add(odemeyapildi, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 440, -1, -1));

        lbltoplam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltoplam.setForeground(new java.awt.Color(255, 255, 255));
        lbltoplam.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel2.add(lbltoplam, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 160, 17));

        lblkalan.setForeground(new java.awt.Color(255, 255, 255));
        lblkalan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(lblkalan, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 160, 20));

        tarea.setColumns(20);
        tarea.setRows(5);
        jScrollPane1.setViewportView(tarea);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 323, 409));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("TAKSİT SAYISI      :");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        lbltaksitsayisi.setForeground(new java.awt.Color(255, 255, 255));
        lbltaksitsayisi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(lbltaksitsayisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 158, 17));

        lblodenen.setForeground(new java.awt.Color(255, 255, 255));
        lblodenen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(lblodenen, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 160, 17));

        butonara.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        butonara.setForeground(new java.awt.Color(255, 255, 255));
        butonara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesytrew.jpg"))); // NOI18N
        butonara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonaraActionPerformed(evt);
            }
        });
        jPanel2.add(butonara, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 50, 40));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WhatsApp Image 2021-06-20 at 18.00.02.jpeg"))); // NOI18N
        jLabel20.setText("jLabel20");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -60, 1460, 720));

        jTabbedPane1.addTab("PARA İŞLEMLERİ", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 64, 1370, 590));

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("SCHOOL");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 140, 40));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WhatsApp Image 2021-06-20 at 18.00.02.jpeg"))); // NOI18N
        jLabel19.setText("s");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1470, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kaydetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaydetbtnActionPerformed
  
           
           int sayac=0;
           int kontenjan=100;
        try
        {
           
            conn=db.connect_db();
        String sql2 = "SELECT * FROM OGRENCIKAYIT  ";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql2);
        while(rs.next()) {
        sayac++;
            }
        int kayitsayisi=kontenjan-sayac;
        System.out.println(kontenjan-sayac);
        lbldoluk.setText(String.valueOf(kayitsayisi-1));
        lblbosk.setText(String.valueOf(sayac+1));
        }
        catch(Exception ex)
        {

        }
        finally
        {
            try
            {
                conn.close();
            }
            catch(Exception ex)
            {

            }
        }
        
       try
       {
        
        
        if (sayac<100) {
            conn=db.connect_db();
            String sql="INSERT INTO OGRENCIKAYIT(ADSOYAD,TCKIMLIKNO,EMAIL,TELNO,DILSEVIYESI,TARIH,UCRET,TAKSITSAYISI,KALANTAKSIT)"
+"VALUES('"+txtadsoyad.getText()+"','"+txttc.getText()+"','"+txtemail.getText()+"','"+txttel.getText()+"','"+cbdil.getSelectedIndex()+"','"
                    +lbltarih.getText()+"','"+lblucret.getText()+"','"+txttaksitsayisi.getText()+"','"+lblucret.getText()+"')";
         
           pst = conn.prepareStatement(sql);
           pst.execute();
           
             
               
            txtadsoyad.setText("");txttc.setText("");txtemail.setText("");txttel.setText("");
           // lblucret.setText("");
            cbdil.setSelectedIndex(0);
                    
            
        }
       }
       catch(Exception ex)
       {
           JOptionPane.showMessageDialog(null,ex);
       }
       finally
       {
           try{
               conn.close();
           }
           catch(Exception ex)
           {
               
           }
       }

    }//GEN-LAST:event_kaydetbtnActionPerformed
   
    
    private void cbdilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbdilActionPerformed
      int a1=800,a2=1000,b1=1200,b2=1400,c1=1600,c2=1800,ucret=0;
      if (cbdil.getSelectedIndex() == 1) {
            ucret = a1;

           
        } else if (cbdil.getSelectedIndex() == 2) {
            ucret = a2;

            
        } else if (cbdil.getSelectedIndex() == 3) {
            ucret = b1;

           
        } else if (cbdil.getSelectedIndex() == 4) {
            ucret = b2;

            
        } else if (cbdil.getSelectedIndex() == 5) {
            ucret = c1;

            
        } else if (cbdil.getSelectedIndex() == 6) {
            ucret = c2;

           
        }
        lblucret.setText(String.valueOf(ucret));

        
    }//GEN-LAST:event_cbdilActionPerformed

    private void odemeyapildiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odemeyapildiActionPerformed
     tarea.append("\n\nİNGİLİZCE KURS SİSTEMİ TAKSİT DEKONTU\n\n"
                + "DEKONT TARİHİ  : " + LocalDate.now() + "\n"
                + "\nTC KİMLİK NO :" + txttcpara.getText()
                + "\nTOPLAM TAKSİT:" + lbltoplam.getText()
                + "\nÖDENEN TAKSİT:" + lblodenen.getText()
                + "\nKALAN TAKSİT :" + lblkalan.getText()
                + "\nTAKSİT SAYISI:" + lbltaksitsayisi.getText());

        Connection conn = null;

        try {
            conn = db.connect_db();
            String sql = "INSERT INTO ODEME (TCKIMLIKNO,TOPLAMTAKSIT,ODENENTAKSIT,KALANTAKSIT,TAKSITSAYISI,DEKONTTARIHI)"
                    + "VALUES ('" + txttcpara.getText() + "','" + lbltoplam.getText() + "','" + lblodenen.getText() + "','" + lblkalan.getText() + "','" + lbltaksitsayisi.getText() + "','" + LocalDate.now() + "')";

            pst = conn.prepareStatement(sql);
            pst.execute();

        } catch (Exception ex) {

        } finally {
            try {
                conn.close();
            } catch (Exception ex) {

            }
        }
    
        
        
        
        
        
        
        txttcpara.setText("");
        lbltoplam.setText("");
        lblodenen.setText("");
        lblkalan.setText("");
        lbltaksitsayisi.setText("");
    //    tarea.setText("");
        
        
        
    }//GEN-LAST:event_odemeyapildiActionPerformed

    private void butonaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonaraActionPerformed
       String tc = txttcpara.getText();
        try {
            conn = db.connect_db();
            String sql2 = "SELECT * FROM OGRENCIKAYIT WHERE TCKIMLIKNO='" + tc + "'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql2);
            lbltoplam.setText(rs.getString("UCRET"));
            lbltaksitsayisi.setText(rs.getString("TAKSITSAYISI"));
            int toplam = Integer.parseInt(lbltoplam.getText());
            int taksit = Integer.parseInt(lbltaksitsayisi.getText());
            int odenen = toplam / taksit;
            lblodenen.setText(String.valueOf(odenen));
            lblkalan.setText(String.valueOf(toplam - odenen));
            
            
            
            
            
            
        }
        catch(Exception ex)
        {
            
        }
        finally
        {
            try{
                conn.close();
            }
            catch(Exception ex)
            {
                
            }
        }
       
                
    }//GEN-LAST:event_butonaraActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(KURS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KURS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KURS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KURS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KURS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butonara;
    private javax.swing.JComboBox<String> cbdil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton kaydetbtn;
    private javax.swing.JLabel lblbosk;
    private javax.swing.JLabel lbldoluk;
    private javax.swing.JLabel lblkalan;
    private javax.swing.JLabel lblodenen;
    private javax.swing.JLabel lbltaksitsayisi;
    private javax.swing.JLabel lbltarih;
    private javax.swing.JLabel lbltoplam;
    private javax.swing.JLabel lbltoplamk;
    private javax.swing.JLabel lblucret;
    private javax.swing.JButton odemeyapildi;
    private javax.swing.JTextArea tarea;
    private javax.swing.JTextField txtadsoyad;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txttaksitsayisi;
    private javax.swing.JTextField txttc;
    private javax.swing.JTextField txttcpara;
    private javax.swing.JTextField txttel;
    // End of variables declaration//GEN-END:variables
}
