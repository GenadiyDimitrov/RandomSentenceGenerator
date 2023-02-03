import java.util.Random;
import java.util.Scanner;

public class RandomSentenceGenerator {
    //region Arrays
    private static final String[] names = {
            "Ivan",
            "Peter",
            "Gena",
            "Stoqn",
            "Dragan",
            "Petkan",
            "Polly",
            "Tihomir"
    };
    private static final String[] places = {
            "Sofia",
            "Varna",
            "Plovdiv",
            "London",
            "New York",
            "Burgas",
            "Moscow",
            "Tokyo"

    };
    private static final String[] verbs = {
            "eats",
            "holds",
            "sees",
            "plays with",
            "brings",
            "runs from",
            "scares",
            "throws rock at"

    };
    private static final String[] nouns = {
            "stones",
            "cake",
            "apple",
            "laptop",
            "bikes",
            "cars",
            "planes",
            "rocks",
            "dragons",
            "boats",
            "sharks",
    };
    private static final String[] adverbs = {
            "slowly",
            "diligently",
            "warmly",
            "sadly",
            "rapidly",
            "angrily",
    };
    private static final String[] details = {
            "near the river",
            "at the airport",
            "at home",
            "in the park",
            "out in the ocean",
            "at the restaurant",
    };
    //endregion

    private static final Random random = new Random();

    public static void main(String[] args) {
        logo();
        run();
    }

    public static void logo() {
        //Game logo for the start
        System.out.println("Welcome to:");
        System.out.println("    ____                     __                     _____               __                              ______                                 __              ");
        System.out.println("   / __ \\ ____ _ ____   ____/ /____   ____ ___     / ___/ ___   ____   / /_ ___   ____   _____ ___     / ____/___   ____   ___   _____ ____ _ / /_ ____   _____");
        System.out.println("  / /_/ // __ `// __ \\ / __  // __ \\ / __ `__ \\    \\__ \\ / _ \\ / __ \\ / __// _ \\ / __ \\ / ___// _ \\   / / __ / _ \\ / __ \\ / _ \\ / ___// __ `// __// __ \\ / ___/");
        System.out.println(" / _, _// /_/ // / / // /_/ // /_/ // / / / / /   ___/ //  __// / / // /_ /  __// / / // /__ /  __/  / /_/ //  __// / / //  __// /   / /_/ // /_ / /_/ // /    ");
        System.out.println("/_/ |_| \\__,_//_/ /_/ \\__,_/ \\____//_/ /_/ /_/   /____/ \\___//_/ /_/ \\__/ \\___//_/ /_/ \\___/ \\___/   \\____/ \\___//_/ /_/ \\___//_/    \\__,_/ \\__/ \\____//_/     ");
        System.out.println("Game by Genadiy Dimitrov");
    }

    private static void run() {
        printInfo();
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        while (!command.equalsIgnoreCase("exit")) {
            printSentence();
            command = sc.nextLine();
        }
        sc.close();

    }

    private static void printInfo() {
        System.out.println("Press Enter to generate new sentence.");
        System.out.println("Write 'exit' to stop.");
    }

    private static void printSentence() {
        String sentence = getRandomSentence();
        System.out.println(sentence);
    }

    private static String getRandomSentence() {
        return String.format("%s from %s %s %s %s %s",
                getRandomWord(names),
                getRandomWord(places),
                getRandomWord(adverbs),
                getRandomWord(verbs),
                getRandomWord(nouns),
                getRandomWord(details)
        );
    }

    private static String getRandomWord(String[] words) {
        int index = random.nextInt(words.length);
        return words[index];
    }

}