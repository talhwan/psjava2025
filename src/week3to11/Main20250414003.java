package week3to11;

import java.util.Scanner;

public class Main20250414003 {
    public static void main(String[] args) {
        Main20250414003 ps = new Main20250414003();
        ps.j042();
    }

    public void j041(){
        Lotto lotto = new Lotto();
        lotto.printNumbers();
        lotto.remakeAuto();
        lotto.printNumbers();
    }
    public void j042(){
        Lotto lotto = new Lotto();
        lotto.printNumbers();
        lotto.remake();
        lotto.printNumbers();
    }
}
