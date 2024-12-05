import java.util.ArrayList;
import java.util.List;

public abstract class Kullanici {
    private String isim;
    private String mail;
    private List<Urun> urunler;

    public String getIsim() {return isim;}

    public void setIsim(String isim) {this.isim = isim;}

    public String getMail() {return mail;}

    public void setMail(String mail) {this.mail = mail;}

    public List<Urun> getUrunler() {return urunler;}

    public void setUrunler(List<Urun> urunler) {this.urunler = urunler;}

    public Kullanici(){
        urunler = new ArrayList<Urun>();
    }

    public abstract double getToplamTutar(double fiyat);

    public Urun getUrun(int index){
        return getUrunler().get(index);
    }
    public void addUrun(Urun urun){
        getUrunler().add(urun);
    }

}
