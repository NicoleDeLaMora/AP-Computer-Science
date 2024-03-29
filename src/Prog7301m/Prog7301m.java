package Prog7301m;

import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.image.BufferedImage;


public class Prog7301m {
    public static int argmax(double[] a){
        int max = 0;
        for(int i = 1; i < a.length; i++){
            if(a[i] > a[max]) max = i;
        }
        return max;
    }

    public static void main(String[] args) {
        try {  // On Replit, may need to put "../data/prog285b.dat"
            //Training Data
            Scanner input = new Scanner(new File("data/prog7301m_train.csv")); //csv = comma seperated values
            var Xtr = new ArrayList<Double[]>();
            var Ytr = new ArrayList<Double[]>();
            input.nextLine();
            while(input.hasNextLine()) {
                String[] line = input.nextLine().split(",");
                Double[] row = new Double[line.length-1];
                Double[] label_onehot = new Double[10]; //10 possible digits
                int label = Integer.parseInt(line[0]);
                for(int i= 0; i < label_onehot.length; i++)
                    label_onehot[i] = 0.0;
                label_onehot[label] = 1.0;
                for(int i = 1; i < line.length; i++)
                    row[i-1] = Double.parseDouble(line[i]);
                Xtr.add(row);
                Ytr.add(label_onehot);

            }

            //Test Data
            input = new Scanner(new File("data/prog7301m_test.csv")); //csv = comma seperated values
            var Xte = new ArrayList<Double[]>();
            var Yte = new ArrayList<Double[]>();
            input.nextLine();
            while(input.hasNextLine()) {
                String[] line = input.nextLine().split(",");
                Double[] row = new Double[line.length - 1];
                Double[] label_onehot = new Double[10]; //10 possible digits
                int label = Integer.parseInt(line[0]);
                for (int i = 0; i < label_onehot.length; i++)
                    label_onehot[i] = 0.0;
                label_onehot[label] = 1.0;
                for (int i = 1; i < line.length; i++)
                    row[i - 1] = Double.parseDouble(line[i]);
                Xte.add(row);
                Yte.add(label_onehot);
            }

            double[][] X_train = new double[Xtr.size()][784];
            double[][] y_train = new double[Ytr.size()][10];
            for(int i = 0; i < Xtr.size(); i++){
                for(int j= 0; j < 784; j++){
                    X_train[i][j] = Xtr.get(i)[j];
                }
                for(int j = 0; j < 10; j++){
                    y_train[i][j] = Ytr.get(i)[j];
                }
            }
            double[][] X_test = new double[Xte.size()][784];
            double[][] y_test = new double[Yte.size()][10];
            for(int i = 0; i < Xte.size(); i++){
                for(int j= 0; j < 784; j++){
                    X_test[i][j] = Xte.get(i)[j];
                }
                for(int j = 0; j < 10; j++){
                    y_test[i][j] = Yte.get(i)[j];
                }
            }

            //Crewsate Model
            var model = new MultiLayerPerceptron(new int[]{784,100,10}, 0.01, new Activations.Sigmoid());
            model.train(X_train, y_train,15);
            System.out.println("Final accuracy: " + model.accuracy(X_test, y_test));


            //Pick a random image from the test set
            int index = (int)(Math.random() * X_test.length);
            double[] X_val = X_test[index];
            double[] y_val = y_test[index];

            //predict the label
            double[] y_pred = model.predict(X_val);
            int pred = argmax(y_pred);
            int actual = argmax(y_val);
            System.out.println("Predicted: " + pred + "\t Actuals: " + actual);

            //Display the image
            var image = new BufferedImage(28, 28, BufferedImage.TYPE_INT_RGB);
            for(int i = 0; i < 28; i++){
                for(int j = 0; j < 28; j++){
                    image.setRGB(j,i,((int)X_val[i*28+j]));
                }
                var frame = new JFrame("Image");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new JLabel(new ImageIcon(image)));
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }


            } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
