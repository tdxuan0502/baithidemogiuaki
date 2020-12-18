package exception;
import java.util.*;
class InvalidInputException extends Exception {
    public InvalidInputException(String exceptionText){
	super(exceptionText);
}
    }
public class TestExceptionInput {
	static void validateInput(int number) throws InvalidInputException {
		if(number<20 | number>100) {
			throw new InvalidInputException("");
		}
		System.out.println("valid input");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.print("enter a number les than 100 ");
int number = sc.nextInt();
try {
	validateInput(number);
}catch(InvalidInputException e) {
	System.out.println("caught exception -input is greater than 100 invalid");
}
	}

}
