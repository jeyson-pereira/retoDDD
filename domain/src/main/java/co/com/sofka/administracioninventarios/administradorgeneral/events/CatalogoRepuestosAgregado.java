package co.com.sofka.administracioninventarios.administradorgeneral.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generic.values.CatalogoRepuestosId;

public class CatalogoRepuestosAgregado extends DomainEvent {
    private final CatalogoRepuestosId catalogoRepuestosId;

    public CatalogoRepuestosAgregado(CatalogoRepuestosId catalogoRepuestosId) {
        super("co.com.sofka.administracioninventarios.CatalogoRepuestosAgregado");
        this.catalogoRepuestosId = catalogoRepuestosId;
    }

    public CatalogoRepuestosId getCatalogoRepuestosId() {
        return catalogoRepuestosId;
    }
}
