package co.com.sofka.administracioninventarios.catalogomotocicletas.events;

import co.com.sofka.administracioninventarios.catalogomotocicletas.values.TipoCatalogo;
import co.com.sofka.domain.generic.DomainEvent;

public class CatalogoMotocicletasCreado extends DomainEvent {
    private final TipoCatalogo tipoCatalogo;

    public CatalogoMotocicletasCreado(TipoCatalogo tipoCatalogo) {
        super("co.com.sofka.administracioninventarios.CatalogoMotocicletasCreado");
        this.tipoCatalogo = tipoCatalogo;
    }

    public TipoCatalogo getTipoCatalogo() {
        return tipoCatalogo;
    }
}
