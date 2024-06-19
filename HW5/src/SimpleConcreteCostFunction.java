public class SimpleConcreteCostFunction extends AbstractCostFunction{
    @Override
    double calculate(double[] x) {
        return (Math.pow(x[0],2) + 4 * x[0] + 2);
    }
}
