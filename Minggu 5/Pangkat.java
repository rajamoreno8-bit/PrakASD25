import java.util.Scanner;
public class Pangkat {
    
    int nilai, pangkat;

    Pangkat(int n, int p){
        nilai = n;
        pangkat = p;
    }

    int pangkatBF(int a, int n){
        int hasil = 1;
        for(int i = 0; i < n; i++){
            hasil = hasil * a;
        }
        return hasil;
    }

    int pangkatDC(int a, int n){
        if(n == 0){
            return 1;
        }else{
            if(n % 2 == 1){
                return (pangkatDC(a, n/2) * pangkatDC(a, n/2) * a);
            }else{
                return (pangkatDC(a, n/2) * pangkatDC(a, n/2));
            }
        }
    }   Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Elemen");

        Pangkat[] png = new pangkat[elemen];
        for(int i=0;i<elemen;i++){
            System.out.print("Masukkan nilai basis elemen ke-"+(i+1)+": ");
            int basis = input.nextInt();
        }
}