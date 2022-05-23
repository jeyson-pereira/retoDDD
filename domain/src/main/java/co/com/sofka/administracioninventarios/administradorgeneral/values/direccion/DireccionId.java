package co.com.sofka.administracioninventarios.administradorgeneral.values.direccion;

import co.com.sofka.domain.generic.Identity;

public class DireccionId extends Identity{
    public DireccionId(String id) {
        super(id);
    }

    public static DireccionId of(String id) {
        return new DireccionId(id);
    }
}