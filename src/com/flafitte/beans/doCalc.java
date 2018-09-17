package com.flafitte.beans;


public class doCalc {
	private String result;
	public String getResult() {
		return result;
	}

	
	// Perform the calculation
	// fields[0] : first number
	// fields[1] : operator type
	// fields[2] : second number 
	// Store result in same name variable
	public doCalc(String field1, String operator, String field2) {
		double res[]= new double[2];
		
		res[0]=getNumberFromString(field1);
		res[1]=getNumberFromString(field2);

		if (operator.equals("plus")){
			result=Double.toString((res[0]+res[1]));
		}
		else if (operator.equals("moins")) {
			result= Double.toString((res[0]-res[1]));
		}
		else if (operator.equals("fois")) {
			result= Double.toString((res[0]*res[1]));
		}
		else if (operator.equals("divisé par")) {
			if (res[1] != 0) {
				result= Double.toString((res[0]/res[1]));
			}
			else {
				result= "Division par zéro !";
			}
		}
		else
			{
			result="Erreur";
		}
	}
	
	// Performs huge values like 5.2*65+36/8 etc.
	// Store result in var result
	public doCalc(String value) {
		// Parse 
		String F1 = null, F2=null;
		char op=' ';
		//result=value;
		
		for (int i = 0; i < value.length(); i++){
		    char c = value.charAt(i);        
		    
		    // Test if it's numeric
		    if (Character.isDigit(c) || (c=='.')) {
		    	if (op==' ') {
		    		if (F1== null) {
		    			F1=Character.toString(c);
		    		}
		    		else {
		    			F1=F1+Character.toString(c);
		    		}
		    		
		    	}
		    	else {
		    		if (F2== null) {
		    			F2=Character.toString(c);
		    		}
		    		else {
		    			F2=F2+Character.toString(c);
		    		}
		    	}
		    }
		    // Else it's an operator
		    else {
		    	if (op!=' ') {
	    			// Performs calculation of F1 op F2, store result in F1, add operator
		    		F1=calculate(F1,op,F2);
		    		op= ' ';
		    		F2=null;
		    	}
		    	op=c;
		    	
		    }
		}
		
		// Return final result
		result=calculate(F1,op,F2);
		
		
	}
	
	public String calculate(String field1, char operator, String field2) {
		double res[]= new double[2];
		String returnResult = null;
		
		res[0]=getNumberFromString(field1);
		res[1]=getNumberFromString(field2);

		switch (operator) {
			case '+' :
				returnResult=Double.toString((res[0]+res[1]));
				break;
			case '-' :
				returnResult=Double.toString((res[0]-res[1]));
				break;
			case '*' :
				returnResult=Double.toString((res[0]*res[1]));
				break;
			case '/' :
				if (res[1] != 0) {
				returnResult=Double.toString((res[0]/res[1]));
				}
				else {
					returnResult="ERROR!";
				}
				
		}
		
		return returnResult;

	}
	
	// Return a number from a string
	private double getNumberFromString(String num) {
		try {
			return Double.parseDouble(num);
		}
		catch (NumberFormatException e) {
			System.out.println("Probleme de format de nombre invalide (" + num + ")" );
			return 0.0d;
		}
		catch (Exception e) {
			System.out.println("Invalid number ("+ num + ")");
			return 0.0d;
		}
	
	}


}
		
