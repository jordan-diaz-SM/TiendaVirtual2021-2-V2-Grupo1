package tienda.models.interfaces;

import tienda.models.LineaProducto;
import tienda.models.MantenimientoProducto;
import tienda.models.CamaraProducto;
import tienda.models.BateriaProducto;

public interface IProductoFactory {

    public LineaProducto getLineaProducto();

    public MantenimientoProducto getMantenimiento();

    public CamaraProducto getCamaraProducto();

    public BateriaProducto getBateriaProducto();

}