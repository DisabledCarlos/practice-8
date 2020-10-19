/**
 * @author Carlos Acuña
 * No. control: 18290849
 * Fecha de entrega: 18/octubre/2020
 */

package parte2.punto.siete;

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
     * Método encargado de rellenar alguna figura de acuerdo al plano cartesiano
     * @param x Arreglo de las posiciones en X de la figura
     * @param y Arreglo de las posiciones en Y de la figura
     * @param g Objeto Graphic
     */
    private void rellenarFigura(int x[], int y[], Graphics g) {
        int px[] = new int[x.length];
        int py[] = new int[y.length];

        for(int i = 0; i < x.length; i++) {
            if(x[i] >= 0 && y[i] > 0) {
                    px[i] = anchoCentral + x[i];
                    py[i] = altoCentral - y[i];
            }
        }

        g.setColor(Color.WHITE);
        g.fillPolygon(px, py, x.length - 1);
    }

    /**
     * Método encargado de hacer una rotación en un punto especifico 
     * de las coordenadas X
     * @param x Coordenadas en X de la figura
     * @param y Coordenadas en Y de la figura
     * @param xr Punto de rotación en X
     * @param yr Punto de rotación en Y
     * @param theta Ángulo de rotación de la figrua
     */
    private int[] rotacionPuntoX(int x[], int y[], int xr, int yr, int theta) {
        int px[] = new int[x.length];

        for(int i = 0; i < x.length; i++) {
            px[i] = (int) ((x[i] - xr) * Math.cos(theta) - (y[i] - yr) * Math.sin(theta) + xr);
        }

        return px;
    }

    /**
     * Método encargado de hacer una rotación en un punto especifico
     * de las coordenadas Y
     * @param x Coordenadas en X de la figura
     * @param y Coordenadas en Y de la figura
     * @param xr Punto de rotación en X
     * @param yr Punto de rotación en Y
     * @param theta Ángulo de rotación de la figura
     */
    private int[] rotacionPuntoY(int x[], int y[], int xr, int yr, int theta) {
        int py[] = new int[y.length];

        for(int i = 0; i < x.length; i++) {
            py[i] = (int) ((x[i] - xr) * Math.sin(theta) + (y[i] - yr) * Math.cos(theta) + yr);
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

        int px[], py[] = new int[]{5};
        px = x;
        py = y;

        // Parte D
        rellenarFigura(px, py, g);
        g.setColor(Color.GREEN);
        dibujarFigura(px, py, g);

        // Parte C
        x = rotacionPuntoX(px, py, 100, 100, -310);
        y = rotacionPuntoY(px, py, 100, 100, -310);
        rellenarFigura(x, y, g);
        g.setColor(Color.GREEN);
        dibujarFigura(x, y, g);

        // Parte B
        x = rotacionPuntoX(px, py, 100, 100, 50);
        y = rotacionPuntoY(px, py, 100, 100, 50);
        rellenarFigura(x, y, g);
        g.setColor(Color.GREEN);
        dibujarFigura(x, y, g);
        
        // Parte A
        x = rotacionPuntoX(px, py, 100, 100, -45);
        y = rotacionPuntoY(px, py, 100, 100, -45);
        rellenarFigura(x, y, g);
        g.setColor(Color.GREEN);
        dibujarFigura(x, y, g);
    }
}
