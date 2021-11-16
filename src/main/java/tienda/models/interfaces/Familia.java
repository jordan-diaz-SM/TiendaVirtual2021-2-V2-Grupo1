package tienda.models.interfaces;

public abstract class Familia {

    protected ICategoria categoria;
    
    public abstract String getNombre();

    public abstract String getEspecificaciones();
}
