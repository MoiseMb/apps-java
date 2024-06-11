
//Question 1 : caluler la norme d'un vecteur 

public static double norme (double x,double y){


double resultat = math.sqrt((x*x) + (y*y));
	return resultat ;

}



//Question 2 : Fonction pour calculer le factorielle d'un nombre

public static int factorielle(int n){
	if (n==0) {
		return 1;
		
	}else

	return n*factorielle(n-1);
}


//Question 3 : Fonction pour calculer le puissance d'un nombre

public static float puissance (int n,int p){

	if (p==0) {
		return 1;
	}else
	if (n>0) {
		return n * puissance(n,p-1);
	}else
	
	return 1/puissance(n,-p);
	
}

 

//Question 4 : Fonction Pour calculer le reste 

public static int reste (int n, int p){
	while(n>=p){
		n=n-p;
	}

	return n;

}

//Question 5 : Fonction pour fusionner 2 tableaux

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

//Question 6 : Fonction qui recherche un element x dans un tableau 

public static boolean recherche(int[] tab,int x){

	boolean resultat=false;

	for (int i=0;i<tab.lenght ;i++ ) {

		if (x==tab[i]) {
			resultat=true;
			break;
		}
		
	}
	return resultat;
}
