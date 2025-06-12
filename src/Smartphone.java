import java.math.BigDecimal;

/* public class Smartphone extends Prodotto {

    private String codiceIMEI;
    private int memoria;

    public Smartphone(String nome, String marca, BigDecimal prezzo, BigDecimal iva, String codiceIMEI, int memoria) {
        super(nome, marca, prezzo, iva);
        //TODO Auto-generated constructor stub
        this.codiceIMEI = codiceIMEI;
        this.memoria = memoria;
    }

    public String getCodiceIMEI(){
        return codiceIMEI;
    }

    public void setCodiceIMEI(String codiceIMEI){
        this.codiceIMEI = codiceIMEI;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
} */



    public class Smartphone extends Prodotto {

        private String codiceIMEI;
        private int memoriaInGb;

        public Smartphone(String nome, String marca, BigDecimal prezzo, String codiceIMEI, int memoriaInGb) {
            super(nome, marca, prezzo);
            this.codiceIMEI = codiceIMEI;
            this.memoriaInGb = memoriaInGb;
        }

        public String getCodiceIMEI() {
            return codiceIMEI;
        }

        public void setCodiceIMEI(String codiceIMEI) {
            this.codiceIMEI = codiceIMEI;
        }

        public int getMemoriaInGb() {
            return memoriaInGb;
        }

        public void setMemoriaInGb(int memoriaInGb) {
            this.memoriaInGb = memoriaInGb;
        }

        @Override
        public String toString(){
            return super.toString() + "\nCodice IMEI : " + getCodiceIMEI() + "\n Memoria : " + getMemoriaInGb();
        }

    
}