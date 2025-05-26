package week13;

import java.util.*;

public class ScoreManager {
    List<Score> listScore = null;
    Map<String, Score> mapScore = null;

    public ScoreManager(){
        listScore = new ArrayList<Score>();
        mapScore = new HashMap<String, Score>();
    }
    public void addScore(Score score){
        listScore.add(score);
        mapScore.put(score.getNo(), score);
    }
    public void printAll(){
        for(Score s : listScore){
            System.out.println(s);
        }

        Set<String> keys = mapScore.keySet();
        for(String key : keys){
            Score s = mapScore.get(key);
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        ScoreManager sm = new ScoreManager();
        sm.addScore(new Score("20240001", 100,90, 100));
        sm.printAll();
    }


}
