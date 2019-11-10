package daily.dose;

import daily.dose.DbConnect;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import javax.swing.undo.UndoManager;


/* @author alaa*/
public class Orders extends javax.swing.JFrame {

    private JFrame jframe;
    PreparedStatement ps;
    ResultSet rs;
    Connection conn = null;

    public static String DateFormat = "dd/MM/yyyy";

    public Orders() {
        initComponents();
        showTableData();
        showdate();
        showTableDataI();
        showTableDataII();
        showTableDataIII();
        showTableDataIIII();
        getsum();
        billno();
//        selectCombo();

        textRecipt.append("****************************************"
                + "" + "\n  DailyDose coffe" + "\n  Date:" + date.getText() + "\n  BillNo:" + billNum.getText()
                + "\n****************************************"
        );
    }

    /**
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        drinksTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textRecipt = new javax.swing.JTextArea();
        jPanel11 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel12 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        print = new javax.swing.JButton();
        orderText = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        qnt = new javax.swing.JTextField();
        tableNum = new javax.swing.JComboBox<>();
        billNum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        addRecordTakeAway = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        date = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        total = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        jPanel7.setBackground(new java.awt.Color(17, 63, 103));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("X");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("-");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Daily Dose Coffe  -  Orders");

        jPanel1.setBackground(new java.awt.Color(52, 105, 154));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(52, 105, 154));

        jTabbedPane1.setBackground(new java.awt.Color(17, 63, 103));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));

        jTable4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable4);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Koktail", jPanel6);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTable5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable5);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Hot Drinks", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setForeground(new java.awt.Color(0, 0, 0));

        drinksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        drinksTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                drinksTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(drinksTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cold Drinks", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Milk shake", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Deserts", jPanel5);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(52, 105, 154));
        jPanel9.setEnabled(false);

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        textRecipt.setColumns(20);
        textRecipt.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        textRecipt.setRows(5);
        textRecipt.setBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane1.setViewportView(textRecipt);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(52, 105, 154));
        jPanel11.setToolTipText("");

        jTabbedPane2.setBackground(new java.awt.Color(17, 63, 103));
        jTabbedPane2.setForeground(new java.awt.Color(255, 255, 255));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(17, 63, 103));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add Record");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        print.setBackground(new java.awt.Color(17, 63, 103));
        print.setForeground(new java.awt.Color(255, 255, 255));
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });

        tableNum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2","3","4","5","6","7","8","9","10", }));
        tableNum.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                tableNumPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Bill No :");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Table No :");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Order : ");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Price : ");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("qnt :");

        jButton7.setText("Show bill");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10))
                .addGap(23, 23, 23)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tableNum, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(billNum, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(orderText)
                            .addComponent(price)
                            .addComponent(qnt))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(94, 94, 94))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(billNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tableNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(qnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(print)
                    .addComponent(jButton7))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Orders", jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel11.setText("Bill no :");

        jLabel12.setText("Order :");

        jLabel13.setText("Price :");

        jLabel14.setText("qnt :");

        addRecordTakeAway.setBackground(new java.awt.Color(17, 63, 103));
        addRecordTakeAway.setForeground(new java.awt.Color(255, 255, 255));
        addRecordTakeAway.setText("Add record");
        addRecordTakeAway.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRecordTakeAwayActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(17, 63, 103));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Print");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton8.setText("Show Bill");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4)
                    .addComponent(jTextField3)
                    .addComponent(jTextField2)
                    .addComponent(jTextField1))
                .addGap(75, 75, 75))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addRecordTakeAway)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(29, 29, 29)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addRecordTakeAway)
                    .addComponent(jButton5)
                    .addComponent(jButton8))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Take Away", jPanel13);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jLabel15.setText("Bill no:");

        jLabel16.setText("order :");

        jLabel17.setText("price : ");

        jLabel18.setText("qnt :");

        jButton4.setBackground(new java.awt.Color(17, 63, 103));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText(" Add record");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(17, 63, 103));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Print");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton9.setText("Show bill");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel15)
                                .addComponent(jLabel16))
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField8)
                            .addComponent(jTextField6)
                            .addComponent(jTextField7)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton6)
                    .addComponent(jButton9))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Delivery", jPanel15);

        jPanel10.setBackground(new java.awt.Color(52, 105, 154));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date");

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill no", "Order", "table no", "Price", "qnt", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        orderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderTableMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(orderTable);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(total)
                                .addGap(6, 6, 6))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(101, 101, 101))
        );

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setForeground(new java.awt.Color(17, 63, 103));
        jButton3.setText("Delete row");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(255, 255, 255));
        clear.setForeground(new java.awt.Color(17, 63, 103));
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(17, 63, 103));
        jButton2.setText("Login as Admin");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(clear)
                    .addComponent(jButton2))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1011, 725));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        orderText.setText("");
        price.setText("");
        qnt.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");

        textRecipt.append("");
        DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
        model.setRowCount(0);
        refresh();
//        selectCombo();

    }//GEN-LAST:event_clearActionPerformed
    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        tableInsert();
        try {
            // TODO add your handling code here:
            textRecipt.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
        }
        billupdate();
        addMoringOrder();
        morningSale();
        billno();
    }//GEN-LAST:event_printActionPerformed


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

//        salesReview();
       try {
            DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
            //get order Price
            float orderPrice = Float.parseFloat(price.getText());
            //get number of cups 
            float amount = Float.parseFloat(qnt.getText());
            //Multibly Number * Price
            if (amount < 1) {
                JOptionPane.showMessageDialog(null, "pleas enter Valid quantaty !");
                return;
            }

            float lastPrice = (orderPrice * amount);
            //Store Last Value
            // Save it in instance va
            textRecipt.append(
                    "\n"
                    + "  ORDER : " + orderText.getText() + "  PRICE : " + price.getText() + "  Qnt : " + qnt.getText() + ""
                    + "\n----------------------------------------------------"
            );

            String result = String.valueOf(lastPrice);
            model.addRow(new Object[]{billNum.getText(), orderText.getText(), tableNum.getSelectedItem(), price.getText(), qnt.getText(), result});
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, ex);
        }

        getsum();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void getsum() {
        float sum = 0;
        for (int i = 0; i < orderTable.getRowCount(); i++) {
            sum = sum + Float.parseFloat(orderTable.getValueAt(i, 5).toString());
        }
        total.setText(Float.toString(sum));
    }


    private void drinksTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drinksTableMouseClicked
        // TODO add your handling code here:
        int i = drinksTable.getSelectedRow();
        TableModel model = drinksTable.getModel();
        orderText.setText(model.getValueAt(i, 0).toString());
        price.setText(model.getValueAt(i, 1).toString());

        //Take away 
        int j = jTable4.getSelectedRow();
        TableModel modelj = jTable4.getModel();
        jTextField2.setText(model.getValueAt(i, 0).toString());
        jTextField3.setText(model.getValueAt(i, 1).toString());

        //Delivery
        int f = jTable4.getSelectedRow();
        TableModel modelf = jTable4.getModel();
        jTextField6.setText(model.getValueAt(i, 0).toString());
        jTextField7.setText(model.getValueAt(i, 1).toString());
    }//GEN-LAST:event_drinksTableMouseClicked

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        // TODO add your handling code here:
        int i = jTable4.getSelectedRow();
        TableModel model = jTable4.getModel();
        orderText.setText(model.getValueAt(i, 0).toString());
        price.setText(model.getValueAt(i, 1).toString());

        //Take away 
        int j = jTable4.getSelectedRow();
        TableModel modelj = jTable4.getModel();
        jTextField2.setText(model.getValueAt(i, 0).toString());
        jTextField3.setText(model.getValueAt(i, 1).toString());

        //Delivery
        int f = jTable4.getSelectedRow();
        TableModel modelf = jTable4.getModel();
        jTextField6.setText(model.getValueAt(i, 0).toString());
        jTextField7.setText(model.getValueAt(i, 1).toString());
    }//GEN-LAST:event_jTable4MouseClicked

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
        // TODO add your handling code here:
        int i = jTable5.getSelectedRow();
        TableModel model = jTable5.getModel();
        orderText.setText(model.getValueAt(i, 0).toString());
        price.setText(model.getValueAt(i, 1).toString());

        //Take away 
        int j = jTable4.getSelectedRow();
        TableModel modelj = jTable4.getModel();
        jTextField2.setText(model.getValueAt(i, 0).toString());
        jTextField3.setText(model.getValueAt(i, 1).toString());

        //Delivery
        int f = jTable4.getSelectedRow();
        TableModel modelf = jTable4.getModel();
        jTextField6.setText(model.getValueAt(i, 0).toString());
        jTextField7.setText(model.getValueAt(i, 1).toString());
    }//GEN-LAST:event_jTable5MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int i = jTable2.getSelectedRow();
        TableModel model = jTable2.getModel();
        orderText.setText(model.getValueAt(i, 0).toString());
        price.setText(model.getValueAt(i, 1).toString());

        //Take away 
        int j = jTable4.getSelectedRow();
        TableModel modelj = jTable4.getModel();
        jTextField2.setText(model.getValueAt(i, 0).toString());
        jTextField3.setText(model.getValueAt(i, 1).toString());

        //Delivery
        int f = jTable4.getSelectedRow();
        TableModel modelf = jTable4.getModel();
        jTextField6.setText(model.getValueAt(i, 0).toString());
        jTextField7.setText(model.getValueAt(i, 1).toString());
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
        int i = jTable3.getSelectedRow();
        TableModel model = jTable3.getModel();
        orderText.setText(model.getValueAt(i, 0).toString());
        price.setText(model.getValueAt(i, 1).toString());

        //Take away 
        int j = jTable4.getSelectedRow();
        TableModel modelj = jTable4.getModel();
        jTextField2.setText(model.getValueAt(i, 0).toString());
        jTextField3.setText(model.getValueAt(i, 1).toString());

        //Delivery
        int f = jTable4.getSelectedRow();
        TableModel modelf = jTable4.getModel();
        jTextField6.setText(model.getValueAt(i, 0).toString());
        jTextField7.setText(model.getValueAt(i, 1).toString());
    }//GEN-LAST:event_jTable3MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        System.exit(0);

    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);

    }//GEN-LAST:event_jLabel8MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        LogIn log = new LogIn();
        log.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
        int i = orderTable.getSelectedRow();
        if (i >=0) {
            model.removeRow(i);
        } else {
        }
        JOptionPane.showMessageDialog(null, "Done!");
//        deleteItem();
    }//GEN-LAST:event_jButton3ActionPerformed

//    public void deleteItem() {
//        String billno = billNum.getText();
//        String item = orderText.getText();
//
//        String query = "DELETE FROM `salesReview` WHERE `billno`=? AND `item`=?";
//        try {
//            ps = DbConnect.getconnection().prepareStatement(query);
//            ps.setString(1, billno);
//            ps.setString(2, item);
//
//            if (ps.executeUpdate() > 0) {
//                JOptionPane.showMessageDialog(null, "Done !");
//            }
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, ex);
//        }
//        showTableDataI();
//
//    }

    /////////////////ADD ORDER TO MORNING SHIFT //////////////////
    public void addMoringOrder() {

        String bill_number = billNum.getText();
        String the_date = date.getText();
        String the_total = total.getText();
        String query = "INSERT INTO `mrngShiftOrder`(`billNum`, `date`, `total`) VALUES (?,?,?)";
        try {
            ps = DbConnect.getconnection().prepareStatement(query);
            ps.setString(1, bill_number);
            ps.setString(2, the_date);
            ps.setString(3, the_total);
            ps.executeUpdate();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public void morningSale() {
        String bill_number = billNum.getText();
        String the_date = date.getText();
        String the_total = total.getText();
        String query = "INSERT INTO `morningBill`(`billNum`, `date`, `total`) VALUES (?,?,?)";
        try {
            ps = DbConnect.getconnection().prepareStatement(query);
            ps.setString(1, bill_number);
            ps.setString(2, the_date);
            ps.setString(3, the_total);
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Done !");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        showTableData();
    }

    public void addMoringOrderII() {

        String bill_number = jTextField5.getText();
        String the_date = date.getText();
        String the_total = total.getText();
        String query = "INSERT INTO `mrngShiftTakeaway`(`billNum`, `date`, `total`) VALUES (?,?,?)";
        try {
            ps = DbConnect.getconnection().prepareStatement(query);
            ps.setString(1, bill_number);
            ps.setString(2, the_date);
            ps.setString(3, the_total);
            ps.executeUpdate();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public void addMoringOrderIII() {

        String bill_number = jTextField5.getText();
        String the_date = date.getText();
        String the_total = total.getText();
        String query = "INSERT INTO `mrngShiftDelivery`(`billNum`, `date`, `total`) VALUES (?,?,?)";
        try {
            ps = DbConnect.getconnection().prepareStatement(query);
            ps.setString(1, bill_number);
            ps.setString(2, the_date);
            ps.setString(3, the_total);
            ps.executeUpdate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void tableNumPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_tableNumPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
//                try {
//            String tmp = (String) billNo.getSelectedItem();
//            String query = "SELECT COUNT(*) FROM `bill";
//            ps = DbConnect.getconnection().prepareStatement(query);
//            ps.setString(1, tmp);
//            rs = ps.executeQuery();
//            if (rs.next()) {
//                
//            } else {
//                
//            }
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, ex);
//        }
    }//GEN-LAST:event_tableNumPopupMenuWillBecomeInvisible

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    //////Order Table Mouse Clicked//////////////////////////////////////////////////
    private void orderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderTableMouseClicked
        // TODO add your handling code here:
        int i = orderTable.getSelectedRow();
        TableModel model = orderTable.getModel();
        billNum.setText(model.getValueAt(i, 0).toString());
        orderText.setText(model.getValueAt(i, 1).toString());
        price.setText(model.getValueAt(i, 3).toString());
        ///////////////////TakeAway///////////////////
        int j = orderTable.getSelectedRow();
        TableModel modelj = orderTable.getModel();
        jTextField1.setText(model.getValueAt(j, 0).toString());
        jTextField2.setText(model.getValueAt(j, 1).toString());
        jTextField3.setText(model.getValueAt(j, 3).toString());
        ////////////Delivry///////////////////////
        int f = orderTable.getSelectedRow();
        TableModel modelf = orderTable.getModel();
        jTextField5.setText(model.getValueAt(j, 0).toString());
        jTextField6.setText(model.getValueAt(j, 1).toString());
        jTextField7.setText(model.getValueAt(j, 3).toString());

    }//GEN-LAST:event_orderTableMouseClicked

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void addRecordTakeAwayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRecordTakeAwayActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
            //get order Price
            float order_Price = Float.parseFloat(jTextField3.getText());
            //get number of cups 
            float amount1 = Float.parseFloat(jTextField4.getText());
            //Multibly Number * Price
            if (amount1 < 1) {
                JOptionPane.showMessageDialog(null, "pleas enter Valid quantaty !");
                return;
            }

            float last_Price = (order_Price * amount1);
            //Store Last Value
            // Save it in instance va
            textRecipt.append(
                    "\n"
                    + "  ORDER : " + jTextField2.getText() + "  PRICE : " + jTextField3.getText() + "  Qnt : " + jTextField4.getText() + ""
                    + "\n----------------------------------------------------"
            );

            String result = String.valueOf(last_Price);
            String Null = "0";
            model.addRow(new Object[]{jTextField1.getText(), jTextField2.getText(), "0", jTextField3.getText(), jTextField4.getText(), result});
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, ex);
        }

        getsum();
    }//GEN-LAST:event_addRecordTakeAwayActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
                tableInsert();

        try {
            // TODO add your handling code here:
            textRecipt.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
        }
        billupdate();
        addMoringOrderII();
        billno();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
            //get order Price
            float order_Price = Float.parseFloat(jTextField7.getText());
            //get number of cups 
            float amount1 = Float.parseFloat(jTextField8.getText());
            //Multibly Number * Price
            if (amount1 < 1) {
                JOptionPane.showMessageDialog(null, "pleas enter Valid quantaty !");
                return;
            }

            float last_Price = (order_Price * amount1);
            //Store Last Value
            // Save it in instance va
            textRecipt.append(
                    "\n"
                    + "  ORDER : " + jTextField6.getText() + "  PRICE : " + jTextField7.getText() + "  Qnt : " + jTextField8.getText() + ""
                    + "\n----------------------------------------------------"
            );

            String result = String.valueOf(last_Price);
            String Null = "0";
            model.addRow(new Object[]{jTextField5.getText(), jTextField6.getText(), "0", jTextField7.getText(), jTextField8.getText(), result});
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, ex);
        }
        getsum();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
                tableInsert();


        try {
            // TODO add your handling code here:
            textRecipt.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
        }
        billupdate();
        addMoringOrderIII();
        billno();

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        textAppend();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
                textAppend();

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
                textAppend();

    }//GEN-LAST:event_jButton9ActionPerformed

    public void billno()
    {
        try {
            String query = "SELECT COUNT(*) FROM `bill`";
            ps = DbConnect.getconnection().prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                int g = Integer.parseInt(rs.getString(1));
                g = g + 1;
                billNum.setText(String.valueOf(g));
                jTextField1.setText(String.valueOf(g));
                jTextField5.setText(String.valueOf(g));
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

///////////////////////SHOW DATE IN TEXT BOX /////////////////////
    public void showdate() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat(DateFormat);
        date.setText(format.format(cal.getTime()));
    }
/////////////////////////////////////////////////////////////

    public void showTableData() {
        try {
            String query = "SELECT * FROM `drinks`";
            ps = DbConnect.getconnection().prepareStatement(query);
            rs = ps.executeQuery();
            drinksTable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void showTableDataI() {
        try {
            String query = "SELECT * FROM `milkShake`";
            ps = DbConnect.getconnection().prepareStatement(query);
            rs = ps.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

//        private void selectCombo() {
//                try {
//            String query = "SELECT COUNT(*) FROM `bill`";
//            ps = DbConnect.getconnection().prepareStatement(query);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                int g = Integer.parseInt(rs.getString(1));
//                g = g + 1;
//                tableNum.addItem(String.valueOf(g));
//                tableNum.addItem("Table No:1");
//                tableNum.addItem("Table No:2"); 
//                tableNum.addItem("Table No:3");
//                tableNum.addItem("Table No:4");
//                tableNum.addItem("Table No:5");
//                tableNum.addItem("Table No:6");
//                tableNum.addItem("Table No:7");
//                tableNum.addItem("Table No:8");
//                tableNum.addItem("Table No:9");
//                tableNum.addItem("Table No:10");
//            }
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, ex);
//        } 
//        }
//            String query = "SELECT COUNT(*) FROM `bill`";
//            ps = DbConnect.getconnection().prepareStatement(query);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                String name = rs.getString("INFORMATION_SCHEMA.COLUMNS");
//                billNo.addItem(name);
//                billNo.addItem("1");
//                billNo.addItem("2"); 
//                billNo.addItem("3");
//                billNo.addItem("4");
//                billNo.addItem("5");
//                billNo.addItem("6");
//                billNo.addItem("7");
//                billNo.addItem("8");
//                billNo.addItem("9");
//                billNo.addItem("10");
//            }
//
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, ex);
//
    public void showTableDataII() {
        try {
            String query = "SELECT * FROM `desert`";
            ps = DbConnect.getconnection().prepareStatement(query);
            rs = ps.executeQuery();
            jTable3.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void showTableDataIII() {
        try {
            String query = "SELECT * FROM `koktail`";
            ps = DbConnect.getconnection().prepareStatement(query);
            rs = ps.executeQuery();
            jTable4.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void showTableDataIIII() {
        try {
            String query = "SELECT * FROM `hotDrinks`";
            ps = DbConnect.getconnection().prepareStatement(query);
            rs = ps.executeQuery();
            jTable5.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    /////////////// Update Bill Info //////////////////////
    public void billupdate() {
        String bill_number = billNum.getText();
        String the_date = date.getText();
        String the_total = total.getText();
        String query = "INSERT INTO `bill`(`billNum`, `date`, `total`) VALUES (?,?,?)";
        try {
            ps = DbConnect.getconnection().prepareStatement(query);
            ps.setString(1, bill_number);
            ps.setString(2, the_date);
            ps.setString(3, the_total);
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Done !");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        showTableData();
    }

    public void morningBill() {
        String bill_number = billNum.getText();
        String the_date = date.getText();
        String the_total = total.getText();
        String query = "INSERT INTO `morningBill`(`billNum`, `date`, `total`) VALUES (?,?,?)";
        try {
            ps = DbConnect.getconnection().prepareStatement(query);
            ps.setString(1, bill_number);
            ps.setString(2, the_date);
            ps.setString(3, the_total);
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Done !");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        showTableData();
    } 
    
   public void textAppend(){
   
    int rows = orderTable.getRowCount();
            
            for (int row = 0; row < rows; row++) {
                String item = (String) orderTable.getValueAt(row, 1);
                String price = (String) orderTable.getValueAt(row, 3);
                String qnt = (String) orderTable.getValueAt(row, 4);
                
                   textRecipt.append(
                    "\n Order :"+item+
                    "\n Price :"+price+
                    "\n qnt   : "+qnt+
                    "\n -----------------------"
            );
                
            }
 textRecipt.append(
                "\n Total : " + total.getText() + ""
        );

   }
   
    
    //Table Insert 
    public void tableInsert() {
        try {

            int rows = orderTable.getRowCount();
            String query = "INSERT INTO `salesReview`(`billno`, `item`, `qnt`, `amount`, `date`) VALUES (?,?,?,?,?)";
            ps = DbConnect.getconnection().prepareStatement(query);
            for (int row = 0; row < rows; row++) {
                String billNo = (String) orderTable.getValueAt(row, 0);
                String item = (String) orderTable.getValueAt(row, 1);
                String qnt = (String) orderTable.getValueAt(row, 3);
                String amount = (String) orderTable.getValueAt(row, 4);
                String the_date = date.getText();
                ps.setString(1, billNo);
                ps.setString(2, item);
                ps.setString(3, amount);
                ps.setString(4, qnt);
                ps.setString(5, the_date);
                ps.executeUpdate();

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }
    
    
    
    
//     public void salesReview() {
//        String bill_number = billNum.getText();
//        String orderName = orderText.getText();
//        String qnt_ = qnt.getText();
//        float orderPrice = Float.parseFloat(price.getText());
//        //get number of cups 
//        float amount = Float.parseFloat(qnt.getText());
//        float lastPrice = (orderPrice * amount);
//        String the_date = date.getText();
//        String query = "INSERT INTO `salesReview`(`billno`, `item`, `qnt`, `amount`, `date`) VALUES (?,?,?,?,?)";
//        try {
//            ps = DbConnect.getconnection().prepareStatement(query);
//            ps.setString(1, bill_number);
//            ps.setString(2, orderName);
//            ps.setString(3, qnt_);
//            ps.setString(4, String.valueOf(lastPrice));
//            ps.setString(5, the_date);
//
//            if (ps.executeUpdate() > 0) {
//                JOptionPane.showMessageDialog(null, "Done !");
//            }
//
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, ex);
//        }
//        showTableData();
//    }

//    public void salesReviewI() {
//        String bill_number = jTextField1.getText();
//        String orderName = jTextField2.getText();
//        String qnt_ = jTextField4.getText();
//        float orderPrice = Float.parseFloat(jTextField3.getText());
//        //get number of cups 
//        float amount = Float.parseFloat(jTextField4.getText());
//        float lastPrice = (orderPrice * amount);
//
//        String the_date = date.getText();
//
//        String query = "INSERT INTO `salesReview`(`billno`, `item`, `qnt`, `amount`, `date`) VALUES (?,?,?,?,?)";
//        try {
//            ps = DbConnect.getconnection().prepareStatement(query);
//            ps.setString(1, bill_number);
//            ps.setString(2, orderName);
//            ps.setString(3, qnt_);
//            ps.setString(4, String.valueOf(lastPrice));
//            ps.setString(5, the_date);
//
//            if (ps.executeUpdate() > 0) {
//                JOptionPane.showMessageDialog(null, "Done !");
//            }
//
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, ex);
//        }
//        showTableData();
//    }
//
//    public void salesReviewII() {
//
//        String bill_number = jTextField5.getText();
//        String orderName = jTextField6.getText();
//        String qnt_ = jTextField8.getText();
//        float orderPrice = Float.parseFloat(jTextField7.getText());
//        //get number of cups 
//        float amount = Float.parseFloat(jTextField8.getText());
//        float lastPrice = (orderPrice * amount);
//
//        String the_date = date.getText();
//
//        String query = "INSERT INTO `salesReview`(`billno`, `item`, `qnt`, `amount`, `date`) VALUES (?,?,?,?,?)";
//        try {
//            ps = DbConnect.getconnection().prepareStatement(query);
//            ps.setString(1, bill_number);
//            ps.setString(2, orderName);
//            ps.setString(3, qnt_);
//            ps.setString(4, String.valueOf(lastPrice));
//            ps.setString(5, the_date);
//
//            if (ps.executeUpdate() > 0) {
//                JOptionPane.showMessageDialog(null, "Done !");
//            }
//
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, ex);
//        }
//        showTableData();
//
//    }

//    public void itemNumberI() {
//        String bill_number = orderText.getText();
//        String qnt_ = qnt.getText();
//      
//        String query = "INSERT INTO `itemNumer`(`item`, `qnt`) VALUES (?,?)";
//        try {
//            ps = DbConnect.getconnection().prepareStatement(query);
//            ps.setString(1, bill_number);
//            ps.setString(2, qnt_);
//            ps.executeUpdate() ;
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, ex);
//        }
//        showTableData();
//    }
//    
//     public void itemNumberII() {
//        String bill_number = jTextField2.getText();
//        String qnt_ = jTextField4.getText();
//      
//        String query = "INSERT INTO `itemNumer`(`item`, `qnt`) VALUES (?,?)";
//        try {
//            ps = DbConnect.getconnection().prepareStatement(query);
//            ps.setString(1, bill_number);
//            ps.setString(2, qnt_);
//            ps.executeUpdate() ;
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, ex);
//        }
//        showTableData();
//    }
//    
//        public void itemNumberIII() {
//        String bill_number = jTextField6.getText();
//        String qnt_ = jTextField4.getText();
//      
//        String query = "INSERT INTO `itemNumer`(`item`, `qnt`) VALUES (?,?)";
//        try {
//            ps = DbConnect.getconnection().prepareStatement(query);
//            ps.setString(1, bill_number);
//            ps.setString(2, qnt_);
//            ps.executeUpdate() ;
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, ex);
//        }
//        showTableData();
//    }
//    
    public void refresh() {
        textRecipt.setText("");
        textRecipt.append("******************************************************"
                + "" + "\n  DailyDose coffe" + "\n  Date:" + date.getText() + "\n  BillNo:" + billNum.getText()
                + "\n******************************************************"
        );

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Orders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRecordTakeAway;
    private javax.swing.JTextField billNum;
    private javax.swing.JButton clear;
    private javax.swing.JTextField date;
    private javax.swing.JTable drinksTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTable orderTable;
    private javax.swing.JTextField orderText;
    private javax.swing.JTextField price;
    private javax.swing.JButton print;
    private javax.swing.JTextField qnt;
    private javax.swing.JComboBox<String> tableNum;
    private javax.swing.JTextArea textRecipt;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
