package co.com.sofka.administracioninventarios.catalogomotocicletas.events;

import co.com.sofka.administracioninventarios.catalogomotocicletas.values.MotocicletaLocalId;
import co.com.sofka.domain.generic.DomainEvent;

public class MotocicletaLocalEliminada extends DomainEvent {
    private final MotocicletaLocalId motocicletaId;

    public MotocicletaLocalEliminada(MotocicletaLocalId motocicletaId) {
        super("co.com.sofka.administracioninventarios.MotocicletaLocalEliminada");
        this.motocicletaId = motocicletaId;
    }

    public MotocicletaLocalId getMotocicletaId() {
        return motocicletaId;
    }

}
