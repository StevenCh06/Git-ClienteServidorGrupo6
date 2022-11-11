/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectofinal;

import javax.swing.JOptionPane;


public class RegistrarCocinero extends javax.swing.JFrame {

    ManejoDatos arrayCocineros;

    public RegistrarCocinero() {
    }
    
    
    public RegistrarCocinero(ManejoDatos arrayCocineros) {
        initComponents();
        setLocationRelativeTo(null); //Establecemos como posicion el centro de la pantalla 
        BloquearCampos();
        this.arrayCocineros = arrayCocineros;
    }
    
    public void LimpiarCampos(){        
        txtNombre.setText("");
        txtApellido1.setText("");
        txtApellido2.setText("");
        txtSalario.setText("");
        
    }
    
    public void BloquearCampos(){        
        txtNombre.setEnabled(false);
        txtApellido1.setEnabled(false);
        txtApellido2.setEnabled(false);
        txtSalario.setEnabled(false);
        comboEstado.setEnabled(false);
        agregar.setEnabled(false);
        buscar.setEnabled(true);
    }
    
    public void DESBloquearCampos(){      
        txtNombre.setEnabled(true);
        txtApellido1.setEnabled(true);
        txtApellido2.setEnabled(true);        
        txtSalario.setEnabled(true);
        comboEstado.setEnabled(true);
        agregar.setEnabled(true);
        buscar.setEnabled(false);
        txtNombre.requestFocus();
    }
    
     public void mostrarDatos(int cedula){
        
        for (int i=0;i<arrayCocineros.getCocinero().size();i++)
        {
            Cocinero cocinero = arrayCocineros.getCocinero().get(i);
            if (cocinero.getCedula() == cedula) {
                txtNombre.setText(cocinero.getNombre());
                txtApellido1.setText(cocinero.getApellido1());
                txtApellido2.setText(cocinero.getApellido2());
                txtSalario.setText(String.valueOf(cocinero.getSalario()));
                
                if (cocinero.isEstado()==true) {
                    comboEstado.setSelectedItem("Activo");
                }
                if (cocinero.isEstado()==false) {
                    comboEstado.setSelectedItem("Inactivo");
                }
            }
            else{
            JOptionPane.showMessageDialog(null, "NO existe", "ERROR DE BUSQUEDA",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
     public void editar(){
        
        comboEstado.setEnabled(true);
        String nuevNombre = JOptionPane.showInputDialog(null,"Ingrese el Nuevo Nombre");
        String nuevApe1 = JOptionPane.showInputDialog(null,"Ingrese el Nuevo Primer Apellido");
        String nuevApe2 = JOptionPane.showInputDialog(null,"Ingrese el Nuevo Segundo Apellido");
        double nuevSalario = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el Nuevo Salario"));

        int input = JOptionPane.showConfirmDialog(null, comboEstado,"'¿Cual es el estado del cocinero?",JOptionPane.DEFAULT_OPTION);
        String nuevestado = comboEstado.getSelectedItem().toString();
        
        boolean estado = true;
        
        if(nuevestado.equals("Activo")){
            estado = true;
        }
        if(nuevestado.equals("Inactivo")){
            estado = false;
        }
        
        for (int i=0;i<arrayCocineros.getCocinero().size();i++)
        {
            Cocinero cocinero = arrayCocineros.getCocinero().get(i);
            arrayCocineros.getProfesor().get(i).setNombre(nuevNombre);
            arrayCocineros.getProfesor().get(i).setApellido1(nuevApe1);
            arrayCocineros.getProfesor().get(i).setApellido2(nuevApe2);
            arrayCocineros.getProfesor().get(i).setSalario(nuevSalario);
            arrayCocineros.getProfesor().get(i).setEstado(estado);
        }
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtApellido1 = new javax.swing.JTextField();
        txtApellido2 = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        comboEstado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Registro de Cocineros");

        jLabel2.setText("Numero de cedula:");

        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellidos:");

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        agregar.setText("Registrar");
        agregar.setToolTipText("Llene todos los espacios para agregar el nuevo estudiante");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        buscar.setText("Buscar");
        buscar.setToolTipText("Debe ingresar un numero de cedula a buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jLabel6.setText("Salario x Hora:");

        jLabel8.setText("Estado:");

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(76, 76, 76)
                .addComponent(jLabel1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSalario)
                            .addComponent(comboEstado, 0, 158, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCedula)
                            .addComponent(txtNombre)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(agregar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1))
                    .addComponent(jButton1))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 128, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        // Registrar
        int cedula=Integer.parseInt(txtCedula.getText());
        String nombre=txtNombre.getText();
        String apellido1=txtApellido1.getText();
        String apellido2=txtApellido2.getText();
        double salario=Double.parseDouble(txtSalario.getText());
        
        boolean estado = true;
        String tipo = comboEstado.getSelectedItem().toString();

        if(tipo.equals("Activo")){
            estado = true;
        }
        if(tipo.equals("Inactivo")){
            estado = false;
        }

        Cocinero cocinero = new Cocinero(cedula, nombre, apellido1, apellido2, salario, estado);
        arrayCocineros.getCocinero().add(cocinero);

        JOptionPane.showMessageDialog(null, "Estudiante agregado con exito");
        txtCedula.setText("");
        LimpiarCampos();
        BloquearCampos();

    }//GEN-LAST:event_agregarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed

        int cedula=Integer.parseInt(txtCedula.getText());

        for (int i=0;i<arrayCocineros.getCocinero().size();i++)
        {
            Cocinero xcocinero = arrayCocineros.getCocinero().get(i);
            if (xcocinero.getCedula() == cedula) {
                JOptionPane.showMessageDialog(null, "El cocinero ya existe","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
                mostrarDatos(cedula);
                BloquearCampos();
                int resp = JOptionPane.showConfirmDialog(null, "¿Desea Editar Datos de Este Cocinero?", "EDITAR", JOptionPane.YES_NO_OPTION);
                if(resp==JOptionPane.YES_OPTION){
                    editar();
                    mostrarDatos(cedula);
                    JOptionPane.showMessageDialog(null, "Datos Editados con Exito");
                }
                if(resp==JOptionPane.NO_OPTION){
                    txtCedula.setText("");
                    LimpiarCampos();
                }
            }
            else{
                DESBloquearCampos();
                JOptionPane.showMessageDialog(null, "El Cocinero NO existe puede agregarlo","VALIDANDO DATOS",JOptionPane.INFORMATION_MESSAGE);
                LimpiarCampos();
            }
        }
    }//GEN-LAST:event_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton buscar;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
