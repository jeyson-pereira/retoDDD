package co.com.sofka.administracioninventarios.catalogomotocicletas.events;

import co.com.sofka.administracioninventarios.catalogomotocicletas.MotocicletaLocal;
import co.com.sofka.administracioninventarios.catalogomotocicletas.values.MotocicletaLocalId;
import co.com.sofka.domain.generic.DomainEvent;

public class MotocicletaLocalAgregada extends DomainEvent {
    private final MotocicletaLocalId motocicletaId;
    private final MotocicletaLocal motocicleta;

    public MotocicletaLocalAgregada(MotocicletaLocalId motocicletaId, MotocicletaLocal motocicleta) {
        super("co.com.sofka.administracioninventarios.MotocicletaLocalAgregada");
        this.motocicletaId = motocicletaId;
        this.motocicleta = motocicleta;
    }

    public MotocicletaLocalId getMotocicletaId() {
        return motocicletaId;
    }

    public MotocicletaLocal getMotocicleta() {
        return motocicleta;
    }
}
