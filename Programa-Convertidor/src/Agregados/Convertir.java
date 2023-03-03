package Agregados;

import javax.swing.JOptionPane;
import org.apache.commons.lang3.math.NumberUtils;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Convertir {
    DecimalFormat deciFormat = new DecimalFormat("#.0");
    protected final String msgTitulo = "Conversor";
    protected final String msgError = "Error! Ingrese un número";
    protected int posicionArray = 0;
    
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
    
    public void mostrarConversion(String tipoConversion,ArrayList<String> listaTipoConversion,boolean simboloDerecha,
                                    double valorIni, double valorFin, String simboloIni,String simboloFin){
        for(;posicionArray < listaTipoConversion.size();posicionArray++){
            if(tipoConversion == listaTipoConversion.get(posicionArray)){
                if(simboloDerecha){
                    String msgConversion = String.format("%f%s son %f%s",valorIni,simboloIni,deciFormat.format(valorFin),simboloFin);
                    JOptionPane.showMessageDialog(null, msgConversion, this.msgTitulo, JOptionPane.INFORMATION_MESSAGE);
                }else{
                    String msgConversion = String.format("%s%f son %s%f",simboloIni,valorIni,simboloFin,deciFormat.format(valorFin));
                    JOptionPane.showMessageDialog(null, msgConversion, this.msgTitulo, JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } 
    }
    
    public void repetirConversion(){
        
    }
}
