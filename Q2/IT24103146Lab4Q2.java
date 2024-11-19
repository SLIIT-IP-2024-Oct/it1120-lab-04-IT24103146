import java.util.Scanner;

public class IT24103146Lab4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input and validate exam marks
        System.out.print("Please enter exam marks (out of 100): ");
        double examMarks = scanner.nextDouble();
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid Input for exam marks. Terminating the program");
            return;
        }
        
        // Input and validate lab submission marks
        System.out.print("Please enter lab submission marks (out of 100): ");
        double labMarks = scanner.nextDouble();
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid Input for lab marks. Terminating the program.");
            return;
        }
        
        // Input and validate percentages
        System.out.print("Please enter the percentage given for the exam: ");
        double examPercentage = scanner.nextDouble();
        System.out.print("Please enter percentage given for the lab submission: ");
        double labPercentage = scanner.nextDouble();
        if (examPercentage + labPercentage != 100) {
            System.out.println("The percentage must add up to 100. Terminating the program");
            return;
        }
        System.out.println();
        // Calculate final mark
        double finalMark = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);
        System.out.println("Final Exam Mark is: " + finalMark);
    }
}