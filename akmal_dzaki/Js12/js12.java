package akmal_dzaki.Js12;

import java.util.Scanner;

public class js12 {
    public static void main(String[] args) {
        akar tumbuhan = new akar();
        Scanner in = new Scanner(System.in);

        int pill;

        do {
            System.out.println("\nApa yang ingin anda lakukan?");
            System.out.println("1. Nutrisi\n2. Air\n3. Tampilkan buah\n4. Keluar");
            pill = in.nextInt();
            if(pill == 1){
                tumbuhan.fotosintesis();
                
            } else if (pill == 2){
                tumbuhan.tambahAir();
                
            } else if(pill == 3){
                tumbuhan.penyemaian();
                
            }
        } while(pill == 1 && pill == 2 && pill == 3);
    }
}
