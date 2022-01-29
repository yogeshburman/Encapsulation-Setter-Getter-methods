class Test {
  
  private int accountno;
  
  // setter method 
  public void setAccountno(int no){
    
    accountno =no;
  }
  
  //getter method 
  public int  getAccountno(){
    
    return accountno;
  }
  
  public static void main (String[]args){
     Test t = new Test();
  t.setAccountno(1234); // setting value by calling setter method 
    
   System.out.println(t.getAccountno());  // Getting value by getting Getter methods
  
  
    
  }
 
  
}
