package co.com.sofka.administracioninventarios.catalogorepuestos.events;

import co.com.sofka.administracioninventarios.catalogorepuestos.RepuestoProveedor;
import co.com.sofka.administracioninventarios.catalogorepuestos.values.RepuestoProveedorId;
import co.com.sofka.domain.generic.DomainEvent;

public class RepuestoProveedorAgregado extends DomainEvent {
    private final RepuestoProveedorId repuestoId;
    private final RepuestoProveedor repuesto;

    public RepuestoProveedorAgregado(RepuestoProveedorId respuestoId, RepuestoProveedor repuesto) {
        super("co.com.sofka.administracioninventarios.RepuestoProveedorAgregado");
        this.repuestoId = respuestoId;
        this.repuesto = repuesto;
    }

    public RepuestoProveedorId getRepuestoId() {
        return repuestoId;
    }

    public RepuestoProveedor getRepuesto() {
        return repuesto;
    }
}
