package co.com.sofka.administracioninventarios.catalogorepuestos.events;

import co.com.sofka.administracioninventarios.catalogorepuestos.RepuestoLocal;
import co.com.sofka.administracioninventarios.catalogorepuestos.values.RepuestoLocalId;
import co.com.sofka.domain.generic.DomainEvent;

public class RepuestoLocalAgregado extends DomainEvent {
    private final RepuestoLocalId repuestoId;
    private final RepuestoLocal repuesto;

    public RepuestoLocalAgregado(RepuestoLocalId respuestoId, RepuestoLocal repuesto) {
        super("co.com.sofka.administracioninventarios.RepuestoLocalAgregado");
        this.repuestoId = respuestoId;
        this.repuesto = repuesto;
    }

    public RepuestoLocalId getRepuestoId() {
        return repuestoId;
    }

    public RepuestoLocal getRepuesto() {
        return repuesto;
    }
}
