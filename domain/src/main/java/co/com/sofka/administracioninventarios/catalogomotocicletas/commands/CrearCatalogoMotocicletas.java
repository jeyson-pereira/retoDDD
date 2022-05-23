package co.com.sofka.administracioninventarios.catalogomotocicletas.commands;

import co.com.sofka.generic.values.CatalogoMotocicletasId;
import co.com.sofka.administracioninventarios.catalogomotocicletas.values.TipoCatalogo;
import co.com.sofka.domain.generic.Command;

public class CrearCatalogoMotocicletas extends Command {
    private final CatalogoMotocicletasId catalogomotocicletasId;
    private final TipoCatalogo tipoCatalogo;

    public CrearCatalogoMotocicletas(CatalogoMotocicletasId catalogomotocicletasId, TipoCatalogo tipoCatalogo) {
        this.catalogomotocicletasId = catalogomotocicletasId;
        this.tipoCatalogo = tipoCatalogo;
    }

    public CatalogoMotocicletasId getCatalogomotocicletasId() {
        return catalogomotocicletasId;
    }

    public TipoCatalogo getTipoCatalogo() {
        return tipoCatalogo;
    }
}
