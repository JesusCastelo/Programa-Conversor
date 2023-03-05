package Agregados;

import java.util.ArrayList;

public class ConvertirTemperatura extends Convertir implements Funcionalidad {

    @Override
    public ArrayList<String> getListaTiposConversion() {
        ArrayList<String> obtenerTiposConversion = new ArrayList<>();

        for (TiposTemperatura tipoTemperatura : TiposTemperatura.values()) {
            obtenerTiposConversion.add(tipoTemperatura.getTipoConversion());
        }

        return obtenerTiposConversion;
    }

    @Override
    public ArrayList<String> getListaSimbolosIni() {
        ArrayList<String> obtenerListaSimbolosIni = new ArrayList<>();

        for (TiposTemperatura tipoTemperatura : TiposTemperatura.values()) {
            obtenerListaSimbolosIni.add(tipoTemperatura.getSimboloInicial());
        }

        return obtenerListaSimbolosIni;
    }

    @Override
    public ArrayList<String> getListaSimboloFin() {
        ArrayList<String> obtenerListaSimboloFin = new ArrayList<>();

        for (TiposTemperatura tipoTemperatura : TiposTemperatura.values()) {
            obtenerListaSimboloFin.add(tipoTemperatura.getSimboloFinal());
        }

        return obtenerListaSimboloFin;
    }

    @Override
    public ArrayList<Double> getListaValoresDeConversion() {
        ArrayList<Double> obtenerListaValoresDeConversion = new ArrayList<>();

        for (TiposTemperatura tipoTemperatura : TiposTemperatura.values()) {
            obtenerListaValoresDeConversion.add(tipoTemperatura.getValorDeConversion());
        }

        return obtenerListaValoresDeConversion;
    }

    @Override
    public double ejecutarFormula() {
        switch (posicionArray) {
            case 0:
                return valorIni * getListaValoresDeConversion().get(posicionArray) + 32;
            case 1:
                return valorIni + getListaValoresDeConversion().get(posicionArray);
            case 2:
                return valorIni / getListaValoresDeConversion().get(posicionArray);
            case 3:
                return (valorIni - 32) / getListaValoresDeConversion().get(posicionArray);
            case 4:
                return valorIni - getListaValoresDeConversion().get(posicionArray);
            case 5:
                return valorIni / getListaValoresDeConversion().get(posicionArray);
            default:
                return 0;
        }
    }

    @Override
    public void ejecutarConversion() {
        msgMostrar = "Ingrese el valor que desea convertir";
        valorIni = obtenerValor(msgMostrar);
        listaTipoConversion = getListaTiposConversion();
        listaSimbolosIni = getListaSimbolosIni();
        listaSimbolosFin = getListaSimboloFin();
        msgMostrar = "Elija el tipo de conversion";
        mostrarConversion(msgMostrar, listaTipoConversion, true, valorIni, listaSimbolosIni,
                listaSimbolosFin);
    }
}
