import java.math.BigDecimal;

public class Cuffie extends Prodotto{

    private String colore;
    private boolean wireless;


    Cuffie(String nome, String marca, BigDecimal prezzo, BigDecimal iva, String colore, boolean wireless) {
        super(nome, marca, prezzo, iva);
        //TODO Auto-generated constructor stub

        this.colore = colore;
        this.wireless = wireless;
    }

    public String getColor(){
        return colore;
    }

    public void setColor(String colore){
        this.colore = colore;
    }

    public boolean isWireless(){
        return wireless;
    }

    public void setWireless(boolean wireless){
        this.wireless = wireless;
    }
}
