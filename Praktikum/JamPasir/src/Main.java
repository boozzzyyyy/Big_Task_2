public class Main {
    public static void main(String[] args){
        main1(3);
    }
    public static void main1(int n){
        int m = 0;

        for (int i = (n-1); i>=0; i--){
            for (int j = m; j>=0; j--){
                System.out.print(" ");

            }
            for (int k = i; k>=0; k--){
                System.out.print("* ");
            }
            System.out.println("");
            m++;


        }

        for (int i = 1; i<n; i++){
            for (int j = 0; j<(n-i); j++){
                System.out.print(" ");
            }
            for (int k = i; k>=0; k--){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
