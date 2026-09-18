// Add import statements
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class EmployeePayroll {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inFile = new Scanner(
                new FileReader("C:\\Users\\wiley\\IdeaProjects\\Homework\\employees.txt"));
        // handles filenotfound error
        PrintWriter outFile = new
                PrintWriter("payroll.txt");
        // Employee 1
        String firstName1;
        String lastName1;
        double hourlyRate1;
        double hoursWorked1;
        double grossPay1;
        // Read Employee 1
        firstName1 = inFile.next();
        lastName1 = inFile.next();
        hourlyRate1 = inFile.nextDouble();
        hoursWorked1 = inFile.nextDouble();
        // Employee 2
        String firstName2;
        String lastName2;
        double hourlyRate2;
        double hoursWorked2;
        double grossPay2;
        // Read Employee 2
        firstName2 = inFile.next();
        lastName2 = inFile.next();
        hourlyRate2 = inFile.nextDouble();
        hoursWorked2 = inFile.nextDouble();

        // Employee 3
        String firstName3;
        String lastName3;
        double hourlyRate3;
        double hoursWorked3;
        double grossPay3;
        // Read Employee 3
        firstName3 = inFile.next();
        lastName3 = inFile.next();
        hourlyRate3 = inFile.nextDouble();
        hoursWorked3 = inFile.nextDouble();

        // Employee 4
        String firstName4;
        String lastName4;
        double hourlyRate4;
        double hoursWorked4;
        double grossPay4;
        // Read Employee 4
        firstName4 = inFile.next();
        lastName4 = inFile.next();
        hourlyRate4 = inFile.nextDouble();
        hoursWorked4 = inFile.nextDouble();

        // Calculate gross pay
        grossPay1 = hourlyRate1 * hoursWorked1;
        grossPay2 = hourlyRate2 * hoursWorked2;
        grossPay3 = hourlyRate3 * hoursWorked3;
        grossPay4 = hourlyRate4 * hoursWorked4;

        // Output
        outFile.println("Employee   Rate Hours Gross Pay");

        outFile.printf("%s %s %.2f %.1f %.2f%n",
                firstName1, lastName1, hourlyRate1, hoursWorked1, grossPay1);

        outFile.printf("%s %s %.2f %.1f %.2f%n",
                firstName2, lastName2, hourlyRate2, hoursWorked2, grossPay2);

        outFile.printf("%s %s %.2f %.1f %.2f%n",
                firstName3, lastName3, hourlyRate3, hoursWorked3, grossPay3);

        outFile.printf("%s %s %.2f %.1f %.2f%n",
                firstName4, lastName4, hourlyRate4, hoursWorked4, grossPay4);
        //close files
        inFile.close();
        outFile.close();
    }
}