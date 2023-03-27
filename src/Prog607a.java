import java.util.*;

public class Prog607a {
  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);
    System.out.println("-----menu-----");
    System.out.println("0) Quit");
    System.out.println("1) Encode Date");
    System.out.println("2) Decode Date");
    System.out.print("Select an option ");
    int option = input.nextInt();

    // loop it
    while (option != 0) {
        
      if (option == 1) {
        //encode it
          System.out.print("\nenter date(m/d/y) "); //09/18/83
          String Date = input.next();
          String encode = "";
        //months = a-l
        encode += encodeMonth(Date.substring(0,2));
        //dates (didgits) = q-z  //days are always 2 didgits
        encode += encodeDate(Date.substring(3,5));
        //year take years, subtract 1970, z = 1, a = 26
        encode += encodeYear(Date.substring(6));


        System.out.print("The code is: " + encode);
      }else{ // decode it // opposite of everything else
        System.out.print("\nenter code ");
        String code = input.next();
        String date = "";

        int mmonth = decodeMonth(code.substring(0,1));
        String day = decodeDate(code.substring(1,3));
        int year = decodeYear(code.substring(3));

        System.out.print("The date is: " + mmonth + "/" + day + "/" + year);
      }
    
      // if option wasnt 0, write again yk
      System.out.println("\n");
      System.out.println();
        System.out.println("-----menu-----");
        System.out.println("0) Quit");
        System.out.println("1) Encode Date");
        System.out.println("2) Decode Date");
        System.out.print("Select an option ");
         option = input.nextInt();
    }

  }

  public static String encodeMonth(String month){
    if(month.equals("01")){
      return "A";
    }else if(month.equals("02")){
      return "B";
    }else if(month.equals("03")){
      return "C";
    }else if(month.equals("04")){
      return "D";
    }else if(month.equals("05")){
      return "E";
    }else if(month.equals("06")){
      return "F";
    }else if(month.equals("07")){
      return "G";
    }else if(month.equals("08")){
      return "H";
    }else if(month.equals("09")){
      return "I";
    }else if(month.equals("10")){
      return "J";
    }else if(month.equals("11")){
      return "K";
    }else return "L"; //euals 12
  }

  public static String encodeDate(String date){
    String first = date.substring(0,1);
    String second = date.substring(1);
    String answer = "";
    
    if(first.equals("1"))
      answer+= "Q"; //qrstuvwxyz
    else if(first.equals("2"))
      answer += "R";
    else if(first.equals("3"))
      answer += "S";
    
    if(second.equals("0")){
      answer += "Z";
    }else if(second.equals("1")){
      answer += "Q";
    }else if(second.equals("2")){
      answer += "R";
    }else if(second.equals("3")){
      answer += "S";
    }else if(second.equals("4")){
      answer += "T";
    }else if(second.equals("5")){
      answer += "U";
    }else if(second.equals("6")){
      answer += "V";
    }else if(second.equals("7")){
      answer += "W";
    }else if(second.equals("8")){
      answer+= "X";
    }else{ //9
      answer += "Y";
    }
    return answer;
  }

  public static String encodeYear(String year){
    int yer = Integer.parseInt(year);

    yer -= 70;
    if(yer == 26){
      return "A";
    }else if(yer == 25){
      return "B";
    }else if(yer == 24){
      return "C";
    }else if(yer == 23){
      return "D";
    }else if(yer == 22){
      return "E";
    }else if(yer == 21){
      return "F";
    }else if(yer == 20){
      return "G";
    }else if(yer == 19){
      return "H";
    }else if(yer == 18){
      return "I";
    }else if(yer == 17){
      return "J";
    }else if(yer == 16){
      return "K";  //abcdefghijklmnopqrstuvwxyz
    }else if(yer == 15){
      return "L";
    }else if(yer == 14){
      return "M";
    }else if(yer == 13){
      return "N";
    }else if(yer == 12){
      return "O";
    }else if(yer == 11){
      return "P";
    }else if(yer == 10){
      return "Q";
    }else if(yer == 9){
      return "R";
    }else if(yer == 8){
      return "S";
    }else if(yer == 7){
      return "T";
    }else if(yer == 6){
      return "U";
    }else if(yer == 5){
      return "V";
    }else if(yer == 4){
      return "W";
    }else if(yer == 3){
      return "X";
    }else if(yer == 2){
      return "Y";
    }else return "Z";


    /*
    if(yer == 26)
       retrun "A";
    else if (yer == 25)
      retrun "B";
    else if (yer == 24)
      retrun "C";
    else if (yer == 23)
      retrun "D";
    else if (yer == 22)
      retrun "E";
    else if (yer == 21)
      retrun "F";
    else if (yer == 20)
      retrun "G";
    else if (yer == 19)
      retrun "H";
    else if (yer == 18)
      retrun "I";
    else if (yer == 17)
      retrun "J";
    else if (yer == 16)
      retrun "K";
    else if (yer == 15)
      retrun "L";
    else if (yer == 14)
      retrun "M";
    else if (yer == 13)
      retrun "N";
    else if (yer == 12)
      retrun "O";
    else if (yer == 11)
      retrun "P";
    else if (yer == 10)
      retrun "Q";
    else if (yer == 9)
      retrun "R";
    else if (yer == 8)
      retrun "S";
    else if (yer == 7)
      retrun "T";
    else if (yer == 6)
      retrun "U";
    else if (yer == 5)
      retrun "V";
    else if (yer == 4)
      retrun "W";
    else if (yer == 3)
      retrun "X";
    else if (yer == 2)
      retrun "Y";
    else // (yer == 1)
      retrun "Z";
    */
  }


  
  public static int decodeMonth(String month){
    if(month.equals("A"))
      return 1;
    else if(month.equals("B"))
      return 2;
    else if(month.equals("C"))
      return 3;
    else if(month.equals("D"))
      return 4;
    else if(month.equals("E"))
      return 5;
    else if(month.equals("F"))
      return 6;
    else if(month.equals("G"))
      return 7;
    else if(month.equals("H"))
      return 8;
    else if(month.equals("I"))
      return 9;
    else if(month.equals("J"))
      return 10;
    else if(month.equals("K"))
      return 11;
    else return 12;  
  }

  public static String decodeDate(String date){
    String first = date.substring(0,1);
    String second = date.substring(1);
    String ans = "";

    if(first.equals("Q"))
      ans+= 1;
    else if(first.equals("R"))
      ans+=2;
    else if(first.equals("S"))
      ans+=3;

    if(second.equals("Q"))//qrstuvwxyz
      ans+= 1;
    else if(second.equals("R"))
      ans+=2;
    else if(second.equals("S"))
      ans+=3;
    else if(second.equals("T"))
      ans+=4;
    else if(second.equals("U"))
      ans+=5;
    else if(second.equals("V"))
      ans+=6;
    else if(second.equals("W"))
      ans+=7;
    else if(second.equals("X"))
      ans+=8;
    else if(second.equals("Y"))
      ans+=9;
    else 
      ans+=0;

    return ans;
  }

  public static int decodeYear(String year){
    if(year.equals("Z"))
      return 1970 + 1;
    else if(year.equals("Y"))
      return 1970 + 2;
    else if(year.equals("X"))
      return 1970 + 3;
    else if(year.equals("W"))
      return 1970 + 4;
    else if(year.equals("V"))
      return 1970 + 5;
    else if(year.equals("U"))
      return 1970 + 6;
    else if(year.equals("T"))
      return 1970 + 7;
    else if(year.equals("S")) //abcdefghijklmnopqrstuvwxyz
      return 1970 + 8;
    else if(year.equals("R"))
      return 1970 + 9;
    else if(year.equals("Q"))
      return 1970 + 10;
    else if(year.equals("P"))
      return 1970 + 11;
    else if(year.equals("O"))
      return 1970 + 12;
    else if(year.equals("N"))
      return 1970 + 13;
    else if(year.equals("M"))
      return 1970 + 14;
    else if(year.equals("L"))
      return 1970 + 15;
    else if(year.equals("K"))
      return 1970 + 16;
    else if(year.equals("J"))
      return 1970 + 17;
    else if(year.equals("I"))
      return 1970 + 18;
    else if(year.equals("H"))
      return 1970 + 19;
    else if(year.equals("G"))
      return 1970 + 20;
    else if(year.equals("F"))
      return 1970 + 21;
    else if(year.equals("E"))
      return 1970 + 22;
    else if(year.equals("D"))
      return 1970 + 23;
    else if(year.equals("C"))
      return 1970 + 24;
    else if(year.equals("B"))
      return 1970 + 25;
    else
      return 1970 + 26;
  }
  //done 
}

/*
-----menu-----
0) Quit
1) Encode Date
2) Decode Date
Select an option 1

enter date(m/d/y) 09/14/83
The code is: IQTN


-----menu-----
0) Quit
1) Encode Date
2) Decode Date
Select an option 2

enter code AOQV
The date is: 1/1/1975


-----menu-----
0) Quit
1) Encode Date
2) Decode Date
Select an option 0

Process finished with exit code 0

 */