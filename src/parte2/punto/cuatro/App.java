/**
 * @author Carlos Acuña
 * No. control: 18290849
 * Fecha de entrega: 18/octubre/2020
 */

package parte2.punto.cuatro;

import javax.swing.*;

public class App extends JFrame {
    private Rotacion r;

    public App() {
        initComponents();
    }

    /**
     * Método encargado de inicializar los atributos del frame
     */
    private void initComponents() {
        setTitle("Rotación de una flecha");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        r = new Rotacion();
        add(r);

        setVisible(true);
    }

    public static void main(String args[]) {
        new App();
    }
}