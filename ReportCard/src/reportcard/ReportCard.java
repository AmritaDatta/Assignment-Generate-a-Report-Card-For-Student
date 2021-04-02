package reportcard;

import java.util.Scanner;

public class ReportCard {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        System.out.println("Enter Student's name: ");
        String name = in.nextLine();
        
        System.out.println("Enter the number of subject: ");
        int noOfSubject = in.nextInt();
        
        //creating an integer array with the size of no of subjects
        
        int[] marks = new int[noOfSubject];
        String[] subjectName = new String[noOfSubject];
        
        subNames(subjectName);
        marksEntry(marks);
        generatingReposrtCard(name, noOfSubject, subjectName, marks);
    }
    
    //method for marks entry
public static void marksEntry(int[] marks) {
    
    for (int index=0; index<marks.length; index++){
        
        System.out.println("Enter marks for Subject - " + (index+1) + ": ");
        marks[index] = in.nextInt();
    }
}

//method for subject names
public static void subNames(String[] subjectName) {
    for (int index=0; index<subjectName.length; index++){
        
        System.out.println("Enter the name of Subject - " + (index+1) + ": ");
        subjectName[index] = in.next();
    }
}

//method for generating reposrt card
public static void generatingReposrtCard(String name, int noOfSubject, String[] subjectName, int[] marks) {
    System.out.println("---------------------------------------------");
    
    System.out.println("\t\tReport Card");
    System.out.println("Name: " + name);
    
    System.out.println("---------------------------------------------");
    
    System.out.println("Subjects \t\t       Marks");
    System.out.println("---------------------------------------------");
    
    int total = 0;
    for (int index=0; index<noOfSubject; index++){
        
        total += marks[index];
        System.out.println("Subject - " + (index+1) + ": " + subjectName[index] +"\t\t        " + marks[index]);
    }    
        System.out.println("------------------------------------------");
        
        float average=((float)total)/noOfSubject;
        //System.out.println("Total: " + total + "\t\t     Average: " + average);
        System.out.printf("Total: %d \t\t     Average: %.2f \n", total, average);
        
        System.out.println("------------------------------------------");
              
}   
}
