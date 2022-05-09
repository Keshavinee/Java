class Sorting{
    public static <T extends Comparable> void selSort(T arr[]){
        int pos;
        T min;
        for (int i = 0; i < arr.length - 1; i++)
        {
            min = arr[i];
            pos = i;
            for (int j = i+1; j < arr.length; j++){
                if (arr[j].compareTo(min) < 0)
                {
                    min = arr[j];
                    pos = j;
                }   
            }
            arr[pos] = arr[i];
            arr[i] = min;
        }   
    }

    public static <T> void display(T arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class TestSort {
    public static void main(String[] args) {
        Double a[] = {4.5,2.34,6.78,1.2,3.42,4.5};
        Sorting.selSort(a);
        Sorting.display(a);

        String b[] = {"Keshav","Magu","Arun","Ram"};
        Sorting.selSort(b);
        Sorting.display(b);
    }
}
