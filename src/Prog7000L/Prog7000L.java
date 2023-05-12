package Prog7000L;
import java.util.*;
import java.io.*;
public class Prog7000L {

    public static void main(String[] args) {
        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/prog7000l.csv"));

            ArrayList<Double[]> X = new ArrayList<Double[]>();
            ArrayList<Double> y = new ArrayList<>();
            //Home, Price, SQFT, Bedrooms, Bathrooms, Offers, Brick, Neighborhood

            //read in ndata
            input.nextLine();
            while(input.hasNextLine()){
                String line = input.nextLine();
                String[] data = line.split(",");
                Double[] row = new Double[2];
                row [0] = Double.parseDouble(data[2]);
                row[1] = Double.parseDouble(data[0]);
                y.add(Double.parseDouble(data[1]));
                X.add(row);
            }

            //fit model to data
            double[][] X_train = new double[X.size()][2];
            for(int i  = 0; i < X.size(); i++){
                X_train[i][0] = X.get(i)[0];
                X_train[i][1] = X.get(i)[1];
            }
            double[] y_train = new double[X.size()];
            for(int i  = 0; i < y.size(); i++)
                y_train[i] = y.get(i);

            var lr = new LinearRegression(60, 100, 0.0000001, 0.00001);
            lr.fit(X_train, y_train, 100);
            System.out.println(lr);

            double sqFoot = 1897;
            //find comperable data poi nt

            double closestPoint = X_train[0][0];
            int closestIndex = 0;

            for(int i = 0; i < X_train.length; i++){
                if(Math.abs(X_train[i][0] - sqFoot) < Math.abs(closestPoint - sqFoot)){
                    closestIndex = i;
                }
            }
            System.out.println("Perdicted output for " + sqFoot + ": " + lr.perdict(sqFoot));
            System.out.println("Compared to " + X_train[closestIndex][0] + ": " + y_train[closestIndex]);


            } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
