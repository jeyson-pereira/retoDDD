package co.com.sofka.administracioninventarios.catalogorepuestos.values;

import co.com.sofka.domain.generic.Identity;

public class RepuestoProveedorId extends Identity {
    public RepuestoProveedorId() {
    }
    public RepuestoProveedorId(String id) {
        super(id);
    }

    public static RepuestoProveedorId of(String id) {
        return new RepuestoProveedorId(id);
    }
}
