package tienda.models.impl;

import tienda.models.*;
import tienda.models.interfaces.IProductoFactory;

public class GamaMediaFactory implements IProductoFactory{
    
    @Override
    public LineaProducto getLineaProducto() {
        
        return new LineaGamaMedia();
    }

    @Override
    public MantenimientoProducto getMantenimiento() {
        
        return new MantenimientoMedio();
    }

    @Override
    public CamaraProducto getCamaraProducto(){

        return new ResolucionMedia();
    }

    @Override
    public BateriaProducto getBateriaProducto(){
        
        return new DuracionMedia();
    }

}
