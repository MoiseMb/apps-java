import java.sql.*;


public class testbd{


// public static Connection connecter(){

// 	String url = "jdbc:mysql://localhost:3306/university";
// 	String utilisateur = "root";
// 	String motDePasse = "";

// 	Connection connexion = DriverManager.getConnection(url, utilisateur, motDePasse);

// 	return connexion;
// }

	public static void main(String[] args) {
		
		try{
					// Connection con=connecter();

				String url = "jdbc:mysql://localhost:3306/university";
				String utilisateur = "root";
				String motDePasse = "";
				Connection connexion = DriverManager.getConnection(url, utilisateur, motDePasse);
				
				}catch(Exception e){
					e.printStackTrace();
				
				}





	}
}