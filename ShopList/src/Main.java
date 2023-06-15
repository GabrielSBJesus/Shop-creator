import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		LocalDateTime dateTomate = LocalDateTime.of(2021, 7, 15, 23, 30, 0);
	    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	    String newDateTomate = dateTomate.format(dateFormat);
	    
		LocalDateTime dateBanana = LocalDateTime.of(2021, 5, 30, 5, 30, 0);
	    String newDateBanana = dateBanana.format(dateFormat);
	    
		LocalDateTime dateCereja = LocalDateTime.of(2021, 8, 18, 12, 30, 0);
	    String newDateCereja = dateCereja.format(dateFormat);
	    
		Product tomate = new Product("Tomate", 10.0, newDateTomate , 1);
		Product banana = new Product("banana", 20.0, newDateBanana , 2);
		Product cereja = new Product("cereja", 2.0, newDateCereja , 3);
		
		List<Product> listOfFruits = new ArrayList<Product>();
		
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
