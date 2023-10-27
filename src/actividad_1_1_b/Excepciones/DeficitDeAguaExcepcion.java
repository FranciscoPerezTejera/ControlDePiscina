package actividad_1_1_b.Excepciones;

import java.io.IOException;

public class DeficitDeAguaExcepcion extends IOException {

    public DeficitDeAguaExcepcion() {
    }

    public DeficitDeAguaExcepcion(String message) {
        super(message);
    }

    public DeficitDeAguaExcepcion(String message, Throwable cause) {
        super(message, cause);
    }

    public DeficitDeAguaExcepcion(Throwable cause) {
        super(cause);
    }
    
    
    
}
