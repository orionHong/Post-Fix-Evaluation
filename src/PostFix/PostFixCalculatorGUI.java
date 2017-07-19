/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PostFix;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author Hongru Xiang
 */
public class PostFixCalculatorGUI extends javax.swing.JFrame {
    private PostFixController c;
    private final AbstractDocument doc;
    private DefaultListModel equationList = new DefaultListModel();
    private ArrayList<Equation> equations = new ArrayList();
    private boolean isChar = false;
    private boolean isLoaded = false;
          
    /**
     * Creates new form PostFixCalculatorGUI
     */
    public PostFixCalculatorGUI() {
        initComponents();
        doc = (AbstractDocument)showCase.getDocument();
        doc.setDocumentFilter(new CalculatorFilterForInt());
        
        showCase.setEditable(false);
        btEnable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        fiveBt = new javax.swing.JButton();
        sevenBt = new javax.swing.JButton();
        eightBt = new javax.swing.JButton();
        sixBt = new javax.swing.JButton();
        nineBt = new javax.swing.JButton();
        twoBt = new javax.swing.JButton();
        oneBt = new javax.swing.JButton();
        fourBt = new javax.swing.JButton();
        threeBt = new javax.swing.JButton();
        multiplyBt = new javax.swing.JButton();
        divideBt = new javax.swing.JButton();
        subtractBt = new javax.swing.JButton();
        addBt = new javax.swing.JButton();
        zeroBt = new javax.swing.JButton();
        spaceBt = new javax.swing.JButton();
        equalBt = new javax.swing.JButton();
        deleteBt = new javax.swing.JButton();
        clearAllBt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        equationListPnl = new javax.swing.JList();
        loadBt = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        showCase = new javax.swing.JTextField();
        deleteListBt = new javax.swing.JButton();
        saveBt = new javax.swing.JButton();
        charMode = new javax.swing.JRadioButton();
        newListBt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fiveBt.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        fiveBt.setText("5");
        fiveBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveBtActionPerformed(evt);
            }
        });

        sevenBt.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        sevenBt.setText("7");
        sevenBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenBtActionPerformed(evt);
            }
        });

        eightBt.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        eightBt.setText("8");
        eightBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightBtActionPerformed(evt);
            }
        });

        sixBt.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        sixBt.setText("6");
        sixBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixBtActionPerformed(evt);
            }
        });

        nineBt.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        nineBt.setText("9");
        nineBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineBtActionPerformed(evt);
            }
        });

        twoBt.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        twoBt.setText("2");
        twoBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoBtActionPerformed(evt);
            }
        });

        oneBt.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        oneBt.setText("1");
        oneBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneBtActionPerformed(evt);
            }
        });

        fourBt.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        fourBt.setText("4");
        fourBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourBtActionPerformed(evt);
            }
        });

        threeBt.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        threeBt.setText("3");
        threeBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeBtActionPerformed(evt);
            }
        });

        multiplyBt.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        multiplyBt.setText("×");
        multiplyBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyBtActionPerformed(evt);
            }
        });

        divideBt.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        divideBt.setText("÷");
        divideBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideBtActionPerformed(evt);
            }
        });

        subtractBt.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        subtractBt.setText("-");
        subtractBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractBtActionPerformed(evt);
            }
        });

        addBt.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        addBt.setText("+");
        addBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtActionPerformed(evt);
            }
        });

        zeroBt.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        zeroBt.setText("0");
        zeroBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroBtActionPerformed(evt);
            }
        });

        spaceBt.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spaceBt.setText("Space");
        spaceBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spaceBtActionPerformed(evt);
            }
        });

        equalBt.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        equalBt.setText("=");
        equalBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalBtActionPerformed(evt);
            }
        });

        deleteBt.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        deleteBt.setText("DEL");
        deleteBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtActionPerformed(evt);
            }
        });

        clearAllBt.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        clearAllBt.setText("AC");
        clearAllBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAllBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(clearAllBt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oneBt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fourBt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sevenBt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zeroBt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(deleteBt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(addBt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(twoBt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(threeBt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(fiveBt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(sixBt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(eightBt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(nineBt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(spaceBt, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(divideBt, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(equalBt, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(multiplyBt, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(subtractBt, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addGap(128, 128, 128))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subtractBt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addBt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteBt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(clearAllBt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(multiplyBt, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(divideBt, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(oneBt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(twoBt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(threeBt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fourBt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fiveBt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sixBt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sevenBt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eightBt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nineBt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(equalBt, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spaceBt, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zeroBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37))
        );

        equationListPnl.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        equationListPnl.setModel(equationList);
        equationListPnl.setToolTipText("");
        equationListPnl.setDragEnabled(true);
        equationListPnl.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                equationListPnlValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(equationListPnl);

        loadBt.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        loadBt.setText("L O A D");
        loadBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadBtActionPerformed(evt);
            }
        });

        showCase.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        showCase.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        showCase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                showCaseKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(showCase);

        deleteListBt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        deleteListBt.setText("Delete List");
        deleteListBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteListBtActionPerformed(evt);
            }
        });

        saveBt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        saveBt.setText("Save List");
        saveBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtActionPerformed(evt);
            }
        });

        charMode.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        charMode.setText("Char");
        charMode.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                charModeStateChanged(evt);
            }
        });

        newListBt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        newListBt.setText("+");
        newListBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newListBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(saveBt, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(newListBt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteListBt, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addComponent(loadBt, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(charMode)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(charMode)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(loadBt, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(newListBt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saveBt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteListBt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void twoBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoBtActionPerformed
        showCase.setText(showCase.getText() + '2');
        showCase.requestFocusInWindow();
    }//GEN-LAST:event_twoBtActionPerformed

    private void multiplyBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyBtActionPerformed
        showCase.setText(showCase.getText() + '*');
        showCase.requestFocusInWindow();
    }//GEN-LAST:event_multiplyBtActionPerformed

    private void threeBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeBtActionPerformed
        showCase.setText(showCase.getText() + '3');
        showCase.requestFocusInWindow();
    }//GEN-LAST:event_threeBtActionPerformed

    private void divideBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideBtActionPerformed
        showCase.setText(showCase.getText() + '/');
        showCase.requestFocusInWindow();
    }//GEN-LAST:event_divideBtActionPerformed

    private void subtractBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractBtActionPerformed
        showCase.setText(showCase.getText() + '-');
        showCase.requestFocusInWindow();
    }//GEN-LAST:event_subtractBtActionPerformed

    private void addBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtActionPerformed
        showCase.setText(showCase.getText() + '+');
        showCase.requestFocusInWindow();
    }//GEN-LAST:event_addBtActionPerformed

    private void equalBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalBtActionPerformed
        saveEquation();

        c.doCalculation();

        doc.setDocumentFilter(new DocumentFilter());
        showCase.setText(showCase.getText() + " == "
            + getSelectedEquation().getResult());

        resetMode(isChar);

        equalBt.setEnabled(false);

    }//GEN-LAST:event_equalBtActionPerformed

    private void oneBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneBtActionPerformed
        showCase.setText(showCase.getText() + '1');
        showCase.requestFocusInWindow();
    }//GEN-LAST:event_oneBtActionPerformed

    private void fourBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourBtActionPerformed
        showCase.setText(showCase.getText() + '4');
        showCase.requestFocusInWindow();
    }//GEN-LAST:event_fourBtActionPerformed

    private void fiveBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveBtActionPerformed
        showCase.setText(showCase.getText() + '5');
        showCase.requestFocusInWindow();
    }//GEN-LAST:event_fiveBtActionPerformed

    private void sixBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixBtActionPerformed
        showCase.setText(showCase.getText() + '6');
        showCase.requestFocusInWindow();
    }//GEN-LAST:event_sixBtActionPerformed

    private void sevenBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenBtActionPerformed
        showCase.setText(showCase.getText() + '7');
        showCase.requestFocusInWindow();
    }//GEN-LAST:event_sevenBtActionPerformed

    private void eightBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightBtActionPerformed
        showCase.setText(showCase.getText() + '8');
        showCase.requestFocusInWindow();
    }//GEN-LAST:event_eightBtActionPerformed

    private void nineBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineBtActionPerformed
        showCase.setText(showCase.getText() + '9');
        showCase.requestFocusInWindow();
    }//GEN-LAST:event_nineBtActionPerformed

    private void zeroBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroBtActionPerformed
        showCase.setText(showCase.getText() + '0');
        showCase.requestFocusInWindow();
    }//GEN-LAST:event_zeroBtActionPerformed

    private void spaceBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spaceBtActionPerformed
        showCase.setText(showCase.getText() + " ");
        showCase.requestFocusInWindow();
    }//GEN-LAST:event_spaceBtActionPerformed

    private void deleteBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtActionPerformed
        try{
            StringBuffer newS = new StringBuffer(showCase.getText());
            showCase.setText(newS.deleteCharAt(newS.length() - 1).toString());
        }
        catch(StringIndexOutOfBoundsException ex){
        }
        showCase.requestFocusInWindow();
    }//GEN-LAST:event_deleteBtActionPerformed

    private void clearAllBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearAllBtActionPerformed
        showCase.setText(null);
        showCase.requestFocusInWindow();
    }//GEN-LAST:event_clearAllBtActionPerformed

    private void deleteListBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteListBtActionPerformed
        int idx = equationListPnl.getSelectedIndex();
        try{
            equationListPnl.setSelectedIndex(idx - 1);

            equations.remove(idx);
            equationList.removeElementAt(idx);
        } catch(IndexOutOfBoundsException ex) {
            // Do nothing
        }
        
    }//GEN-LAST:event_deleteListBtActionPerformed

    private void saveBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtActionPerformed
        saveEquation();
        
        try{   
            FileOutputStream fos = new FileOutputStream("equationArr.tmp");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(equations);
            oos.close();
        } catch(IOException | NoSuchElementException ex){
             Logger.getLogger
        (PostFixCalculatorGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveBtActionPerformed

    private void charModeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_charModeStateChanged
        isChar = !isChar;
        
        resetMode(isChar);
        
        showCase.requestFocusInWindow();
        
        equalBt.setEnabled(true);
    }//GEN-LAST:event_charModeStateChanged

    private void loadBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadBtActionPerformed
        if(isLoaded)
            return;
        
        ArrayList<Equation> equation2 = new ArrayList();
        
        try{
            FileInputStream fis = new FileInputStream("equationArr.tmp");
            ObjectInputStream ois = new ObjectInputStream(fis);
            try{
                equation2 = (ArrayList<Equation>)ois.readObject();
                equations.addAll(equation2);
            } catch(ClassNotFoundException ex){
                System.out.println("class not found");
            }
        } catch(IOException ex){
            Logger.getLogger
        (PostFixCalculatorGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(Equation e: equation2){
            equationList.addElement(e);
        }
        
        try{
            try{
                c.resetId(equations.get(equations.size() - 1));
                isLoaded = true;
            } catch (NullPointerException ex){
                // Do nothing
            }
        } catch(ArrayIndexOutOfBoundsException ex){
            // Do nothing
        }
    }//GEN-LAST:event_loadBtActionPerformed

    private void newListBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newListBtActionPerformed
        equations.add(new Equation());
        equationList.addElement(equations.get(equations.size() - 1));
    }//GEN-LAST:event_newListBtActionPerformed

    private void equationListPnlValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_equationListPnlValueChanged
        showCase.setEditable(true);
        btEnable(true);
        
        
        int idx = equationListPnl.getSelectedIndex();
        try{
            Equation e = equations.get(idx);

            resetMode(e);

            showCase.setText(e.getEquation());

            showCase.requestFocus();
        } catch (IndexOutOfBoundsException ex){
            // Do nothing
        }
    }//GEN-LAST:event_equationListPnlValueChanged

    private void showCaseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_showCaseKeyPressed
        equalBt.setEnabled(true);
    }//GEN-LAST:event_showCaseKeyPressed
    
    /*** Add a Controller to GUI ***/
    public void addController(PostFixController c){
        this.c = c;
    }
    
    public void saveEquation() throws ArrayIndexOutOfBoundsException{
        try{
            int index = equationListPnl.getSelectedIndex();

            Equation e = equations.get(index);
            e.setEquation(showCase.getText(), isChar);
        } catch (NoSuchElementException ex){
            // Do nothing
        }
    }
    
    /*** Get selected Equation ***/
    public Equation getSelectedEquation(){
        return equations.get(equationListPnl.getSelectedIndex());
    }
    
    /*** Display Error Message Window ***/
    void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
    
    public void resetMode(Equation e){
        if(e.getIsChar()){
            charMode.setSelected(true);
        }
        else
            charMode.setSelected(false);
    }
    
    public void resetMode(boolean isChar2){
        if(isChar2)
            doc.setDocumentFilter(new CalculatorFilterForChar());
        else
            doc.setDocumentFilter(new CalculatorFilterForInt());
    }
    
    public boolean getIsChar(){
        return isChar;
    }
    
    public void btEnable(boolean state){
        oneBt.setEnabled(state);
        twoBt.setEnabled(state);
        threeBt.setEnabled(state);
        fourBt.setEnabled(state);
        fiveBt.setEnabled(state);
        sixBt.setEnabled(state);
        sevenBt.setEnabled(state);
        eightBt.setEnabled(state);
        nineBt.setEnabled(state);
        zeroBt.setEnabled(state);
        deleteBt.setEnabled(state);
        clearAllBt.setEnabled(state);
        addBt.setEnabled(state);
        subtractBt.setEnabled(state);
        multiplyBt.setEnabled(state);
        divideBt.setEnabled(state);
        spaceBt.setEnabled(state);
        equalBt.setEnabled(state);
    }
    
    /**
     * @param args the command line arguments
     */
    
/*    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    /*
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PostFixCalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PostFixCalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PostFixCalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PostFixCalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PostFixCalculatorGUI().setVisible(true);
            }
        });

    }
*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBt;
    private javax.swing.JRadioButton charMode;
    private javax.swing.JButton clearAllBt;
    private javax.swing.JButton deleteBt;
    private javax.swing.JButton deleteListBt;
    private javax.swing.JButton divideBt;
    private javax.swing.JButton eightBt;
    private javax.swing.JButton equalBt;
    private javax.swing.JList equationListPnl;
    private javax.swing.JButton fiveBt;
    private javax.swing.JButton fourBt;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton loadBt;
    private javax.swing.JButton multiplyBt;
    private javax.swing.JButton newListBt;
    private javax.swing.JButton nineBt;
    private javax.swing.JButton oneBt;
    private javax.swing.JButton saveBt;
    private javax.swing.JButton sevenBt;
    private javax.swing.JTextField showCase;
    private javax.swing.JButton sixBt;
    private javax.swing.JButton spaceBt;
    private javax.swing.JButton subtractBt;
    private javax.swing.JButton threeBt;
    private javax.swing.JButton twoBt;
    private javax.swing.JButton zeroBt;
    // End of variables declaration//GEN-END:variables
}
