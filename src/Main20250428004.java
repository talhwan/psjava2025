public class Main20250428004 {
    public static void main(String[] args) {
        Main20250428004 ps = new Main20250428004();
        ps.j052();
    }

    public void j044() {
        MakePW2 pw = new MakePW2();
        pw.make(3);
        pw.make(10, 8);
    }
    public void j052() {
        Score2 score2 = new Score2(3);
        score2.getScore();
        score2.printScore();
        score2.getScore();
        score2.printScore();
    }
}