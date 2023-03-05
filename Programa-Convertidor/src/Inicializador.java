
import Agregados.ConvertirMoneda;
import Agregados.ConvertirTemperatura;
import javax.swing.JOptionPane;

public class Inicializador {

    private static String[] lista = {"Convertidor de Moneda", "Convertidor de Temperatura"};

    public static void main(String args[]) {

        String seleccion = (String) JOptionPane.showInputDialog(null, "Elija que desea convertir", "Conversor",
                JOptionPane.QUESTION_MESSAGE, null, lista, lista[0]);
        if (seleccion == null) {
            JOptionPane.showMessageDialog(null, "Finalizo el programa", "Conversion", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } else {
            switch (seleccion) {
                case "Convertidor de Moneda":
                    ConvertirMoneda convertidorMon = new ConvertirMoneda();
                    convertidorMon.ejecutarConversion();
                    break;
                case "Convertidor de Temperatura":
                    ConvertirTemperatura convertidorTemp = new ConvertirTemperatura();
                    convertidorTemp.ejecutarConversion();
                    break;
            }
        }
    }

}
