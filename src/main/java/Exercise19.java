/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Umran Jameel
 */

import java.util.*;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);



        System.out.print("What is you height (inches)? ");
        String inches = in.nextLine();
        double height = Double.parseDouble(inches);


        System.out.print("What is your weight (pounds)? ");
        String pounds = in.nextLine();
        double weight = Double.parseDouble(pounds);


        double bmi = (weight / (height * height)) * 703;

        if (bmi < 18.5) {
            System.out.printf("Your BMI is %.1f\nYou should see your doctor.", bmi);
        }
        else if (bmi < 25) {
            System.out.printf("Your BMI is %.1f\nYou are within the ideal weight range.", bmi);
        }
        else {
            System.out.printf("Your BMI is %.1f\nYou are overweight, you should see your doctor.", bmi);
        }
    }
}
