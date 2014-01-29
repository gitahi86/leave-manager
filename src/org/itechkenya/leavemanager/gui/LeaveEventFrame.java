/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itechkenya.leavemanager.gui;

import java.awt.event.ItemEvent;
import java.math.BigDecimal;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JTable;
import org.itechkenya.leavemanager.api.JpaManager;
import org.itechkenya.leavemanager.api.UiManager;
import org.itechkenya.leavemanager.domain.Contract;
import org.itechkenya.leavemanager.domain.Employee;
import org.itechkenya.leavemanager.domain.LeaveEvent;
import org.itechkenya.leavemanager.domain.LeaveType;
import org.itechkenya.leavemanager.jpa.exceptions.NonexistentEntityException;

/**
 *
 * @author gitahi
 */
public class LeaveEventFrame extends LeaveManagerFrame {

    /**
     * Creates new form EarnLeaveFrame
     */
    public LeaveEventFrame() {
        initComponents();
        configureComponents();
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        eventButtonGroup = new javax.swing.ButtonGroup();
        outerPanel = new javax.swing.JPanel();
        employeeLabel = new javax.swing.JLabel();
        employeeComboBox = new javax.swing.JComboBox();
        contractLabel = new javax.swing.JLabel();
        contractComboBox = new javax.swing.JComboBox();
        innerPanel = new javax.swing.JPanel();
        contractYearLabel = new javax.swing.JLabel();
        contractYearTextField = new javax.swing.JTextField();
        daysEarnedLabel = new javax.swing.JLabel();
        daysEarnedTextField = new javax.swing.JTextField();
        daysSpentLabel = new javax.swing.JLabel();
        daysSpentTextField = new javax.swing.JTextField();
        balanceLabel = new javax.swing.JLabel();
        balanceTextField = new javax.swing.JTextField();
        startDateLabel = new javax.swing.JLabel();
        startDateChooser = new com.toedter.calendar.JDateChooser();
        leaveTypeLabel = new javax.swing.JLabel();
        leaveTypeComboBox = new javax.swing.JComboBox();
        daysLabel = new javax.swing.JLabel();
        daysTextField = new javax.swing.JTextField();
        commentsLabel = new javax.swing.JLabel();
        commentsTextField = new javax.swing.JTextField();
        eventTypePanel = new javax.swing.JPanel();
        earnRadioButton = new javax.swing.JRadioButton();
        spendRadioButton = new javax.swing.JRadioButton();
        endDateLabel = new javax.swing.JLabel();
        endDateChooser = new com.toedter.calendar.JDateChooser();
        newButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Earn Leave");

        outerPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        employeeLabel.setText("Employee");

        employeeComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                employeeComboBoxItemStateChanged(evt);
            }
        });

        contractLabel.setText("Contract");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, employeeComboBox, org.jdesktop.beansbinding.ELProperty.create("${selectedItem != null}"), contractComboBox, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        contractComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                contractComboBoxItemStateChanged(evt);
            }
        });

        innerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Summary"));

        contractYearLabel.setText("Contract Year");

        daysEarnedLabel.setText("Days Earned");

        daysEarnedTextField.setEditable(false);

        daysSpentLabel.setText("Days Spent");

        daysSpentTextField.setEditable(false);

        balanceLabel.setText("Balance");

        balanceTextField.setEditable(false);

        javax.swing.GroupLayout innerPanelLayout = new javax.swing.GroupLayout(innerPanel);
        innerPanel.setLayout(innerPanelLayout);
        innerPanelLayout.setHorizontalGroup(
            innerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(innerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contractYearLabel)
                    .addComponent(daysEarnedLabel)
                    .addComponent(daysSpentLabel)
                    .addComponent(balanceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(innerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(balanceTextField)
                    .addComponent(daysSpentTextField)
                    .addComponent(daysEarnedTextField)
                    .addComponent(contractYearTextField))
                .addContainerGap())
        );
        innerPanelLayout.setVerticalGroup(
            innerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerPanelLayout.createSequentialGroup()
                .addGroup(innerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contractYearLabel)
                    .addComponent(contractYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(innerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(daysEarnedLabel)
                    .addComponent(daysEarnedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(innerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(daysSpentLabel)
                    .addComponent(daysSpentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(innerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(balanceLabel)
                    .addComponent(balanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        startDateLabel.setText("Start Date");

        leaveTypeLabel.setText("Leave Type");

        daysLabel.setText("Days");

        commentsLabel.setText("Comments");

        eventTypePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Event Type"));

        eventButtonGroup.add(earnRadioButton);
        earnRadioButton.setText("Earn");

        eventButtonGroup.add(spendRadioButton);
        spendRadioButton.setSelected(true);
        spendRadioButton.setText("Spend");

        javax.swing.GroupLayout eventTypePanelLayout = new javax.swing.GroupLayout(eventTypePanel);
        eventTypePanel.setLayout(eventTypePanelLayout);
        eventTypePanelLayout.setHorizontalGroup(
            eventTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eventTypePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(earnRadioButton)
                .addGap(18, 18, 18)
                .addComponent(spendRadioButton)
                .addContainerGap(732, Short.MAX_VALUE))
        );
        eventTypePanelLayout.setVerticalGroup(
            eventTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eventTypePanelLayout.createSequentialGroup()
                .addGroup(eventTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(earnRadioButton)
                    .addComponent(spendRadioButton))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        endDateLabel.setText("End Date");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, spendRadioButton, org.jdesktop.beansbinding.ELProperty.create("${selected}"), endDateLabel, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, spendRadioButton, org.jdesktop.beansbinding.ELProperty.create("${selected}"), endDateChooser, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout outerPanelLayout = new javax.swing.GroupLayout(outerPanel);
        outerPanel.setLayout(outerPanelLayout);
        outerPanelLayout.setHorizontalGroup(
            outerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(outerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eventTypePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(innerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(outerPanelLayout.createSequentialGroup()
                        .addGroup(outerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(employeeLabel)
                            .addComponent(contractLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(outerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contractComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(employeeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(outerPanelLayout.createSequentialGroup()
                        .addGroup(outerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(daysLabel)
                            .addComponent(commentsLabel)
                            .addComponent(leaveTypeLabel)
                            .addComponent(startDateLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(outerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(leaveTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(commentsTextField)
                            .addComponent(daysTextField)))
                    .addGroup(outerPanelLayout.createSequentialGroup()
                        .addComponent(endDateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(endDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 819, Short.MAX_VALUE)))
                .addContainerGap())
        );
        outerPanelLayout.setVerticalGroup(
            outerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(outerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeLabel)
                    .addComponent(employeeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(outerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contractLabel)
                    .addComponent(contractComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(innerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(outerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(startDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startDateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(outerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(leaveTypeLabel)
                    .addComponent(leaveTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(outerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(daysLabel)
                    .addComponent(daysTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(outerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(commentsLabel)
                    .addComponent(commentsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eventTypePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(outerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(endDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endDateLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        newButton.setText("New");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scrollPane.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(closeButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(outerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newButton)
                    .addComponent(saveButton)
                    .addComponent(closeButton)
                    .addComponent(deleteButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        clear();
    }//GEN-LAST:event_newButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        LeaveEvent leaveEvent = (LeaveEvent) getSelectedItem();
        try {
            if (leaveEvent == null) {
                leaveEvent = new LeaveEvent();
                flesh(leaveEvent);
                JpaManager.getLejc().create(leaveEvent);
                updateTable(leaveEvent, UpdateType.CREATE);
            } else {
                flesh(leaveEvent);
                JpaManager.getLejc().edit(leaveEvent);
                updateTable(leaveEvent, UpdateType.EDIT);
            }
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(LeaveEventFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(LeaveEventFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        for (Object item : getSelectedItems()) {
            LeaveEvent leaveEvent = (LeaveEvent) item;
            try {
                JpaManager.getLejc().destroy(leaveEvent.getId());
                updateTable(leaveEvent, UpdateType.DESTROY);
            } catch (NonexistentEntityException ex) {
                UiManager.showErrorMessage(this, ex.getMessage());
                Logger.getLogger(LeaveEventFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void employeeComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_employeeComboBoxItemStateChanged
        Employee employee = (Employee) employeeComboBox.getSelectedItem();
        if (employee != null) {
            List<Contract> contractList = JpaManager.getCjc().findContractEntities();
            contractComboBox.removeAllItems();
            for (Contract contract : contractList) {
                if (employee.equals(contract.getEmployee())) {
                    contractComboBox.addItem(contract);
                    if (contract.getActive()) {
                        contractComboBox.setSelectedItem(contract);
                    } else {
                        contractComboBox.setSelectedItem(null);
                    }
                }
            }
        }
    }//GEN-LAST:event_employeeComboBoxItemStateChanged

    private void contractComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_contractComboBoxItemStateChanged
        Contract contract = (Contract) contractComboBox.getSelectedItem();
        LeaveEventTableModel model = new LeaveEventTableModel();
        if (contract != null) {
            List<LeaveEvent> leaveEventList = JpaManager.getLejc().findLeaveEventEntities();
            BigDecimal daysEarned = BigDecimal.ZERO;
            BigDecimal daysSpent = BigDecimal.ZERO;
            BigDecimal balance = BigDecimal.ZERO;
            for (LeaveEvent leaveEvent : leaveEventList) {
                if (contract.equals(leaveEvent.getContract())) {
                    model.createRow(leaveEvent);
                    if (leaveEvent.getDaysEarned() != null) {
                        daysEarned = daysEarned.add(leaveEvent.getDaysEarned());
                    }
                    if (leaveEvent.getDaysSpent()!= null) {
                        daysSpent = daysSpent.add(leaveEvent.getDaysSpent());
                    }
                }
            }
            balance = daysEarned.add(daysSpent.negate());
            daysEarnedTextField.setText(daysEarned.toString());
            daysSpentTextField.setText(daysSpent.toString());
            balanceTextField.setText(balance.toString());
        }
        table.setModel(model);
    }//GEN-LAST:event_contractComboBoxItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JTextField balanceTextField;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel commentsLabel;
    private javax.swing.JTextField commentsTextField;
    private javax.swing.JComboBox contractComboBox;
    private javax.swing.JLabel contractLabel;
    private javax.swing.JLabel contractYearLabel;
    private javax.swing.JTextField contractYearTextField;
    private javax.swing.JLabel daysEarnedLabel;
    private javax.swing.JTextField daysEarnedTextField;
    private javax.swing.JLabel daysLabel;
    private javax.swing.JLabel daysSpentLabel;
    private javax.swing.JTextField daysSpentTextField;
    private javax.swing.JTextField daysTextField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JRadioButton earnRadioButton;
    private javax.swing.JComboBox employeeComboBox;
    private javax.swing.JLabel employeeLabel;
    private com.toedter.calendar.JDateChooser endDateChooser;
    private javax.swing.JLabel endDateLabel;
    private javax.swing.ButtonGroup eventButtonGroup;
    private javax.swing.JPanel eventTypePanel;
    private javax.swing.JPanel innerPanel;
    private javax.swing.JComboBox leaveTypeComboBox;
    private javax.swing.JLabel leaveTypeLabel;
    private javax.swing.JButton newButton;
    private javax.swing.JPanel outerPanel;
    private javax.swing.JButton saveButton;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JRadioButton spendRadioButton;
    private com.toedter.calendar.JDateChooser startDateChooser;
    private javax.swing.JLabel startDateLabel;
    private javax.swing.JTable table;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    @Override
    public final void loadData() {
        List<Employee> employeeList = JpaManager.getEjc().findEmployeeEntities();
        for (Employee employee : employeeList) {
            employeeComboBox.addItem(employee);
        }
        employeeComboBox.setSelectedItem(null);

        List<LeaveType> leaveTypeList = JpaManager.getLtjc().findLeaveTypeEntities();
        for (LeaveType leaveType : leaveTypeList) {
            leaveTypeComboBox.addItem(leaveType);
        }
        leaveTypeComboBox.setSelectedItem(null);

        LeaveEventTableModel model = new LeaveEventTableModel();
        table.setModel(model);
    }

    @Override
    public void flesh(Object item) {
        LeaveEvent leaveEvent = (LeaveEvent) item;
        if (leaveEvent != null) {
            leaveEvent.setContract((Contract) contractComboBox.getSelectedItem());
            leaveEvent.setContractYear(new Integer(contractYearTextField.getText()));
            leaveEvent.setLeaveType((LeaveType) leaveTypeComboBox.getSelectedItem());
            leaveEvent.setStartDate(startDateChooser.getDate());
            if (earnRadioButton.isSelected()) {
                leaveEvent.setDaysEarned(new BigDecimal(daysTextField.getText()));
                leaveEvent.setDaysSpent(null);
                leaveEvent.setEndDate(null);
            } else if (spendRadioButton.isSelected()) {
                leaveEvent.setDaysSpent(new BigDecimal(daysTextField.getText()));
                leaveEvent.setDaysEarned(null);
                leaveEvent.setEndDate(endDateChooser.getDate());
            }
            if (!commentsTextField.getText().equals("")) {
                leaveEvent.setComment(commentsTextField.getText());
            }
        }
    }

    @Override
    public JButton getOkButton() {
        return saveButton;
    }

    @Override
    public JButton getDeleteButton() {
        return deleteButton;
    }

    @Override
    public JTable getTable() {
        return table;
    }

    @Override
    public void clearFields() {

    }

    @Override
    public void showSelectedItem(Object item) {
        LeaveEvent leaveEvent = (LeaveEvent) item;
        if (leaveEvent != null) {
            employeeComboBox.setSelectedItem(leaveEvent.getContract().getEmployee());
            contractComboBox.setSelectedItem(leaveEvent.getContract());
            startDateChooser.setDate(leaveEvent.getStartDate());
            leaveTypeComboBox.setSelectedItem(leaveEvent.getLeaveType());
            daysTextField.setText(leaveEvent.getDaysEarned() != null
                    ? leaveEvent.getDaysEarned().toString() : leaveEvent.getDaysSpent().toString());
            earnRadioButton.setSelected(leaveEvent.getDaysEarned() != null);
            spendRadioButton.setSelected(leaveEvent.getDaysSpent() != null);
            endDateChooser.setDate(leaveEvent.getEndDate());
            commentsTextField.setText(leaveEvent.getComment());
        }
    }

    private class LeaveEventTableModel extends LeaveManagerTableModel {

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            if (rowIndex >= getRows().size()) {
                return null;
            }
            LeaveEvent leaveEvent = (LeaveEvent) getRow(rowIndex);
            switch (columnIndex) {
                case 0:
                    return leaveEvent.getContract().getEmployee();
                case 1:
                    return leaveEvent.getContract();
                case 2:
                    return leaveEvent.getContractYear();
                case 3:
                    return leaveEvent.getLeaveType();
                case 4:
                    return leaveEvent.getStartDate();
                case 5:
                    return leaveEvent.getDaysEarned();
                case 6:
                    return leaveEvent.getDaysSpent();
                case 7:
                    return leaveEvent.getEndDate();
                case 8:
                    return leaveEvent.getComment();
                default:
                    return null;
            }
        }

        @Override
        public Class getColumnClass(int column) {
            for (int i = 0; i < getRows().size(); i++) {
                Object value = getValueAt(i, column);
                if (value != null) {
                    return value.getClass();
                }
            }
            return Object.class;
        }

        @Override
        public String[] getColumns() {
            String[] columns = {"Employee", "Contract", "Contract Year", "Leave Type", "Start Date", "Days Earned", "Days Spent", "End Date", "Comment"};
            return columns;
        }
    }
}
