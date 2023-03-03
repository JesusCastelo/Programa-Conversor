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
    protected double valorFin;
    
    protected ArrayList<String> listaTipoConversion;
    protected ArrayList<String> listaSimbolosIni;
    protected ArrayList<String> listaSimbolosFin;
    protected ArrayList<Double> listaValoresDeConversion;
    
    public double obtenerValor(String msgMostrar){
        double valor;
        while(true){
            String msgObtenido = JOptionPane.showInputDialog(null, msgMostrar, this.msgTitulo,
                                                            JOptionPane.QUESTION_MESSAGE);    
            if(NumberUtils.isCreatable(msgObtenido)){
                valor = Double.parseDouble(msgObtenido);
                break;
            }else{
                JOptionPane.showMessageDialog(null, this.msgError, this.msgTitulo, JOptionPane.ERROR_MESSAGE);
            }
        }
        return valor;
    }
    
    public String obtenerTipoConversion(String msgMostrar,ArrayList<String> listaTipoConversion){
        String msgObtenido = (String)JOptionPane.showInputDialog(null, msgMostrar, this.msgTitulo, JOptionPane.QUESTION_MESSAGE,
                                                                null, listaTipoConversion.toArray(), listaTipoConversion.get(0));
        return msgObtenido;
    }
    
    public void mostrarConversion(String msgMostrar,ArrayList<String> listaTipoConversion,boolean simboloDerecha,
                                    double valorIni, double valorFin, String simboloIni,String simboloFin){
        
        String tipoConversion = obtenerTipoConversion(msgMostrar, listaTipoConversion);
        
        for(;posicionArray < listaTipoConversion.size();posicionArray++){
            if(tipoConversion == listaTipoConversion.get(posicionArray)){
                if(simboloDerecha){
                    String msgConversion = String.format("%f%s son " + decimalFormat.format(valorFin) + "%s",valorIni,simboloIni,simboloFin);
                    JOptionPane.showMessageDialog(null, msgConversion, this.msgTitulo, JOptionPane.INFORMATION_MESSAGE);
                }else{
                    String msgConversion = String.format("%s%f son %s" + decimalFormat.format(valorFin),simboloIni,valorIni,simboloFin);
                    JOptionPane.showMessageDialog(null, msgConversion, this.msgTitulo, JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        
        repetirConversion(msgMostrar, listaTipoConversion, simboloDerecha, valorIni, valorFin, simboloIni, simboloFin);
    }
    
    public void repetirConversion(String msgMostrar,ArrayList<String> listaTipoConversion,boolean simboloDerecha,
                                    double valorIni, double valorFin, String simboloIni,String simboloFin){
        
        int opcionElegida = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Conversion",JOptionPane.YES_NO_CANCEL_OPTION);
        
        switch(opcionElegida){
            case 0:
                mostrarConversion(msgMostrar, listaTipoConversion, simboloDerecha, valorIni, valorFin, simboloIni, simboloFin);
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
