import java.util.Scanner;

class ArrayExample{
    void demoArray(){
        int [] age = new int[3];
        age[0]=23;
        age[1]=34;
        age[2]=45;
     System.out.println(age[0]);
     System.out.println(age[1]);
     System.out.println(age[2]);

     int weight []={2,56,89};

     System.out.println(weight[1]);
     System.out.println(weight[2]);
     System.out.println(weight[0]);

     String [] name = new String[3];
     Scanner sc = new Scanner(System.in);
     for(int i=0; i<name.length; i++){
        System.out.println("enter names");
        name[i] =  sc.nextLine();


     }
     //using for each loop for printing all values of name 
     System.out.println("you entered the following names ");
     for(String names:name){
        System.out.println(names);
     }
     System.out.println(name.length);
    }
}
class MultiArray{
    void demoArray(){
        int[][] multiArray = {{23,45},{34,23},{56,89}};
        System.out.println(multiArray[0][0]);
        System.out.println(multiArray[0][1]);
        System.out.println(multiArray[1][0]);
        System.out.println(multiArray[1][1]);
        System.out.println(multiArray[2][0]);
        System.out.println(multiArray[2][1]);
         
        int[][] age = new int[4][3];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
            age[i][j]   = sc.nextInt();


            }
        }
        for(int i=0; i<age.length; i++){
            for(int j=0; j<age[i].length; j++){
                System.out.println(age[i][j]);
            }
        }

    }
        
}
class SumOfArrays{
    void arraysum(){
    int[] arrays = new  int[5];
    Scanner sc = new Scanner(System.in);
    for(int i=0; i<5; i++){
        System.out.println("enter your number");
      arrays[i] =  sc.nextInt();

    }
    int  sum = 0;
    // adding the all the arrays 
    for(int i=0; i<5; i++){
        sum=sum+arrays[i];

    }
    System.out.println("sum of arrays is "+sum);
}
    void maxValueArray(){
        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5; i++){
            System.out.println("enter your array for finding max value ");
            array[i] = sc.nextInt();

        }
        // finding the max value 
       int  maxvalue=0;
        for(int i=0; i<5; i++){
            if(array[i]>maxvalue){
                maxvalue=array[i];
            }

        }
        System.out.println("max value is "+maxvalue);
        
    }
    void findArray(){
        int[] array = {10,30,80,25,78};
        System.out.println("choose any number for searching the index of no"+array);
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int  ans =-1;
        for(int i=0; i<array.length; i++){
            if(array[i]==a){
                ans =i;
                break;
            }

        }
        System.out.println("found "+a+"at index "+ans);
        
    }


}
public class Array {
    public static void main(String[] args) {
        ArrayExample array= new ArrayExample();
       // array.demoArray();
        MultiArray multiArray = new MultiArray();
       // multiArray.demoArray();
        SumOfArrays a= new SumOfArrays();
       // a.arraysum();
       //a.maxValueArray();
       a.findArray();
       

    }
    
}
