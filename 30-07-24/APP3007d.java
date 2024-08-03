import java.util.Scanner;
public class APP3007d {
public static void main(String[] args) {
    int temp=0;int temp2;
    Scanner myobj=new Scanner(System.in);
    System.out.println("Enter number of elements in array:");
    int n= myobj.nextInt();
    int[] arr=new int[n];
    for (int k=0;k<n;k++){
        arr[k]=myobj.nextInt();
    }
    

    for (int i=0;i<arr.length;i++){
        for (int j=i+1;j<arr.length;j++){
            if(arr[i]<arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            else{
                continue;
            }
        }
    }
    System.out.println(arr[2]);
}   
}
