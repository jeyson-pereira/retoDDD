package co.com.sofka.administracioninventarios.catalogomotocicletas.commands;

import co.com.sofka.administracioninventarios.catalogomotocicletas.MotocicletaProveedor;
import co.com.sofka.generic.values.CatalogoMotocicletasId;
import co.com.sofka.administracioninventarios.catalogomotocicletas.values.MotocicletaProveedorId;
import co.com.sofka.domain.generic.Command;

public class AgregarMotocicletaProveedor extends Command {
    private final  CatalogoMotocicletasId catalogoMotocicletasId;
    private final MotocicletaProveedorId motocicletaProveedorId;
    private final MotocicletaProveedor motocicletaProveedor;

    public AgregarMotocicletaProveedor(CatalogoMotocicletasId catalogoMotocicletasId, MotocicletaProveedorId motocicletaProveedorId, MotocicletaProveedor motocicletaProveedor) {
        this.catalogoMotocicletasId = catalogoMotocicletasId;
        this.motocicletaProveedorId = motocicletaProveedorId;
        this.motocicletaProveedor = motocicletaProveedor;
    }

    public CatalogoMotocicletasId getCatalogoMotocicletasId() {
        return catalogoMotocicletasId;
    }

    public MotocicletaProveedorId getMotocicletaProveedorId() {
        return motocicletaProveedorId;
    }

    public MotocicletaProveedor getMotocicletaProveedor() {
        return motocicletaProveedor;
    }
}
