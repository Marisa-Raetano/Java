import java.util.Scanner;


class AndGate{
  private Input a;
  private Input b;
  
  public AndGate(Input _a, Input _b){
    this.a = _a;
    this.b = _b;
  }

  public boolean evaluate(){

    return a.evaluate() && b.evaluate();


  }


  public String toString(){
    return "(" + this.a.evaluate() + " AND " + this.b.evaluate() + ")";
  }

}

class OrGate{
  private Input a;
  private Input b;

  public OrGate(Input _a, Input _b){
    this.a = _a;
    this.b = _b;
  }


  public boolean evaluate(){

    return a.evaluate() || b.evaluate();

  }

  public String toString(){
    return "(" + this.a.evaluate() + " OR " + this.b.evaluate() + ")";
  }

}


class Input{
  private boolean value = false;
  public Input(){
    this.value = false;
  }

  public Input(boolean b){
    this.value = b;
  }

  public boolean evaluate(){
    return this.value;
  }

  public String toString(){
    return " " + this.value;
  }

}


class NotGate{
  private Input a;
  public NotGate(Input _a){
    this.a = _a;
  }
  public boolean evaluate(){
    return !a.evaluate();
  }

  public String toString(){
    return "(NOT " + this.a.evaluate() + ")";

  }
}

class Main{

  public static void main(String[] args){

    Input a = new Input(true);
    Input b = new Input(false);
    AndGate ag = new AndGate(a,b);
    System.out.println(ag.evaluate());
    System.out.println(ag);

  }
}


