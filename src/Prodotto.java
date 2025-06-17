import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

/* public class Prodotto {
    private int codice;
    private String nome;
    private String marca;
    private BigDecimal prezzo;
    private BigDecimal iva;

    public Prodotto(String nome, String marca, BigDecimal prezzo, BigDecimal iva){
        Random rand = new Random();
        this.codice = rand.nextInt(999999);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public int getCodice(){
        return codice;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public BigDecimal getPrezzo(){
        return prezzo;
    }

    public void setPrezzo(BigDecimal prezzo){
        this.prezzo = prezzo;
    }

    public BigDecimal getIva(){
        return iva;
    }

    public void setIva(BigDecimal iva){
        this.iva = iva;
    }

} */

//correzion

/* public class Prodotto {
    private int codice;
    private String nome;
    private String marca;
    private BigDecimal prezzo;
    private BigDecimal iva;
    
    public Prodotto(String nome, String marca, BigDecimal prezzo) {
        Random rand = new Random();
        this.codice = rand.nextInt(999999);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = new BigDecimal(0.22);
    }

    public Prodotto(String nome, String marca, BigDecimal prezzo, BigDecimal iva){
        Random rand = new Random();
        this.codice = rand.nextInt(999999);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // Mettodi getter e setter publici per ogni variabile di istanza
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public BigDecimal getPrezzoIvato(){
        if(prezzo != null && iva != null){
            //stiamo verificando che siano inizializzate le nostre variabili di istanza
            return prezzo.add(prezzo.multiply(iva)).setScale(2, RoundingMode.DOWN);
        } // non ci servirà eseguire la nostra operazione e ritorneremo null
        return null;
    }

    @Override
    public String toString(){
        if(nome != null){
        return codice + " - " + nome;
    }
    return null;    
    }
} */


//esercizio Java OOP Inheritance Shop(Override)
public class Prodotto {
    private static final Random randomGenerator = new Random();

    private int codice;
    private String nome;
    private String descrizione;
    private BigDecimal prezzo;
    private BigDecimal iva;

    public Prodotto(String nome, String descrizione, BigDecimal prezzo) {
      
        this.codice = Prodotto.randomGenerator.nextInt(999999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = new BigDecimal(0.22);
    }

    public Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva) {
        Random rand = new Random();
        this.codice = rand.nextInt(999999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // Mettodi getter e setter publici per ogni variabile di istanza
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public BigDecimal getPrezzoIvato() {
        if (prezzo != null && iva != null) {
            // stiamo verificando che siano inizializzate le nostre variabili di istanza
            return prezzo.add(prezzo.multiply(iva)).setScale(2, RoundingMode.DOWN);
        } // non ci servirà eseguire la nostra operazione e ritorneremo null
        return null;
    }

    public BigDecimal getPrezzoScontato(boolean hasFidelityCard){
        if(!hasFidelityCard){
            return getPrezzoIvato();
        }
        //Sconto base 2%
        return getPrezzoIvato().multiply(new BigDecimal("0.98")).setScale(2, RoundingMode.DOWN);
    }

    @Override
    public String toString() {
        if (nome != null) {
            return codice + " - " + nome;
        }
        return null;
    }
}