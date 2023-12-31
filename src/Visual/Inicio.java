

package Visual;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author Sebastian
 */
public class Inicio extends javax.swing.JFrame {
    
    private static final int PRECIO_SERVICIO_ADICIONAL = 50000;
    private static final int PRECIO_SALA_ESTANDAR = 100000;
    private static final int PRECIO_SALA_VIP = 200000;
    private static final int PRECIO_SALA_PLATINUM = 300000;

    /**
     * Creates new form Inicio
     */
        public Inicio() {
        initComponents();
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generarReservaActionPerformed(e);
            }
        });
    }
 // Métodos públicos para obtener componentes
    public com.toedter.calendar.JDateChooser getCalendar() {
        return Calendar;
    }

    public javax.swing.JComboBox<String> getjComboBox1() {
        return jComboBox1;
    }

    public javax.swing.JComboBox<String> getjComboBox2() {
        return jComboBox2;
    }

    public javax.swing.JCheckBox getjCheckBox1() {
        return jCheckBox1;
    }

    public javax.swing.JCheckBox getjCheckBox2() {
        return jCheckBox2;
    }

    public javax.swing.JCheckBox getjCheckBox3() {
        return jCheckBox3;
    }

    public javax.swing.JCheckBox getjCheckBox4() {
        return jCheckBox4;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Calendar = new com.toedter.calendar.JDateChooser();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CREAR RESERVA");

        jLabel2.setText("SALAS");

        jLabel3.setText("CALENDARIO");

        jLabel4.setText("HORAS");

        jLabel5.setText("SERVICIOS ADICIONALES");

        jButton1.setText("GENERAR RESERVA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Servico de streaming");

        jCheckBox2.setText("Servicio de dormitorios");

        jCheckBox3.setText(" Comida y Bebidas Ilimitadas");

        jCheckBox4.setText(" Servicio de duchas ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sala Estandar", "Sala Vip", "Sala Platinuom", " " }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 HORA", "2 HORAS", "3 HORAS", "4 HORAS" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox1)
                    .addComponent(jButton1)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Calendar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel4)))
                .addContainerGap(259, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(340, 340, 340))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Calendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox4)
                .addGap(47, 47, 47)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
        );

        setSize(new java.awt.Dimension(779, 557));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.GENERARRESERVA();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void generarReservaActionPerformed(ActionEvent evt) {
        String salaSeleccionada = jComboBox1.getSelectedItem().toString();
        String fechaSeleccionada = Calendar.getDate().toString();
        String horasSeleccionadas = jComboBox2.getSelectedItem().toString();
        boolean streamingSeleccionado = jCheckBox1.isSelected();
        boolean dormitoriosSeleccionado = jCheckBox2.isSelected();
        boolean comidaBebidasSeleccionado = jCheckBox3.isSelected();
        boolean duchasSeleccionado = jCheckBox4.isSelected();

     // Calcula el total
    int total = calcularTotal(salaSeleccionada, streamingSeleccionado, dormitoriosSeleccionado,
            comidaBebidasSeleccionado, duchasSeleccionado);

    // Muestra el recibo solo si se ha generado correctamente
    if (mostrarRecibo(salaSeleccionada, fechaSeleccionada, horasSeleccionadas, streamingSeleccionado,
            dormitoriosSeleccionado, comidaBebidasSeleccionado, duchasSeleccionado,
            total)) {
        // Aquí puedes añadir lógica adicional si es necesario
    }
}
    
    // Método para calcular el total
private int calcularTotal(String salaSeleccionada, boolean streaming, boolean dormitorios,
        boolean comidaBebidas, boolean duchas) {
    int total = 0;

    if (salaSeleccionada.equals("Sala Estandar")) {
        total += PRECIO_SALA_ESTANDAR;
    } else if (salaSeleccionada.equals("Sala Vip")) {
        total += PRECIO_SALA_VIP;
    } else if (salaSeleccionada.equals("Sala Platinuom")) {
        total += PRECIO_SALA_PLATINUM;
    }

    if (streaming) {
        total += PRECIO_SERVICIO_ADICIONAL;
    }
    if (dormitorios) {
        total += PRECIO_SERVICIO_ADICIONAL;
    }
    if (comidaBebidas) {
        total += PRECIO_SERVICIO_ADICIONAL;
    }
    if (duchas) {
        total += PRECIO_SERVICIO_ADICIONAL;
    }

    return total;
}
private boolean mostrarRecibo(String salaSeleccionada, String fechaSeleccionada, String horasSeleccionadas,
            boolean streaming, boolean dormitorios, boolean comidaBebidas, boolean duchas,
            int total) {
        // Construye el mensaje del recibo
        StringBuilder mensajeRecibo = new StringBuilder();
        mensajeRecibo.append("RECIBO DE RESERVA\n\n");
        mensajeRecibo.append("Sala: ").append(salaSeleccionada).append("\n");
        mensajeRecibo.append("Fecha: ").append(fechaSeleccionada).append("\n");
        mensajeRecibo.append("Horas: ").append(horasSeleccionadas).append("\n");
        mensajeRecibo.append("Servicios Adicionales:\n");
        if (streaming) {
            mensajeRecibo.append("- Servicio de streaming\n");
        }
        if (dormitorios) {
            mensajeRecibo.append("- Servicio de dormitorios\n");
        }
        if (comidaBebidas) {
            mensajeRecibo.append("- Comida y Bebidas Ilimitadas\n");
        }
        if (duchas) {
            mensajeRecibo.append("- Servicio de duchas\n");
        }
        mensajeRecibo.append("\nTotal a pagar: $").append(total);

        // Muestra el recibo en un cuadro de diálogo
        int option = JOptionPane.showConfirmDialog(this, mensajeRecibo.toString(),
                "Recibo de Reserva", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

        // Retorna true si el usuario presiona OK, de lo contrario false
        return option == JOptionPane.OK_OPTION;
        
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Calendar;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables


    private void GENERARRESERVA() {
        DatosUsuario DatosUsuario = new DatosUsuario();
        DatosUsuario.setVisible(true);
        
        this.setVisible(false);
    }
}

