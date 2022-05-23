package co.com.sofka.administracioninventarios.administradorgeneral.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generic.values.CatalogoMotocicletasId;

public class CatalogoMotocicletasAgregado extends DomainEvent {
    private final CatalogoMotocicletasId catalogoMotocicletasId;

    public CatalogoMotocicletasAgregado(CatalogoMotocicletasId catalogoMotocicletasId) {
        super("co.com.sofka.administracioninventarios.CatalogoMotocicletasAgregado");
        this.catalogoMotocicletasId = catalogoMotocicletasId;
    }

    public CatalogoMotocicletasId getCatalogoMotocicletasId() {
        return catalogoMotocicletasId;
    }
}
