// Add import statements
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class StudentGradeReport {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inFile = new Scanner(
                new FileReader("C:\\Users\\wiley\\IdeaProjects\\Homework\\grades.txt"));
        // handles filenotfound error
        PrintWriter outFile = new PrintWriter("gradeReport.txt");
        // Student 1
        String studentFirst1;
        String studentLast1;
        int test1stu1;
        int test2stu1;
        int test3stu1;
        int test4stu1;
        int test5stu1;
        double averageStu1;
        // Read Student 1
        studentFirst1 = inFile.next();
        studentLast1 = inFile.next();
        test1stu1 = inFile.nextInt();
        test2stu1 = inFile.nextInt();
        test3stu1 = inFile.nextInt();
        test4stu1 = inFile.nextInt();
        test5stu1 = inFile.nextInt();
        // Student 2
        String studentFirst2;
        String studentLast2;
        int test1stu2;
        int test2stu2;
        int test3stu2;
        int test4stu2;
        int test5stu2;
        double averageStu2;
        // Read Student 2
        studentFirst2 = inFile.next();
        studentLast2 = inFile.next();
        test1stu2 = inFile.nextInt();
        test2stu2 = inFile.nextInt();
        test3stu2 = inFile.nextInt();
        test4stu2 = inFile.nextInt();
        test5stu2 = inFile.nextInt();
        // Student 3
        String studentFirst3;
        String studentLast3;
        int test1stu3;
        int test2stu3;
        int test3stu3;
        int test4stu3;
        int test5stu3;
        double averageStu3;
        // Read Student 3
        studentFirst3 = inFile.next();
        studentLast3 = inFile.next();
        test1stu3 = inFile.nextInt();
        test2stu3 = inFile.nextInt();
        test3stu3 = inFile.nextInt();
        test4stu3 = inFile.nextInt();
        test5stu3 = inFile.nextInt();
        // Student 4
        String studentFirst4;
        String studentLast4;
        int test1stu4;
        int test2stu4;
        int test3stu4;
        int test4stu4;
        int test5stu4;
        double averageStu4;
        // Read Student 4
        studentFirst4 = inFile.next();
        studentLast4 = inFile.next();
        test1stu4 = inFile.nextInt();
        test2stu4 = inFile.nextInt();
        test3stu4 = inFile.nextInt();
        test4stu4 = inFile.nextInt();
        test5stu4 = inFile.nextInt();
        // Student 5
        String studentFirst5;
        String studentLast5;
        int test1stu5;
        int test2stu5;
        int test3stu5;
        int test4stu5;
        int test5stu5;
        double averageStu5;
        // Read Student 5
        studentFirst5 = inFile.next();
        studentLast5 = inFile.next();
        test1stu5 = inFile.nextInt();
        test2stu5 = inFile.nextInt();
        test3stu5 = inFile.nextInt();
        test4stu5 = inFile.nextInt();
        test5stu5 = inFile.nextInt();

        // Calculate average score
        averageStu1 = (test1stu1 + test2stu1 + test3stu1 + test4stu1 + test5stu1) / 5.0;
        averageStu2 = (test1stu2 + test2stu2 + test3stu2 + test4stu2 + test5stu2) / 5.0;
        averageStu3 = (test1stu3 + test2stu3 + test3stu3 + test4stu3 + test5stu3) / 5.0;
        averageStu4 = (test1stu4 + test2stu4 + test3stu4 + test4stu4 + test5stu4) / 5.0;
        averageStu5 = (test1stu5 + test2stu5 + test3stu5 + test4stu5 + test5stu5) / 5.0;
        // Output
        outFile.println("Student        Test1 Test2 Test3 Test4 Test 5 Average");

        outFile.printf("%s %s %d   %d     %d     %d    %d    %.2f%n",
                studentFirst1, studentLast1, test1stu1, test2stu1, test3stu1, test4stu1, test5stu1, averageStu1);

        outFile.printf("%s %s %d    %d     %d    %d    %d     %.2f%n",
                studentFirst2, studentLast2, test1stu2, test2stu2, test3stu2, test4stu2, test5stu2, averageStu2);

        outFile.printf("%s %s  %d    %d     %d    %d    %d    %.2f%n",
                studentFirst3, studentLast3, test1stu3, test2stu3, test3stu3, test4stu3, test5stu3, averageStu3);

        outFile.printf("%s %s    %d   %d    %d    %d    %d    %.2f%n",
                studentFirst4, studentLast4, test1stu4, test2stu4, test3stu4, test4stu4, test5stu4, averageStu4);

        outFile.printf("%s %s    %d    %d    %d    %d    %d    %.2f%n",
                studentFirst5, studentLast5, test1stu5, test2stu5, test3stu5, test4stu5, test5stu5, averageStu5);
        //close files
        inFile.close();
        outFile.close();
    }
}