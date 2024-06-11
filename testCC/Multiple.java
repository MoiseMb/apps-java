public class Multiple{

	public static void main(String[] args) {
		if(args.length< 1){System.out.println("Donner un argument ");
		return;
	}
		int a=Integer.parseInt(args[0]);
		
		int i,j;
		if(a>0){
			for (i=1;i<=a ;i++ ) {
				System.out.println("table "+a+" : ");
				for (j=1;j<=12 ;j++ ) {
					System.out.println(i+" x "+j+" = "+i*j);
				}
			}
		}else{
			System.out.println("Veuillez entrer un nombre positif");
		}

	}
}