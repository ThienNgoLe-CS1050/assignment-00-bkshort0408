package brandon_short_assignment02;

import javax.swing.JOptionPane; // Imports the standard JOptionPane into the class for use

public class Brandon_Short_assignment02 {
    public static void main(String[] args) {
        // Variable declaration
        String firstName;
        char middleInitial;
        String lastName;
        int age;
        double grossAnnualPay;
        double taxRate;
        double netAnnualPay;

        // Reading input
        firstName = JOptionPane.showInputDialog("Enter your first name:");
        String middleInitialStr = JOptionPane.showInputDialog("Enter your middle name initial:");
        middleInitial = middleInitialStr.charAt(0);
        lastName = JOptionPane.showInputDialog("Enter your last name:");
        age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
        grossAnnualPay = Double.parseDouble(JOptionPane.showInputDialog("Enter your annual gross pay:"));
        taxRate = Double.parseDouble(JOptionPane.showInputDialog("Enter your tax rate (as a decimal):"));
        // JOptionPane is used to create dialog boxes after importing the java_Desktop. 
        // Right click error and click add java desktop or similar option
        // Adding javax.swing to packages results in duplication error.
        
        // Processing data (Easiest part)
        netAnnualPay = grossAnnualPay - (grossAnnualPay * taxRate);

        // Displaying the output (Second easiest part)
        System.out.println("Hello " + firstName + " " + middleInitial + ". " + lastName + ",");
        System.out.println("You are " + age + " years old now.");
        System.out.println("It is amazing that you made $" + grossAnnualPay + " this year.");
        System.out.println("With the tax rate of " + taxRate + ", you can take home $" + netAnnualPay + ".");
    }
}