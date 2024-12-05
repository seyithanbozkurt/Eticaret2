public class Siparis {
    public static void odemeYap(Kullanici kullanici){
        double ToplamTutar=0;
        for ( Urun urun : kullanici.getUrunler())
            ToplamTutar+= urun.getFiyat();
        ToplamTutar= kullanici.getToplamTutar(ToplamTutar);
        System.out.println(kullanici.getClass().getSimpleName() + " " + "Toplam Tutar:" + ToplamTutar);
    }
}
