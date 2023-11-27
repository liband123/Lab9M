package Lab9;

public class HeapSort {
    
    /**
     * This method takes in an array on integers and sort them using heap-sort
     * @param input array of integer items
     * @return sorted array
     */
    public static int[] sort(int[]input)
    {
        MaxHeap maxHeap = new MaxHeap(input);
        // Your code goes here
        
        for (int i = input.length - 1; i >= 0; i--) {
            int maxValue = maxHeap.delete();
            input[i] = maxValue;
            
            
            
            
        }
 
        // You might change this line and return the sorted array
        return input;
    }
}
