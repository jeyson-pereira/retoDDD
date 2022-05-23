package co.com.sofka.administracioninventarios.catalogorepuestos.events;

import co.com.sofka.administracioninventarios.catalogorepuestos.RepuestoTercero;
import co.com.sofka.administracioninventarios.catalogorepuestos.values.RepuestoTerceroId;
import co.com.sofka.domain.generic.DomainEvent;

public class RepuestoTerceroAgregado extends DomainEvent {
    private final RepuestoTerceroId repuestoId;
    private final RepuestoTercero repuesto;

    public RepuestoTerceroAgregado(RepuestoTerceroId respuestoId, RepuestoTercero repuesto) {
        super("co.com.sofka.administracioninventarios.RepuestoTerceroAgregado");
        this.repuestoId = respuestoId;
        this.repuesto = repuesto;
    }

    public RepuestoTerceroId getRepuestoId() {
        return repuestoId;
    }

    public RepuestoTercero getRepuesto() {
        return repuesto;
    }
}
