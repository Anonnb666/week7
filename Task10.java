package week7;

public class Task10 {
    public static char GetRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    public static char getRandomLowerCaseLetter() {
        return GetRandomCharacter('a', 'z');
    }

    public static char getRandomUpperCaseLetter() {
        return GetRandomCharacter('A', 'Z');
    }
}
