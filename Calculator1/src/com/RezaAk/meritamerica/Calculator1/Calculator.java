package com.RezaAk.meritamerica.Calculator1;


// Reza Akhlaqi 	7-14-2019

//need to import this to implement the serializable interface.
import java.io.Serializable;



public class Calculator implements Serializable {
    
	
	//The serializable class Calculator need to declare a static final serialVersionUID field of type long
	// The code in line 16 is suggested by IDE
	private static final long serialVersionUID = 1L;
	
	private double operandOne;
    private double operandTwo;
    private Character operation;
    
    
    
    public Calculator() {
    	
    }
    
    
    
   //getters 
	public double getOperandOne() {
		return operandOne;
	}
	
	
	public Character getOperation() {
		return operation;
	}
	
	
	public double getOperandTwo() {
	return operandTwo;
	}
	
	
	
	
	//setters
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	
	
	public void setOperation(Character operation) {
        if (operation == '+' || operation == '-') {
            this.operation = operation;
        } else {
            this.operation = '+';
        }
	}

	
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
    }
	
	
	
	
	
	
	
	
	
	
	
	
    public double peformOperation() {
        if (this.operation == '+') {
            double result = operandOne + operandTwo;
            return result;
        } else {
            double result = operandOne - operandTwo;
            return result;
        }
    }
    
    
    
    
    public double getResults(double one, Character op, double two) {
        this.setOperandOne(one);
        this.setOperation(op);
        this.setOperandTwo(two);
        double result = this.peformOperation();
        return result;
    }
    
    
    

}