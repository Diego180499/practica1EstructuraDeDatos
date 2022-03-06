/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Clases.Apuesta;
import Clases.Carrera;
import Utils.ManejoArchivos;
import Utils.Utils;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class ApuestasFrame extends javax.swing.JFrame {

    Carrera carrera;

    public ApuestasFrame() {
        initComponents();
        this.setResizable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        rutaArchivo = new javax.swing.JTextField();
        botonCargar = new javax.swing.JButton();
        botonIngresar = new javax.swing.JButton();
        botonVerificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textoResultado = new javax.swing.JTextField();
        botonCalcularResultados = new javax.swing.JButton();
        botonOrdenar = new javax.swing.JButton();
        botonIngresarResultado = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        menuReportesCriticos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        texto.setBackground(new java.awt.Color(0, 51, 102));
        texto.setColumns(20);
        texto.setForeground(new java.awt.Color(255, 255, 255));
        texto.setRows(5);
        texto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(texto);

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        rutaArchivo.setBackground(new java.awt.Color(0, 102, 153));
        rutaArchivo.setForeground(new java.awt.Color(255, 255, 255));

        botonCargar.setBackground(new java.awt.Color(0, 102, 153));
        botonCargar.setForeground(new java.awt.Color(255, 255, 255));
        botonCargar.setText("Cargar Archivo");
        botonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarActionPerformed(evt);
            }
        });

        botonIngresar.setBackground(new java.awt.Color(0, 102, 153));
        botonIngresar.setForeground(new java.awt.Color(255, 255, 255));
        botonIngresar.setText("Ingresar Apuesta");
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });

        botonVerificar.setBackground(new java.awt.Color(0, 102, 153));
        botonVerificar.setForeground(new java.awt.Color(255, 255, 255));
        botonVerificar.setText("Verificar Apuestas");
        botonVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerificarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("I N G R E S O     D E      A P U E S T A S");

        jLabel3.setBackground(new java.awt.Color(0, 51, 51));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("I N G R E SO      D E       R E S U L T A D O S");

        textoResultado.setBackground(new java.awt.Color(0, 102, 153));
        textoResultado.setForeground(new java.awt.Color(255, 255, 255));

        botonCalcularResultados.setBackground(new java.awt.Color(0, 102, 153));
        botonCalcularResultados.setForeground(new java.awt.Color(255, 255, 255));
        botonCalcularResultados.setText("CALCULAR RESULTADOS");
        botonCalcularResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularResultadosActionPerformed(evt);
            }
        });

        botonOrdenar.setBackground(new java.awt.Color(0, 102, 153));
        botonOrdenar.setForeground(new java.awt.Color(255, 255, 255));
        botonOrdenar.setText("ORDENAR RESULTADOS");
        botonOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOrdenarActionPerformed(evt);
            }
        });

        botonIngresarResultado.setBackground(new java.awt.Color(0, 102, 153));
        botonIngresarResultado.setForeground(new java.awt.Color(255, 255, 255));
        botonIngresarResultado.setText("INGRESAR RESULTADOS");
        botonIngresarResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarResultadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rutaArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonCargar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(botonIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botonVerificar, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE))
                            .addComponent(textoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonCalcularResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(botonOrdenar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonIngresarResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rutaArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCargar))
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonIngresar)
                .addGap(18, 18, 18)
                .addComponent(botonVerificar)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonIngresarResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonCalcularResultados)
                .addGap(37, 37, 37)
                .addComponent(botonOrdenar)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(335, 335, 335)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addGap(16, 16, 16))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 102, 153));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        jMenu1.setBackground(new java.awt.Color(0, 102, 153));
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Archivo");

        jMenuItem1.setBackground(new java.awt.Color(0, 102, 153));
        jMenuItem1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setText("Examinar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setBackground(new java.awt.Color(0, 102, 153));
        jMenuItem2.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem2.setText("Guardar Resultados");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setBackground(new java.awt.Color(0, 102, 153));
        jMenuItem3.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem3.setText("Guardar Reportes");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        menuReportesCriticos.setBackground(new java.awt.Color(0, 102, 153));
        menuReportesCriticos.setForeground(new java.awt.Color(255, 255, 255));
        menuReportesCriticos.setText("Guardar Reportes Críticos");
        menuReportesCriticos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReportesCriticosActionPerformed(evt);
            }
        });
        jMenu1.add(menuReportesCriticos);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 971, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarActionPerformed
        String contenido = ManejoArchivos.leerArchivo(rutaArchivo.getText());
        texto.setText(contenido);
    }//GEN-LAST:event_botonCargarActionPerformed

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed

        int cantidadApuestas = texto.getLineCount();
        carrera = new Carrera(cantidadApuestas);

        for (int i = 0; i < cantidadApuestas; i++) {
            String[] lineas = Utils.split(texto.getText(), '\n', cantidadApuestas);
            String[] datos = Utils.miSplit(lineas[i]);
            Apuesta apuesta = new Apuesta(datos[0], datos[1], datos[2], datos[3], datos[4],
                    datos[5], datos[6], datos[7], datos[8], datos[9], datos[10], datos[11]);
            carrera.insertarApuestas(apuesta);
        }

        JOptionPane.showMessageDialog(null, "Se han ingresado los resultados");
    }//GEN-LAST:event_botonIngresarActionPerformed

    private void botonVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerificarActionPerformed
        Apuesta[] apuestas = carrera.getApuestas();

        for (int i = 0; i < apuestas.length; i++) {
            carrera.verificarApuesta(apuestas[i]);
        }
        JOptionPane.showMessageDialog(null, "Se han verificado las apuestas");
    }//GEN-LAST:event_botonVerificarActionPerformed

    private void botonIngresarResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarResultadoActionPerformed
        String resultado = textoResultado.getText();
        carrera.ingresarResultados(resultado);
        JOptionPane.showMessageDialog(null, "Se han ingresado los resultados");
    }//GEN-LAST:event_botonIngresarResultadoActionPerformed

    private void botonOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOrdenarActionPerformed
        Apuesta[] apuestas = carrera.ordenarResultados();
        JOptionPane.showMessageDialog(null, "Se han ordenado los resultados");
    }//GEN-LAST:event_botonOrdenarActionPerformed

    private void botonCalcularResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularResultadosActionPerformed
        carrera.calcularResultado();
        JOptionPane.showMessageDialog(null, "Se han calculado los Resultados");
    }//GEN-LAST:event_botonCalcularResultadosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(this);

        if (jf.getSelectedFile() != null) {
            rutaArchivo.setText(jf.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        String nombre = JOptionPane.showInputDialog(null, "Guardar Resultados Como: ");
        String contenido = carrera.verApuestas();
        ManejoArchivos.anexarArchivo(nombre + ".txt", contenido);
        JOptionPane.showMessageDialog(null, "Se ha guardado el archivo como " + nombre + ".txt");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void menuReportesCriticosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReportesCriticosActionPerformed
        String nombre = JOptionPane.showInputDialog(null,"Guardar Reportes Críticos como: ");
        String contenido = carrera.verPromedioPasos()+"\n"+carrera.verTiempos()+"\n"+carrera.calcularMayorPasos()+"\n"+carrera.calcularMenorPasos();
         ManejoArchivos.anexarArchivo(nombre + ".txt", contenido);
         JOptionPane.showMessageDialog(null,"Se han guardado los reportes críticos como: "+nombre+".txt");

    }//GEN-LAST:event_menuReportesCriticosActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        String nombre = JOptionPane.showInputDialog(null, "Guardar Reporte de Apuestas Rechazadas:");
        String contenido = carrera.verApuestasRechazadas();
        ManejoArchivos.anexarArchivo(nombre, contenido);
        JOptionPane.showMessageDialog(null, "Se han guardado los reportes de apuestas rechazadas en " + nombre + ".txt");

    }//GEN-LAST:event_jMenuItem3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCalcularResultados;
    private javax.swing.JButton botonCargar;
    private javax.swing.JButton botonIngresar;
    private javax.swing.JButton botonIngresarResultado;
    private javax.swing.JButton botonOrdenar;
    private javax.swing.JButton botonVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuReportesCriticos;
    private javax.swing.JTextField rutaArchivo;
    private javax.swing.JTextArea texto;
    private javax.swing.JTextField textoResultado;
    // End of variables declaration//GEN-END:variables
}
