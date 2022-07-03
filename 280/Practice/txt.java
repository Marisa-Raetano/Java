import java.util.Scanner;

class stdIn{

  public static void main(String[] args){

    Scanner stdIn = new Scanner(System.in);
    while(stdIn.hasNextLine()){
      String word = stdIn.nextLine();
      System.out.println(word);
    }   



  }

}
