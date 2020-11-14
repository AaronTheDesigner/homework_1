import java.util.Scanner;
import java.lang.Math;

public class App {

    public static class Powerball {

        public static void questionaire() {

            Scanner scanner = new Scanner(System.in);

            String[] questions = { "What is the name of your favorite pet?", "How old is your pet?",
                    "What is your lucky number?", "Do you have a favorite quarterback? (yes or no)",
                    "If so, what is their jersey number?", "What is the two digit model year of your car?",
                    "What is the first name of your favorite actor or actress?",
                    "Enter a random number between 1 and 50", "Would you like to see your numbers for the day?" };
            String petName = "";
            int petAge = 0;
            int luckyNum = 0;
            int qbNum = 0;
            int modelYear = 0;
            String favActor = "";
            int random = 0;

            for (int i = 0; i < questions.length; i++) {
                // initialze all values

                if (i == 0) {
                    System.out.println(questions[i]);
                    petName = scanner.next();
                }

                if (i == 1) {
                    System.out.println(questions[i]);
                    petAge = scanner.nextInt();
                }

                if (i == 2) {
                    System.out.println(questions[i]);
                    luckyNum = scanner.nextInt();
                }

                if (i == 4) {
                    System.out.println(questions[3]);
                    String answer = scanner.next();
                    if (answer.equals("yes")) {
                        System.out.println(questions[i]);
                        qbNum = scanner.nextInt();
                    } else if (answer.equals("no")) {
                        System.out.println("Next question");
                    }
                }

                if (i == 5) {
                    System.out.println(questions[i]);
                    modelYear = scanner.nextInt();
                }

                if (i == 6) {
                    System.out.println(questions[i]);
                    favActor = scanner.next();
                }

                if (i == 7) {
                    System.out.print(questions[i]);
                    random = scanner.nextInt();

                    if (random <= 1 || random >= 50) {
                        System.out.println(questions[i]);
                        random = scanner.nextInt();
                    }
                }

                if (i == 8) {
                    System.out.println(questions[i]);
                    String answer = scanner.next();
                    if (answer.equals("yes")) {
                        long powerball = magicNum(luckyNum, qbNum);
                        nonMagicNum(petName, petAge, modelYear, random, favActor);
                    } else {
                        System.out.println("Feel free to return any time.");
                    }
                }

            }
            scanner.close();
        }

        public static void nonMagicNum(String petName, int petAge, int modelYear, int random, String favActor) {
            double randomOne = Math.random();
            double randomTwo = Math.random();
        }

        public static long magicNum(int luckyNum, int qbNum) {

            int maxMagic = 75;
            double random = Math.random();

            if (random >= .5) {
                double magicBall = qbNum * random;
                long result = (Math.round(magicBall));
                System.out.println(result);
                if (result > maxMagic) {
                    System.out.println(result - maxMagic);
                    return result - maxMagic;
                }

                return result;
            } else {
                double magicBall = luckyNum * random;
                long result = (Math.round(magicBall));
                System.out.println(result);
                if (result > maxMagic) {
                    System.out.println(result - maxMagic);
                    return result - maxMagic;
                }

                return result;
            }
        }

    }

    public static class AsciiChars {

        public static void printNumbers() {
            // TODO: print valid numeric input
            System.out.println("numbers");

        }

        public static void printLowerCase() {
            // TODO: print valid lowercase alphabetic input
            System.out.println("lowercase");
        }

        public static void printUpperCase() {
            // TODO: print valid uppercase alphabetic input
            System.out.println("uppercase");
        }
    }

    public static void main(String[] args) {
        // print the valid characters for input
        // AsciiChars.printNumbers();
        // AsciiChars.printLowerCase();
        // AsciiChars.printUpperCase();
        // Powerball.questionaire();

        Powerball.questionaire();

        // System.out.println(petName);
        // System.out.println(petAge);
        // System.out.println(luckyNum);
        // System.out.println(qbNum);
        // System.out.println(modelYear);
        // System.out.println(favActor);
        // System.out.println(randomNum);

    }
}
