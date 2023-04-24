package InheritanceReview;

public class Animal {
    private int myAge;
    private String myName;

    public Animal(){
        myAge = 0;
        myName = "";
    }

    public Animal(int age, String nam){
        myAge = age;
        myName = nam;
    }

    public void eat(){
        System.out.println("I can eat");
    }

    public void speak(){
        System.out.println("Hello There!");
    }

    public int getAge(){return myAge;}
    public String getName(){return myName;}
}
