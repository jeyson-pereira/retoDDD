package co.com.sofka.administracioninventarios.catalogorepuestos.commands;

import co.com.sofka.generic.values.CatalogoRepuestosId;
import co.com.sofka.administracioninventarios.catalogorepuestos.values.CategoriaRepuestos;
import co.com.sofka.domain.generic.Command;

public class CrearCatalogoRepuestos extends Command {
    private final CatalogoRepuestosId catalogoRepuestosId;
    private final CategoriaRepuestos categoriaCatalogo;

    public CrearCatalogoRepuestos(CatalogoRepuestosId catalogoRepuestosId, CategoriaRepuestos categoriaCatalogo) {
        this.catalogoRepuestosId = catalogoRepuestosId;
        this.categoriaCatalogo = categoriaCatalogo;
    }

    public CatalogoRepuestosId getCatalogoRepuestosId() {
        return catalogoRepuestosId;
    }

    public CategoriaRepuestos getCategoriaCatalogo() {
        return categoriaCatalogo;
    }
}
