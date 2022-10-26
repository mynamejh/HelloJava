package co.edu.inherit;

public class Parent extends Object {
	String field;
	Parent (){
		System.out.println("Parent() call");
	}
	Parent(String args){
		System.out.println("Parent() call.");
	}
	
	void method() {
		System.out.println("parent method() call.");
	}
	
	
	
}
