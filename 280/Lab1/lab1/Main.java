import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;

class Main{

  public static void main(String[] args){

    //try{
    //File file = new File("HURDAT2.txt");
    Scanner stdIn = new Scanner(System.in);
    String line = stdIn.nextLine();
    String[] tokens = line.split(" , ");

    System.out.println(tokens.length);
    /*
    // Hurricane h1 = new Hurricane();
    while (stdIn.hasNextLine()) {
    String data = stdIn.nextLine();
    System.out.println(stdIn.hasNextLine());
    }
    }
    //catch (IOException ex) {
    // Handle exception
    }
     */
/*
    final String FILE_NAME = "HURDAT2.txt";
    Scanner scnr = new Scanner(new FileInputStream(FILE_NAME));
    while (scnr.hasNextLine()) {
      System.out.println(scnr.nextLine());
    }
    scnr.close();
*/
    Hurricane h1 = new Hurricane(tokens[0].trim(),tokens[1].trim());
    int times = Integer.parseInt(tokens[tokens.length-1].trim());
    for(int i= 0; i < times; ++i){
      line = stdIn.nextLine();
      h1.addObservation(line);
    }
    System.out.println(h1);
  }
}






