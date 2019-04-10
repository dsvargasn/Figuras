/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import figuras.logica.*;
import java.util.Scanner;
/**
 *
 * @author Estudiantes
 */
public class Figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x1 = 5;
        System.out.println("Seleccione la figura.");
        System.out.println("1. Cuadrado, 2. Rectangulo, 3. Circulo, 4. Triangulo, 5. Elipse.");
        Scanner entrada = new Scanner (System.in);
        int num = entrada.nextInt();
        Figura f;
        Punto origen = new Punto();
        Punto fin = new Punto();
        switch (num) {
            case 1:
                f = new Cuadrado();
                origen.setX(0);
                origen.setY(0);
                
                fin.setX(5);
                fin.setY(0);
                Mostrar(f, origen, fin);
            break;
            case 2:
                f = new Rectangulo();
                origen.setX(0);
                origen.setY(5);
                
                fin.setX(10);
                fin.setY(0);
                Mostrar(f, origen, fin);
            break;
            case 3:
                f = new Circulo();
                origen.setX(0);
                origen.setY(0);
                
                fin.setX(5);
                fin.setY(0);
                Mostrar(f, origen, fin);
            break;
            case 4:
                f = new Triangulo();
                origen.setX(0);
                origen.setY(5);
                
                fin.setX(5);
                fin.setY(0);
                Mostrar(f, origen, fin);
            break;
            case 5:
                f = new Elipse();
                origen.setX(0);
                origen.setY(5);
                
                fin.setX(6);
                fin.setY(0);
                Mostrar(f, origen, fin);
            break;
            default:
                System.out.println("Opcioón no válida.");
        }
        
    }
    
    public static void Mostrar(Figura f, Punto origen, Punto fin) {
        
        f.setOrigen(origen);
        f.setFin(fin);
        f.calcularArea();
        f.calcularPerimetro();
        System.out.println("Area = " + f.getArea());
        System.out.println("Perímetro = " + f.getPerimetro());
    }
    
}
