package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int i = 0;
        String answer = "";
        while (i < chars.length) {
            answer = answer + chars[i];
            i++;
        }
        System.out.println(answer);
    }
}
