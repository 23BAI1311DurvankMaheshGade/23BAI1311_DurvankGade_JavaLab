class Student {
public int roll_no;
public String Name;
Student(int roll_no,String Name){
    this.roll_no=roll_no;
    this.Name=Name;

}  
}
public class APP108d{
    public static void main(String[] args) {
        Student arr[];
        arr=new Student[5];
        arr[0]=new Student(1,"Aman");
        arr[1]=new Student(2,"Nimish");
        arr[2]=new Student(3,"Dinsha");
        arr[3]=new Student(4,"Rajat");
        arr[4]=new Student(5,"Durvank");

        for(int i=0; i<arr.length;i++){
            System.out.println("Roll number: "+ arr[i].roll_no + " Name " + arr[i].Name);
        }
    }
}
