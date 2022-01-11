package day24_CustomeMethod_Return;

public class Lunch1212 {
    public static void main(String[] args) {

        String sentence = "Java java java python python";
        String word = "python";
        System.out.println(frequencyOfWord(sentence, word));
    }

        public static int frequencyOfWord (String sentence, String word){
            int count = 0;
            for (int i = 0, j = 0; i < sentence.length() - word.length(); i++, j++) {
                String frequencyOfWord = sentence.substring(i, i + word.length());
                if (frequencyOfWord.toLowerCase().contains(word)) {
                    count++;
                }

            }
            return count;
        }
    }



/*
	1.  create a method named frequencyOfWord that passes two parameters: string sentence and String word,
	 then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3

 */