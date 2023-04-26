
package ejercicioextra2relaciones;

import entidades.Edificio;
import entidades.edificioDeOficinas;
import entidades.polideportivo;
import java.util.ArrayList;






public class Ejercicioextra2relaciones {

    public static void main(String[] args) {
        
        ArrayList<Edificio> building = new ArrayList();
        
      edificioDeOficinas e1=new edificioDeOficinas(5, 5, 10, 4, 8, 10);
      building.add(e1);
       
      
      edificioDeOficinas e2=new edificioDeOficinas(4, 7, 8, 5, 5, 8);
      building.add(e2);
      
      polideportivo p1=new polideportivo("resorT", true, 5, 4, 9);
      building.add(p1);
      
      polideportivo p2=new polideportivo("mimus", false, 6, 3, 4);
      building.add(p2);
      
       for (Edificio aux : building) {
            if (aux instanceof edificioDeOficinas) {
                System.out.println(((edificioDeOficinas) aux).cantpersonas());
                System.out.println("la cantidad de personas que pueden trabajar en el edificio 1 son: "+((edificioDeOficinas) aux).getCantPerOfi()*((edificioDeOficinas) aux).getNumDeOfi()*((edificioDeOficinas) aux).getNumPisos());
               System.out.println("la cantidad de personas por piso es: "+ ((edificioDeOficinas) aux).getCantPerOfi()*((edificioDeOficinas) aux).getNumDeOfi() );
                System.out.println(aux.calcularVolumen()+"mts3");

                System.out.println(aux.calcularSuperficie()+"mts2");
                
            }
            
       }  
        
        for (Edificio aux : building) {
            if (aux instanceof polideportivo) {
                
                if (((polideportivo) aux).isTechada()==true) {
                    System.out.println(aux);
                    
                }
                
            }
            
        }
      
        
        
        
       
                
        
        
        
       
    }
    
}
