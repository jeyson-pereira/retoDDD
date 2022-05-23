package co.com.sofka.administracioninventarios.catalogomotocicletas.events;

import co.com.sofka.administracioninventarios.catalogomotocicletas.MotocicletaProveedor;
import co.com.sofka.administracioninventarios.catalogomotocicletas.values.MotocicletaProveedorId;
import co.com.sofka.domain.generic.DomainEvent;

public class MotocicletaProveedorAgregada extends DomainEvent {
    private final MotocicletaProveedorId motocicletaId;
    private final MotocicletaProveedor motocicleta;

    public MotocicletaProveedorAgregada(MotocicletaProveedorId motocicletaId, MotocicletaProveedor motocicleta) {
        super("co.com.sofka.administracioninventarios.MotocicletaProveedorAgregada");
        this.motocicletaId = motocicletaId;
        this.motocicleta = motocicleta;
    }

    public MotocicletaProveedorId getMotocicletaId() {
        return motocicletaId;
    }

    public MotocicletaProveedor getMotocicleta() {
        return motocicleta;
    }
}
