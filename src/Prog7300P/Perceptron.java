package Prog7300P;
import java.util.function.Function;
public class Perceptron {
    private double learning_rate;
    private int epochs;
    private double[] weights;
    private double bias;
    private Function<Double, Double> activation;

    private Double unit_step(Double x){
        return x > 0 ? 1.0 : 0.0;   //? == if, : == else
    }

    public Perceptron(Double learning_rate, int epochs){
        this.learning_rate = learning_rate;
        this.epochs = epochs;
        this.bias = 1;
        this.activation = this::unit_step;

    }

    public double[] getWeights() {return weights;}
    public double getBias(){return bias;}

    public double forward(double[] X){
        double dot_product = bias;
        for(int i = 0; i < X.length; i++)
            dot_product+= X[i] * weights[i];
        return activation.apply(dot_product);
    }

    public double[] predict(double[][] X_test){
        double[] perceptions = new double[X_test.length];
        for(int i = 0; i < X_test.length; i++){
            perceptions[i] = forward(X_test[i]);
        }
        return perceptions;
    }
    public void fir(double[][] X_train, double[] y_train){
        weights = new double[X_train[0].length];
        for(int i = 0; i < weights.length; i++){
            weights[i] = Math.random()-0.5;
        }
        int n_samples = X_train.length;
        for(int epoch = 0; epoch < epochs; epoch++){
            double less = 0;
            for(int i = 0; i < n_samples; i++){
                double y_pred = forward(X_train[i]);
                double error = y_train[i]-y_pred;
                less += Math.pow(error,2);


            }
        }
    }

}
