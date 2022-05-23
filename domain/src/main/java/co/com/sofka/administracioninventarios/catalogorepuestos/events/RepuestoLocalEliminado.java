package co.com.sofka.administracioninventarios.catalogorepuestos.events;

import co.com.sofka.administracioninventarios.catalogorepuestos.values.RepuestoLocalId;
import co.com.sofka.domain.generic.DomainEvent;

public class RepuestoLocalEliminado extends DomainEvent {
    private final RepuestoLocalId repuestoId;

    public RepuestoLocalEliminado(RepuestoLocalId repuestoId) {
        super("co.com.sofka.administracioninventarios.RepuestoLocalEliminado");
        this.repuestoId = repuestoId;
    }

    public RepuestoLocalId getRepuestoId() {
        return repuestoId;
    }
}
