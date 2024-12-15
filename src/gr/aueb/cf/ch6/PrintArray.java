package gr.aueb.cf.ch6;

public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printArray( arr);

    }
// απλη μεθοδος τυπωνει ολα τα στοιχεια του πινακα

    public static void printArray(int[] arr){
        for (int item: arr)
            System.out.print(item +" ");

    }
//υπερφορτωμενη τυπωνει απο low μεχρι high
    public static void printArray(int[]arr,int low, int high){
        if((low<0) || (high> arr.length-1)) return;
        for(int i = low ; i < high ; i++)
            System.out.print(arr[i] +" ");


    }

}

