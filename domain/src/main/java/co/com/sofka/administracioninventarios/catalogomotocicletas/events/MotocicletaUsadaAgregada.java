package co.com.sofka.administracioninventarios.catalogomotocicletas.events;

import co.com.sofka.administracioninventarios.catalogomotocicletas.MotocicletaUsada;
import co.com.sofka.administracioninventarios.catalogomotocicletas.values.MotocicletaUsadaId;
import co.com.sofka.domain.generic.DomainEvent;

public class MotocicletaUsadaAgregada extends DomainEvent {
    private final MotocicletaUsadaId motocicletaId;
    private final MotocicletaUsada motocicleta;

    public MotocicletaUsadaAgregada(MotocicletaUsadaId motocicletaId, MotocicletaUsada motocicleta) {
        super("co.com.sofka.administracioninventarios.MotocicletaUsadaAgregada");
        this.motocicletaId = motocicletaId;
        this.motocicleta = motocicleta;
    }

    public MotocicletaUsadaId getMotocicletaId() {
        return motocicletaId;
    }

    public MotocicletaUsada getMotocicleta() {
        return motocicleta;
    }
}
