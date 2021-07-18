import java.util.Scanner;

public class IfElseControlStatements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int studentsGrade;
        System.out.println("Enter student's grade");
        studentsGrade = input.nextInt();
        if(studentsGrade>=80)
            System.out.println("A \n");
        else
            if(studentsGrade>=70)
                System.out.println("He or she deserves B");

            else
                if (studentsGrade>=50)
                    System.out.println(("He or She deserves C"));
                else
                    System.out.println("He or She failed");



    }

}
