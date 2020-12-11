import java.util.Scanner;

/*
*Author : riannasmuk10-Dec-2020
*Date : 10-Dec-2020
*/


/*
 * Écrire une méthode permettant de tester si un tableau contient un élément
 * donné (fourni par l’utilisateur). Afficher un message disant si l’élément
 * recherché est présent ou non. 
 */


public class Formatif_Rianna2 {


		public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int[] tab = {5, 100, 32, 78, 29, 10, 32, 12, 7, 27, 98, 54 };


				System.out.println("Quel numéro voulez-vous tester pour voir s'il est dans le tableau?");
				int nombre = sc.nextInt();

				int toFind = nombre;
				boolean found = false;

				for (int n : tab) {
					if (n == toFind) {
						found = true;
						break;
					}
				}

				if(found)
					System.out.println(toFind + " se trouve dans le tableau.");
				else
					System.out.println(toFind + " ne se trouve pas dans le tableau.");
		}
}