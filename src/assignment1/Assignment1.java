package assignment1;

import java.util.Scanner;

/**
 *
 * @author Calum
 */
public class Assignment1 {

    public static void main(String[] args) {
        //add keyboard scanner
        Scanner keyboard = new Scanner(System.in);
        
        //prompt user to enter all 5 grades, then save them in a associated variable
        System.out.print("Please enter a grade: ");
        double grade1 = keyboard.nextInt();
        
        System.out.print("Please enter a grade: ");
        double grade2 = keyboard.nextInt();
        
        System.out.print("Please enter a grade: ");
        double grade3 = keyboard.nextInt();
        
        System.out.print("Please enter a grade: ");
        double grade4 = keyboard.nextInt();
        
        System.out.print("Please enter a grade: ");
        double grade5 = keyboard.nextInt();
        
        //create variable 'average' to represent the getAverage method
        double average = getAverage(grade1, grade2, grade3, grade4, grade5);
        
        //print marks inputted by user and the letter grades assigned to the marks
        System.out.printf("%nThe mark for the first course was %.0f%%, the letter grade is %s%n", grade1, getLetterGrade(grade1));
        System.out.printf("The mark for the second course was %.0f%%, the letter grade is %s%n", grade2, getLetterGrade(grade2));
        System.out.printf("The mark for the third course was %.0f%%, the letter grade is %s%n", grade3, getLetterGrade(grade3));
        System.out.printf("The mark for the fourth course was %.0f%%, the letter grade is %s%n", grade4, getLetterGrade(grade4));
        System.out.printf("The mark for the fifth course was %.0f%%, the letter grade is %s%n", grade5, getLetterGrade(grade5));
        
        //print overall average of all marks and the letter grade assigned to that average
        System.out.printf("The overall average mark is %.1f%%, which is a letter grade of %s%n", average, getLetterGrade(average));
          
    }
    
    public static String getLetterGrade(double grade){     
        if (grade >=80 && grade<=100){
                return "A";
             }
        else if(grade >=70 && grade <=79){
                 return "B";
             }
        else if(grade >=60 && grade <=69){
                 return "C";
             }
        else if(grade >=50 && grade <=59){
                 return "D";
             }
        else {
                 return "F";
             }
        
    }
    
    public static double getAverage(double grade1, double grade2, double grade3, double grade4, double grade5){
              double average = ((grade1 + grade2 + grade3 + grade4 + grade5)/5);
              return average;
    }
    
}
