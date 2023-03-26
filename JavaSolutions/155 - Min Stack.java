class MinStack {

    int size;
    List<Integer> cStack;
    List<Integer> minStack;
    public MinStack() {
        size = 0;
        cStack = new ArrayList();
        minStack = new ArrayList();  
    }
    
    public void push(int val) {
        int min = size <= 0? Integer.MAX_VALUE: minStack.get(size - 1);
        minStack.add(Math.min(min, val));        
        cStack.add(val);
        size++;
    }
    
    public void pop() {
        minStack.remove(size - 1);
        cStack.remove(size - 1);
        int min = Integer.MAX_VALUE;
        size--;
    }
    
    public int top() {
        return cStack.get(size - 1);
    }
    
    public int getMin() {
        return minStack.get(size - 1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */