
public class tableau{
public static int max(int tab[][]){
int max=tab[0].length;
	for (int i=1;i<tab.length ; i++) {
		
		if (max<tab[i].length) {
			max=tab[i].length;
		}
	}
	return max;
}

	public static void main(String[] args) {

		int tab[][]={{1,3,4},{3,4,5,6,8}};
		for (int j=0;j<max(tab) ;j++ ) {
			for (int i=0;i<tab.length ;i++ ) {
				if (j<tab[i].length) {
					System.out.print(tab[i][j]+"\t");
				}else{
					System.out.print("\t");
				}
			}
			System.out.println();
		}


	}
}