package stacksandqueues.sortstackusingrecursion;

import java.util.Stack;

class SortStack {
    public static void sort(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }

        int temp = st.pop();
        sort(st);

        insertAtSortedPosition(st, temp);
    }

    public  static void insertAtSortedPosition(Stack<Integer> st, int temp) {
        if (st.isEmpty() || st.peek() < temp) {
            st.push(temp);
            return;
        }

        int ele = st.pop();
        insertAtSortedPosition(st, temp);

        st.push(ele);
    }
}
