package com.csabapro;

import java.util.Scanner;

public class Human {
    public String lastName;
    public String firstName;
    public int yearOfBirth;
    public String mothersName;
    public String socialSecurityNumber;

    Human(String lastName, String firstName, int yearOfBirth, String mothersName, String socialSecurityNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.yearOfBirth = yearOfBirth;
        this.mothersName = mothersName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public static Human askForHuman(Scanner s) {
        boolean correctInput = false;
        String human = "";
        while (!correctInput) {
            System.out.println(
                    "Write in a human in the following format: LastName,Firstname,YearOfBirth,MothersName,SocialSecurityNumber");
            try { // We have yet to learn about try {} catch {}. We didn't validate input
                human = s.next(".*,.*,[0-9]{4},.*,.*"); // My own input. In class we only used Scanner.nextLine()
                /** This is an example on how to read a single variable
                 * System.out.println("Input last name:");
                 * lastname = s.nextLine();
                 * and so on and so on
                 */
                // String a = s.nextLine();
                correctInput = true;
            } catch (Exception e) {
                System.out.println("Format wasn't correct!");
            }
        }
        String[] humanStrings = human.split(",");
        return new Human(humanStrings[0], humanStrings[1], Integer.parseInt(humanStrings[2]), humanStrings[3],
                humanStrings[4]);
    }

    @Override
    public String toString() { // We have yet to learn about StringBuilders. It's better practice than this.
        return lastName + ", " + firstName + " ( " + mothersName + " )" + "[" + socialSecurityNumber + "]" + " "
                + (2023 - yearOfBirth);
    }
}
