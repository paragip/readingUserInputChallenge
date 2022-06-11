import java.util.Scanner;

public class readingUserInputChallenge {

    public static void main(String[] args) {

        int sum = 0;
        int counter = 1;
        Scanner scanner = new Scanner(System.in);

        while (counter != 11) {

            System.out.println("Enter number #" + counter + " : ");
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt) {

                int number = scanner.nextInt();
                scanner.nextLine();
                sum += number;
                counter++;

            } else {

                System.out.println("Invalid number");
                scanner.nextLine();

            }
        }

        scanner.close();

        System.out.println("The sum of given numbers: " + sum);
    }

}
