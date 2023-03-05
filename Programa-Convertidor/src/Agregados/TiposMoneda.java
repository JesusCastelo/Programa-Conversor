package Agregados;

public enum TiposMoneda implements FuncionalidadTipos{
    SOL_A_DOLAR("Convertir de Sol a Dolar", "S/", "$", 0.26),
    SOL_A_EURO("Convertir de Sol a Euro", "S/", "€", 0.25),
    SOL_A_LIBRAESTERLINA("Convertir de Sol a Libra Esterlina","S/","£",0.22),
    SOL_A_YENJAPONES("Convertir de Sol a Yen Japonés","S/","¥",35.88),
    SOL_A_WONSURCOREANO("Convertir de Sol a Won Surcoreano","S/","₩",342.39),
    DOLAR_A_SOL("Convertir de Dolar a Sol", "$", "S/", 3.81),
    EURO_A_SOL("Convertir de Euro a Sol", "€", "S/", 4.04),
    LIBRAESTERLINA_A_SOL("Convertir de Libra Esterlina a Sol","£","S/",4.56),
    YENJAPONES_A_SOL("Convertir de Yen Japonés a Sol","¥","S/",0.028),
    WONSURCOREANO_A_SOL("Convertir de Won Surcoreano a Sol","₩","S/",0.0029);
    
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
