package tp3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Directorio {

    private HashMap<String,Cliente> directorio = new HashMap();

    public boolean agregarCliente(String telefono, Cliente cliente) {
        return directorio.put(telefono, cliente) == null; //lo ideal seria que consulte en el main si existe y que quiere hacer el usuario (Deberia retornar un cliente¿?)
    }

    public Cliente buscarCliente(String telefono) {
        return directorio.get(telefono);
        /*for (Map.Entry<String, Cliente> entry : directorio.entrySet()) {
            if (telefono.equalsIgnoreCase(entry.getKey())) {
                return entry.getValue();
            }
        }*/
        //return null;
    }
   
    public ArrayList<String> buscarTelefono(String apellido) {
        ArrayList<String> telefonosMismoApellido = new ArrayList<>();
       for (Map.Entry<String, Cliente> entry : directorio.entrySet()) {
            if (entry.getValue().getApellido().equalsIgnoreCase(apellido)) {
                telefonosMismoApellido.add(entry.getKey());
            }
        }
        return telefonosMismoApellido;
    }


   public Set<Cliente> buscarClientes(String ciudad) {
        HashSet <Cliente> cli=new HashSet();
        for (Map.Entry<String, Cliente> entry : directorio.entrySet()) {
                
               if(entry.getValue().getCiudad().equalsIgnoreCase(ciudad)){
               cli.add(entry.getValue());
               } 
           
       }
              
    return cli;}
   
    public boolean borrarCliente(String telefono) {
        return directorio.remove(telefono) == null;
        
    }

    public HashMap<String, Cliente> getDirectorio() {
        return directorio;
    }
}
