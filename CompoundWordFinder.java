import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CompoundWordFinder {
    private Set<String> wordSet;
    private Deque<WordPart> wordQueue;

    CompoundWordFinder() {
        wordSet = new HashSet<>();
        wordQueue = new ArrayDeque<>();
    }

    class WordPart {
        String word;
        String remainder;

        WordPart(String word, String remainder) {
            this.word = word;
            this.remainder = remainder;
        }
    }

    void addWordsFromFile(String filePath) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String word = line.trim();
                wordSet.add(word);
                Deque<String> prefixes = getPrefixes(word);
                for (String prefix : prefixes) {
                    wordQueue.add(new WordPart(word, word.substring(prefix.length())));
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file!");
            System.exit(0);
        }
    }

    Deque<String> getPrefixes(String word) {
        Deque<String> prefixes = new ArrayDeque<>();
        String currentPrefix = "";

        for (int i = 0; i < word.length(); i++) {
            currentPrefix += word.charAt(i);
            if (wordSet.contains(currentPrefix)) {
                prefixes.add(currentPrefix);
            }
        }

        return prefixes;
    }

    WordPart findLongestCompoundWords() {
        String longestCompoundWord = "";
        int longestCompoundWordLength = 0;
        String secondLongestCompoundWord = "";

        while (!wordQueue.isEmpty()) {
            WordPart wordPart = wordQueue.poll();
            String word = wordPart.word;
            String remainder = wordPart.remainder;

            if (wordSet.contains(remainder) && word.length() > longestCompoundWordLength) {
                secondLongestCompoundWord = longestCompoundWord;
                longestCompoundWord = word;
                longestCompoundWordLength = word.length();
            } else {
                Deque<String> prefixes = getPrefixes(remainder);
                for (String prefix : prefixes) {
                    wordQueue.add(new WordPart(word, remainder.substring(prefix.length())));
                }
            }
        }

        return new WordPart(longestCompoundWord, secondLongestCompoundWord);
    }

    public static void main(String[] args) {
        CompoundWordFinder compoundWordFinder = new CompoundWordFinder();
        long startTime = System.currentTimeMillis();
        compoundWordFinder.addWordsFromFile("Input_01.txt");
        WordPart result = compoundWordFinder.findLongestCompoundWords();
        long endTime = System.currentTimeMillis();
        System.out.println("Longest Compound Word: " + result.word);
        System.out.println("Second Longest Compound Word: " + result.remainder);
        System.out.println("Time taken: " + (endTime - startTime) / 1000.0 + " seconds");
    }
}
