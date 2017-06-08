import java.util.ArrayList;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> sendData = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String capital1, capital2;
		
		System.out.println("Menu para encontrar distancias entre as capitais brasileiras");
		System.out.println("Digite o nome da primeira capital");
		capital1 = sc.next();
		System.out.println("Digite o nome da segunda capital");
		capital2 = sc.next();
		sendData.add(capital1);
		sendData.add(capital2);
		
		
		
	}

}
