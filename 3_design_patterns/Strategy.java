public class Strategy {
    public static void main(String[] args) {
        Context context = new Context(new Add());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new Substract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new Multiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}

class Context {
    private ICalculation calculation;

    public Context(ICalculation calculation) {
        this.calculation = calculation;
    }

    public int executeStrategy(int num1, int num2) {
        return calculation.execute(num1, num2);
    }
}

interface ICalculation {
    public int execute(int num1, int num2);
}

class Add implements ICalculation {
    @Override
    public int execute(int num1, int num2) {
        return num1 + num2;
    }
}

class Substract implements ICalculation {
    @Override
    public int execute(int num1, int num2) {
        return num1 - num2;
    }
}

class Multiply implements ICalculation {
    @Override
    public int execute(int num1, int num2) {
        return num1 * num2;
    }
}