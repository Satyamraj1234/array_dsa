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

    public static void main(String[] args) {
        ArrayExample a= new ArrayExample();
        a.creatArray();
        
    }
    
}
