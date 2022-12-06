//Nicole de la Mora // 12/6/22 // My ArrayList Lab
public class MyArrayListLab {
    public static void main(String[] args) {
        intArrayList list = new intArrayList();
        System.out.println("Testing add() and get()...");
        for (int i = 0; i < 10; i++)
            list.add(i);
        for (int i = 0; i < list.size(); i++)
            System.out.println("list.get(" + i + ") = " + list.get(i));
        System.out.println("\nTesting set()...");
        for (int i = 0; i < list.size(); i++)
            list.set(i, i * 2);
        for (int i = 0; i < list.size(); i++)
            System.out.println("list.get(" + i + ") = " + list.get(i));
        System.out.println("\nTesting remove()...");
        for (int i = 0; i < list.size(); i++)
            if (i % 3 == 0) list.remove(i);
        for (int i = 0; i < list.size(); i++)
            System.out.println("list.get(" + i + ") = " + list.get(i));
        System.out.println("\nTesting indexOf()...");
        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * 20);
            System.out.println("list.indexOf(" + num + ") = " + list.indexOf(num));
        }
    }
}
/*
C:\Users\delamora.n\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=54963:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\delamora.n\Desktop\AP Computer Science\out\production\AP Computer Science" MyArrayListLab
Testing add() and get()...
list.get(0) = 0
list.get(1) = 1
list.get(2) = 2
list.get(3) = 3
list.get(4) = 4
list.get(5) = 5
list.get(6) = 6
list.get(7) = 7
list.get(8) = 8
list.get(9) = 9

Testing set()...
list.get(0) = 0
list.get(1) = 2
list.get(2) = 4
list.get(3) = 6
list.get(4) = 8
list.get(5) = 10
list.get(6) = 12
list.get(7) = 14
list.get(8) = 16
list.get(9) = 18

Testing remove()...
list.get(0) = 6
list.get(1) = 8
list.get(2) = 10
list.get(3) = 12
list.get(4) = 14
list.get(5) = 16
list.get(6) = 18

Testing indexOf()...
list.indexOf(3) = -1
list.indexOf(10) = 2
list.indexOf(7) = -1
list.indexOf(16) = 5
list.indexOf(16) = 5
list.indexOf(4) = -1
list.indexOf(15) = -1
list.indexOf(15) = -1
list.indexOf(17) = -1
list.indexOf(5) = -1

Process finished with exit code 0

 */