/**
 * @author Carlos Acuña
 * No. control: 18290849
 * Fecha de entrega: 18/octubre/2020
 */

package parte1;

import java.awt.Graphics;
import javax.swing.JPanel;

public class PlanoCartesiano extends JPanel {
    private int ancho, alto, anchoCentral, altoCentral;

    public PlanoCartesiano() {
        ancho = getSize().width;
        alto = getSize().height;
        anchoCentral = ancho / 2;
        altoCentral = alto / 2;
    }

    /**
     * Método encargado de dibujar las lineas perpendiculares
     * para el plano cartesiano
     * @param g Objeto graphics
     */
    private void dibujarPlano(Graphics g) {
        ancho = getSize().width;
        alto = getSize().height;
        anchoCentral = ancho / 2;
        altoCentral = alto / 2;

        // Linea horizontal
        g.drawLine(0, altoCentral, ancho, altoCentral);

        // Linea vertical
        g.drawLine(anchoCentral, 0, anchoCentral, alto);
    }

    /**
     * Método encargado de dibujar alguna figura de acuerdo al plano cartesiano
     * @param x Arreglo de las posiciones en X de la figura
     * @param y Arreglo de las posiciones en Y de la figura
     * @param g Objeto Graphic
     */
    private void dibujarFigura(int x[], int y[], Graphics g) {
        for(int i = 0; i < x.length - 1; i++) {
            // Solo primer cuadrante
            if((x[i] > 0 && y[i] > 0) && (x[i+1] > 0 && y[i+1] > 0)) {
                g.drawLine(anchoCentral + x[i], altoCentral - y[i], 
                    anchoCentral + x[i + 1], altoCentral - y[i + 1]);
            
            // Solo cuarto cuadrante
            } else if((x[i] > 0 && y[i] < 0) && (x[i+1] > 0 && y[i+1] < 0)) {
                g.drawLine(anchoCentral + x[i], altoCentral + y[i] * -1, 
                    anchoCentral + x[i + 1], altoCentral + y[i + 1] * -1);
            
            // Solo segundo cuadrante
            } else if((x[i] < 0 && y[i] > 0) && (x[i+1] < 0 && y[i+1] > 0)) {
                g.drawLine(anchoCentral + x[i], altoCentral - y[i], 
                    anchoCentral + x[i + 1], altoCentral - y[i + 1]); 

            // Solo tercer cuadrante
            } else if((x[i] < 0 && y[i] < 0) && (x[i+1] < 0 && y[i+1] < 0)) {
                g.drawLine(anchoCentral + x[i], altoCentral + y[i] * -1, 
                    anchoCentral + x[i + 1], altoCentral + y[i + 1] * -1);
            }
            

            // Primer cuadrante al cuarto cuadrante
            if((x[i] > 0 && y[i] > 0) && (x[i + 1] > 0 && y[i + 1] < 0)) {
                g.drawLine(anchoCentral + x[i], altoCentral - y[i], 
                    anchoCentral + x[i + 1], altoCentral + y[i + 1] * -1);
                
            // Cuarto cuadrante al primer cuadrante
            } else if((x[i] > 0 && y[i] < 0) && (x[i + 1] > 0 && y[i + 1] > 0)) {
                g.drawLine(anchoCentral + x[i], altoCentral - y[i], 
                    anchoCentral + x[i + 1], altoCentral - y[i + 1]);
            }



            // Segundo cuadrante al tercer cuadrante
            if((x[i] < 0 && y[i] > 0) && (x[i + 1] < 0 && y[i + 1] < 0)) {
                g.drawLine(anchoCentral + x[i], altoCentral - y[i], 
                    anchoCentral + x[i + 1], altoCentral + y[i + 1] * -1);
                
            // Tercer cuadrante al segundo cuadrante
            } else if((x[i] < 0 && y[i] < 0) && (x[i + 1] < 0 && y[i + 1] > 0)) {
                g.drawLine(anchoCentral + x[i], altoCentral - y[i], 
                    anchoCentral + x[i + 1], altoCentral - y[i + 1]);
            }
        }
    }

    /**
     * El método paintComponent() se encarga de dibujar y volver a dibujar 
     * cuando el panel cambia de tamaño
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        dibujarPlano(g);

        // Cuadrado cuadrante uno
        dibujarFigura(new int[]{50, 250, 250, 50, 50}, 
            new int[]{50, 50, 250, 250, 50}, g);

        // Triangulo cudrante cuatro
        dibujarFigura(new int[]{100, 300, 200, 100}, 
            new int[]{-200, -200, -25, -200}, g);

        // Romboide segundo cuadrante
        dibujarFigura(new int[]{-325, -250, -50, -125, -325}, 
            new int[]{50, 200, 200, 50, 50}, g);

        // Trapecio tercer cuadrante
        dibujarFigura(new int[]{-200, -125, -50, -125, -200}, 
            new int[]{-100, -10, -100, -190, -100}, g);

        // Rectangulo cuadrante 2 y 3
        dibujarFigura(new int[]{-600, -400, -400, -600, -600}, 
            new int[]{300, 300, -300, -300, 300}, g);

        // Circulo cuadrante 4
        g.drawOval(anchoCentral, altoCentral, 100, 100);
    }
}
