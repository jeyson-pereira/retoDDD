package co.com.sofka.administracioninventarios.catalogorepuestos.values;

import co.com.sofka.domain.generic.Identity;

public class RepuestoLocalId extends Identity {
    public RepuestoLocalId(String id) {
        super(id);
    }

    public RepuestoLocalId() {

    }

    public static RepuestoLocalId of(String id) {
        return new RepuestoLocalId(id);
    }
}
