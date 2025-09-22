import java.util.*; // Importing the Csanner class from the util packege
public class ChuongMayian {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Creating a Scanner object

        // Declaring the variable place holder
        String name;
        int age;
        double height;
        double weight;
        int jerseyNumber;


        System.out.print("Enter player's name: "); // calling the user name
        name = input.nextLine(); // Reading user input
        System.out.print("Enter player age: "); // Displaying a greeting
        age = input.nextInt(); // Reading user input
        System.out.print("Enter player height (in meters): ");
        height = input.nextDouble(); // Reading user input
        System.out.print("Enter player weight (in pounds): ");
        weight = input.nextDouble();
        System.out.print("Enter player jersey number: ");
        jerseyNumber = input.nextInt();
        input.close();

        // Converting the player details such as weight to kgs, height to cm
        final double POUND = 0.45359237;
        final double centimeters = 100;
        double heightCm = height * centimeters;
        double weightKg = weight * POUND;
        int heightCmInt = (int) heightCm;
        int weightKgInt = (int) weightKg;


        //Checking the eligibility of the player to play
        String eligibility;
        boolean isEligible = (age >= 18) && (age <= 35) && (weightKgInt < 90);
        if (isEligible){
            eligibility = "Eligible";
        }else{
            eligibility = "Not Eligible";
        }
        // Declaring the player's details
        String position;
        String stage;
        String attackerJersey;
        String finalDecision;
        String lineUpDecision;

        // Checking the position of the player
        boolean isGoalKeeper = (jerseyNumber == 1);
        boolean isDefender = (jerseyNumber >= 2) && (jerseyNumber <= 6);
        boolean isStriker = (jerseyNumber == 9) || (jerseyNumber == 10) || (jerseyNumber == 11) || (jerseyNumber == 7);
        boolean isMidFielder = (jerseyNumber == 8) || (jerseyNumber == 12) || (jerseyNumber == 13);
        boolean isRisingStar = (age < 20);
        boolean isPrime = (age >= 20 && age < 30);
        boolean isVeteran = (age >= 30 && age <= 35);
        boolean makeLineUp = isGoalKeeper || isDefender || isStriker && isEligible;
        if (isGoalKeeper){
            position = "Goalkeeper";
        } else if (isDefender) {
            position = "Defender";
        } else if (isMidFielder) {
            position = "Midfielder";
        } else if (isStriker) {
            position = "Striker";
        } else {
            position = "Unknown";
        }
        if (isRisingStar){
            stage = "Rising Star";
        } else if (isPrime) {
            stage = "Prime Player";
        } else if (isVeteran) {
            stage = "Veteran Player";
        } else {
            stage = "Unknown";
        }
        if (isStriker){
            attackerJersey = "Yes";
        } else {
            attackerJersey = "No";
        }
        if (makeLineUp){
            finalDecision = "Selected";
        } else {
            finalDecision = "Not Selected";
        }
        if (makeLineUp){
            lineUpDecision = "Yes";
        } else {
            lineUpDecision = "No";
        }

        // Displaying the player's information on the screen
        System.out.println("Player's profile");
        System.out.println("____________________________");
        System.out.println("Player: " + name);
        System.out.println("Age: " + age + " (" + stage + ")");
        System.out.println("Height: " + heightCmInt + " cm");
        System.out.println("Weight: " + weightKgInt + " kg");
        System.out.println("Jersey: " + jerseyNumber);
        System.out.println("Position: " + position);
        System.out.println("Attacker jersey: " + attackerJersey);
        System.out.println("Eligibility: " + eligibility);
        System.out.println("Lineup decision: " + lineUpDecision);
        System.out.println("Final Decision: " + finalDecision);
    }
}