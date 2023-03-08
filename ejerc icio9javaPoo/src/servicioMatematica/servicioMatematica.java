/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioMatematica;

/**
 *
 * @author Alumno
 */
public class servicioMatematica {
    
    public double devolverValor(double n1, double n2){
        double mayor=0;
        if (n1>mayor){
            mayor=n1;
        }
        if (n2>mayor){
            mayor=n2;
        }
        if (n1>n2){
            mayor=n1;}
        else{
            mayor=n2;
        
            
        }
        return mayor;
        
        
    }
    public double devolverMenor(double n1, double n2){
        double menor=0;
        if (n1<menor){
            menor=n1;
        }
        if (n2>menor){
            menor=n2;
        }
        /*if (n1>n2){
            menor=n1;}
        else{
            menor=n2;
        
            
        }*/
        return menor;
    
    }
    public void calcularPotencia(int may, int men){
        double p=Math.pow(may,men);
        System.out.println("El numero "+may+" elevado a "+men+" da como resultado "+p);   
    }
    public void calcularRaiz(double m){
        int ma=(int)Math.abs(m);/*valor absoluto Math.abs*/
        System.out.println("el valor absoluto de "+m+"es "+ma);
        ma=(int)(Math.sqrt(ma));
        System.out.println("la raiz cuadrada de "+m+"es "+ma);
        
        
    }
}
