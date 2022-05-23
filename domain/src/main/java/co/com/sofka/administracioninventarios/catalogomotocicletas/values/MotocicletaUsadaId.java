package co.com.sofka.administracioninventarios.catalogomotocicletas.values;

import co.com.sofka.domain.generic.Identity;

public class MotocicletaUsadaId extends Identity {
    public MotocicletaUsadaId(){
    }

    public MotocicletaUsadaId(String id){
        super(id);
    }
    public static MotocicletaUsadaId of(String id){
        return new MotocicletaUsadaId(id);
    }
}
