import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("This program will compute the score of students");
        System.out.println("please enter score\nwhole number to compute or negative to end");
        double score = keyboard.nextDouble();
        int gradesCounter = 0;
        int aCounter = 0;
        int bCounter = 0;
        int cCounter = 0;
        int dCounter = 0;
        int fCounter = 0;
        double max = 10;
        double min = max;
        double sum = 0;
        while (score >= 0)
        {
            gradesCounter++;
            sum = score + score;
            if(score > max)
                max = score;
            else if(score < min)
                min = max;
            else if((score >90)&&(score <100))
                aCounter++;
            else if((score >80)&&(score <89))
                bCounter++;
            else if((score >70)&&(score<79))
                cCounter++;
            else if((score >60)&&(score<69))
                dCounter++;
            else
                fCounter++;
            System.out.println("Enter score again");
            score = keyboard.nextDouble();


        }
        System.out.println("Total numbver of Grades: "+ gradesCounter);
        System.out.println("Number of A's: " +aCounter);
        System.out.println("Number of B's: " + bCounter);
        System.out.println("Number of C's: " + cCounter);
        System.out.println("Number of D's: " + dCounter);
        System.out.println("Number of F's: " + fCounter);
    }
}
