/*
Calcular la hipotenusa de un triángulo rectángulo utilizando el teorema de Pitágoras
 */
package ejercicio2;
import java.util.*;

/**
 *
 * @author Piter
 */
public class Ejercicio2 {

    private int ca, co, h;
    
    public void cargarDatos(){
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Digite el cateto adyasente... ");
        ca=entrada.nextInt();
        
        System.out.println("Digite el cateto opuesto... ");
        co=entrada.nextInt();        
    }
    
    public void calcularCatetos(){
        
        double catetoAdyasente=Math.pow(ca, 2);
        double catetoOpuesto=Math.pow(co, 2);
        double hipotenusa=Math.sqrt(catetoAdyasente +catetoOpuesto);
        
        System.out.println("La hipotenusa del triangulo es "+hipotenusa);        
    }   
}
