import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the number of subjects: ");
        int n = scanner.nextInt();
        
      
        int[] marks = new int[n];
        
    
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
        
       
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        
      
        double averagePercentage = (double) totalMarks / n;
       
        String grade;
        if (averagePercentage >= 90) {
            grade = "O";
        } else if (averagePercentage >= 80) {
            grade = "E";
        } else if (averagePercentage >= 70) {
            grade = "A";
        } else if (averagePercentage >= 60) {
            grade = "B";
        } else if (averagePercentage >= 50) {
            grade = "C";
        } else {
            grade = "F";
        }
        
   
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);
        
        
        scanner.close();
    }
}

