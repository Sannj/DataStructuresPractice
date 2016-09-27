package DataStructuresPractice;
public class Heaps{
	public static void main(String args[]){
		int origArray[] = {3,2,1,7,8,4,10,16,12};
		Heaps minHeap = new Heaps(9);
		minHeap.createMinHeap(origArray);
		minHeap.display();
        System.out.println("\n");
		System.out.println("\n"+minHeap.extractMin());
		minHeap.display();
		Heaps maxHeap = new Heaps(9);
		maxHeap.createMaxHeap(origArray);
		maxHeap.display();
        System.out.println("\n\n"+maxHeap.extractMax());
        maxHeap.display();
	}

	int len;
	int[] heap;
	int size;

	private static final int FRONT = 1;

	Heaps(int len){
		this.len = len;
		heap = new int[this.len+1];
		size = 0;
	}


	public int extractMin(){
        int val = heap[1];
        swap(1, size-1);
        size--;
        sinkDownMinHeap(1);
        return val;
    }

    public int extractMax(){
        int val = heap[1];
        swap(1, size-1);
        size--;
        sinkDownMaxHeap(1);
        return val;
    }

	public void sinkDownMinHeap(int k){
        int smallest =k;
        if(2*k<size && heap[smallest]>heap[2*k]){
            smallest = 2*k;
        }
        if(2*k+1<size && heap[smallest]>heap[2*k+1]){
            smallest = 2*k+1;
        }
        if(smallest!=k){
            swap(k,smallest);
            sinkDownMinHeap(smallest);
        }
	}

    public void sinkDownMaxHeap(int k){
        int largest =k;
        if(2*k<size && heap[largest]<heap[2*k]){
            largest = 2*k;
        }
        if(2*k+1<size && heap[largest]<heap[2*k+1]){
            largest = 2*k+1;
        }
        if(largest!=k){
            swap(k,largest);
            sinkDownMaxHeap(largest);
        }
    }

	public void createMaxHeap(int[] origArray){
		heap[0] = Integer.MAX_VALUE;
		if(origArray.length > 0){
			for(int i = 0; i<origArray.length; i++){
				insertMaxHeap(origArray[i]);
			}
		}
	}
	public void createMinHeap(int[] origArray){
		heap[0] = Integer.MIN_VALUE;
		if(origArray.length > 0){
			for(int i = 0; i < origArray.length; i++){
				insertMinHeap(origArray[i]);
			}
		}
	}

	public void insertMaxHeap(int val){
		if(size == 0){
			heap[1] = val;
			size = 2;
		}
		else{
			heap[size] = val;
			size++;
			bubbleUpMaxHeap();
		}
	}

	public void insertMinHeap(int val){
		if(size == 0){
			heap[1] = val;
			size = 2;
		}
		else{
			heap[size] = val;
			size++;
			bubbleUpMinHeap();
		}
	}

	public void bubbleUpMaxHeap(){
		int pos = size - 1;
		while(pos > 0 && heap[pos/2] < heap[pos]){
			swap(pos,pos/2);
			pos = pos/2;
		}
	}

	public void bubbleUpMinHeap(){
		int pos = size - 1;
		while(pos > 0 && heap[pos/2] > heap[pos]){
			swap(pos, pos/2);
			pos = pos/2;
		}
	}

	public void display(){
		if(size > 0){
			System.out.println();
			for(int i = 1; i < size; i++){
				System.out.print(heap[i]+ " ");
			}
		}
	}

	private int parent(int pos)
    {
        return pos / 2;
    }

    private int leftChild(int pos){
    	return (2*pos);
    }

    private int rightChild(int pos){
    	return (2*pos + 1);
    }

    private boolean isLeaf(int pos){
    	if(pos >= (size/2) && pos <= size){
    		return true;
    	}
    	return false;
    }

    private void swap(int pos1, int pos2){
    	int temp = heap[pos1];
    	heap[pos1] = heap[pos2];
    	heap[pos2] = temp;
    }
}