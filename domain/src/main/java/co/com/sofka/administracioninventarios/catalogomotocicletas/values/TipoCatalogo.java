package co.com.sofka.administracioninventarios.catalogomotocicletas.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoCatalogo implements ValueObject<String> {
    private final String value;

    public TipoCatalogo(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.length() > 15 ){
            throw new IllegalArgumentException("El nombre tipo de catalogo no puede tener mas de 15 caracteres");
        }
    }

    @Override
    public String value() { return value; }
}
