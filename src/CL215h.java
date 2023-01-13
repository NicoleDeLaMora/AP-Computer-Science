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
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > max){
                max = list.get(i);
            }else if(list.get(i) < min){
                min = list.get(i);
            }
             tot += list.get(i);
        }
        ave = (tot - min - max) / list.size();
        return ave;
    }
    public void WriteIt(){
        for(int l = 0; l < list.size(); l++)
        System.out.print(list.get(l) + " ");

        System.out.println(" = " + ave);

    }
}