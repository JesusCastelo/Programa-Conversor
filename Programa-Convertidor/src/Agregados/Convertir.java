package Agregados;

import javax.swing.JOptionPane;
import org.apache.commons.lang3.math.NumberUtils;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Convertir {

    DecimalFormat decimalFormat = new DecimalFormat("#.0");

    protected final String msgTitulo = "Conversor";
    protected final String msgError = "Error! Ingrese un número";

    protected String msgMostrar;
    protected int posicionArray = 0;
    protected double valorIni;

    protected ArrayList<String> listaTipoConversion;
    protected ArrayList<String> listaSimbolosIni;
    protected ArrayList<String> listaSimbolosFin;
    protected ArrayList<Double> listaValoresDeConversion;

    double ejecutarFormula(){
        return 0;
    }
    
    public double obtenerValor(String msgMostrar) {
        double valor = 0;
        while (true) {
            String msgObtenido = JOptionPane.showInputDialog(null, msgMostrar, this.msgTitulo,
                    JOptionPane.QUESTION_MESSAGE);
            if (msgObtenido == null) {
                JOptionPane.showMessageDialog(null, "Finalizo el programa", "Conversion", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            } else {
                if (NumberUtils.isCreatable(msgObtenido)) {
                    valor = Double.parseDouble(msgObtenido);
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, this.msgError, this.msgTitulo, JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        return valor;
    }

    public String obtenerTipoConversion(String msgMostrar, ArrayList<String> listaTipoConversion) {
        String msgObtenido = (String) JOptionPane.showInputDialog(null, msgMostrar, this.msgTitulo, JOptionPane.QUESTION_MESSAGE,
                null, listaTipoConversion.toArray(), listaTipoConversion.get(0));
        
        if(msgObtenido == null){
            JOptionPane.showMessageDialog(null, "Finalizo el programa", "Conversion", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        return msgObtenido;
    }

    public void mostrarConversion(String msgMostrar, ArrayList<String> listaTipoConversion, boolean simboloDerecha,
            double valorIni, ArrayList<String> simboloIni, ArrayList<String> simboloFin) {

        String tipoConversion = obtenerTipoConversion(msgMostrar, listaTipoConversion);       

        for (posicionArray = 0; posicionArray < listaTipoConversion.size(); posicionArray++) {
            if (tipoConversion.equals(listaTipoConversion.get(posicionArray))) {
                double valorFin = ejecutarFormula();
                if (simboloDerecha) {
                    String msgConversion = String.format(decimalFormat.format(valorIni) + "%s son " + decimalFormat.format(valorFin) + "%s",
                                            simboloIni.get(posicionArray), simboloFin.get(posicionArray));
                    JOptionPane.showMessageDialog(null, msgConversion, this.msgTitulo, JOptionPane.INFORMATION_MESSAGE);
                } else {
                    String msgConversion = String.format("%s" + decimalFormat.format(valorIni) + " son %s" + decimalFormat.format(valorFin), 
                                            simboloIni.get(posicionArray), simboloFin.get(posicionArray));
                    JOptionPane.showMessageDialog(null, msgConversion, this.msgTitulo, JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            }
        }
        repetirConversion(msgMostrar, listaTipoConversion, simboloDerecha, valorIni, simboloIni, simboloFin);
    }

    public void repetirConversion(String msgMostrar, ArrayList<String> listaTipoConversion, boolean simboloDerecha,
            double valorIni, ArrayList<String> simboloIni, ArrayList<String> simboloFin) {

        int opcionElegida = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Conversion", JOptionPane.YES_NO_CANCEL_OPTION);

        switch (opcionElegida) {
            case 0:
                mostrarConversion(msgMostrar, listaTipoConversion, simboloDerecha, valorIni, simboloIni, simboloFin);
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Finalizo el programa", "Conversion", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Finalizo el programa", "Conversion", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }
}
