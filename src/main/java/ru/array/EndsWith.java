package ru.array;

public class EndsWith {

    public static boolean endsWith(char[] word, char[] post) {
        int count = 0;
        for (int i = 0; i < post.length; i++) {
            if (word[word.length - 1 - i] == post[post.length - 1 - i]) {
                count++;
            }
        }
        return count == post.length;
    }
}
