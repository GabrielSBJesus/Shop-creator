import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seja Bem vindo ao ShopCreator");
		
		System.out.println("Gostaria de Criar um loja ?");
		
		char res = sc.nextLine().toLowerCase().charAt(0);
		
		if(res == 's') {
			System.out.print("Qual seria o nome do dono da Loja ?");
			String boss = sc.next();
			
			System.out.println("Qual seria o nome da loja ?");
			String nameStore = sc.next();
			
			System.out.println("Já sabemos quem é o chef e também o nome da loja \nagora precisamos colocar itens na loja");
			
			int quantidadeItens = sc.nextInt();
			
			List<Product> subList = new ArrayList<Product>();
			
			for(int i = 0; i < quantidadeItens; i++) {
				System.out.println("Qual o nome do seu produto ?");
				String nomeProduto = sc.next();
				
				
				System.out.println("Qual o ano de valídade do seu item ?");
				int anoValidade = sc.nextInt();
				System.out.println("Qual o mês de valídade do seu item ?");
				int mesValidade = sc.nextInt();
				while(mesValidade > 12) {
					System.out.println("Qual o mês de valídade do seu item ?");
					mesValidade = sc.nextInt();
				}
				
				System.out.println("Qual o dia de valídade do seu item ?");
				int diaValidade = sc.nextInt();
				while(diaValidade > 31) {
					System.out.println("Qual o dia de valídade do seu item ?");
					diaValidade = sc.nextInt();	
				}
				
				LocalDateTime dateItem = LocalDateTime.of(anoValidade, mesValidade, diaValidade, 23, 30, 0);
			    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			    String newDateItem = dateItem.format(dateFormat);
			    
				Product Item = new Product(nomeProduto, 2.0, newDateItem , 3);
				
				
				subList.add(Item);
			
			}
			
			System.out.println("Sua Loja já tem alguns itens.");
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
			System.out.println("Muito obrigado por usar nosso programa, agora você tem uma loja só sua.");
			Shop shop = new Shop(boss, nameStore, 1, 10000.10, subList);
			System.out.println("Sua Loja:");
			System.out.println(shop);

		} else {
			System.out.println("Ok, estarei esperando caso queira criar uma loja.");
		}
		
		
		
	}
}
