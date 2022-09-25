package tp3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TP3 {

 public static void main(String[] args) {
    //Test de metodos//
    //Testeo de creacion de Directorio y agregando Clientes al mismo    
    Directorio guia=new Directorio();
    Cliente C1=new Cliente("14144735", "Gerardo", "Garro", "San Luis", "Lucas Rodriguez");
    Cliente C2=new Cliente("14144735", "Zoe", "Acevedo", "San Luis", "Pasaje Fortuna");
    Cliente C3=new Cliente("4076512", "Ana", "Sosa", "Buenos Aires", "Palermo");
    Cliente C4=new Cliente("7376377", "Rolando", "Garro", "Cordoba", "Recoleta");
    Cliente C5=new Cliente("50125444", "Lara", "Suarez", "San Luis", "Pasaje Fortuna");
    Cliente C6=new Cliente("2531054", "Marcos", "Miranda", "Cordoba", "Ampia");
    System.out.println("Directorio Original:");
    guia.agregarCliente("2664016108", C1);
    guia.agregarCliente("2665800147", C2);
    guia.agregarCliente("3516800871", C3);
    guia.agregarCliente("2657112544", C4);
    guia.agregarCliente("21543315", C5);
    guia.agregarCliente("2665315577", C6);
    
    MostrarDir(guia);
    System.out.println("");
    
    //testeo metodo directorio para obtener de los Maps sus numeros con la condicion que sea mismo Apellido
    System.out.println("Lista de numeros con mismo apellido:");
    ArrayList<String> mismoAp= new ArrayList<>();
    mismoAp=guia.buscarTelefono("Garro");
        for (Iterator<String> it = mismoAp.iterator(); it.hasNext();) {
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }
        System.out.println("");
    //testeo Metodo de la clase Directorio 
    //en la cual me devuelve una lista con los clientes de una ciudad determinada 
    System.out.println("Lista de Clientes de la misma ciudad");
    Set <Cliente> nuevo;
    nuevo=guia.buscarClientes("San Luis");
        for (Iterator<Cliente> iterator = nuevo.iterator(); iterator.hasNext();) {
            while(iterator.hasNext()){
                System.out.println(iterator.next());    
            }
            
        }
    System.out.println("");
    
    //testeo de la clase Directorio para borrar un Map por su Key(String numero)
    guia.borrarCliente("2665800147");
    System.out.println("Directorio nuevo con un elemento eliminado del original:");
    MostrarDir(guia);
            
   
 
    
      
        
        } 
            
      //funcion para mostrar Los Valores de los Maps en Directorio
    public static void MostrarDir(Directorio dir){
       for (Map.Entry<String, Cliente> e : dir.getDirectorio().entrySet()) {
            System.out.println(e.getValue());
            
        } 
        }   
    }
    
    

