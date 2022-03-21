public class Main {
    public static void main(String[] args){
        indexHuruf("C");
        indexHuruf("R");
        indexHuruf("K");
        indexHuruf("P");
    }

    public static void indexHuruf(String hurufDicari){
        String[][] tabelHuruf = {
                {"A", "B", "C/K", "D", "E"},
                {"F", "G", "H", "I", "J"},
                {"L", "M", "N", "O", "P"},
                {"Q", "R", "S", "T", "U"},
                {"V", "W", "X", "Y", "Z"}
        };
        String lokasiHuruf = "";

        for (int i = 0;i < 5;i++){
            for (int j = 0;j < 5;j++){
                if (tabelHuruf[j][i].contains(hurufDicari)) {
                    lokasiHuruf = (i + 1) + " " + (j + 1);
                    break;
                }
            }
        }

        lokasiHuruf = (lokasiHuruf == "") ? "Huruf tidak ditemukan" : lokasiHuruf;
        System.out.println(hurufDicari);
        System.out.println(lokasiHuruf);
    }
}
