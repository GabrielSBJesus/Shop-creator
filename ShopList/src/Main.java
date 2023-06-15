import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		LocalDateTime date = LocalDateTime.of(2021, 5, 15, 10, 30, 0);
	    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	    String newDate = date.format(dateFormat);
	    
		Produto tomate = new Produto("Tomate", 10.0, newDate , 1);
		Produto banana = new Produto("banana", 20.0, newDate , 2);
		Produto cereja = new Produto("cereja", 2.0, newDate , 3);
		
		List<Produto> listOfFruits = new ArrayList<Produto>();
		
		ListProducts listOfProducts = new ListProducts("Frutas");
		listOfProducts.setListOfProducts(listOfFruits);
		
		Shop petShop = new Shop("Carlos", "StormPet", 1, 10000.10, listOfProducts);
	
		listOfProducts.addProductrAtList(tomate);
		listOfProducts.addProductrAtList(cereja);
		listOfProducts.addProductrAtList(banana);
		System.out.println(petShop);
		System.out.println(listOfFruits);
		
	}
}
