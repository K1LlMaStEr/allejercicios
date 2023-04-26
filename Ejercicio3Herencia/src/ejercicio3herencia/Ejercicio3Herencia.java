  /*
 Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package ejercicio3herencia;

import Entidades.Circulo;
import Entidades.Rectangulo;

 
public class Ejercicio3Herencia {

    public static void main(String[] args) {
        Circulo c1=new Circulo();
        Rectangulo r1=new Rectangulo();
        r1.perimetroRectangulo(6.3, 5.6);
        r1.areaRectangulo(7, 6);
        c1.areaCirculo(3.1416, 4);
        c1.perimetroCirculo(3.1416, 4);
    }
    
}
