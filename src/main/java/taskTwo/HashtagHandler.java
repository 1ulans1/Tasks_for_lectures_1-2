package taskTwo;

import java.util.*;

public class HashtagHandler {

    private final List<String> strings;

    public HashtagHandler(List<String> strings) {
        this.strings = strings;
    }

    public List<String> topFive() {

        HashMap<String, Integer> dict = new HashMap<>();

        onlyTags().forEach(setWord -> setWord.forEach(
                word -> dict.put(
                        word,
                        dict.containsKey(word) ? dict.get(word) + 1 : 1
                )
        ));

        return dict.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted((value1, value2) -> Integer.compare(value2.getValue(), value1.getValue()))
                .map(Map.Entry::getKey)
                .limit(5)
                .toList();
    }

    private List<Set<String>> onlyTags() {
        List<Set<String>> words = new ArrayList<>();

        for (String temp : strings) {

            Set<String> tempSet = new HashSet<>();
            int startWord = -1;

            for (int i = 0; i < temp.length(); i++) {

                char currentChar = temp.charAt(i);

                boolean isSpace = currentChar == ' ';
                boolean isHashtag = currentChar == '#';

                if (isSpace || isHashtag) {

                    if (startWord != -1 && startWord + 1 != i)
                        tempSet.add(temp.substring(startWord, i));

                    startWord = isHashtag ? i : -1;
                }
            }

            if (startWord != -1 && startWord + 1 != temp.length()) {
                tempSet.add(temp.substring(startWord));
            }

            words.add(tempSet);
        }
        return words;
    }
}
