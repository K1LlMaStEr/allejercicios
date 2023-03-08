/*
 Definir la clase Fecha. La Clase entidad tendrá solo 3 atributos (día, mes, año). No se podrá utilizar
ningún tipo de objeto de “clase fechas”. Inicializando desde la entidad los valores en 1, 1, 1900
respectivamente.
*/
package exex4;

/**
 *
 * @author Alumno
 */
public class Exex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          fechaServicios fS=new fechaServicios();
        Fecha f1 = fS.crearFecha();
        f1.cantDias();
        f1.diaAnterior();
        f1.diaPosterior();
        if(f1.esBiciesto()){
            System.out.println("El Año es Biciesto.");
        }else{
            System.out.println("El Año NO es Biciesto");
        }
        // TODO code application logic here
    }
    
}
