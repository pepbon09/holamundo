import java.util.Scanner;

public class Ajedrez {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		int lado, casilla, mitad;
		System.out.println("Que grande quieres que sea la casilla? ");
		casilla=scn.nextInt();
		lado=casilla*8;
		mitad=lado/2;
		
		System.out.print("|");
		for(int i=0; i<lado; i++) {
			System.out.print("-");
		}
		System.out.print("|");
		System.out.println();
		for(int i=0; i<mitad; i+=casilla) {
			for(int l=0; l<casilla; l++) {
				System.out.print("|");
				for(int h=0; h<mitad; h+=casilla) {
					for(int j=0; j<casilla; j++) {
						System.out.print(" ");
					}
					for(int j=0; j<casilla; j++) {
						System.out.print("#");
					}
				}
				System.out.print("|");
				System.out.println();
			}
			for(int l=0; l<casilla; l++) {
				System.out.print("|");
				for(int h=0; h<mitad; h+=casilla) {
					for(int j=0; j<casilla; j++) {
						System.out.print("#");
					}
					for(int j=0; j<casilla; j++) {
						System.out.print(" ");
					}
				}
				System.out.print("|");
				System.out.println();
			}
		}
		System.out.print("|");
		for(int i=0; i<lado; i++) {
			System.out.print("-");
		}
		System.out.print("|");

	}

}
