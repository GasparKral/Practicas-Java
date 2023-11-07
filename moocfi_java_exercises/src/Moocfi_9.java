import java.util.Scanner;

public class Moocfi_9 {

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        String text1 = "I will tell you a story, but I need some information first. \nWhat is the main character called?";
        String text2 = "What is their job?";
        String name, job;

        System.out.println(text1);
        name = imput.nextLine();
        System.out.println(text2);
        job = imput.nextLine();
        System.out.println("Here is the story:  \nOnce upon a time there was " + name + ", who was a " + job + "."
                + "On the way to work, " + name + " reflected on life. \nPerhaps " + name + "  will not be a " + job
                + " forever.");
        imput.close();
    }
}
