import java.util.Scanner;
public class f2exercice3{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("saisir un nombre");
		int nb=sc.nextInt();
		int res;

		for (int i=1;i<=nb ;i++ ) {
			System.out.println("table de "+i);
			for (int j=1;j<=10 ;j++ ) {
				res=j*i;
				System.out.println(i+" * "+j+" = "+res);
			
			}
			System.out.println();
		}

	}
}