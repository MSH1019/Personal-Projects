int computeFibonacci(int n) {
        int result = 1;
        int lastResult = 1;
        int temp;
    
        for (int i = 2; i < n; i++) {
            temp = result;
            result = lastResult + result;
            lastResult = temp;
        }
        return result;
    }

