public class DynamicArray {
    int[] items;
    private int size = 0;
    private int counter = 0;

    public DynamicArray() {
        size = 100;
        items = new int[100];
    }

    public DynamicArray(int n) {
        size = n;
        items = new int[size];
    }

    // insert
    public void insert(int element) {
        if (counter < size - 1)
        {
            items[counter] = element;
            counter++;
        }
        else
        {
            size = size * 2;
            int [] Array =new int[size];
            CopyArray(items , Array);
            items = Array;
            items[counter++] = element;
        }


    }
    //copy array
    private void CopyArray(int Array[] , int NewArray []) {
        for (int i = 0; i < counter; i++) {
            NewArray [i] = Array [i];
        }
    }
    // remove at
    public void RemoveAt(int index)
    {
        if(IsValidIndex(index))
        {
            for(int i=index;i<counter;i++)
            {
                items[i]=items[i+1];
            }
            counter--;
        }
        else
        {
            throw new  IllegalStateException();
        }
    }
    private boolean IsValidIndex(int index)
    {
        return (index >= 0 && index <counter);
    }
    // index of
    public int IndexOf(int element)
    {
        for(int i=0; i<counter;i++)
        {
            if(items[i]== element)
            {
                return i;
            }
        }
        return -1;
    }
    // print Array
    public void PrintArray()
    {
        for(int i=0; i<counter;i++)
        {
            System.err.print(items[i]+" ");
        }
        System.out.println();
    }
    // max
    public int MAX()
    {
        int max = items[0];
        for(int i=1; i<counter;i++)
        {
            if(items[i]>max)
            {
                max=items[i];
            }
        }
        return max;
    }
    // min
    public int MIN()
    {
        int min = items[0];
        for(int i=1; i<counter;i++)
        {
            if(items[i]<min)
            {
                min=items[i];
            }
        }
        return min;
    }
}
