package stacksandqueues.stockspanproblem;

import java.util.Stack;

public class StockSpanProblem {
    public void stockSpan(int[] stock, int[] span) {
        Stack<Integer> st = new Stack<>();
        span[0] = 1;
        st.push(0);

        for (int i = 1; i < stock.length; i++) {
            int currPrice = stock[i];
            while (!st.isEmpty() && currPrice > stock[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) {
                span[i] = i + 1;
            }
            else {
                int prevHigh = st.peek();
                span[i] = i - prevHigh;
            }
            st.push(i);
        }
    }
}
