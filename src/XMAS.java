public class XMAS {
    public static void main (String[] args){

        System.out.println("\n\n");
        int branches = 16;
        int num = 1;
        String[] types = {".",".",".",".","-","-","-","-","'","'","'","'","O",};

        for(int r = branches + 1; r >= 1; r--){
            if(num == 1){
                for(int c = 0; c < r; c++)
                    System.out.print(" ");

                System.out.print("*\n");
                num+=2;
            }else{
                for(int x = 0; x < r; x++)
                    System.out.print(" ");

                for(int y = 0; y < num; y++) {
                    int index = (int) (Math.random() * types.length);
                    System.out.print(types[index]);
                }
                System.out.print("\n");
                num += 2;
            }
        }

        for(int x = 0; x < branches + 1; x++){
            System.out.print(" ");
        }
        System.out.print("|\n");
        for(int x = 0; x < branches + 1; x++){
            System.out.print(" ");
        }
        System.out.print("|\n\nHappy Holdidays From JAVA!");

    }
}
/*
C:\Users\delamora.n\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=53125:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\delamora.n\Desktop\AP Computer Science\out\production\AP Computer Science" XMAS



                 *
                .'-
               ....'
              '--..-'
             '--.-.-'-
            '..'''---'.
           -.O-.'.-.-.O-
          '.''.'-.O..'''-
         .-''''..O'-'OOO''
        ''O.O'O-..'.-.'-'.'
       ''.-..-''..''--''.'-'
      '--''...--.--.-.'-..-'.
     O''..-'O...-''.'-'''-O.--
    '''-'.''--.'-..--.O.''.'''-
   '-.-'.-.-.''..-'..'O.''-.''--
  -'.'..-..'...'O.'O...'.O--O'O'-
 ''..''O'.-O'.O..-.'..--.'...'.-'-
                 |
                 |

Happy Holdidays From JAVA!
Process finished with exit code 0

 */