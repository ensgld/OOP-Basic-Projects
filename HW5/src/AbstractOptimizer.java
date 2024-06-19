public abstract class AbstractOptimizer {
    abstract double[] optimize(double[] x0, AbstractCostFunction cost) throws OptimizierException;

}
