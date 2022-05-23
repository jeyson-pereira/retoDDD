package co.com.sofka.administracioninventarios.catalogomotocicletas.commands;

import co.com.sofka.generic.values.CatalogoMotocicletasId;
import co.com.sofka.administracioninventarios.catalogomotocicletas.values.MotocicletaProveedorId;
import co.com.sofka.domain.generic.Command;

public class EliminarMotocicletaProveedor extends Command {
    private final CatalogoMotocicletasId catalogoMotocicletasId;
    private final MotocicletaProveedorId motocicletaProveedorId;

    public EliminarMotocicletaProveedor(CatalogoMotocicletasId catalogoMotocicletasId, MotocicletaProveedorId motocicletaProveedorId) {
        this.catalogoMotocicletasId = catalogoMotocicletasId;
        this.motocicletaProveedorId = motocicletaProveedorId;
    }

    public CatalogoMotocicletasId getCatalogoMotocicletasId() {
        return catalogoMotocicletasId;
    }

    public MotocicletaProveedorId getMotocicletaProveedorId() {
        return motocicletaProveedorId;
    }
}
