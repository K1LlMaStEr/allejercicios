/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;
import entidades.Electrodomestico;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ServiciosElectrodomesticos {
    
    protected Scanner leer = new Scanner(System.in);
    
    public String comprobarConsumoEnergetico(String letra){
        
        String newLetter = letra.toUpperCase();
             
        if((!newLetter.equals("A"))&&(!newLetter.equals("B"))&&(!newLetter.equals("C"))&&(!newLetter.equals("D"))&&(!newLetter.equals("E"))&&(!newLetter.equals("F"))){
            newLetter = "F";
       }
        return newLetter;
    }
    
    public String comprobarColor(String color){
        int cont = 0;
        String newColor = color.toLowerCase();
        String[] COLORES = {"blanco", "negro", "rojo", "azul", "gris"};
        
        for (String colorF : COLORES) {
            if(newColor.equals(colorF)){            
                cont++;
                break;
            }
        }
        
        if(cont>0){
            return newColor;
        }else{
            newColor = "blanco";
            return newColor;
        }
    }
    
    public int precioFinal(int precio, int peso, String consumo){
        
        switch(consumo){
            case "A": 
                    precio+= 1000; 
                    break;
            case "B":
                    precio += 800;
                    break;
            case "C": 
                    precio+= 600; 
                    break;
            case "D":
                    precio += 500;
                    break;
            case "E": 
                    precio+= 300; 
                    break;
            case "F":
                    precio += 100;
                    break;
        }
        
        
        if(peso>= 1 && peso<= 19){
            precio+= 100;
        } else if(peso >19 && peso <= 49){
            precio+= 500;
        } else if(peso > 49 && peso <= 79){
            precio+= 800;
        } else if(peso > 79){
            precio+= 1000;
        }  
        
        return precio;
    }
    
    public void crearElectrodomestico(Electrodomestico e){

        System.out.println("Ingrese color del electrodomestico: ");
        String color = comprobarColor(leer.nextLine());
        System.out.println("Ingrese Letra para el consumo energético: ");
        String consumo = comprobarConsumoEnergetico(leer.nextLine());
        System.out.println("Ingrese peso del electrodomestico: ");
        int peso = leer.nextInt();
        int precio = 1000;
        
        e.setColor(color);
        e.setConsumoE(consumo);
        e.setPeso(peso);
        e.setPrecio(precio);
    }
}
