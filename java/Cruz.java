import java.util.Scanner;

public class Cruz {

	public static void main(String[] args) {
		
		int lado, ast, esp, espfuera, espg;
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Inserta la escala de la cruz:");
		esp=scn.nextInt();
		espfuera=esp+1;
		lado=esp+2;
		
		for(int i=0; i<espfuera; i++) {
			System.out.print("  ");
		}
		for(int i=0; i<lado; i++) {
			System.out.print("* ");
		}
		System.out.println();
		
		for(int i=0; i<esp; i++) {
			for(int j=0; j<espfuera; j++) {
				System.out.print("  ");
			}
			System.out.print("* ");
			for(int j=0; j<esp; j++) {
				System.out.print("  ");
			}
			System.out.print("*");
			System.out.println();
		}
		
		for(int i=0; i<lado; i++) {
			System.out.print("* ");
		}
		for(int i=0; i<esp; i++) {
			System.out.print("  ");
		}
		for(int i=0; i<lado; i++) {
			System.out.print("* ");
		}
		System.out.println();
		espg=((lado*2)+esp)-2;
		
		for(int i=0; i<esp; i++) {
			System.out.print("* ");
			for(int j=0; j<espg; j++) {
				System.out.print("  ");
			}
			System.out.print("*");
			System.out.println();
		}
		
		for(int i=0; i<lado; i++) {
			System.out.print("* ");
		}
		for(int i=0; i<esp; i++) {
			System.out.print("  ");
		}
		for(int i=0; i<lado; i++) {
			System.out.print("* ");
		}
		System.out.println();
		
		for(int i=0; i<esp; i++) {
			for(int j=0; j<espfuera; j++) {
				System.out.print("  ");
			}
			System.out.print("* ");
			for(int j=0; j<esp; j++) {
				System.out.print("  ");
			}
			System.out.print("*");
			System.out.println();
		}
		
		for(int i=0; i<espfuera; i++) {
			System.out.print("  ");
		}
		for(int i=0; i<lado; i++) {
			System.out.print("* ");
		}

	}

}
