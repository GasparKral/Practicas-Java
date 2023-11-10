import java.util.Scanner;

public class Moocfi_29 {

    /*
     * The table below describes how the grade for a particular course is
     * determined. Write a program that gives a course grade according to the
     * provided table.
     */
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        int grade;
        int value1[] = { 100, 90, 80, 70, 60, 50, 0 };
        String answer[] = { "Incredible!", "5", "4", "3", "2", "1", "Failed!" };

        System.out.println("Give points[0-100]: ");
        grade = imput.nextInt();
        imput.close();

        for (int i = 0; i < value1.length; i++) {

            if (grade < 0) {
                System.out.println("Imposible!");
                break;
            } else if (grade >= value1[i]) {
                System.out.println("Grade: " + answer[i]);
                break;
            }

        }

    }

}
