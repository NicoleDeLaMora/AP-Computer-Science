public class crying(){
  public static main(String[] args){
    String str = "dib";


 boolean b =false; 
 boolean a = false;
 
 
 if (str.substring(0,1).equals("f")){
   a = true;
 }else a=false;
 
 if (str.substring(str.length()-1, str.length()).equals("b")){
   b=true;
 }else b=false;
 
 if (a==true && b==true){
   return "FizzBuzz";
 }else if (b==true){
   return "Buzz";
 }else if(a==true){
   return "Fizz"
 }else return str;
}

  }
}