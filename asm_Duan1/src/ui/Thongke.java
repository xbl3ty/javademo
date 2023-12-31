/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import Dao.chitietchuyenxeDao;
import Xe.chitietchuyenxe;
import da1.ui.QuanLyNhanVien;
import da1.ui.QuanLyXe;
import da1.ui.QuanLyKhuyenMai;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class Thongke extends javax.swing.JFrame {
chitietchuyenxeDao dao=new chitietchuyenxeDao();
        
    /**
     * Creates new form Thongke
     */
    public Thongke() {
        initComponents();
        dao.select();
        loadtable();
    }
    public void loadtable(){
        
            DefaultTableModel df = (DefaultTableModel) table.getModel();
            df.setRowCount(0);
            for (int i = 0; i < searche("", "all").size(); i++) {
List a=(List) searche("", "all").get(i);
String trangthai="";
int tien=0;
if(a.get(10).toString().equals("0")){
    trangthai="đã đặt";
    tien= (int)a.get(9);
}else{
    trangthai="đã hủy";
   tien= (int)a.get(9)-((int)a.get(9)*(int)a.get(10))/10;
    
}
int moneyy=0;
            Object[] row = {
                a.get(0), a.get(7), trangthai, a.get(9),tien

            };
            
            df.addRow(row);
            for(int x=0;x<df.getRowCount();x++){
                moneyy=moneyy+Integer.parseInt(df.getValueAt(x, 4).toString());
            }
            money.setText(String.valueOf(moneyy));
}
        }
    
      public List load(int ran) {
        List<chitietchuyenxe> listt = new ArrayList<>();
        listt = (List<chitietchuyenxe>) dao.select().get(ran);
        return listt;
    }

     
        public List searche(String uu,String ccb){
     List e=new ArrayList();
     List f=new ArrayList();
     List g=new ArrayList();
       for(int i=0;i<dao.size();i++){
           if(load(i).get(10).toString().equals(uu)){
              e.add(load(i));
           }else{
               g.add(load(i));
           }
           f.add(load(i));
       }
       
        if(ccb.equals("all")){
            return f;
        }else if(ccb.equals("a")){
            return e;
        }else{
            return g;
        }
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ccb = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        money = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã chuyến xe", "Mã người đặt", "Trạng thái", "Số tiền vé xe", "Số tiền thực thu"
            }
        ));
        jScrollPane1.setViewportView(table);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 51, 255));
        lblTitle.setText("THỐNG KÊ");

        jLabel1.setText("Loại Thống kê");

        ccb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "đặt thành công", "hủy" }));
        ccb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ccbItemStateChanged(evt);
            }
        });

        jLabel2.setText("Tổng số tiền thực thu");

        money.setText("jLabel3");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Conference.png"))); // NOI18N
        jButton1.setText("Người dùng");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Bar chart.png"))); // NOI18N
        jButton4.setText("Thống kê");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Peace.png"))); // NOI18N
        jButton2.setText("Xe");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Free.png"))); // NOI18N
        jButton3.setText("Khuyến mãi");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(0, 12, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(ccb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(money, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)
                        .addComponent(jButton3)
                        .addComponent(jButton4))
                    .addComponent(lblTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ccb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(money))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ccbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ccbItemStateChanged
//
    switch (ccb.getSelectedIndex()) {
        case 0:
            loadtable();
            break;
        case 1:
            {
                DefaultTableModel df = (DefaultTableModel) table.getModel();
                df.setRowCount(0);
                for (int i = 0; i < searche("0", "a").size(); i++) {
                    List a=(List) searche("0", "a").get(i);
                    String trangthai="";
                    int tien=0;
                    if(a.get(10).toString().equals("0")){
                        trangthai="đã đặt";
                        tien= (int)a.get(9);
                    }else{
                        trangthai="đã hủy";
                        tien= (int)a.get(9)-((int)a.get(9)*(int)a.get(10))/10;
                        
                    }
                    int moneyy=0;
                    Object[] row = {
                        a.get(0), a.get(7), trangthai, a.get(9),tien
                            
                    };
                    
                    df.addRow(row);
                    for(int x=0;x<df.getRowCount();x++){
                        moneyy=moneyy+Integer.parseInt(df.getValueAt(x, 4).toString());
                    }
                    money.setText(String.valueOf(moneyy));
                }               break;
            }
        default:
            {
                    DefaultTableModel df = (DefaultTableModel) table.getModel();
                    df.setRowCount(0);
                    for (int i = 0; i < searche("0", "b").size(); i++) {
                            List a=(List) searche("0", "b").get(i);
                            String trangthai="";
                            int tien=0;
                            if(a.get(10).toString().equals("0")){
                                    trangthai="đã đặt";
                                    tien= (int)a.get(9);
                                    }else{
                                            trangthai="đã hủy";
                                            tien= (int)a.get(9)-((int)a.get(9)*(int)a.get(10))/10;
                                            
                                            }
                            int moneyy=0;
                            Object[] row = {
                                    a.get(0), a.get(7), trangthai, a.get(9),tien
                                    
                                    };
                            
                            df.addRow(row);
                            for(int x=0;x<df.getRowCount();x++){
                                    moneyy=moneyy+Integer.parseInt(df.getValueAt(x, 4).toString());
                                    }
                            money.setText(String.valueOf(moneyy));
                            }               break;
            }
    }
        
    }//GEN-LAST:event_ccbItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new QuanLyNhanVien().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new Thongke().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new QuanLyXe().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new QuanLyKhuyenMai().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Thongke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Thongke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Thongke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Thongke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Thongke().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ccb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel money;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
