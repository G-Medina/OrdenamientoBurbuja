
package ordenamiento.burbuja;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class OrdenamientoBurbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner rd=new Scanner(System.in);
        System.out.println("Proceso de inventariado\n");
        
        int cantidad, precio;
        
         cantidad=  Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de productos: "));
 
         String inventario[];
        inventario = new String[cantidad];

        
         for(int g=0; g<cantidad; g++){
         System.out.print((g+1)+". Ingrese producto "+(g+1)+": ");
            inventario[g]=rd.nextLine();
      
         }
               // Imprimimos el array INVENTARIO desordenado. 
        System.out.println("Array inventario desordenado: "); 
        for(int i=0; i<inventario.length; i++) 
        {System.out.println( " Inventario[" + i + "] = " + inventario[i] ); 
        
        ordenamientoburbuja(cantidad,inventario);
        }
                           // Imprimimos el array INVENTARIO ordenado. 
        System.out.println("\n Array Inventario ordenado: "); 
        for(int i=0; i<inventario.length; i++) 
        {System.out.println( " Inventario[" + i + "] = " + inventario[i] ); }       
                
                
            }
    
    
    public static void ordenamientoburbuja(int cantidad, String inventario[]){
        String clave;
                 for(int k=0; k<(cantidad-1);k++){
            for(int w=0; w<(cantidad-1);w++){
                if(inventario[w+1].compareTo(inventario[w])>0){
                    clave=inventario[w];
                    inventario[w]=inventario[w+1];
                    inventario[w+1]=clave;
                    
                     }
        
    }
}
   
    }
    
    
        }
        
  
         
         
    
    
 
    

