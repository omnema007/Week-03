package stacksandqueues.stockspanproblem;

public class Main {
    public static void main(String[] args) {
        StockSpanProblem obj = new StockSpanProblem();
        int[] stock = {100, 80, 60, 70, 60, 85, 100};
        int[] span = new int[stock.length];
        obj.stockSpan(stock, span);

        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }

    }
}
