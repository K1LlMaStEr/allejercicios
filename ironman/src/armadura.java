
import java.util.Scanner;


public class armadura {
    
    
    Scanner leer = new Scanner(System.in);
    public void caminar(int energia){
        System.out.println("ingrese tiempo de  caminata");
        
        int desgaste=leer.nextInt()*1;
        energia = energia-desgaste;
        
    }
    public void correr(int energia){
        System.out.println("ingrese el tiempo corrido");
        int desgaste=leer.nextInt()*2;
        energia= energia-desgaste;
        
    }
    public void propulsarse(int energia){
        System.out.println("ingrese tiempo de uso");
        int desgaste=leer.nextInt()*3;
        energia=energia-desgaste;
        
        
    }
    public void volar(int energia){
        System.out.println("ingrese tiempo de volado");
        int desgaste=leer.nextInt()*(3+2);
        energia=energia-desgaste;
    }
    public void disparo(int energia){
        System.out.println("ingrese tiempo de disparo");
        int desgaste=leer.nextInt()*3;
        energia=energia-desgaste;
    }
    public void escribirConsola(int energia){
        energia=energia-2;
        
    }
    public void hablar(int energia){
        energia=energia-1;
        
    }
    if 
    

}
