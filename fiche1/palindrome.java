import java.util.Scanner;

public class palindrome{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("veuillez saisir un mot");
		String mot=sc.next();
		

		int t2=mot.length()-1,res=0;
		
		String rev="";

	for (int i=t2 ;i>=0 ;i-- ) {
	
		rev+=mot.charAt(i);		
	}
	System.out.println("inverse : "+rev);

	rev=rev.toUpperCase();
	mot=mot.toUpperCase();

			if (mot.equals(rev)) {
			System.out.println("Le mot est un palindrome");

			}else{

			System.out.println("Le mot n'est pas un palindrome");
		}
		
	}

}
