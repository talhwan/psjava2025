public class Main20250414004 {
    public static void main(String[] args) {
        Main20250414004 ps = new Main20250414004();
        ps.j043();
    }

    public void j041() {
        Lotto2 lotto2 = new Lotto2();
        lotto2.printNumbers();
        lotto2.remakeAuto();
        lotto2.printNumbers();
    }
    public void j042() {
        Lotto2 lotto2 = new Lotto2();
        lotto2.printNumbers();
        lotto2.remake();
        lotto2.printNumbers();
    }
    public void j043() {
        Lotto2 lotto2 = new Lotto2();
        lotto2.printNumbers();
        lotto2.remake();
        lotto2.printNumbers();

        int[] answers = {1,2,3,4,5,6};
        int resultNum = lotto2.checkLotto(answers);
        System.out.println("result : " + resultNum);

    }
}