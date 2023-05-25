package Prog7301n;
import java.util.Arrays;
public class NNTest {
    //Test MLP using XOR dataset
    public static void main(String[] args){
        double[][] X_Train = {{0,0}, {0,1}, {1,0}, {1,1}}; //{{condition 1, condidtion 2}};
        double[][] y_train = {{0}, {1}, {1}, {0}};
        var model = new MultiLayerPerceptron(new int[]{2, 3, 1}, 0.1, new Activations.TanH());

        model.train(X_Train, y_train, 1000);

        for(int i = 0; i < X_Train.length; i++){
            double[] result = model.predict(X_Train[i]);
            System.out.printf("Input: %s Output: %.6f\n", Arrays.toString(X_Train[i]), result[0]);
        }
        System.out.println("Final accuracy: " + model.accuracy(X_Train, y_train));

    }
}
