
public class APP3007c {
    public static void main(String[] args) {
        /*StringBuilder sb=new StringBuilder("Hello");
        sb.append("Java");
        System.out.println(sb);*/

        /*StringBuilder sb=new StringBuilder("Hello");
        sb.replace(1,3,"Java");
        System.out.println(sb);*/

        /*StringBuilder sb=new StringBuilder("Hello");
        sb.delete(1, 3);
        System.out.println(sb);*/

        /*StringBuilder sb=new StringBuilder("Hello");
        sb.reverse();
        System.err.println(sb);*/
        
        StringBuilder sb=new StringBuilder();
        System.out.println(sb.capacity());
        sb.append("Hello");
        System.out.println(sb.capacity());
        sb.append(" Java is my favorite language");
        System.out.println(sb.capacity());
        sb.ensureCapacity(10);
        System.out.println(sb.capacity());
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());
    }
}
