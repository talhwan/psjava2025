package week3to11;

import java.util.ArrayList;
import java.util.List;

public class WordCRUD {
    List<Word> words;

    public WordCRUD(){
        this.words = new ArrayList<Word>();
    }
    public void add(Word word){
        words.add(word);
    }
    public void update(int index, Word word){
        /*Word eachWord = words.get(index);
        eachWord = word;*/
        words.set(index, word);
    }
    public void delete(int index){
        words.remove(index);
    }

    public void toPrint(){
        //for 문
        /*
        for(int i=0; i<words.size(); i++){
            Word each = words.get(i);
            System.out.println(each.getText() + " " + each.getMeaning() + " " + each.getLevel());
        }
        */

        //foreach 구문!!
        for(Word each : words){
            System.out.println(each.getText() + " " + each.getMeaning() + " " + each.getLevel());
        }
    }

}