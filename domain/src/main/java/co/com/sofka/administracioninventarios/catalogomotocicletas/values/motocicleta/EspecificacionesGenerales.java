package co.com.sofka.administracioninventarios.catalogomotocicletas.values.motocicleta;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class EspecificacionesGenerales implements ValueObject<EspecificacionesGenerales.Props> {
    private final String color;
    private final Integer cilindraje;
    private final String arranque;
    private final Integer capacidadCombustibleLitros;

    public EspecificacionesGenerales(String color, Integer cilindraje, String arranque, Integer capacidadCombustibleLitros) {
        this.color = Objects.requireNonNull(color);
        this.cilindraje = Objects.requireNonNull(cilindraje);
        this.arranque = Objects.requireNonNull(arranque);
        this.capacidadCombustibleLitros = Objects.requireNonNull(capacidadCombustibleLitros);

        if(this.cilindraje <= 0 ){
            throw new IllegalArgumentException("El cilindraje no puede ser negativo o 0");
        }
        if(this.capacidadCombustibleLitros <= 0 ){
            throw new IllegalArgumentException("La capacidad de combustible no puede ser negativo o 0");
        }
    }

    public EspecificacionesGenerales of(String color, Integer cilindraje, String arranque, Integer capacidadCombustibleLitros) {
        return new EspecificacionesGenerales(color, cilindraje, arranque, capacidadCombustibleLitros);
    }

    @Override
    public Props value() {
        return new Props(){

            @Override
            public String color(){
                return color;
            }

            @Override
            public Integer cilindraje(){
                return cilindraje;
            }

            @Override
            public String arranque(){
                return arranque;
            }

            @Override
            public Integer capacidadCombustibleLitros(){
                return capacidadCombustibleLitros;
            }
        };
    }

    public interface Props{
        String color();
        Integer cilindraje();
        String arranque();
        Integer capacidadCombustibleLitros();
    }
}
