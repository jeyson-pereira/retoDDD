package co.com.sofka.administracioninventarios.catalogomotocicletas.values.motocicleta;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Tecnomecanicos implements ValueObject<Tecnomecanicos.Props> {
    private final String motor;
    private final String transmision;
    private final String suspensionDelantera;
    private final String suspensionTrasera;
    private final String frenoDelantero;
    private final String frenoTrasero;

    public Tecnomecanicos(String motor, String transmision, String suspensionDelantera, String suspensionTrasera, String frenoDelantero, String frenoTrasero) {
        this.motor = Objects.requireNonNull(motor);
        this.transmision = Objects.requireNonNull(transmision);
        this.suspensionDelantera = Objects.requireNonNull(suspensionDelantera);
        this.suspensionTrasera = Objects.requireNonNull(suspensionTrasera);
        this.frenoDelantero = Objects.requireNonNull(frenoDelantero);
        this.frenoTrasero = Objects.requireNonNull(frenoTrasero);
    }

    public Tecnomecanicos of(String motor, String transmision, String suspensionDelantera, String suspensionTrasera, String frenoDelantero, String frenoTrasero) {
        return new Tecnomecanicos(motor, transmision, suspensionDelantera, suspensionTrasera, frenoDelantero, frenoTrasero);
    }

    @Override
    public Props value() {
        return new Props(){

            @Override
            public String motor(){
                return motor;
            }

            @Override
            public String transmision(){
                return transmision;
            }

            @Override
            public String suspensionDelantera(){
                return suspensionDelantera;
            }

            @Override
            public String suspensionTrasera(){
                return suspensionTrasera;
            }

            @Override
            public String frenoDelantero(){
                return frenoDelantero;
            }

            @Override
            public String frenoTrasero(){
                return frenoTrasero;
            }
        };
    }

    public interface Props{
        String motor();
        String transmision();
        String suspensionDelantera();
        String suspensionTrasera();
        String frenoDelantero();
        String frenoTrasero();
    }
}
