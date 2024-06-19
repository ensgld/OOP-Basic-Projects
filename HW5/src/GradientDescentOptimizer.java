public class GradientDescentOptimizer extends  AbstractOptimizer {
    final int stepSize;
    final int maxIterations;
    GradientDescentOptimizer(int stepSize,int maximumIteration){
        this.maxIterations=maximumIteration;
        this.stepSize=stepSize;
    }
    @Override double[] optimize(double[] x0, AbstractCostFunction cost) throws OptimizationException {
        double[] x = Arrays.copyOf(x0, x0.length);
        for (int i = 0; i < maxIterations; i++) {
            try {
                double[] gradient = calculateGradient(x, cost);
                for (int j = 0; j < x.length; j++) {
                    x[j] -= stepSize * gradient[j];
                }
            } catch (CostFunctionException e) {
                throw new OptimizationException("Optimization failed: " + e.getMessage(), e);
            }
        }
        return x;
    }
    private double[] calculateGradient(double[] x, AbstractCostFunction cost) throws CostFunctionException {
        double[] gradient = new double[x.length];
        double epsilon = 1e-6;

        for (int i = 0; i < x.length; i++) {
            double[] xPlusEpsilon = Arrays.copyOf(x, x.length);
            xPlusEpsilon[i] += epsilon;
            gradient[i] = (cost.calculate(xPlusEpsilon) - cost.calculate(x)) / epsilon;
        }

        return gradient;
    }


}
