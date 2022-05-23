package co.com.sofka.administracioninventarios.catalogorepuestos.events;

import co.com.sofka.administracioninventarios.catalogorepuestos.values.RepuestoTerceroId;
import co.com.sofka.domain.generic.DomainEvent;

public class RepuestoTerceroEliminado extends DomainEvent {
    private final RepuestoTerceroId repuestoId;

    public RepuestoTerceroEliminado(RepuestoTerceroId repuestoId) {
        super("co.com.sofka.administracioninventarios.RepuestoTerceroEliminado");
        this.repuestoId = repuestoId;
    }

    public RepuestoTerceroId getRepuestoId() {
        return repuestoId;
    }
}
