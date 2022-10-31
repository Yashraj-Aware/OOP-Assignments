import  java.util.*;
public class assignment_1 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Number of Students");
                int n = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    System.out.println("enter the name of the student:");
                    String s = sc.next();
                    System.out.println("Enter marks of Subject");
                    System.out.println("Physics marks");
                    int p = sc.nextInt();
                    System.out.println("Chemistry marks");
                    int c = sc.nextInt();
                    System.out.println("Mathematics marks");
                    int m = sc.nextInt();
                    int avg = (p + c + m) / 3;
                    System.out.println("Average of Student is :" + avg);
                    System.out.println("The grade of student  is :");
                    if (avg >= 80) {
                        System.out.println("A Grade");
                    } else if (avg < 80 && avg >= 60) {
                        System.out.println("B Grade");
                    } else if (avg < 60 && avg >= 40) {
                        System.out.println("B Grade");
                    } else {
                        System.out.println("D Grade");
                    }
                }
                System.out.println("\n");
            }
        }
