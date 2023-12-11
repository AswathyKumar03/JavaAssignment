package classDataTypeAssignment;

public class ArrayUtility {
	
	int checkYesOrNo(String userInput) {
		
		int isInputIsValid = -1;
		
		if("yes".equalsIgnoreCase(userInput)) {
			isInputIsValid = 1;
		}else if(("no".equalsIgnoreCase(userInput))){
			isInputIsValid = 0;
		}else {
			System.out.println("Invalid input");
			
		}
		return isInputIsValid;
	}
}
