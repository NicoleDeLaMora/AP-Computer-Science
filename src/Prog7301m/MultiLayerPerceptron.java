package Prog7301m;

public class MultiLayerPerceptron {
    private double fLearningRate;
    private Layer[] flayers;
    private Activations.Activation fActivation;

    public MultiLayerPerceptron(int[] layers, double learning_rate, Activations.Activation activation){
        fLearningRate = learning_rate;
        fActivation = activation;
        flayers = new Layer[layers.length];

        for(int i = 0; i < layers.length; i++){
            flayers[i] = (i==0) ? new Layer(layers[i], 0) : new Layer(layers[i], layers[i-1]);
        }
    }

    public double[] feedForward(double[] x){
        double result;
        double[] output = new double[flayers[flayers.length-1].size];

        for(int i  = 0; i < flayers[0].size; i++) flayers[0].Nuerons[i].Value = x[i];
        for(int k = 1; k < flayers.length; k++){
            for(int i = 0; i < flayers[k].size; i++){
                result = 0.0;
                for(int j = 0; j < flayers[k-1].size; j++){
                    result += flayers[k].Nuerons[i].Weights[j] * flayers[k-1].Nuerons[j].Value;
                }
                result += flayers[k].Nuerons[i].Bias;
                flayers[k].Nuerons[i].Value = fActivation.activate(result);
            }
        }
        for(int i = 0; i < flayers[flayers.length-1].size; i++){
            output[i] = flayers[flayers.length-1].Nuerons[i].Value;
        }
        return output;
    }
    public double[] predict(double[] input) {
        return feedForward(input);
    }

    public double backPropagate(double[] input, double[] output) {
        double[] result = feedForward(input);
        double error = 0.0;

        for (int i = 0; i < flayers[flayers.length-1].size; i++) {
            error = output[i] - result[i];
            flayers[flayers.length-1].Nuerons[i].Delta = error * fActivation.activateDeriv(result[i]);
        }

        for (int k = flayers.length-2; k >= 0; k--) {
            for (int i = 0; i < flayers[k].size; i++) {
                error = 0;
                for (int j = 0; j < flayers[k+1].size; j++)
                    error += flayers[k+1].Nuerons[j].Delta * flayers[k+1].Nuerons[j].Weights[i];
                flayers[k].Nuerons[i].Delta = error *
                        fActivation.activateDeriv(flayers[k].Nuerons[i].Value);
            }
            for (int i = 0; i < flayers[k+1].size; i++) {
                for (int j = 0; j < flayers[k].size; j++)
                    flayers[k+1].Nuerons[i].Weights[j] += fLearningRate *
                            flayers[k+1].Nuerons[i].Delta * flayers[k].Nuerons[j].Value;
                flayers[k+1].Nuerons[i].Bias += fLearningRate * flayers[k+1].Nuerons[i].Delta;
            }
        }

        error = 0.0;
        for (int i = 0; i < output.length; i++) error += Math.abs(result[i]-output[i]);
        error /= output.length;
        return error;
    }

    public void train(double[][] X_train, double[][] y_train, int epochs) {
        for (int epoch = 0; epoch < epochs; epoch++) {
            double loss = 0;
            for (int i = 0; i < X_train.length; i++)
                loss += backPropagate(X_train[i], y_train[i]);
            loss /= X_train.length;
            System.out.printf("Epoch %d:\tLoss: %.6f\t\tAccuracy: %.6f\n",
                    (epoch+1), loss, accuracy(X_train, y_train));
        }
    }

    public double accuracy(double[][] input, double[][] output){
        double error = 0;
        for(int i = 0; i < input.length; i++){
            double[] result = feedForward(input[i]);
            for(int j = 0; j < output[i].length; j++){
                error+= Math.abs(result[j] - output[i][j]);
            }
        }
        return 1 - error / (input.length * output[0].length);
    }

}
