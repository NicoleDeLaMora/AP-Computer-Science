package Prog7000L;
import java.util.Arrays;
public class LinearRegression {
    private double theta0; //my intercept
    private double theta1; //my slope
    private double alpha; //my learning rate
    private double tolerance;
    private double[] objectives; //x's


    public LinearRegression(double thetaOne, double thetaZero, double learning_rates, double tol) {
        theta1 = thetaOne;
        theta0 = thetaZero;
        alpha = learning_rates;
        tolerance = tol;
    }

    public void fit(double[][] X_train, double[] Y_train, int epochs) { //prnounced epic //epochs = one run thu training set
        int m = X_train.length;
        objectives = new double[epochs];
        double[] e = new double[m];

        for (int epoch = 0; epoch < epochs; epoch++) {
            if (epoch > 0) {
                double temp0 = 0;
                double temp1 = 0;
                for (int i = 0; i < m; i++) {
                    double temp = (theta1 * X_train[i][0] + theta1 - Y_train[i]);
                    //perdicted label - actual label
                    temp0 += temp;
                    temp1 += temp * X_train[1][0];
                }
                //gradient descent algorithm
                theta0 -= (1.0 / m) * alpha * temp0;
                theta1 -= (1.0 / m) * alpha * temp1;
                //shrinks the decimal so its not a huge data number ig
            }
            for (int i = 0; i < m; i++) {
                e[i] = theta1 * X_train[i][0] + theta0 - Y_train[i]; //cost function
            }
            double obj = 0;
            for (int i = 0; i < m; i++) {
                obj += e[i] * e[i];
            }
            objectives[epoch] = obj;

            if (epoch > 1 && (Math.abs(objectives[epoch] - objectives[epoch - 1]) < tolerance))
                break;

        }


    }

    public double getIntercept() {
        return theta0;
    }

    public double getSlope() {
        return theta1;
    }

    public double perdict(double x) {
        return theta1 * x + theta0;
    }

    public String toString(){
        return "Regression Line: y = " + theta1 + " * x " + theta0 +
                "\nObjective: " + Arrays.toString(objectives) +
                "\nMin. Objective; " + (double)Arrays.stream(objectives).min().getAsDouble();

    }

}
