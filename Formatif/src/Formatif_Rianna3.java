import java.util.Arrays;

/*
*Author : riannasmuk10-Dec-2020
*Date : 10-Dec-2020
*/

public class Formatif_Rianna3
{

	/*
	 * Écrire une méthode qui reçoit en paramètre un tableau d’entiers et qui
	 * retourne le même tableau amputé du plus grand nombre de cet élément. Utiliser
	 * la méthode plusGrandIndex de la classe MethodesTableaux pour trouver l’index
	 * du nombre le plus grand dans un tableau d’entiers. Afficher le tableau ainsi
	 * modifié.
	 */
		
		public static int nombre(int[] s, int total) {
				int n;
				for (int i = 0; i < total; i++) {
					for (int r = i + 1; r < total; r++) {
						if (s[i] < s[r]) {
							n = s[i];
							s[i] = s[r];
							s[r] = n;
						}
					}
				}
				return s[0];
		}

		public static void main(String args[]){

				int coolerArray[]; 
				int []s= {12,45,33,11};

				coolerArray = Arrays.stream(s).filter(d -> d != nombre(s,4)).toArray();
				System.out.println(Arrays.toString(coolerArray));

		}
}