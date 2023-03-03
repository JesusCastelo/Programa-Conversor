package Agregados;

import java.util.ArrayList;
import java.util.List;

public class ConvertirMoneda implements Funcionalidad{

    @Override
    public String[] getListaTiposConversion() {
        List<String> obtenerTiposConversion = new ArrayList<>();
        
        for(TiposMoneda tipoMoneda : TiposMoneda.values()){
            obtenerTiposConversion.add(tipoMoneda.getTipoConversion());
        }
        
        final String[] listaTipoConversion = new String[obtenerTiposConversion.size()];
        
        for(int i = 0; i < listaTipoConversion.length; i++){
            listaTipoConversion[i] = obtenerTiposConversion.get(i);
        }
        
        obtenerTiposConversion.clear();   
        return listaTipoConversion;
    }

    @Override
    public String[] getListaSimbolosIni() {
        List<String> obtenerListaSimbolosIni = new ArrayList<>();
        
        for(TiposMoneda tipoMoneda : TiposMoneda.values()){
            obtenerListaSimbolosIni.add(tipoMoneda.getTipoConversion());
        }
        
        final String[] listaSimbolosIni = new String[obtenerListaSimbolosIni.size()];
        
        for(int i = 0; i < listaSimbolosIni.length; i++){
            listaSimbolosIni[i] = obtenerListaSimbolosIni.get(i);
        }
        
        obtenerListaSimbolosIni.clear();   
        return listaSimbolosIni;
    }

    @Override
    public String[] getListaSimboloFin() {
        List<String> obtenerListaSimboloFin = new ArrayList<>();
        
        for(TiposMoneda tipoMoneda : TiposMoneda.values()){
            obtenerListaSimboloFin.add(tipoMoneda.getTipoConversion());
        }
        
        final String[] listaSimboloFin = new String[obtenerListaSimboloFin.size()];
        
        for(int i = 0; i < listaSimboloFin.length; i++){
            listaSimboloFin[i] = obtenerListaSimboloFin.get(i);
        }
        
        obtenerListaSimboloFin.clear();   
        return listaSimboloFin;
    }
    
    @Override
    public double[] getListaValoresDeConversion() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double ejecutarFormula() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
