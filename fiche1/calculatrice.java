public class calculatrice{
	public static void main(String[] args) {
		int m=Integer.parseInt(args[0]);
		
		int m2=Integer.parseInt(args[2]);
		int result;
		char c=args[1].charAt(0);


		if (c=='+') {
			result=m+m2;
			
			
		}else
		if (c=='-') {
			result=m-m2;
			
		}else
		if (c=='x') {
			result= (m *m2);
		}else
		if (c=='/') {
			result=m/m2;

			
		}else{
			System.out.println("L'operateur n'existe pas ");
			return;
		}
		System.out.println("le resultat de "+m+ " "+c+ " "+m2+ " = "+result);

	}
}