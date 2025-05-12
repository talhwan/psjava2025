public class Word {
    String text; //단어
    String meaning; //한글뜻
    int level; // 난이도 1~3만 가능

    public Word() {
    }
    public Word(String text, String meaning, int level) {
        this.text = text;
        this.meaning = meaning;
        this.level = level;
    }

    public void setText(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
    public String getMeaning() {
        return meaning;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public int getLevel() {
        return level;
    }

    @Override
    public String toString(){
        return text + "\t" + meaning + "\t" + level;
    }

}