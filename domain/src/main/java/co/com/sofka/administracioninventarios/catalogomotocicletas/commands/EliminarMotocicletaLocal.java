package co.com.sofka.administracioninventarios.catalogomotocicletas.commands;

import co.com.sofka.generic.values.CatalogoMotocicletasId;
import co.com.sofka.administracioninventarios.catalogomotocicletas.values.MotocicletaLocalId;
import co.com.sofka.domain.generic.Command;

public class EliminarMotocicletaLocal extends Command {
    private final CatalogoMotocicletasId catalogoMotocicletasId;
    private final MotocicletaLocalId motocicletaLocalId;

    public EliminarMotocicletaLocal(CatalogoMotocicletasId catalogoMotocicletasId, MotocicletaLocalId motocicletaLocalId) {
        this.catalogoMotocicletasId = catalogoMotocicletasId;
        this.motocicletaLocalId = motocicletaLocalId;
    }

    public CatalogoMotocicletasId getCatalogoMotocicletasId() {
        return catalogoMotocicletasId;
    }

    public MotocicletaLocalId getMotocicletaLocalId() {
        return motocicletaLocalId;
    }
}
