import java.util.Scanner;
import java.lang.Math;

public class App {

    public static class Powerball {

        public static void introduction() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your name: ");
            String name = scanner.next();
            System.out.println("Hello, " + name + ". Would you like to proceed? (yes or no)");
            String passGo = scanner.next();
            if (passGo.equals("yes")) {
                questionaire();
            } else {
                System.out.println("Feel free to resume another time.");
            }

            scanner.close();
        }

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
                        nonMagicNum(petName, petAge, modelYear, random, luckyNum, qbNum, favActor);
                        magicNum(luckyNum, qbNum);
                    } else {
                        System.out.println("Feel free to return any time.");
                    }
                }

            }
            scanner.close();
        }

        public static void nonMagicNum(String petName, int petAge, int modelYear, int random, int luckyNum, int qbNum, String favActor) {

            char[] petArray = petName.toCharArray();
            int numOne = petArray[3];
            int numTwo = modelYear + luckyNum;
            char[] actorArray = favActor.toCharArray();
            int numThree = actorArray[0];
            int numFour = petAge + modelYear;
            int numFive = qbNum + petAge + luckyNum;

            System.out.print("Lottery numbers: " + numOne + " " + numTwo + " " + numThree + " " + numFour + " " + numFive + " ");
            

            
        }

        public static long magicNum(int luckyNum, int qbNum) {

            int maxMagic = 75;
            double random = Math.random();

            if (random >= .5) {
                double magicBall = qbNum * random;
                long result = (Math.round(magicBall));
                System.out.println("Magic Ball: " + result);
                if (result > maxMagic) {
                    System.out.println(result - maxMagic);
                    return result - maxMagic;
                }

                return result;
            } else {
                double magicBall = luckyNum * random;
                long result = (Math.round(magicBall));
                System.out.println("Magic Ball: " + result);
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
            char[] numbers = {'0','9'};
            
            for (int i = 0; i < numbers.length; i++) {
                char character = numbers[i];
                int ascii = character;
                System.out.println(ascii);
            }

            Powerball.introduction();
        }

        public static void printLowerCase() {
            char[] lowerCase = {'a','z'};
            
            for (int i = 0; i < lowerCase.length; i++) {
                char character = lowerCase[i];
                int ascii = character;
                System.out.println(ascii);

            }

            Powerball.introduction();
        }

        public static void printUpperCase() {
            char[] upperCase = {'A','Z'};
            
            for (int i = 0; i < upperCase.length; i++) {
                char character = upperCase[i];
                int ascii = character;
                System.out.println(ascii);

            }

            Powerball.introduction();
        }
    }

    public static void main(String[] args) {
        // print the valid characters for input
        AsciiChars.printNumbers();
        // AsciiChars.printLowerCase();
        // AsciiChars.printUpperCase();
        // Powerball.introduction();

    }
}

// https://github.com/AaronTheDesigner/homework_1/blob/main/src/App.java