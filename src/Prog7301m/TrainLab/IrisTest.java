package Prog7301m.TrainLab;

import Prog7301m.Activations;
import Prog7301m.MultiLayerPerceptron;
import java.util.*;
import java.io.*;

public class IrisTest {
public static int argmax(double[] a) {
  int max = 0;
  for (int i = 1; i < a.length; i++)
    if (a[i] > a[max]) max = i;
  return max;
}
public static void main(String[] args) {
  try {
  // Training Data

    String[] labels = { "rank	points",	"goalsDiff",	"team_id",	"team.name",	"matches_played",	"wins",	"draws",	"losses",	"goals_for",	"goals_against",	"home",	"home_wins",	"home_draw",	"home_lose",	"home_goals_for", "home_goals_against",	"away",	"away_wins",	"away_draw",	"away_lose",	"away_goals_for",	"away_goals_against" };
    Scanner input = new Scanner(new File("data/2023_PL_standings.csv"));
    ArrayList<Double[]> Xtr = new ArrayList<Double[]>();
    ArrayList<Double[]> ytr = new ArrayList<Double[]>();
    input.nextLine();
    while (input.hasNextLine()) {
      String[] line = input.nextLine().split(",");
      Double[] row = new Double[line.length - 2];
      Double[] label_onehot = new Double[20];
      int label = Arrays.asList(labels).indexOf(line[2]);
      for (int i = 0; i < label_onehot.length; i++){
        label_onehot[i] = 0.0;
      }
        
      label_onehot[label] = 1.0;
     
      for (int i = 0; i < line.length; i++){
        if(i != 3 || i != 4){
           row[i - 1] = Double.parseDouble(line[i]);
        }
      }
      Xtr.add(row);
      ytr.add(label_onehot);
}
  int train_size = (int)(Xtr.size() * 0.8);
  int test_size = Xtr.size() - train_size;
  double[][] X_train = new double[train_size][Xtr.get(0).length];
  double[][] y_train = new double[train_size][ytr.get(0).length];
  for (int i = 0; i < train_size; i++) {
    for (int j = 0; j < Xtr.get(0).length; j++)
      X_train[i][j] = Xtr.get(i)[j];
    for (int j = 0; j < ytr.get(0).length; j++)
      y_train[i][j] = ytr.get(i)[j];
  }
  double[][] X_test = new double[test_size][Xtr.get(0).length];
  double[][] y_test = new double[test_size][ytr.get(0).length];
  for (int i = 0; i < test_size; i++) {
  for (int j = 0; j < Xtr.get(0).length; j++)
    X_test[i][j] = Xtr.get(i + train_size)[j];
  for (int j = 0; j < ytr.get(0).length; j++)
    y_test[i][j] = ytr.get(i + train_size)[j];
}
// Create model
  int inputs = X_train[0].length;
  int outputs = y_train[0].length;
// int hiddenNeurons = 10; // Also try (int)Math.sqrt(inputs*outputs);
  int hiddenL1 = outputs * 6;
  int hiddenL2 = outputs * 3;
  var model = new MultiLayerPerceptron(new int[]{ inputs, hiddenL1,   hiddenL2, outputs }, 0.01, new Activations.Sigmoid());
  model.train(X_train, y_train, 10);
  System.out.println("Final Accuracy: " + model.accuracy(X_test,   y_test));
// Pick a random sample from the test set
  int index = (int) (Math.random() * X_test.length);
  double[] X_val = X_test[index];
  double[] y_val = y_test[index];
// Predict the label
  double[] y_pred = model.predict(X_val);
  String pred = labels[argmax(y_pred)];
  String actual = labels[argmax(y_val)];
  System.out.println("Predicted: " + pred + "\tActual: " + actual);
} catch (IOException e) {
System.out.println("Cannot find file");
}
}
}
/*
<<<<<<< HEAD
Cant run it but its coded
=======
C:\Users\delamora.n\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=55752:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\delamora.n\Desktop\AP Computer Science\out\production\AP Computer Science" Prog7301m.TrainLab.IrisTest
Epoch 1:	Loss: 0.289686		Accuracy: 0.504240
Epoch 2:	Loss: 0.266542		Accuracy: 0.550183
Epoch 3:	Loss: 0.239321		Accuracy: 0.612981
Epoch 4:	Loss: 0.216740		Accuracy: 0.662144
Epoch 5:	Loss: 0.202975		Accuracy: 0.672642
Epoch 6:	Loss: 0.194437		Accuracy: 0.679658
Epoch 7:	Loss: 0.185802		Accuracy: 0.685206
Epoch 8:	Loss: 0.177124		Accuracy: 0.688798
Epoch 9:	Loss: 0.168566		Accuracy: 0.690932
Epoch 10:	Loss: 0.160269		Accuracy: 0.692395
Final Accuracy: 0.827526816143221
Predicted: Iris-virginica	Actual: Iris-virginica

Process finished with exit code 0

>>>>>>> 074d5dced619cf12f8f58cbed435d08387cb9422
 */