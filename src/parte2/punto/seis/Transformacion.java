/**
 * @author Carlos Acuña
 * No. control: 18290849
 * Fecha de entrega: 18/octubre/2020
 */

package parte2.punto.seis;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class Transformacion extends JPanel {
    private int ancho, alto, anchoCentral, altoCentral;

    public Transformacion() {
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

    /**
     * Método encargado de hacer la transformación de traslación en los puntos X
     * @param x Arreglo de las coordenadas X de la figura
     * @param tx Traslación en X
     */
    private int[] traslacionX(int x[], int tx) {
        int px[] = new int[x.length];

        for(int i = 0; i < x.length; i++) {
            px[i] = tx + x[i];
        }

        return px;
    }

    /**
     * Método encargado de hacer la transformación de traslación en los puntos Y
     * @param y Arreglo de las coordenadas Y de la figura
     * @param ty Traslación en Y
     */
    private int[] traslacionY(int y[], int ty) {
        int py[] = new int[y.length];

        for(int i = 0; i < y.length; i++) {
            py[i] = ty + y[i];
        }

        return py;
    }

    /**
     * El método paintComponent() se encarga de dibujar y volver a dibujar 
     * cuando el panel cambia de tamaño
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        dibujarPlano(g);

        int x[] = new int[]{50, 150, 150, 50, 50};
        int y[] = new int[]{50, 50, 150, 150, 50};

        // Figura de cuadrado
        g.setColor(Color.GREEN);
        dibujarFigura(x, y, g);

        x[0] = 125;
        y[4] = 125; 

        // Parte A
        x = traslacionX(x, 25);
        y = traslacionY(y, 25);
        dibujarFigura(x, y, g);

        // Parte B
        x = traslacionX(x, 25);
        y = traslacionY(y, 25);
        dibujarFigura(x, y, g);

        // Parte C
        x = traslacionX(x, 25);
        y = traslacionY(y, 25);
        dibujarFigura(x, y, g);

    }
}
