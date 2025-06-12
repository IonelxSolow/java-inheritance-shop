import java.math.BigDecimal;

/* public class Televisori extends Prodotto {

    private int dimensioni;
    private boolean smart;

    public Televisori(String nome, String marca, BigDecimal prezzo, BigDecimal iva, int dimensioni, boolean smart) {
        super(nome, marca, prezzo, iva);
        //TODO Auto-generated constructor stub

        this.dimensioni = dimensioni;
        this.smart = smart;
    }

    public int getDimensioni(){
        return dimensioni;
    }

    public void setDimensioni(int dimensioni){
        this.dimensioni = dimensioni;
    }

    public boolean isSmart(){
        return smart;
    }

    public void setSmart(boolean smart){
        this.smart = smart;
    }
} */

public class Televisori extends Prodotto {

    private int pollici;
    private boolean isSmartTv;

    public Televisori(String nome, String marca, BigDecimal prezzo, int pollici, boolean isSmartTv) {
        super(nome, marca, prezzo);

        this.pollici = pollici;
        this.isSmartTv = isSmartTv;
    }

    public int getPollici() {
        return pollici;
    }

    public void setPollici(int pollici) {
        this.pollici = pollici;
    }

    public boolean isSmartTv() {
        return isSmartTv;
    }

    public void setSmart(boolean isSmartTv) {
        this.isSmartTv = isSmartTv;
    }

    @Override
    public String toString(){
        return super.toString() + "\nDimensioni TV : " + getPollici() + "\nSmart : " + isSmartTv();
    }
}