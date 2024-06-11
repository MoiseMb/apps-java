import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class test{

	public static void main(String[] args) {
		// Scanner sc=new Scanner(System.in);
		// System.out.println("Saisir une valeur : ");
		// int a=sc.nextInt();
		 // int m=reste(a,4);
		int t[]={1,4,6,8};
		int t2[]={6,2,9,11};
		int m=puissance(4,-2);
		System.out.println(m);
		/*int fus[]= fusion(t,t2);
		for (int i=0;i<fus.length ;i++ ) {
			System.out.print(fus[i]+" \t");
			
		}
		System.out.println("");
		if (recherche(t,83)) {
			System.out.println("element 8 trouver");
		}else
			System.out.println("Element introuvable");
*/
		Date d=new Date();
		SimpleDateFormat simple=new SimpleDateFormat("dd/MM/yy");
		// System.out.println("Date actuel : "+simple.format(d));  
		System.out.println("Date actuel : "+d); 
		calendar.add(Calendar.DATE,7);1 

		
	}

	public static int[] fusion(int[] T1, int [] T2){

	int t []= new int [T1.length+T2.length];
	int i,j;

	for ( i=0;i<T1.length ;i++ ) {

		t[i]=T1[i];
		
	}


	for ( j=0;j<T2.length ;j++ ) {
		
		t[i+j]=T2[j];
		
	}
	return t;
}

public static int puissance (int n,int p){

	if (p==0) {
		return 1;
	}else
	if (p>0) {
		return n * puissance(n,p-1);
	}else
	return n * puissance(n,-(p+1));
	// return 1/puissance(n,-p);
	
} 


public static boolean recherche(int[] tab,int x){

	boolean resultat=false;

	for (int i=0;i<tab.length ;i++ ) {

		if (x==tab[i]) {
			resultat=true;
			break;
		}
		
	}
	return resultat;
}
}
