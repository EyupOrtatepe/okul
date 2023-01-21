package okulYonetimi;

public class Ogrenci extends Kisi{
    private int numara;
    private String sinif;

    public Ogrenci(int numara, String sinif) {
        this.numara = numara;
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return super.toString() +" "+
                "numara=" + numara +
                ", sinif='" + sinif + '\'' ;
    }

    public Ogrenci(String ad, String sad, String tcNo, int yas, int numara, String sinif) {
        super(ad, sad, tcNo, yas);
        this.numara = numara;
        this.sinif = sinif;
    }
}
