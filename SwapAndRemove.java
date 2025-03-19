/**
 * ACS-1903 Lab 9 Q8
 * @author (Harmanjit Singh Malhi 3197492)
 */

import java.util.ArrayList;

public class SwapAndRemove{
    public static void main(String[] args){
        ArrayList<String> words = new ArrayList<>();
        words.add("is");
        words.add("this");
        words.add("an");
        words.add("array");
        words.add("list");
        words.add("?");
        System.out.println(words);

        String firstWord = words.get(0);
        String secondWord = words.get(1);
        words.set(0, secondWord);
        words.set(1, firstWord);
        int lastWord = words.size()-1;
        words.remove(lastWord);
        
        for(String s: words){
            System.out.print(s+" ");
        }
        

    }
}