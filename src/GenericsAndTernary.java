public class GenericsAndTernary {
    //Generic Typing
    //means template type instead of having an explicit varible

    //MyBox is essentiualy the same thing as an arraylist -- not specific to a type, ocu
    static class  MyBox<T>{ //define template type T
        private T myVal;

        public MyBox(T thing){myVal = thing;}

        public void setVal(T thing){myVal = thing;}

        public T getVal(){return myVal;}


    }

    public static void main(String[] args){
        var box = new MyBox<Integer>(5);

        String mess = (box.getVal() >= 5) ?"val >= 5" : "val < 5";  //has condition,
        //Ternary Operator -> (condition "if" ... "else"...
        System.out.println(mess);
        box.setVal(10);
        System.out.println(box.getVal());

        var sBox = new MyBox<String>("hello");
        System.out.println(sBox.getVal());

        //only ever use var if you use the "new" keyword
        //and the type is not a child class or uses interface

        int day = 3;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wenday");
                break;
            case 4: //if day == 4
                System.out.println("Thursday");
                break; //break stops you from going to the case bleow
            default: //else
                System.out.println("Invalid");

        }
    }
}
