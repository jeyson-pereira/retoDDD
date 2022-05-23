package co.com.sofka.administracioninventarios.catalogorepuestos.values;

import co.com.sofka.domain.generic.Identity;

public class RepuestoTerceroId extends Identity {
    public RepuestoTerceroId(String id) {
        super(id);
    }

    public RepuestoTerceroId() {

    }

    public static RepuestoTerceroId of(String id) {
        return new RepuestoTerceroId(id);
    }
}
