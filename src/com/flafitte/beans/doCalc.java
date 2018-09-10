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
	
	// Return a number from a string
	private double getNumberFromString(String num) {
		return Double.parseDouble(num);
	}
}
