/**
 * @author Carlos Acuña
 * No. control: 18290849
 * Fecha de entrega: 18/octubre/2020
 */

package parte2.punto.seis;

import javax.swing.*;

public class App extends JFrame {
    private Transformacion t;

    public App() {
        initComponents();
    }

    /**
     * Método encargado de inicializar los atributos del frame
     */
    private void initComponents() {
        setTitle("Transformaciones en una figura");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        t = new Transformacion();
        add(t);

        setVisible(true);
    }

    public static void main(String args[]) {
        new App();
    }
}