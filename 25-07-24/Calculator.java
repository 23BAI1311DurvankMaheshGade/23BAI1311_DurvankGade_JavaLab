import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        int operandA, operandB; int i=0;
        String operation;
        String loop;
        String add="ADD";
        String sub="SUB";
        String mul="MULTIPLY";
        String div="DIVIDE";
        String cont="YES";
        String end="NO"; 
        Scanner n = new Scanner(System.in);
        while(i<=0){
        System.out.println("Enter the arithmetic operation you need to perform:\n1.ADD\n2.SUB\n3.MULTIPLY\n4.DIVIDE");
        operation = n.nextLine();
        System.out.println("Enter Operand 1");
        operandA = n.nextInt();
        System.out.println("Enter Operand 2");
        operandB = n.nextInt();
        n.nextLine();
        if(operation.equals(add)){
            System.out.println(operandA+operandB);
        }
        else if(operation.equals(sub)){
            System.out.println(operandA-operandB);
        }
        else if(operation.equals(mul)){
            System.out.println(operandA*operandB);
        }
        else if(operation.equals(div)){
            System.out.println(operandA/operandB);
        }

        System.out.println("YES to continue or NO to exit: ");
        loop = n.nextLine();
        if(loop.equals(cont)){
            continue;
        }
        else{
            break;
        }
        }
        }
}