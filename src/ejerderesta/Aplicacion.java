package ejerderesta;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aplicacion {
    private JPanel panBase;
    private JPanel panSuperior;
    private JPanel panMedio;
    private JPanel panInferior;
    private JPanel panSeparador;
    private JButton btnRestar;
    private JLabel txtTitulo;
    private JLabel titNum1;
    private JLabel titNum2;
    private JTextField datNum1;
    private JTextField datNum2;
    private JLabel txtResultado;


    public Aplicacion() {
        
        btnRestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

               haceerResta();
            }
        });
        datNum1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                haceerResta();
            }
        });
        datNum2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                haceerResta();
            }
        });
    }

    public void haceerResta(){

        String numStr1 = datNum1.getText();         // Lee el numStr1
        String numStr2 = datNum2.getText();         // Lee el numStr2
        int n1 = Integer.parseInt(numStr1);         // Convierte numStr1 en int
        int n2 = Integer.parseInt(numStr2);         // Convierte numStr2 en int
        Resta resta = new Resta();                  // Crea objeto resta
        int r = resta.calcularResta(n1,n2);         // Llama a clase Resta y retorna r
        // Comprueba el número mayor y escribe resultado
        if ( n1 > n2 ) {
            txtResultado.setText(" La resta de " + numStr1 + " menos " + numStr2 + " es " + r);
        }
        else {
            txtResultado.setText(" La resta de " + numStr2 + " menos " + numStr1 + " es " + r);
        }


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplicacion resta");
        frame.setContentPane(new Aplicacion().panBase);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
