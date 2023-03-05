package Agregados;

import java.util.ArrayList;

public class ConvertirMoneda extends Convertir implements Funcionalidad {

    @Override
    public ArrayList<String> getListaTiposConversion() {
        ArrayList<String> obtenerTiposConversion = new ArrayList<>();

        for (TiposMoneda tipoMoneda : TiposMoneda.values()) {
            obtenerTiposConversion.add(tipoMoneda.getTipoConversion());
        }

        return obtenerTiposConversion;
    }

    @Override
    public ArrayList<String> getListaSimbolosIni() {
        ArrayList<String> obtenerListaSimbolosIni = new ArrayList<>();

        for (TiposMoneda tipoMoneda : TiposMoneda.values()) {
            obtenerListaSimbolosIni.add(tipoMoneda.getSimboloInicial());
        }

        return obtenerListaSimbolosIni;
    }

    @Override
    public ArrayList<String> getListaSimboloFin() {
        ArrayList<String> obtenerListaSimboloFin = new ArrayList<>();

        for (TiposMoneda tipoMoneda : TiposMoneda.values()) {
            obtenerListaSimboloFin.add(tipoMoneda.getSimboloFinal());
        }

        return obtenerListaSimboloFin;
    }

    @Override
    public ArrayList<Double> getListaValoresDeConversion() {
        ArrayList<Double> obtenerListaValoresDeConversion = new ArrayList<>();

        for (TiposMoneda tipoMoneda : TiposMoneda.values()) {
            obtenerListaValoresDeConversion.add(tipoMoneda.getValorDeConversion());
        }

        return obtenerListaValoresDeConversion;
    }

    @Override
    public double ejecutarFormula() {
        return valorIni * getListaValoresDeConversion().get(posicionArray);
    }

    @Override
    public void ejecutarConversion() {
        msgMostrar = "Ingrese el monto que desea convertir";
        valorIni = obtenerValor(msgMostrar);
        listaTipoConversion = getListaTiposConversion();
        listaSimbolosIni = getListaSimbolosIni();
        listaSimbolosFin = getListaSimboloFin();
        msgMostrar = "Elija el tipo de conversion";
        mostrarConversion(msgMostrar, listaTipoConversion, false, valorIni,
                listaSimbolosIni, listaSimbolosFin);
    }
}
