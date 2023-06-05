import java.util.*;
import java.util.function.Function;

public class FuncProgAndCalculus {
    public static double f(double x) {return Math.pow(x,3);} //f(x) = x ^3

    public static double derive(Function<Double, Double> f, double x){
        final double h = 0.0000001;
        return (f(x-h) - f(x))/h;
    }
    public static double derive(Function<Double, Double> f, double x, double h) {
        return (f(x-h) - f(x))/h;
    }
    public static double deriveN(Function<Double, Double> f, double x, int n) {
        final double h = 1/Math.pow(10,n);
        if(n==1) return derive(f,x);
        else return (derive(f,x+h, n-1) - deriveN(f, x, n-1))/h;
    }
    public static double integrate(Function<Double, Double> f, double a, double b, int n){
        double sum = 0;
        double deltaX = (b-a)/n;
        for(int i = 0; i < n; i++){
            sum+= f(((a + i * deltaX) + (a + (i + 1) * deltaX)) / 2) * deltaX;
        }
        return sum;
    }

        public static void main(String[] args){
        double x = 5;
        System.out.println("X = " + x);
        System.out.println("f(x) = " + f(x));
        System.out.println("f'(x) using power rule = " + (3 * Math.pow(x, 2)));
        System.out.println("f'(x) using def = " + derive(FuncProgAndCalculus::f, x));
        System.out.println("f''(x) = " + deriveN(FuncProgAndCalculus::f, x, 2));
        System.out.println("f'''(x) = " + deriveN(FuncProgAndCalculus::f, x, 3));
        //_____________
            //fundamental theorm of calculus versus Riemann estimation
            double a = 1;
            double b = 5;
            int n = 100_000_000;
            System.out.printf("a = %f\tb=%f\n", a,b);
            System.out.println("f(x) = " + f(b-a));
            System.out.println("f(x) using power rule = " + ((Math.pow(b,4)/4) - (Math.pow(a,4)/4)));
            System.out.println("f(x) using def = " + integrate(FuncProgAndCalculus :: f, a, b, n));

    }

}
