package Agregados;
import java.util.List;

public interface Funcionalidad {
    List<String> getListaTiposConversion();
    List<String> getListaSimbolosIni();
    List<String> getListaSimboloFin();
    List<Double> getListaValoresDeConversion();
    void ejecutarConversion();
}
