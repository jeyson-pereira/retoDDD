package co.com.sofka.administracioninventarios.catalogomotocicletas.commands;

import co.com.sofka.administracioninventarios.catalogomotocicletas.MotocicletaUsada;
import co.com.sofka.generic.values.CatalogoMotocicletasId;
import co.com.sofka.administracioninventarios.catalogomotocicletas.values.MotocicletaUsadaId;
import co.com.sofka.domain.generic.Command;

public class AgregarMotocicletaUsada extends Command {
    private final  CatalogoMotocicletasId catalogoMotocicletasId;
    private final MotocicletaUsadaId motocicletaUsadaId;
    private final MotocicletaUsada motocicletaUsada;

    public AgregarMotocicletaUsada(CatalogoMotocicletasId catalogoMotocicletasId, MotocicletaUsadaId motocicletaUsadaId, MotocicletaUsada motocicletaUsada) {
        this.catalogoMotocicletasId = catalogoMotocicletasId;
        this.motocicletaUsadaId = motocicletaUsadaId;
        this.motocicletaUsada = motocicletaUsada;
    }

    public CatalogoMotocicletasId getCatalogoMotocicletasId() {
        return catalogoMotocicletasId;
    }

    public MotocicletaUsadaId getMotocicletaUsadaId() {
        return motocicletaUsadaId;
    }

    public MotocicletaUsada getMotocicletaUsada() {
        return motocicletaUsada;
    }
}
