import java.util.List;

public class ListProducts {
	private String typeOfList; 
	private List<Product> listOfProducts;
	
	public ListProducts(String typeOfList) {
		this.typeOfList = typeOfList;
	}

	public String getTypeOfList() {
		return typeOfList;
	}

	public void setTypeOfList(String typeOfList) {
		this.typeOfList = typeOfList;
	}

	public List<Product> getListOfProducts() {
		return listOfProducts;
	}

	public void setListOfProducts(List<Product> listOfProducts) {
		this.listOfProducts = listOfProducts;
	}
	
	public void addProductrAtList(Product product) {
		this.listOfProducts.add(product);
	}

	@Override
	public String toString() {
		return "ListProducts [typeOfList=" + typeOfList + ", listOfProducts=" + listOfProducts + "]";
	}
	
}


