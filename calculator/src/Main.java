public class Main {
    public static void main(String[] args) {
        int end = 0;
        while(end!=1) {
            int num1 = Calculator.getInt();
            int num2 = Calculator.getInt();
            char operation = Calculator.getOperation();
            int result = Calculator.calc(num1, num2, operation);
            System.out.println("Результат операции: " + result);
            System.out.println("Повторить?");
            end = Calculator.getInt();
        }
    }
}
