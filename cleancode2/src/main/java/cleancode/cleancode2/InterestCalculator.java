package cleancode.cleancode2;


import java.util.Scanner;
//import org.apache.logging.log4j.message.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class InterestCalculator 
{
	private static Logger logger=LogManager.getLogger(InterestCalculator.class);


    public static void main( String[] args )
    {

    	    			Scanner scanner=new Scanner(System.in);
    	logger.error("Enter the amount:");
        double amount=scanner.nextDouble();
        logger.error("Enter the No.of years:");
        double noOfYears=scanner.nextDouble();
        logger.error("Enter the Rate of  interest");
        double interestRate=scanner.nextDouble();
        logger.error("enter type of interest \n1)simple_interest\n2)compound_interest\n");
        int choice=scanner.nextInt();
        switch(choice) {
        case 1:simple_interest SI=new simple_interest(amount,noOfYears,interestRate);
        		logger.error("Simple interest ="+SI.calculate());
        		
        		
        		break;
        case 2:compound_interest CI=new compound_interest(amount,noOfYears,interestRate);
				logger.error("compound interest ="+CI.calculate1());
				break;
		default:logger.error("enter valid interest type in range 1 or 2");
				break;
        }
        scanner.close();
        		
    }
}
