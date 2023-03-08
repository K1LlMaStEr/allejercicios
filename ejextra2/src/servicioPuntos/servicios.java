package servicioPuntos;
import entidades.puntos;
import java.util.Scanner;


/**
 *
 * @author Alumno
 */
public class servicios {
    Scanner leer = new Scanner(System.in);
    
    puntos pt = new puntos();
    
    public puntos crearPuntos(){
        System.out.println("ingrese las coordenada X1");
        pt.setX1(leer.nextInt());
        System.out.println("ingrese las coordenadas X2");
        pt.setX2(leer.nextInt());   
        System.out.println("ingrese coordenadas de Y1");
        pt.setY1(leer.nextInt());
         System.out.println("ingrese coordenadas de Y2");
         pt.setY2(leer.nextInt());
        
        return pt;
        
        }
    public double calcular(){
        double calculo= (Math.sqrt(Math.pow(pt.getX2(),2)- (Math.pow(pt.getX1(), 2))+ (Math.pow(pt.getY2(),2)- (Math.pow(pt.getY1(), 2)))));
        System.out.println(calculo);
        return calculo;
    }
    
    
}
