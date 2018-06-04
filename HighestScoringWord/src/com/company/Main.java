package com.company;

public class Main {
    public static String high(String s) {
        // Your code here...
        s = s.toLowerCase();
        String[] words = s.split(" ");
        StringBuilder st = new StringBuilder();
        int hScore = 0;
        for(int i = 0;i<words.length;i++)
        {
            System.out.printf(words[i]);
            if (score(words[i]) > hScore){
                hScore = score(words[i]);
                st.delete(0,st.length());
                st.append(words[i]);
            }
        }
        return st.toString();
    }
    //checks the score of a word
    public static int score(String s){
        int count = 0;
        char c = 0;
        char[] array = s.toCharArray();
        for (int i = 0;i<array.length;i++){
            count+= (int)array[i] - 96;
        }
        return count;
    }
    public static void main(String[] args) {
	// write your code here
        System.out.printf(high("Aas"));
    }
}
