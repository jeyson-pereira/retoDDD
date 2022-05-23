package co.com.sofka.administracioninventarios.administradorgeneral.values.direccion;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Municipio implements ValueObject<String> {
    private final String value;

    public Municipio(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El municipio no puede estar en blanco");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
