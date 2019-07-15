package com.RezaAk.meritamerica.Calculator1;

public class CalculatorTest {
	
    public static void main(String[] args) {
    	
    	
    	
        Calculator result = new Calculator();
        
        
        
        
        System.out.println(result.getResults(14.25, '+', 5.75));
        System.out.println(result.getResults(22.11, '+', 8.75));
        System.out.println(result.getResults(10.01, '-', 4.33));
        System.out.println(result.getResults(16.22, '-', 11.65));
    }
}