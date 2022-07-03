import java.util.*;

class Hurricane{
  private String name = "";
  private String date = "";

  public Hurricane(String d, String n){
    this.date = d;
    this.name = n;

  }

  public void addObservation(String line){
    String[] tokens = line.split(" , ");
  }

  public String toString(){
    return this.name + " on " + this.date;

  }

}
