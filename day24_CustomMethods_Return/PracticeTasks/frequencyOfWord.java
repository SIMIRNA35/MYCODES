package day24_CustomMethods_Return.PracticeTasks;

public class frequencyOfWord {
    public static void main(String[] args) {
//1.  create a method named frequencyOfWord that passes two parameters: string sentence and String word, then returns the frequency of word from the sentence
//                Ex:
//                    sentence = "Java java java python python"
//                    word = "java";
//                    frequencyOfWord(sentence, word) ==>  3

            String sentence = "Java java java python python";
        sentence = sentence.toLowerCase(); // kucuk/ buyuk harf bakmaksizin
                String word = "java"; // frequency arancak kelime

                int frequency = frequencyOfWord(sentence, word);

                System.out.println(frequency);
                }

public static int frequencyOfWord(String sentence, String word) {
        int count = 0;

        String result = "";
        for (int i = 0; i < sentence.length(); i++) {

        result += sentence.charAt(i); // her bir harf tek tek bakacak

        if (result.contains(word)) { // eger word teki kelimeyi iceriyorsa

        result = result.replace(word, ""); // word teki kelimeyi "" bosluga kadar yerdigistircek
        count++;
        }
        }
        return count;


        }
        }
