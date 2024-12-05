//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Kullanici gül= new PrimeKullanici();
        Kullanici seysey= new StandartKullanici();

        Urun telefon = new Urun("iPHONE", 5500);
        Urun bilgisayar = new Urun("HP", 3200);

        gül.addUrun(telefon);
        gül.addUrun(bilgisayar);
        seysey.addUrun(telefon);

        Siparis.odemeYap(gül);
        Siparis.odemeYap(seysey);
    }
}