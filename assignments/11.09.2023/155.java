class MinStack {
    ArrayList<Integer> a1;
    private int top;

    public MinStack() {
        a1 = new ArrayList<>();
        top = -1;
    }
    
    public void push(int val) {
        top = top + 1;
        a1.add(top,val);
    }
    
    public void pop() {
        top = top - 1;
    }
    
    public int top() {
        return a1.get(top);
    }
    
    public int getMin() {
        ArrayList<Integer> min = new ArrayList<>();
        for(int i=0;i<=top;i++){
            int temp = a1.get(i);
            min.add(i, temp);
        }
        Collections.sort(min);
        return min.get(0);
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