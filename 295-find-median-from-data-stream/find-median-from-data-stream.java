class MedianFinder {
    
    PriorityQueue<Integer> largeFirst;
    PriorityQueue<Integer> smallFirst;

    public MedianFinder() {
        largeFirst=new PriorityQueue<>(Collections.reverseOrder());
        smallFirst=new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        largeFirst.offer(num);
        
        smallFirst.offer(largeFirst.poll());

        if(largeFirst.size()<smallFirst.size())
            largeFirst.offer(smallFirst.poll());
    }
    
    public double findMedian() {

        if(smallFirst.size()<largeFirst.size())
            return largeFirst.peek();

        return (smallFirst.peek() + largeFirst.peek())/ 2.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */