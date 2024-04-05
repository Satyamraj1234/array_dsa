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
    public int[] presentArray(int [] array){
        int [] frequency = new int[100005];
        for(int i=0; i<array.length; i++){
            frequency[array[i]]=frequency[array[i]]+1;

        }
        return frequency;

    }
    public int[] rotateArray(int[]array ,int k){
        int n = array.length;
        int [] ans = new int[n];
        k = k%n;
        int j=0;
        for(int i=n-k; i<n; i++){
            ans[j++]=array[i];
        }
        for(int i= 0; i<n-k; i++){
            ans[j++]=array[i];
        }
        return ans;


    }
    public int[] sortbyParity(int[]array){
        int n=array.length;
        int left=0;
        int right =n-1;
        while (left<right) {
            if(array[left]%2==1&&array[right]%2==0){
                swapArray(array, left, right);
                left++;
                right--;
            }
            if(array[left]%2==0){
                left++;

            }
            if(array[right]%2 ==1)
            right--;
            
        }
        return array;
    }
    public int[] sortbysquare(int[] array){
        int left=0;
        int right = array.length-1;
        int [] ans = new int[array.length];
        int k =0;
        while (left<=right) {
            if (Math.abs(array[left])>Math.abs(array[right])) {
                ans[k++]=array[left]*array[left];
                left++;
                
            }else{
                ans[k++]=array[right]*array[right];
                right--;
            }
            
        }
        return ans;

    }
    public int[] prefixsum(int[]array){
        for(int i=1; i<array.length; i++){
            array[i]=array[i]+array[i-1];
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
     int[] presentArray= a.presentArray(array);
     System.out.println("enter the number of query");
     int query= sc.nextInt();
     while (query>0) {
        System.out.println("enter number to be searched");
        int x = sc.nextInt();
        if(presentArray[x]>0){
            System.out.println("yes present ");

        }else{
            System.out.println("not present");
        }
        query--;
        
     }
    System.out.println("enter k");
    int  k= sc.nextInt();
    int[] rotate=a.rotateArray(array, k);
    a.printArray(rotate);
    int[]b=a.sortbyParity(array);
   a.printArray(b);
 int[] srtbysqr= a.sortbysquare(array);
  a.ReverseArray(srtbysqr);
  a.printArray(srtbysqr);
  int[] prifixsum= a.prefixsum(array);
   a.printArray(prifixsum);





    }
    
}


