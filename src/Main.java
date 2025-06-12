import java.math.BigDecimal;

public class Main {
    /* public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println();

        Smartphone smartphone1 = new Smartphone("Iphone 113", "Apple", new BigDecimal("1300"), new BigDecimal("22"), "123456789012345", 64);
        Smartphone smartphone2 = new Smartphone("Iphone 213", "Appleeee", new BigDecimal("1800"), new BigDecimal("21"), "901234512345678", 46);

        System.out.println("Smartphone1: " + smartphone1.getNome() + ", IMEI: " + smartphone1.getCodiceIMEI()
                + ", Codice prodotto: " + smartphone1.getCodice());
        System.out.println("Smartphone2: " + smartphone2.getNome() + ", IMEI: " + smartphone2.getCodiceIMEI()
                + ", Codice prodotto: " + smartphone2.getCodice());

        // test Setter Smartphone        
        smartphone1.setNome("Iphone 13 Pro");
        smartphone1.setMarca("Apple Inc.");
        smartphone1.setPrezzo(new BigDecimal("1400"));
        smartphone1.setIva(new BigDecimal("20"));
        smartphone1.setCodiceIMEI("999999999999999");
        smartphone1.setMemoria(128);

        System.out.println();
        System.out.println("Dopo Setter:");
        System.out.println();

        // test getter Smartphone
        System.out.println(smartphone1.getNome());
        System.out.println(smartphone1.getMarca());
        System.out.println(smartphone1.getPrezzo());
        System.out.println(smartphone1.getIva());
        System.out.println(smartphone1.getCodice());
        System.out.println(smartphone1.getCodiceIMEI());
        System.out.println(smartphone1.getMemoria());
        
        System.out.println();

        Televisori televisore1 = new Televisori("Samsung", "Topo di gamma", new BigDecimal("1800"), new BigDecimal("23"), 55, true);
      
        System.out.println("Televisore: " + televisore1.getNome() + ", Smart: " + televisore1.isSmart());

        System.out.println();

        Cuffie cuffie = new Cuffie("Songna", "Sony", new BigDecimal(120), new BigDecimal(25), "Blu", false);

        System.out.println("Cufie: " + cuffie.getNome() + ", Codice: " + cuffie.getCodice() + ", " + cuffie.getColor() + ", Wireless: " + cuffie.isWireless());

        System.out.println();
      

        

        

    } */

    public static void main(String[] args) {
        // Test Smartphone
        Smartphone smartphone1 = new Smartphone("iPhone 15", "Apple", new BigDecimal("1200"), "123456789012345", 256);
        System.out.println("=== Smartphone 1 ===");
        System.out.println(smartphone1);
        smartphone1.setNome("iPhone 15 Pro");
        smartphone1.setMarca("Apple Inc.");
        smartphone1.setPrezzo(new BigDecimal("1350"));
        smartphone1.setIva(new BigDecimal("0.22"));
        smartphone1.setCodiceIMEI("999999999999999");
        smartphone1.setMemoriaInGb(512);
        System.out.println("Dopo modifiche:");
        System.out.println(smartphone1);
        System.out.println();

        // Test Televisori
        Televisori tv1 = new Televisori("OLED G3", "LG", new BigDecimal("1800"), 65, true);
        System.out.println("=== Televisore 1 ===");
        System.out.println(tv1);
        tv1.setNome("OLED G4");
        tv1.setMarca("LG Electronics");
        tv1.setPrezzo(new BigDecimal("2100"));
        tv1.setIva(new BigDecimal("0.19"));
        tv1.setPollici(77);
        tv1.setSmart(true);
        System.out.println("Dopo modifiche:");
        System.out.println(tv1);
        System.out.println();

        // Test Cuffie
        Cuffie cuffie1 = new Cuffie("WH-1000XM5", "Sony", new BigDecimal("350"), "Nero", true);
        System.out.println("=== Cuffie 1 ===");
        System.out.println(cuffie1);
        cuffie1.setNome("WH-1000XM6");
        cuffie1.setMarca("Sony Corporation");
        cuffie1.setPrezzo(new BigDecimal("400"));
        cuffie1.setIva(new BigDecimal("0.22"));
        cuffie1.setColore("Blu");
        cuffie1.setWireless(false);
        System.out.println("Dopo modifiche:");
        System.out.println(cuffie1);
        System.out.println();
    }

}
