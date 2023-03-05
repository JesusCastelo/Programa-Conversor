package Agregados;

public enum TiposTemperatura implements FuncionalidadTipos {
    CELSIUS_A_FAHRENHEIT("Convertir de Celsius a Fahrenheit", "ºC", "ºF", 1.8),
    CELSIUS_A_KELVIN("Convertir de Celsius a Kelvin", "ºC", "K", 273.15),
    CELSIUS_A_REAUMUR("Convertir de Celsius a Reaumur", "ºC", "ºRe",1.25),
    FAHRENHEIT_A_CELSIUS("Convertir de Fahrenheit a Celsius", "ºF", "ºC", 1.8),
    KELVIN_A_CELSIUS("Convertir de Kelvin a Celsius", "K", "ºC", 273.15),
    REAUMUR_A_CELSIUS("Convertir de Reamur a Celsius", "ºRe", "ºC",0.8);
        
    private final String tipoConversion;
    private final String simboloIni;
    private final String simboloFin;
    private final double valorDeConversion;
    
    private TiposTemperatura(String tipoConversion,String simboloIni,String simboloFin,double valorDeConversion){
        this.tipoConversion = tipoConversion;
        this.simboloIni = simboloIni;
        this.simboloFin = simboloFin;
        this.valorDeConversion = valorDeConversion;
    }

    @Override
    public String getTipoConversion() {return this.tipoConversion;}

    @Override
    public String getSimboloInicial() {return this.simboloIni;}

    @Override
    public String getSimboloFinal() {return this.simboloFin;}

    @Override
    public double getValorDeConversion() {return this.valorDeConversion;}
}
