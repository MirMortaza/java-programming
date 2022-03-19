package day28_Array;

import java.util.Arrays;
import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {
        String []studentOne={"7","mir","mortaza","077"};
        System.out.println(Arrays.toString(studentOne));

        String [] studentTwo= new String[4];
        System.out.println(Arrays.toString(studentOne));

        studentTwo[0]="010";
        studentTwo[1]="miiiir";
        studentTwo[2]="Mortaaaza";
        studentTwo[3]= "26";
        System.out.println(Arrays.toString(studentTwo));


        String [] studentthree= new String[4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Id");
        studentthree[0]= input.nextLine();
        System.out.println("Enter your first name");
        studentthree[1]= input.nextLine();
        System.out.println("Enter your last name");
        studentthree[2]=input.nextLine();
        System.out.println("What is your batch number");
        studentthree[3]=input.nextLine();
        System.out.println(Arrays.toString(studentthree));

        String [] Questions={"Enter your Id","Enter your first name","Enter your last name","What is your batch number"};

        String[] studentfour= new String[4];
        for (int i = 0; i < 4; i++) {
            studentfour[i]=input.nextLine();

        }
        System.out.println(Arrays.toString(studentfour));

    }
}
