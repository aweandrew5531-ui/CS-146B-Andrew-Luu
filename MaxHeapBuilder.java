package cs146_hw3;


class WordFreq {
    String word;
    int frequency;

    WordFreq(String w, int f) {
        word = w;
        frequency = f;
    }
}

public class MaxHeapBuilder {
    public static void main(String[] args) {
        WordFreq[] data = {
            new WordFreq("happy",400),
            new WordFreq("satisfied",100),
            new WordFreq("neutral",300),
            new WordFreq("would buy again",200),
            new WordFreq("terrible",160),
            new WordFreq("inconvenient",900),
            new WordFreq("difficult to use",100),
            new WordFreq("easy to use",140),
            new WordFreq("would recommend to friends",800),
            new WordFreq("visit the store",700)
        };
        buildMaxHeap(data);
        System.out.println("After heapified:")
        printHeap(data);
    }
    
    static void heapify(WordFreq[] arr,  int currIndex) {
        int largest = currIndex;          
        int left = 2 * currIndex + 1;       
        int right = 2* currIndex + 2;      

        // If left child exists and greater than root, change largest
        if (left < arr.length && arr[left].frequency > arr[largest].frequency)
            largest = left;

        // If right child exists and greater than current largest, change largest
        if (right < arr.length && arr[right].frequency > arr[largest].frequency)
            largest = right;

        // If largest is not the root node, swap
        if (largest != currIndex) {
            WordFreq temp = arr[currIndex];
            arr[currIndex] = arr[largest];
            arr[largest] = temp;

            // Keep calling the function until the whole tree is heapified
            heapify(arr, largest);
        }
    }
    
    static void buildMaxHeap(WordFreq[] arr) {
        // Start from the last non-leaf node and heapify each node upwards
        for (int i = arr.length/2 - 1; i >= 0; i--) {
            heapify(arr, i);
        }
    }
    
    static void printHeap(WordFreq[] arr) {
    	for (int i = 0; i < arr.length; i++) {
    	    WordFreq obj = arr[i];  
    	    System.out.println(obj.word + " : " + obj.frequency);
    	}
    }
    
}
    




