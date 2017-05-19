package ru.job4j.calculator;


public class Calculator {
	double result;
	
	public double getResult(){
		return this.result;
	}
	
	void add(double first, double second){
		 this.result = first + second;
	}
	
	void substruct(double first, double second){
		 this.result = first - second;
	}
	
	void div (double first, double second){
		 this.result = first / second;
	}
	
	void multiple(double first, double second){
		 this.result = first * second;
	}
}

