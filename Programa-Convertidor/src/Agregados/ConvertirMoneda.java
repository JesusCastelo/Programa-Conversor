package Agregados;

import java.util.ArrayList;
import java.util.List;

public class ConvertirMoneda extends Convertir implements Funcionalidad{

    private double valorConvertir;
    private String msgMostrar;
    
    @Override
    public List<String> getListaTiposConversion() {
        List<String> obtenerTiposConversion = new ArrayList<>();
        
        for(TiposMoneda tipoMoneda : TiposMoneda.values()){
            obtenerTiposConversion.add(tipoMoneda.getTipoConversion());
        }
         
        return obtenerTiposConversion;
    }

    @Override
    public List<String> getListaSimbolosIni() {
        List<String> obtenerListaSimbolosIni = new ArrayList<>();
        
        for(TiposMoneda tipoMoneda : TiposMoneda.values()){
            obtenerListaSimbolosIni.add(tipoMoneda.getTipoConversion());
        }
   
        return obtenerListaSimbolosIni;
    }

    @Override
    public List<String> getListaSimboloFin() {
        List<String> obtenerListaSimboloFin = new ArrayList<>();
        
        for(TiposMoneda tipoMoneda : TiposMoneda.values()){
            obtenerListaSimboloFin.add(tipoMoneda.getTipoConversion());
        }
  
        return obtenerListaSimboloFin;
    }
    
    @Override
    public List<Double> getListaValoresDeConversion() {
        List<Double> obtenerListaValoresDeConversion = new ArrayList<>();
        
        for(TiposMoneda tipoMoneda : TiposMoneda.values()){
            obtenerListaValoresDeConversion.add(tipoMoneda.getValorDeConversion());
        }
  
        return obtenerListaValoresDeConversion;
    }

    @Override
    public double ejecutarFormula() {
        
        return 1*1;
    }
    
    public void ejecutarConversion(){
        msgMostrar = "Ingrese el monto que desea ocnvertir";
        valorConvertir = obtenerValor(msgMostrar);
    }
}
