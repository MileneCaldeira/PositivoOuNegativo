import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
	System.out.println("Informe um número: ");
		Double N = sc.nextDouble();
		if (N>=0.1) {
			System.out.println("POSITIVO");
		}else if (N==0){
			System.out.println("NEUTRO");
		}else {
			System.out.println("NEGATIVO");
		}
	}

}
