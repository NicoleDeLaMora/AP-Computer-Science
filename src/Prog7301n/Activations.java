package Prog7301n;

public class Activations {
    interface Activation{
        public double activate(double Value);
        public double activateDeriv(double Value);
    }

    public static class Sigmoid implements Activation{
        public double activate(double Value){return Math.tanh(Value);}
        public double activateDeriv(double Value){return 1 - Math.pow(Value, 2);}
    }

    public static class TanH implements Activation{
        public double activate(double Value){return Math.tanh(Value);}
        public double activateDeriv(double Value){return Value - Math.pow(Value, 2);}
    }

    public static class ReLU implements Activation{
        public double activate(double Value){return Math.max(0, Value);}
        public double activateDeriv(double Value){return Value >= 0 ? 1 : 0;}
    }


}
