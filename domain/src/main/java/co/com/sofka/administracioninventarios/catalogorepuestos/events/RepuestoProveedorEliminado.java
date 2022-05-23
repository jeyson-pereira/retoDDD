package co.com.sofka.administracioninventarios.catalogorepuestos.events;

import co.com.sofka.administracioninventarios.catalogorepuestos.values.RepuestoProveedorId;
import co.com.sofka.domain.generic.DomainEvent;

public class RepuestoProveedorEliminado extends DomainEvent {
    private final RepuestoProveedorId repuestoId;

    public RepuestoProveedorEliminado(RepuestoProveedorId repuestoId) {
        super("co.com.sofka.administracioninventarios.RepuestoProveedorEliminado");
        this.repuestoId = repuestoId;
    }

    public RepuestoProveedorId getRepuestoId() {
        return repuestoId;
    }
}
