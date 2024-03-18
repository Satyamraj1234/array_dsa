import java.util.Scanner;

public class ArrayExample {
    public int[] creatArray(){
        System.out.println("enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter your number");
        for(int i=0; i<array.length; i++){
            array[i]=sc.nextInt();
        }
        return array;
    }
    public int noOfOccurence(int[] array,int n){
        
        int count = 0;
        for(int i=0; i<array.length; i++){
            if (array[i]==n) {
                count++;
                
            }

        }
        
        return count;

    }
    public int lastOccurenceIndex(int[]array ,int n){
        int lastindex=-1;
        for(int i=0; i<array.length; i++){
            if (array[i]==n ) {
                lastindex = i;
            }
        }
        
        return lastindex;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayExample a= new ArrayExample();
        int[] array=a.creatArray();
        System.out.println("Enter the number to check the occurrences:");
        int n = sc.nextInt();
        int occurrences= a.noOfOccurence( array,n);
        System.out.println("The number " + n + " occurs " + occurrences + " times in the array.");
       
        System.out.println("last occurence is at index"+ a.lastOccurenceIndex(array, occurrences));



    }
    
}


