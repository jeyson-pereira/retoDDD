package co.com.sofka.administracioninventarios.catalogomotocicletas.values.motocicleta;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Kilometraje implements ValueObject<Double> {
    private final Double value;

    public Kilometraje(Double value) {
        this.value = Objects.requireNonNull(value);
        if(this.value < 0 ){
            throw new IllegalArgumentException("El kilometraje no puede ser negativo");
        }
    }

    @Override
    public Double value() { return value; }
}
