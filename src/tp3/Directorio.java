package tp3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Directorio {

    private HashMap<String,Cliente> directorio = new HashMap();

    public boolean agregarCliente(String telefono, Cliente cliente) {
        return directorio.put(telefono, cliente) == null;
    }

    public Cliente buscarCliente(String telefono) {
        //directorio.get(telefono);
        for (Map.Entry<String, Cliente> entry : directorio.entrySet()) {
            if (telefono.equalsIgnoreCase(entry.getKey())) {
                return entry.getValue();
            }
        }
        return null;
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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean borrarCliente(String telefono) {
        return directorio.remove(telefono) == null;
        
    }
}
