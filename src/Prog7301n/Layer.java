package Prog7301n;

public class Layer {
    class Nueron{
        public double Value; //a_i^(l)
        public double[] Weights;
        public double Bias;
        public double Delta;


        public Nueron(int prevLayerSize){
            Weights = new double[prevLayerSize];
            Bias = Math.random()-0.5;
            Delta = Math.random()-0.5;
            Value = Math.random()-0.5;
            for(int i = 0; i < Weights.length; i++){
                Weights[i] = Math.random() - 0.5;
            }
        }
    }

    public Nueron[] Nuerons;
    public int size;



    public Layer(int Nuron, int prev){
        size = Nuron;
        Nuerons = new Nueron[size];
        for(int i = 0; i < size; i++){
            Nuerons[i] = new Nueron(prev);
        }
    }
}
