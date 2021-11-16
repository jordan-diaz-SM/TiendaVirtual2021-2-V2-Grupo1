package tienda.models;

import java.util.ArrayList;
import java.util.List;

public class MantenimientoMedio extends MantenimientoProducto{

    @Override
    public String getPeriodo() {
        
        return "6 meses";
    }

    @Override
    public List<String> tareasMantenimiento() {
        
        List<String> tasks = new ArrayList<String>();
        tasks.add("Revisión por garantía");
        tasks.add("50% descuento en reparación por daños");
        return tasks;
    }
}
