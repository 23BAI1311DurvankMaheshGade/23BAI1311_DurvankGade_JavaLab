public class APP2907{
    public static void main(String[] args){
        /* Program to check armstrong numbers between two numbers */
        int a = 1;
        int b= 1000;
        int temp=0;
        int sum=0;
        for(int i=1;i<=1000;i++){
            int num = i;
            int numd=String.valueOf(i).length();
            while(num>0){
            temp = num%10;
            sum+=Math.pow(temp,numd);
            num=num/10;
        }
        if(sum==i){
            System.out.println(i+"\n");
            sum=0;
        }
        else{
            sum=0;
        }
    }
}}