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
    public int targetsum(int[] array,int target){
        int count=0;
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i]+array[j]==target){
                    count++;

                }
            }
        }
        return count;
    }
    public int findUnique(int[]array){
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i]==array[j]){
                    array[i]=-1;
                    array[j]=-1;
                }
            }
        }
        //traversing the array to find the unique number whose value will not be -1
        int ans =-1;
        for(int i=0; i<array.length;i++){
            if (array[i]>0) {
                ans = array[i];
            }
        }
        return ans;
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
        System.out.println("enter target sum");
        int target = sc.nextInt();
        int targets= a.targetsum(array,target);
        System.out.println("total no of pairs are "+targets);
       int unique= a.findUnique(array);
        System.out.println("unique no is "+unique);



    }
    
}


