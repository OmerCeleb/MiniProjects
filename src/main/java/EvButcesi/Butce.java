package EvButcesi;

public class Butce {

    public static void main(String[] args) {

        EvButcesi cocuk = new EvButcesi();
        cocuk.burs(1250);


        EvButcesi anne = new EvButcesi();
        anne.maas(2500);

        EvButcesi baba = new EvButcesi();
        baba.maas(3000);


        System.out.println("Evin toplam geliri : " + EvButcesi.butce);

        EvButcesi kira =new EvButcesi();
        kira.kira(1750);

        EvButcesi faturalar = new EvButcesi();

        faturalar.fatura(2500);

        System.out.println("Elimizde kalan para : " +EvButcesi.butce);






    }
}
