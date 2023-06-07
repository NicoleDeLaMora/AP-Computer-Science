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
Cant run it but its coded
 */