package Prog7000L;

public class LRTest {

    public static void main(String[] args){
        double[][] X_trian = {
                {2.49, 1},
                {2.57, 1},
                {3.41, 1},
                {1.25, 1},
                {1.62, 1},
                {3.83, 1},
                {11.64, 1},
                {6.41, 1},
                {8.34, 1}

        };
        double[] Y_train = {147.1, 130.1, 129.9, 113.5, 137.5, 162.3, 207.5, 177.9, 210.3};

        //train the mode
        var lr = new LinearRegression(5, 100, .01, 0.001);
        lr.fit(X_trian, Y_train, 1000);
        System.out.println(lr);

        double newInput = 6.75;
        System.out.println("Predicted output for " + newInput + ": " + lr.perdict(newInput));
        System.out.println("Compared to " + X_trian[7][0] + ": " + Y_train[7]);
        System.out.println("Compared to " + X_trian[8][0] + ": " + Y_train[8]);

    }

}
