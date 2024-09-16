import java.util.Scanner;

public class policy
{
   public static void main(String[] args)
   {
   
   Scanner scan = new Scanner(System.in);
   
   int policyNumber, policyHolderAge;
   double policyHolderHeight, policyHolderWeight;
   String providerName, policyHolderFirst, policyHolderLast, smokingStatus;
   
   double bmi, additionalFee = 0.0;
   int baseFee = 600;
   int ageFee = 75;
   int smokerFee = 100;
   double bmiFee;
   
   System.out.println("Please enter the Policy Number: ");
   policyNumber = scan.nextInt();
   System.out.println("Please enter the Provider Name: ");
   providerName = scan.nextLine();
   scan.nextLine();
   System.out.println("Please enter the Policyholder’s First Name: ");
   policyHolderFirst = scan.nextLine();
   
   System.out.println("Please enter the Policyholder’s Last Name: ");
   policyHolderLast = scan.nextLine();
   
   System.out.println("Please enter the Policyholder’s Age: ");
   policyHolderAge = scan.nextInt();
   System.out.println("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
   smokingStatus = scan.next();
   System.out.println("Please enter the Policyholder’s Height (in inches): ");
   policyHolderHeight = scan.nextDouble();
   System.out.println("Please enter the Policyholder’s Weight (in pounds): ");
   policyHolderWeight = scan.nextDouble();
   
   bmi = (policyHolderWeight * 703)/(policyHolderHeight * policyHolderHeight);
   
   bmiFee = ((bmi - 35) * 20);
   
   if (policyHolderAge > 50)
   {
   
      additionalFee = baseFee + ageFee;
   
   }
   
   if (smokingStatus.equals("smoker"))
   {
   
      additionalFee = baseFee + smokerFee;
   
   }
   
   if (bmi > 35)
   {
   
      additionalFee = baseFee + bmiFee;
   
   }
   
   
   //display info
   
   System.out.println("Policy Number: " + policyNumber);
   System.out.println("Provider Name: " + providerName);
   System.out.println("Policyholder’s First Name: " + policyHolderFirst);
   System.out.println("Policyholder’s Last Name: " + policyHolderLast);
   System.out.println("Policyholder’s Age: " + policyHolderAge);
   System.out.println("Policyholder’s Smoking Status: " + smokingStatus);
   System.out.println("Policyholder’s Height: " + policyHolderHeight);
   System.out.println("Policyholder’s Weight: " + policyHolderWeight);
   System.out.printf("Policyholder’s BMI: %.2f\n", bmi);
   System.out.printf("Policy Price: $%.2f", additionalFee);
   
  
      
   
   }
}