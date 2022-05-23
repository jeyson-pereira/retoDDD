package co.com.sofka.administracioninventarios.catalogomotocicletas.commands;

import co.com.sofka.generic.values.CatalogoMotocicletasId;
import co.com.sofka.administracioninventarios.catalogomotocicletas.values.MotocicletaUsadaId;
import co.com.sofka.domain.generic.Command;

public class EliminarMotocicletaUsada extends Command {
    private final CatalogoMotocicletasId catalogoMotocicletasId;
    private final MotocicletaUsadaId motocicletaUsadaId;

    public EliminarMotocicletaUsada(CatalogoMotocicletasId catalogoMotocicletasId, MotocicletaUsadaId motocicletaUsadaId) {
        this.catalogoMotocicletasId = catalogoMotocicletasId;
        this.motocicletaUsadaId = motocicletaUsadaId;
    }

    public CatalogoMotocicletasId getCatalogoMotocicletasId() {
        return catalogoMotocicletasId;
    }

    public MotocicletaUsadaId getMotocicletaUsadaId() {
        return motocicletaUsadaId;
    }
}
