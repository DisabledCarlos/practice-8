/**
 * @author Carlos Acuña
 * No. control: 18290849
 * Fecha de entrega: 18/octubre/2020
 */

package parte1;

import javax.swing.*;

public class App extends JFrame {
    PlanoCartesiano plano;

    public App() {
        initComponents();
    }

    /**
     * Método encargado de inicializar los atributos del frame
     */
    private void initComponents() {
        setTitle("Plano cartesiano");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        plano = new PlanoCartesiano();
        add(plano);

        setVisible(true);
    }
    

    public static void main(String[] args) {
        new App();
    }
}
