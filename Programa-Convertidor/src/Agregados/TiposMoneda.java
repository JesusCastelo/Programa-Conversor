package Agregados;

public enum TiposMoneda implements FuncionalidadTipos{
    SOLES_A_DOLARES("Convertir Soles a Dolares", "S/", "$", 0.26),
    SOLES_A_EUROS("Convertir Soles a Euros", "S/", "€", 0.24),
    SOLES_A_LIBRAESTERLINA("Convertir Soles a Libras Esterlinas","S/","£",0.22),
    SOLES_A_YENJAPONES("Convertir Soles a Yen Japonés","S/","¥",35.88),
    SOLES_A_WONSURCOREANO("Convertir Soles a Won Surcoreano","S/","₩",345.36),
    DOLARES_A_SOLES("Convertir Dolares a Soles", "$", "S/", 3.81),
    EUROS_A_SOLES("Convertir Euros a Soles", "€", "S/", 4.04),
    LIBRAESTERLINA_A_SOLES("Convertir Libras Esterlinas a Soles","£","S/",4.56),
    YENJAPONES_A_SOLES("Convertir Yen Japonés a Soles","¥","S/",0.028),
    WONSURCOREANO_A_SOLES("Convertir Won Surcoreano a Soles","₩","S/",0.0029);
    
    private final String tipoConversion;
    private final String simboloIni;
    private final String simboloFin;
    private final double valorDeConversion;
    
    private TiposMoneda(String tipoConversion,String simboloIni,String simboloFin,double valorDeConversion){
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
