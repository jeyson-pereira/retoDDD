package co.com.sofka.administracioninventarios.catalogorepuestos.events;

import co.com.sofka.administracioninventarios.catalogorepuestos.values.CategoriaRepuestos;
import co.com.sofka.domain.generic.DomainEvent;

public class CatalogoRepuestosCreado extends DomainEvent {
    private final CategoriaRepuestos categoriaCatalogo;
    public CatalogoRepuestosCreado(CategoriaRepuestos categoriaCatalogo) {
        super("co.com.sofka.administracioninventarios.CatalogoRepuestosCreado");
        this.categoriaCatalogo = categoriaCatalogo;
    }

    public CategoriaRepuestos getCategoriaCatalogo() {
        return categoriaCatalogo;
    }
}
