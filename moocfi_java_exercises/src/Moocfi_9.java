import java.util.Scanner;

public class Moocfi_9 {

    /*
     * NB! The example output might align wrong on narrow displays. If you're using
     * only a limited portion of the browser window, or your display is otherwise
     * very narrow, try to stretch the display horizontally to see if the text
     * aligns differently. The exercise expects the text to align as it does on
     * wider displays.
     * 
     * Write a program that asks the user for a character's name and their job. The
     * program then prints a short story.
     * 
     * The output must be as shown below — note, the name and job depend on the
     * user's input.
     */
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
