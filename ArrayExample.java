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
    public int firtRepeatingNumber(int[] array){
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++ ){
                if(array[i]==array[j]){
                    return array[i];
                }
            }
        }
        return -1;
    }
    public int findMax(int[] array){
        int max= Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
    public int secondMax(int[]array){
        int max = findMax(array);
        for(int i=0; i<array.length;i++){
            if(array[i]==max){
                array[i]=Integer.MIN_VALUE;
            }
        }
        int secondMax=findMax(array);
        return secondMax;
    }
    public int[] reverseArray(int[]array){
        int n = array.length;
        int[] ans = new int[n];
        int j = 0;
        for ( int i =n-1; i>=0; i--){
            ans[j++]=array[i];
        }
        return ans;

        
    }
    public void printArray(int[]array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
    public void swapArray(int[] array, int i, int j){
        int temp = array[i];
            array[i]= array[j];
            array[j]=temp;

    }
    public int[] ReverseArray(int []array){
        int i =0; 
        int j = array.length-1;
        while ((i<j)) {
            swapArray(array, i, j);
            i++;
            j--;
            
        }
        return array;

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
     int firstrepeatingno =a.firtRepeatingNumber(array);
     System.out.println("first repeating number is"+firstrepeatingno);
    int secondmax= a.secondMax(array);
     System.out.println("seconf maax value of array is "+secondmax);
     int[] ans =a.reverseArray(array);
     System.out.println("reversed array are");
    a.printArray(ans);
     int[] r= a.ReverseArray(array);

     a.printArray(r);



    }
    
}


