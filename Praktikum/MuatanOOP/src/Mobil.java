public class Mobil extends Hewan{
    int kapasitas = 1, totalMuatanMasuk = 0;
    String[] muatan = new String[kapasitas];

    public void setKapasitas(int i) {
        kapasitas = i;
        muatan = new String[i];
    }

    public void tambahMuatan(int beratHewan, String namaHewan){
        if(totalMuatanMasuk < kapasitas) {
            this.berat = this.berat + beratHewan;
            muatan[totalMuatanMasuk] = namaHewan;
            totalMuatanMasuk++;
        }

    }
}
