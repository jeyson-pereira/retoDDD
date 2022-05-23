package co.com.sofka.administracioninventarios.catalogomotocicletas.values;

import co.com.sofka.domain.generic.Identity;

public class MotocicletaLocalId extends Identity {
    public MotocicletaLocalId(){
    }

    public MotocicletaLocalId(String id){
        super(id);
    }
    public static MotocicletaLocalId of(String id){
        return new MotocicletaLocalId(id);
    }
}
