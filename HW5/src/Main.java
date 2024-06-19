
public class Main {
    public static void main(String[] args) {


        try {
            // Test cases
            double[] initialPoint = {2.0}; // Change the initial point as needed

            // Simple optimization task
            AbstractCostFunction simpleCostFunction = new SimpleCostFunction();
            GradientDescentOptimizer simpleOptimizer = new GradientDescentOptimizer(0.1, 1000);
            double[] resultSimple = simpleOptimizer.optimize(initialPoint, simpleCostFunction);
            System.out.println("Simple Optimization Result: " + Arrays.toString(resultSimple));

            // Complex optimization task
            double[] complexParameters = {1.0, 2.0, 3.0}; // Change parameters as needed
            AbstractCostFunction complexCostFunction = new ComplexCostFunction(complexParameters);
            GradientDescentOptimizer complexOptimizer = new GradientDescentOptimizer(0.01, 500);
            double[] resultComplex = complexOptimizer.optimize(initialPoint, complexCostFunction);
            System.out.println("Complex Optimization Result: " + Arrays.toString(resultComplex));

        } catch (OptimizationException | CostFunctionException e) {
            e.printStackTrace();
        }

    }
}



