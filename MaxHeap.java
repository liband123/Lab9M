package Lab9;

public class MaxHeap {
    private int[] data;
    
    /**
     * @param data
     */
    public MaxHeap(int[]data)
    {
        this.setData(MaxHeapMaker.heapify(data));
    }
    
    /**
     * Author: Ashley Pike
     * Remove the max value from the root of the tree while 
     * keeping the remaining the items as a max-heap
     * @return max value
     */
    public int delete()
    {
        if (this.equals(null))
            return -1;
        
        int result = this.data[0];
        if (this.data.length == 0) {
            this.data[0] = null;
            return temp;
        }
        
        this.data[0] = this.data[this.data.length-1];
        this.data[this.data.length-1] = 0;
        
        int parent = 0;
        while (true) {
            int leftChild = 2 * parent + 1;
            if (leftChild >= this.data.length)
                break;
            int rightChild = leftChild + 1;
            int maxChild = leftChild;
            if (rightChild < this.data.length)
                maxChild = Math.max(leftChild, rightChild);
            if (maxChild > parent) {
                int temp = parent;
                maxChild = temp;
                parent = maxChild;
            } else {
                break
            }   
        }
        return result;
    }
    
    /**
     * Adds new item to the max-heap
     * @param newData the input value to be added to the max-heap
     */
    public void add(int newData)
    {
        // Your code goes here
    }

    /**
     * @return Returns the max-heap
     */
    public int[] getData() {
        return data;
    }

    /**
     * Note that you might to need to 
     * @param data set the array
     */
    public void setData(int[] data) {
        this.data = MaxHeapMaker.heapify(data);
    }
}
