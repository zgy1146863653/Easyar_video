import java.util.*;
public class Test{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
 		int numMax= num1 > num2? (num1 >num3? num1:num3):(num2>num3?num2:num3);
        		System.out.println(numMax+"是这三个数最大的一个");
	}
}