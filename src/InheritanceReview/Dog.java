package InheritanceReview;

public class Dog extends Animal{
    private String myColor;

    public Dog(int age, String nam, String color){
        super(age, nam);
        myColor = color;
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println("I eat dog food");
    }

    //overloading
    public void speak(String word){
        System.out.println(word);
    }

    @Override
    public String toString(){
        return "Age: " + super.getAge() + "\nName: " + super.getName() + "\nCOlor: " + myColor;
    }

    public void bark(){
        System.out.println("bark!");
    }
}
