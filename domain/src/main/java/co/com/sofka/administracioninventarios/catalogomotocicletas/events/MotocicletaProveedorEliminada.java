package co.com.sofka.administracioninventarios.catalogomotocicletas.events;

import co.com.sofka.administracioninventarios.catalogomotocicletas.values.MotocicletaProveedorId;
import co.com.sofka.domain.generic.DomainEvent;

public class MotocicletaProveedorEliminada extends DomainEvent {
    private final MotocicletaProveedorId motocicletaId;

    public MotocicletaProveedorEliminada(MotocicletaProveedorId motocicletaId) {
        super("co.com.sofka.administracioninventarios.MotocicletaProveedorEliminada");
        this.motocicletaId = motocicletaId;
    }

    public MotocicletaProveedorId getMotocicletaId() {
        return motocicletaId;
    }

}
