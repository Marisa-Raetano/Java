import java.io.*;


class FileDemo{

  public static void main(String[] args){
    try{
      String filename = "test";
      File f - new File(filename + ".txt");
      int num = 1;
      while(f.exists()){
	num += 1;
	f = new File(filename + num + ".txt");
      }
      FileWriter fout = new FileWriter(f);
      for(int i = 0; i < 23; ++i){
	String line = " " + i;
	fout.write(line+ "\n");
      }
      fout.close();
    }catch( Exception e){
    }
  }
}

