import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>(); // Stores indices, not temperatures
        
        for (int i = 0; i < n; i++) {
            // While the current temperature is warmer than the temperature at the stack's top index
            while (!st.isEmpty() && temperatures[i] > temperatures[st.peek()]) {
                int prevIndex = st.pop();
                res[prevIndex] = i - prevIndex; // Calculate the days to wait
            }
            st.push(i); // Push the current index
        }
        
        // Any remaining indices in the stack default to 0, which Java arrays do automatically
        return res;
    }
}
