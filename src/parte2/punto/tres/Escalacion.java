/**
 * @author Carlos Acuña
 * No. control: 18290849
 * Fecha de entrega: 18/octubre/2020
 */

package parte2.punto.tres;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class Escalacion extends JPanel {
    private int ancho, alto, anchoCentral, altoCentral;

    public Escalacion() {
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
            if((x[i] >= 0 && y[i] > 0) && (x[i+1] >= 0 && y[i+1] > 0)) {
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
            if((x[i] > 0 && y[i] > 0) && (x[i + 1] > 0 && y[i + 1] <= 0)) {
                g.drawLine(anchoCentral + x[i], altoCentral - y[i], 
                    anchoCentral + x[i + 1], altoCentral + y[i + 1] * -1);
                
            // Cuarto cuadrante al primer cuadrante
            } else if((x[i] >= 0 && y[i] <= 0) && (x[i + 1] >= 0 && y[i + 1] > 0)) {
                g.drawLine(anchoCentral + x[i], altoCentral - y[i], 
                    anchoCentral + x[i + 1], altoCentral - y[i + 1]);
            }



            // Segundo cuadrante al tercer cuadrante
            if((x[i] < 0 && y[i] >= 0) && (x[i + 1] < 0 && y[i + 1] <= 0)) {
                g.drawLine(anchoCentral + x[i], altoCentral - y[i], 
                    anchoCentral + x[i + 1], altoCentral + y[i + 1] * -1);
                
            // Tercer cuadrante al segundo cuadrante
            } else if((x[i] < 0 && y[i] <= 0) && (x[i + 1] < 0 && y[i + 1] >= 0)) {
                g.drawLine(anchoCentral + x[i], altoCentral - y[i], 
                    anchoCentral + x[i + 1], altoCentral - y[i + 1]);
            }


            // Tercer cuadrante al cuarto cuadrante
            if((x[i] <= 0 && y[i] < 0) && (x[i + 1] > 0 && y[i + 1] < 0)) {
                g.drawLine(anchoCentral + x[i], altoCentral + y[i] * -1, 
                    anchoCentral + x[i + 1], altoCentral + y[i + 1] * -1);

            // Cuarto cuadrante al tercer cuadrante
            } else if ((x[i] >= 0 && y[i] < 0) && (x[i + 1] < 0 && y[i + 1] < 0)) {
                g.drawLine(anchoCentral + x[i], altoCentral + y[i] * -1, 
                    anchoCentral + x[i + 1], altoCentral + y[i + 1] * -1);
            }

            
            // Primer cuadrante al tercer cuadrante
            if((x[i] > 0 && y[i] > 0) && (x[i + 1] <= 0 && y[i + 1] <= 0)) {
                g.drawLine(anchoCentral + x[i], altoCentral + y[i] * -1, 
                    anchoCentral + x[i + 1], altoCentral + y[i + 1] * -1);
            
            // Tercer cuadrante al primer cuadrante
            } else if((x[i] < 0 && y[i] < 0) && (x[i + 1] >= 0 && y[i + 1] >= 0)) {
                g.drawLine(anchoCentral + x[i], altoCentral + y[i] * -1, 
                    anchoCentral + x[i + 1], altoCentral + y[i + 1] * -1);
            }

            
            // Primer cuadrante al segundo cuadrante
            if((x[i] >= 0 && y[i] >= 0) && (x[i + 1] < 0 && y[i + 1] >= 0)) {
                g.drawLine(anchoCentral + x[i], altoCentral + y[i] * -1, 
                    anchoCentral + x[i + 1], altoCentral + y[i + 1] * -1);

            // Segundo cuadrante al primer cuadrante
            } else if((x[i] <= 0 && y[i] >= 0) && (x[i + 1] >= 0 && y[i + 1] >= 0)) {
                g.drawLine(anchoCentral + x[i], altoCentral + y[i] * -1, 
                    anchoCentral + x[i + 1], altoCentral + y[i + 1] * -1);
            }
        }
    }

    /**
     * Escalación de una figura sobre sus coordenadas de origen
     * @param x Coordenadas de las x de la figura
     * @param y Coordenadas de las Y en la figura
     * @param sx Escalación en X
     * @param sy Escalación en Y
     * @param c Color de la figura 
     * @param g Objeto Graphics
     */
    private void escalacionOrigen(int x[], int y[], float sx, float sy, Color c, Graphics g) {
        int px[] = new int[x.length];
        int py[] = new int[y.length];

        for(int i = 0; i < x.length; i++) {
            px[i] = Math.round(x[i] * sx);
            py[i] = Math.round(y[i] * sy);
        }

        g.setColor(c);
        dibujarFigura(px, py, g);
    }

    /**
     * Método encargado de realizar la escalación de un punto fijo y
     * posteriormente dibuja la figura escalada
     * @param x Coordenadas de las X de la figura
     * @param y Coordenadas de las Y de la figura
     * @param sx Escalación en X
     * @param sy Escalación en Y
     * @param puntoFijoX Punto fijo en X
     * @param puntoFijoY Punto fijo en y
     * @param c Color de la figura 
     * @param g Objeto Graphics
     */
    private void escalacionPuntoFijo(int x[], int y[], float sx, float sy, 
                            int puntoFijoX, int puntoFijoY, Color c, Graphics g) {
        int px[] = new int[x.length];
        int py[] = new int[y.length];

        for(int i = 0; i < x.length; i++) {
            px[i] = Math.round(x[i] * sx + puntoFijoX * (1 - sx));
            py[i] = Math.round(y[i] * sy + puntoFijoY * (1 - sy));
        }

        g.setColor(c);
        dibujarFigura(px, py, g);
    }

    /**
     * El método paintComponent() se encarga de dibujar y volver a dibujar 
     * cuando el panel cambia de tamaño
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        dibujarPlano(g);

        int x[] = new int[]{50, 125, 150, 175, 250, 175, 150, 125, 50};
        int y[] = new int[]{100, 125, 200, 125, 100, 75, 0, 75, 100};

        // Estrella de cuatro picos en el cuadrante 1
        dibujarFigura(x, y, g);

        // Escalación grupo A
        escalacionOrigen(x, y, 2f, 2f, Color.RED, g);
        escalacionOrigen(x, y, 0.5f, 0.5f, Color.RED, g);
        escalacionOrigen(x, y, 1.5f, 0.5f, Color.RED, g);
        escalacionOrigen(x, y, 0.5f, 1.5f, Color.RED, g);

        // Escalación grupo B
        escalacionPuntoFijo(x, y, 2f, 2f, 150, 100, Color.BLUE, g);
        escalacionPuntoFijo(x, y, 0.5f, 0.5f, 150, 100, Color.BLUE, g);
        escalacionPuntoFijo(x, y, 1.5f, 0.5f, 150, 100, Color.BLUE, g);
        escalacionPuntoFijo(x, y, 0.5f, 1.5f, 150, 100, Color.BLUE, g);

        // Escalación grupo C
        escalacionPuntoFijo(x, y, 2f, 2f, 250, 100, Color.GREEN, g);
        escalacionPuntoFijo(x, y, 0.5f, 0.5f, 250, 100, Color.GREEN, g);
        escalacionPuntoFijo(x, y, 1.5f, 0.5f, 250, 100, Color.GREEN, g);
        escalacionPuntoFijo(x, y, 0.5f, 1.5f, 250, 100, Color.GREEN, g);

        // Escalación grupo D
        escalacionPuntoFijo(x, y, 2f, 2f, 250, -150, Color.MAGENTA, g);
        escalacionPuntoFijo(x, y, 0.5f, 0.5f, 250, -150, Color.MAGENTA, g);
        escalacionPuntoFijo(x, y, 1.5f, 0.5f, 250, -150, Color.MAGENTA, g);
        escalacionPuntoFijo(x, y, 0.5f, 1.5f, 250, -150, Color.MAGENTA, g);
    }
}
