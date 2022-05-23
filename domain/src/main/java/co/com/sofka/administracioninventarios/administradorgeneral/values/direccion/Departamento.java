package co.com.sofka.administracioninventarios.administradorgeneral.values.direccion;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Departamento implements ValueObject<String> {
    private final String value;

    public Departamento(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El departamento no puede estar en blanco");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
