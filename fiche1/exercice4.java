public class exercice4{
public static void main(String[] args) {
	
	int m=Integer.parseInt(args[0]);
	int facto=1,n,i;
		
			
		

		for (n=1;n<=m;n++ ) {

			facto*=n;
			
		}

		System.out.println("factorielle de "+m+" est :  "+facto);
		
	
}
}