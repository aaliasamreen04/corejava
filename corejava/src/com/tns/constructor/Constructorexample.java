package com.tns.constructor;
//  demo constructor

public class Constructorexample {
	
	   Constructorexample () {
		   System.out.println("default constructor");
	   }
	   
	   Constructorexample(int i) {
		   System.out.println("constructor with 1 parameter");
	   }
	   Constructorexample(int i , int j) {
		    System.out.println("constructor with 2 parameter");
	   }
	   
	   Constructorexample(String s, int i) {
		    System.out.println("constructor with diff datatype ");
		    
	   }

	   public static void main(String[] args) {
	        Constructorexample e=new Constructorexample  ();
	        Constructorexample e1=new Constructorexample (2);     
            Constructorexample e3=new Constructorexample (3,5);
            Constructorexample e4=new Constructorexample  ("aalia",7);
     
	   }
       }