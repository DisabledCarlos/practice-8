/**
 * @author Carlos Acuña
 * No. control: 18290849
 * Fecha de entrega: 18/octubre/2020
 */

package parte2.punto.cinco;

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
     * Escalación de una figura sobre sus coordenadas de origen en eje X
     * @param x Coordenadas de las x de la figura
     * @param sx Escalación en X
     */
    private int[] escalacionOrigenX(int x[], float sx) {
        int px[] = new int[x.length];

        for(int i = 0; i < x.length; i++) {
            px[i] = Math.round(x[i] * sx);
        }

        return px;
    }

    /**
     * Escalación de una figura sobre sus coordenadas de origen en el eje Y
     * @param y Coordenadas de las Y en la figura
     * @param sy Escalación en Y
     */
    private int[] escalacionOrigenY(int y[], float sy) {
        int py[] = new int[y.length];

        for(int i = 0; i < y.length; i++) {
            py[i] = Math.round(y[i] * sy);
        }

        return py;
    }

    /**
     * Método encargado de hacer una rotación en el origen de
     * las coordenadas
     * @param x Coordenadas en X de la figura 
     * @param y Coordenadas en Y de la figura 
     * @param theta Angulo de rotación
     */
    private int[] rotacionOrigenX(int x[], int y[], int theta) {
        int px[] = new int[x.length];

        for(int i = 0; i < x.length; i++) {
            px[i] = (int) (x[i] * Math.cos(theta) - y[i] * Math.sin(theta));
        }

        return px;
    }

    /**
     * Método encargado de hacer una rotación en el origen de
     * las coordenadas
     * @param x Coordenadas en X de la figura 
     * @param y Coordenadas en Y de la figura 
     * @param theta Angulo de rotación
     */
    private int[] rotacionOrigenY(int x[], int y[], int theta) {
        int py[] = new int[y.length];

        for(int i = 0; i < x.length; i++) {
            py[i] = (int) (x[i] * Math.sin(theta) + y[i] * Math.cos(theta));
        }

        return py;
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

        int x[] = new int[]{50, 100, 50, 100, 50};
        int y[] = new int[]{60, 60, 10, 10, 60};

        // Figura de reloj de arena
        dibujarFigura(x, y, g);

        int px[], py[] = new int[5];
        
        
        g.setColor(Color.RED);

        // Parte A
        x = px = escalacionOrigenX(x, 2f);
        y = py = escalacionOrigenY(y, 2f);
        dibujarFigura(x, y, g);


        // Parte B
        x = rotacionOrigenX(px, py, 45);
        y = rotacionOrigenY(px, py, 45);
        px = x;
        py = y;
        dibujarFigura(x, y, g);
        
        // Parte C
        x = escalacionOrigenX(px, 1f);
        y = escalacionOrigenY(py, 0.5f);
        px = x;
        py = y;
        dibujarFigura(x, y, g);

        // Parte D
        x = traslacionX(px, 50);
        y = traslacionY(py, -25);
        px = x;
        py = y;
        dibujarFigura(x, y, g);

        // Parte E
        x = rotacionOrigenX(px, py, 90);
        y = rotacionOrigenY(px, py, 90);
        px = x;
        py = y;
        dibujarFigura(x, y, g);

        // Parte F
        x = escalacionOrigenX(px, 1.5f);
        y = escalacionOrigenY(py, 1f);
        px = x;
        py = y;
        dibujarFigura(x, y, g);

        // Parte G
        x = traslacionX(px, 20);
        y = traslacionY(py, 40);
        px = x;
        py = y;
        g.setColor(Color.BLUE);
        dibujarFigura(x, y, g);
    }
}
