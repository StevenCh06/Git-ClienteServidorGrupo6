/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectofinal;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RegistrarEstudiante extends javax.swing.JFrame {

    ManejoDatos arrayEstudiantes;
    
    
    public RegistrarEstudiante() {
                  
    } 
    
    public RegistrarEstudiante(ManejoDatos arrayEstudiantes) {
        initComponents();
        setLocationRelativeTo(null); //Establecemos como posicion el centro de la pantalla 
        BloquearCampos();
        this.arrayEstudiantes = arrayEstudiantes;
    }
    
    public void LimpiarCampos(){        
        txtNombre.setText("");
        txtApellido1.setText("");
        txtApellido2.setText("");
        txtEdad.setText("");
        txtGrupo.setText("");
        
    }
    
    public void BloquearCampos(){        
        txtNombre.setEnabled(false);
        txtApellido1.setEnabled(false);
        txtApellido2.setEnabled(false);
        txtEdad.setEnabled(false);
        txtGrupo.setEnabled(false);
        comboBeca.setEnabled(false);
        comboEstado.setEnabled(false);
        agregar.setEnabled(false);
        buscar.setEnabled(true);
    }
    
    public void DESBloquearCampos(){      
        txtNombre.setEnabled(true);
        txtApellido1.setEnabled(true);
        txtApellido2.setEnabled(true);
        txtEdad.setEnabled(true);
        txtGrupo.setEnabled(true);
        comboBeca.setEnabled(true);
        comboEstado.setEnabled(true);
        agregar.setEnabled(true);
        buscar.setEnabled(false);
        txtNombre.requestFocus();
    }
    
    public void mostrarDatos(int cedula){
        
        for (int i=0;i<arrayEstudiantes.getEstudiante().size();i++)
        {
            Estudiante estudiante = arrayEstudiantes.getEstudiante().get(i);
            if (estudiante.getCedula() == cedula) {
                txtNombre.setText(estudiante.getNombre());
                txtApellido1.setText(estudiante.getApellido1());
                txtApellido2.setText(estudiante.getApellido2());
                txtEdad.setText(Integer.toString(estudiante.getEdad()));
                txtGrupo.setText(Integer.toString(estudiante.getGrupo()));
                if (estudiante.isBeca().equals("Sí")) {
                    comboBeca.setSelectedItem("Sí");
                }
                if (estudiante.isBeca().equals("No")) {
                    comboBeca.setSelectedItem("No");
                }
                if (estudiante.isEstado()==true) {
                    comboEstado.setSelectedItem("Activo");
                }
                if (estudiante.isEstado()==false) {
                    comboEstado.setSelectedItem("Inactivo");
                }
            }
            else{
            JOptionPane.showMessageDialog(null, "NO existe", "ERROR DE BUSQUEDA",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public void editar(){
        comboBeca.setEnabled(true);
        comboEstado.setEnabled(true);
        String nuevNombre = JOptionPane.showInputDialog(null,"Ingrese el Nuevo Nombre");
        String nuevApe1 = JOptionPane.showInputDialog(null,"Ingrese el Nuevo Primer Apellido");
        String nuevApe2 = JOptionPane.showInputDialog(null,"Ingrese el Nuevo Segundo Apellido");
        int nuevEdad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la Nueva Edad"));
        int nuevGrupo = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el Nuevo Grupo"));
        int input = JOptionPane.showConfirmDialog(null, comboBeca,"¿Posee Beca?",JOptionPane.DEFAULT_OPTION);
        String nuevbeca = comboBeca.getSelectedItem().toString();
        int input2 = JOptionPane.showConfirmDialog(null, comboEstado,"'¿Cual es el estado del estudiante?",JOptionPane.DEFAULT_OPTION);
        String nuevestado = comboEstado.getSelectedItem().toString();
        
        boolean estado = true;
        
        if(nuevestado.equals("Activo")){
            estado = true;
        }
        if(nuevestado.equals("Inactivo")){
            estado = false;
        }
        
        for (int i=0;i<arrayEstudiantes.getEstudiante().size();i++)
        {
            Estudiante estudiante = arrayEstudiantes.getEstudiante().get(i);
            arrayEstudiantes.getEstudiante().get(i).setNombre(nuevNombre);
            arrayEstudiantes.getEstudiante().get(i).setApellido1(nuevApe1);
            arrayEstudiantes.getEstudiante().get(i).setApellido2(nuevApe2);
            arrayEstudiantes.getEstudiante().get(i).setEdad(nuevEdad);
            arrayEstudiantes.getEstudiante().get(i).setGrupo(nuevGrupo);
            arrayEstudiantes.getEstudiante().get(i).setBeca(nuevbeca);
            arrayEstudiantes.getEstudiante().get(i).setEstado(estado);
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

        Beca = new javax.swing.ButtonGroup();
        estado = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido1 = new javax.swing.JTextField();
        txtApellido2 = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtGrupo = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        comboBeca = new javax.swing.JComboBox<>();
        comboEstado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(488, 383));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Registro de Estudiantes");

        jLabel2.setText("Numero de cedula:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellidos:");

        jLabel5.setText("Edad:");

        jLabel6.setText("Grupo:");

        jLabel7.setText("Posee beca:");

        jLabel8.setText("Estado:");

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

        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        comboBeca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sí", "No" }));

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCedula)
                            .addComponent(txtNombre)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtApellido1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEdad)
                            .addComponent(txtGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(comboBeca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(50, 50, 50))
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
                    .addComponent(jLabel5)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboBeca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        
        int cedula=Integer.parseInt(txtCedula.getText());
        
        for (int i=0;i<arrayEstudiantes.getEstudiante().size();i++)
        {
            Estudiante xEstudiante = arrayEstudiantes.getEstudiante().get(i);
            if (xEstudiante.getCedula() == cedula) {
                JOptionPane.showMessageDialog(null, "El estudiante ya existe","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
                mostrarDatos(cedula);
                BloquearCampos();
                int resp = JOptionPane.showConfirmDialog(null, "¿Desea Editar Datos de Este Estudiante?", "EDITAR", JOptionPane.YES_NO_OPTION);
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
                JOptionPane.showMessageDialog(null, "El estudiante NO existe puede agregarlo","VALIDANDO DATOS",JOptionPane.INFORMATION_MESSAGE);
                LimpiarCampos();
            }
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        // Registrar
        int cedula=Integer.parseInt(txtCedula.getText());
        String nombre=txtNombre.getText();
        String apellido1=txtApellido1.getText();
        String apellido2=txtApellido2.getText();
        int edad=Integer.parseInt(txtEdad.getText());
        int grupo=Integer.parseInt(txtGrupo.getText());
        String beca = comboBeca.getSelectedItem().toString();
        boolean estado = true;        
        String tipo = comboEstado.getSelectedItem().toString();
        
        if(tipo.equals("Activo")){
            estado = true;
        }
        if(tipo.equals("Inactivo")){
            estado = false;
        }
        
        Estudiante estudiante = new Estudiante(cedula, nombre, apellido1, apellido2, edad, grupo, beca, estado);
        arrayEstudiantes.getEstudiante().add(estudiante);
        
        JOptionPane.showMessageDialog(null, "Estudiante agregado con exito");
        txtCedula.setText("");
        LimpiarCampos();
        BloquearCampos();
        
        
        
    }//GEN-LAST:event_agregarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Beca;
    private javax.swing.JButton agregar;
    private javax.swing.JButton buscar;
    private javax.swing.JComboBox<String> comboBeca;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.ButtonGroup estado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtGrupo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
