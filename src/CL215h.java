import java.util.ArrayList;

public class CL215h {
    private ArrayList<Double> list = new ArrayList<>();
    private double min;
    private double max;
    private double ave;

    public CL215h(ArrayList<Double> c){
        list = c;
    }
    public double findAve(){
        min = list.get(0);
        max = list.get(0);
        double tot = 0;

        for(double lcv : list){
            if(lcv > max){
                max = lcv;
            }
            if(lcv < min){
                min = lcv;
            }
            tot+= lcv;
        }
        System.out.println(min + " " + max);
        ave = (tot - min - max) / list.size();
        return ave;
    }
    public void WriteIt(){
        for(int l = 0; l < list.size(); l++)
        System.out.print(list.get(l) + " ");

        System.out.printf(" = %5.2f\n", ave);

    }
}