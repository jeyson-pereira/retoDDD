package co.com.sofka.administracioninventarios.catalogomotocicletas.commands;

import co.com.sofka.administracioninventarios.catalogomotocicletas.MotocicletaLocal;
import co.com.sofka.generic.values.CatalogoMotocicletasId;
import co.com.sofka.administracioninventarios.catalogomotocicletas.values.MotocicletaLocalId;
import co.com.sofka.domain.generic.Command;

public class AgregarMotocicletaLocal extends Command {
    private final  CatalogoMotocicletasId catalogoMotocicletasId;
    private final MotocicletaLocalId motocicletaLocalId;
    private final MotocicletaLocal motocicletaLocal;

    public AgregarMotocicletaLocal(CatalogoMotocicletasId catalogoMotocicletasId, MotocicletaLocalId motocicletaLocalId, MotocicletaLocal motocicletaLocal) {
        this.catalogoMotocicletasId = catalogoMotocicletasId;
        this.motocicletaLocalId = motocicletaLocalId;
        this.motocicletaLocal = motocicletaLocal;
    }

    public CatalogoMotocicletasId getCatalogoMotocicletasId() {
        return catalogoMotocicletasId;
    }

    public MotocicletaLocalId getMotocicletaLocalId() {
        return motocicletaLocalId;
    }

    public MotocicletaLocal getMotocicletaLocal() {
        return motocicletaLocal;
    }
}
