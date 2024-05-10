package live.coding.tres;

//import java.util.ArrayList;
import java.util.Scanner;

public class MangosNaranjasMain {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		int mangos = leer.nextInt();
		int naranjas = leer.nextInt();
		
		MangosNaranjas mn = new MangosNaranjas (mangos, naranjas);
		mn.mangosCaja();

		//ArrayList<String> cajasMangos = new ArrayList<>();
		//ArrayList<String> cajasNaranjas = new ArrayList<>();
		
		leer.close();
	}

}