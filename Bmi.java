import java.util.Scanner;

public class Bmi {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		
        System.out.print("Enter weight in pounds: ");
        double weightPounds = s.nextDouble();

        System.out.print("Enter height in inches: ");
        double heightInches = s.nextDouble();

        double heightMeters = heightInches * 0.0254;
        double weightKg = weightPounds * 0.453592;
        double bmi = weightKg / (heightMeters * heightMeters);

        System.out.println("BMI is: " + bmi);

		if(bmi<18.5)
		{
			System.out.println("Underweight");
		}
		else if(bmi<25)
		{
			System.out.println("Normal");
		}
		else if(bmi<30)
		{
			System.out.println("Overweight");
		}
		else
		{
			System.out.println("Obesity");
		}
    }
	
}
