package co.com.sofka.administracioninventarios.catalogomotocicletas.values;

import co.com.sofka.domain.generic.Identity;

public class MotocicletaProveedorId extends Identity {
    public MotocicletaProveedorId(){
    }

    public MotocicletaProveedorId(String id){
        super(id);
    }
    public static MotocicletaProveedorId of(String id){
        return new MotocicletaProveedorId(id);
    }
}
