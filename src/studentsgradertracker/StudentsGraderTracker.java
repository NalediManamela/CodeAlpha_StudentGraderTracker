/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsgradertracker;

/**
 *
 * @author LENOVO
 */import java.util.Scanner;
public class StudentsGraderTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         System.out.println("Please Enter the number of students");
         int numStudents= scanner.nextInt( );
         
         int[] grades = new int[numStudents];
         
         for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }
         //Avarage
         double average = Average(grades);
        //Highest 
         double highest = Highest(grades);
         //Lowest 
         double lowest = Lowest(grades);
         
         System.out.println("Average Grade: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
        
        scanner.close();
    }
    //Avarage 
    public static double Average(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }
    //Highest 
    public static int Highest(int[] grades) {
        int highest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }
    //Lowest
     public static int Lowest(int[] grades) {
        int lowest = grades[0];
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}
