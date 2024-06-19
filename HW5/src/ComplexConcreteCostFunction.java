public class ComplexConcreteCostFunction extends AbstractCostFunction {
    double[] parameters;

    @Override
    double calculate(double[] x) {
        return 0;
    }

    ComplexConcreteCostFunction(double[] parameters) {
        this.parameters = parameters;

    }
}
