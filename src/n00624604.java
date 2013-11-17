/*
 * Assignment #6       NO LATE ASSIGNMENTS ACCEPTED PLEASE.     
DUE 11pm, Sunday, November 17, 2013                  

UPDATE: HAVE THE PROGRAM PROMPT FOR TWO INTS. 
ENTER TWO INTS, THE FIRST BEING THE MAXIMUM VALUE OF
THE INTS THAT ARE INSERTED AND THE SECOND BEING THE
MAXIMUM VALUE OF THE INTS THAT ARE SEARCHED FOR: ENTER THEM ON
ONE LINE, BUT IN NO CASE SHOULD EITHER EXCEED 2**31-1:


Note:  There is a method named hashcode() in Object
and a class named java.util.HashTable that overrides
hashcode(). Do NOT use either of these. I want you to write a  hash()
method that is "polynomial" based; do not use the one on page 536.
Use the hash() idea on page 523 where he shows how to hash() 7546.
It is required that you compute that polynomial using the technique we discussed
in class so as to avoid overflow at each stage. See:
http://math.fullerton.edu/mathews/n2003/HornerMod.html and/or pages 564-565.


NOW FOR THE PROBLEM!

Perform simulations to compare the observed performance of hashing with 
the theoretical results.  You will use open addressing as shown on page 
528.   Initially, declare a linear probe hash table.  

You are going to study linear probing with load factors of .1, .2 , .3, 
....,  and .9.   The formula that you will be testing is:
The average probe length using linear probing is roughly 
( 1 + 1/(1-L)**2)/2 (UNsuccessful) or (1+1/(1-L))/2 (successful).  See page 567 (they are
reversed there.)  THESE FORMULAS DO TAKE
INTO ACCOUNT THAT THE PROBE LENGTH DOES COUNT THE TOTAL LENGTH, NOT JUST THE LENGTH AFTER
THE HASH. TO SEE THIS, SIMPLY ASK DO THE FORMULAS MAKE SENSE WHEN L==0. IN BOTH CASES,
THE AVERAGE PROBE LENGTH IS 1.

NOTE THAT DIFFERENT FORMULAS ARE USED FOR QUADRATIC PROBING..SEE THE BOOK.

For each load factor, 10,000 randomly generated positive ints between 1 and 
THE MAXIMUM VALUE FROM THE FIRST UPDATE AT THE TOP (inclusive) will be 
inserted into a table of the "right" size, where "right" is strictly based upon the
load factor you are testing. Repeats are allowed.
Be sure that your formula for randomly generated ints is correct.
There is a class called Random in java.util. USE it!

After a table of the right (based upon L) size is loaded with 10,000 ints, 
do 100 searches of newly  generated random ints between 1 AND THE MAXIMUM VALUE FROM THE 
SECOND UPDATE AT THE TOP (inclusive).
Compute the average probe length for each of the two formulas and indicate the denominators used
in each calculation.
So, for example, each test for a .5 load would have a table of size 
approximately 20,000 (adjusted UPWARD to be prime) and similarly each test for a .9 load would 
have a table of approximate size 10,000/.9 (again adjusted to be prime).

The program should run displaying the various load factors tested, the 
average probe for each search (the two denominators used to compute
the averages will add to 100), and the theoretical 
answers using the formula above.

The "empirical" columns below are the observed averages from your experiments and
the "theoretical" columns are the results from the formulas.
The demoninator columns are listed so that you know exactly how many times a random int
was either found or not found.

So your output should  have six answers in each row on the console:

load    empirical-success  denominator theoretical-success  empirical-failure denominator theoretical-failure   
----    -----------------  ----------- -------------------  ----------------- -----------  ------------------
.1  
.2 
.3
.4
.5
.6
.7
.8
.9

Now, also produce similar output using quadratic probing to compare with the theoretical results from page 568.
DO NOT HAVE A MENU SYSTEM FOR EITHER OF THESE OUTPUTS....SIMPLY PRODUCE BOTH OUTPUT TABLES.

load    empirical-success  denominator theoretical-success  empirical-failure denominator theoretical-failure
----    ----------------------------------------------------------------------------------------------------
.1
.2
.3
.4
.5
.6
.7
.8
.9



Enjoy!



	turnin an electronic version using
	$ turnin bigone kmartin.cop3530.a6

 */
 
 import javax.swing.*; 
import java.util.*;
 
 
 class n00624604{
	 
	 public static void main(String args[]){
		 Prompt prompt = new Prompt();		 
	 }
 }
  
  
 //this class generates a gui prompt for two seperate ints 
class Prompt{
	
	private int maxintsinserted;
	private int maxintsearch;
	
		
	Prompt(){
		
		try{
		String x = JOptionPane.showInputDialog(null, "ENTER TWO INTS, THE FIRST BEING THE MAXIMUM VALUE OF THE INTS THAT ARE INSERTED AND THE SECOND BEING THE MAXIMUM VALUE OF THE INTS THAT ARE SEARCHED FOR: BUT IN NO CASE SHOULD EITHER EXCEED 2**31-1");
					
		StringTokenizer tokenizer = new StringTokenizer(x);
		
		maxintsinserted = Integer.parseInt(tokenizer.nextToken());
		maxintsearch	= Integer.parseInt(tokenizer.nextToken());
		}
		
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "Failed to parse ints (did you enter them correctly?)");
		}
				
	}
	
	public int getMaxInsert(){
		return(maxintsinserted);
	}
	
	public int getMaxSearch(){
		return(maxintsearch);
	}
}

//This class builds and checks a hashtable with linear probing
class LinearHashChecker{	
	
	private int primelength;
	
	
	LinearHashChecker(float loadfactor, float data){		
		int length = (int)(data/loadfactor); //loadfactor = data/length, length = data/loadfactor	
		
		while(!isPrime(length)){
			++length;
		}		
		primelength = length;	
	}
	
	
	
	public boolean isPrime(int x){
		
		int halfx = x/2;
		boolean isprime = false;
		
		for(int i=2;i<halfx;i++){
			if(x%halfx==0){
				isprime = true;
			}
		}
		return(isprime);
	}
	
	public void theoreticalAvg(int l){
		
		int theoavgu;
		int theoavgs;
		
		//( 1 + 1/(1-L)**2)/2 (UNsuccessful) or (1+1/(1-L))/2 (successful)
		
		
	}
	
}

//THis class builds and checks a hashtable with quadradic probing
class QuadradicHashChecker{

public int length;
public int loadfactor;

	
}

// this class contains a method for checking if an int is prime or not (may be expanded later)
class Primes{
	public boolean isPrime(int x){
		
		int halfx = x/2;
		boolean isprime = false;
		
		for(int i=2;i<halfx;i++){
			if(x%halfx==0){
				isprime = true;
			}
		}
		return(isprime);
	}
}

