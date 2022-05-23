package co.com.sofka.administracioninventarios.catalogomotocicletas.events;

import co.com.sofka.administracioninventarios.catalogomotocicletas.values.MotocicletaUsadaId;
import co.com.sofka.domain.generic.DomainEvent;

public class MotocicletaUsadaEliminada extends DomainEvent {
    private final MotocicletaUsadaId motocicletaId;

    public MotocicletaUsadaEliminada(MotocicletaUsadaId motocicletaId) {
        super("co.com.sofka.administracioninventarios.MotocicletaUsadaEliminada");
        this.motocicletaId = motocicletaId;
    }

    public MotocicletaUsadaId getMotocicletaId() {
        return motocicletaId;
    }

}
