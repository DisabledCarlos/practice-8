/**
 * @author Carlos Acuña
 * No. control: 18290849
 * Fecha de entrega: 18/octubre/2020
 */

package parte2.punto.tres;

import javax.swing.*;

public class App extends JFrame {
    private Escalacion e;

    public App() {
        initComponents();
    }

    /**
     * Método encargado de inicializar los atributos del frame
     */
    private void initComponents() {
        setTitle("Escalación de una estrella");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        e = new Escalacion();
        add(e);

        setVisible(true);
    }

    public static void main(String args[]) {
        new App();
    }
}