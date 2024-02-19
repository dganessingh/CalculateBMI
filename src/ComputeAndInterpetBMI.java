import java.util.*;

public class ComputeAndInterpetBMI {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // ask user to input a weight and a height in feet and inches
        System.out.println("Please enter a weight in pounds.");
        double weight = input.nextDouble();

        System.out.println("Please enter a height in feet and inches.");
        double heightFeet = input.nextDouble();
        double heightInches = input.nextDouble();

        final double kilogramsPerPound = 0.453592;
        final double metersPerInch = 0.0254;

        // convert total height to meters and weight to kilograms
        double totalHeight = (heightFeet * 12) + heightInches;
        double weightInKilograms = weight * kilogramsPerPound;
        double heightInMeters = totalHeight * metersPerInch;

        // calculate BMI
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        System.out.println("BMI is " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

    }
}
