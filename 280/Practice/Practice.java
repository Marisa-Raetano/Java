import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.lang.*;



class Practice{

  public static void myMethod(String[] args){
    Scanner stdIn = new Scanner(System.in);
    Vector<String> vector = new Vector<String>();
    for(int i = 0; i < 10; ++i){
      if(stdIn.hasNextLine()){


	String word = stdIn.nextLine();
	StringBuilder input = new StringBuilder();
	
	input.append(word);

	input.reverse();
	//System.out.println(input);


	//vector.addElement(word);
	System.out.println(input);

      }
    }
   


  }
  public static void main(String[] args){

    myMethod(args);
  }   
}



