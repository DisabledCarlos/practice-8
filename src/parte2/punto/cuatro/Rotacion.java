/**
 * @author Carlos Acuña
 * No. control: 18290849
 * Fecha de entrega: 18/octubre/2020
 */

package parte2.punto.cuatro;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class Rotacion extends JPanel {
    private int ancho, alto, anchoCentral, altoCentral;

    public Rotacion() {
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
            if((x[i] > 0 && y[i] >= 0) && (x[i + 1] > 0 && y[i + 1] <= 0)) {
                g.drawLine(anchoCentral + x[i], altoCentral - y[i], 
                    anchoCentral + x[i + 1], altoCentral + y[i + 1] * -1);
                
            // Cuarto cuadrante al primer cuadrante
            } else if((x[i] >= 0 && y[i] <= 0) && (x[i + 1] >= 0 && y[i + 1] >= 0)) {
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

    private void rotacionOrigen(int x[], int y[], int theta, Color c, Graphics g) {
        int px[] = new int[x.length];
        int py[] = new int[y.length];

        for(int i = 0; i < x.length; i++) {
            px[i] = (int) (x[i] * Math.cos(theta) - y[i] * Math.sin(theta));
            py[i] = (int) (x[i] * Math.sin(theta) + y[i] * Math.cos(theta));
        }

        g.setColor(c);
        dibujarFigura(px, py, g);
    }

    private void rotacionPunto(int x[], int y[], int xr, int yr, int theta, Color c, Graphics g) {
        int px[] = new int[x.length];
        int py[] = new int[y.length];

        for(int i = 0; i < x.length; i++) {
            px[i] = (int) ((x[i] - xr) * Math.cos(theta) - (y[i] - yr) * Math.sin(theta) + xr);
            py[i] = (int) ((x[i] - xr) * Math.sin(theta) + (y[i] - yr) * Math.cos(theta) + yr);
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

        int x[] = new int[]{50, 100, 100, 120, 100, 100, 50, 60, 50};
        int y[] = new int[]{10, 10, 20, 0, -20, -10, -10, 0, 10};

        // Estrella de cuatro picos en el cuadrante 1
        dibujarFigura(x, y, g);

        // Rotación grupo A
        rotacionOrigen(x, y, 45, Color.RED, g);
        rotacionOrigen(x, y, 90, Color.RED, g);
        rotacionOrigen(x, y, 135, Color.RED, g);
        rotacionOrigen(x, y, 180, Color.RED, g);

        // Rotación grupo B
        rotacionPunto(x, y, 85, 0, 45, Color.BLUE, g);
        rotacionPunto(x, y, 85, 0, 90, Color.BLUE, g);
        rotacionPunto(x, y, 85, 0, 135, Color.BLUE, g);
        rotacionPunto(x, y, 85, 0, 180, Color.BLUE, g);

        // Rotación grupo C
        rotacionPunto(x, y, 100, 20, 45, Color.MAGENTA, g);
        rotacionPunto(x, y, 100, 20, 90, Color.MAGENTA, g);
        rotacionPunto(x, y, 100, 20, 135, Color.MAGENTA, g);
        rotacionPunto(x, y, 100, 20, 180, Color.MAGENTA, g);

        // Rotación grupo D
        rotacionPunto(x, y, 200, -50, 45, Color.YELLOW, g);
        rotacionPunto(x, y, 200, -50, 90, Color.YELLOW, g);
        rotacionPunto(x, y, 200, -50, 135, Color.YELLOW, g);
        rotacionPunto(x, y, 200, -50, 180, Color.YELLOW, g);
    }
}
