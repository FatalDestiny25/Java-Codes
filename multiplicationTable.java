import java.util.*;
public class multiplicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("Enter Number:");
int n=sc.nextInt();
for(int i=1;i<=12;i++)
{
	System.out.println(n+ "*" +i+ "=" +n*i);
}
	}
}


