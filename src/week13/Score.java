package week13;

public class Score {
    private String no;
    private int kor;
    private int eng;
    private int mat;

    public Score(String no, int kor, int eng, int mat) {
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    public int getSum(){
        return kor + eng + mat;
    }
    public double getAvg(){
        return (double) (kor + eng + mat) / 3;
    }

    public String getNo() {
        return no;
    }
    public void setNo(String no) {
        this.no = no;
    }
    public int getKor() {
        return kor;
    }
    public void setKor(int kor) {
        this.kor = kor;
    }
    public int getEng() {
        return eng;
    }
    public void setEng(int eng) {
        this.eng = eng;
    }
    public int getMat() {
        return mat;
    }
    public void setMat(int mat) {
        this.mat = mat;
    }

    @Override
    public String toString(){
        return no + "\t" + kor + "\t" + eng + "\t" + mat + "\n";
    }
}
