import java.util.List;

public class Shop {
	private String boss;
	private String nameStore;
	private Integer id;
	private double priceStore;
	private List<Product> listaProdutos;
	
	Shop(String boss, String nameStore, Integer id, Double priceStore, List<Product> listaProdutos) {
		this.boss = boss;
		this.nameStore = nameStore;
		this.id = id;
		this.priceStore = priceStore;
		this.listaProdutos = listaProdutos;
	}
	
	public String getNameStore() {
		return nameStore;
	}

	public void setNameStore(String nameStore) {
		this.nameStore = nameStore;
	}

	public Double getPriceStore() {
		return priceStore;
	}

	public void setPriceStore(Double priceStore) {
		this.priceStore = priceStore;
	}
	
	public List<Product> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<Product> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	
	public void showItens() {
		try {
			for(int i = 0; i < this.listaProdutos.size(); i++) {
				if(listaProdutos.get(i) == null) {
					throw new Exception("Um index da sua lista está sem nenhum valor ou com valor nulo");
				}
				System.out.println(listaProdutos.get(i));
			}
		} catch (Exception e)  {
			System.out.println(e);
		}

	}

	@Override
	public String toString() {
		return "Shop [boss=" + boss + ", nameStore=" + nameStore + ", id=" + id + ", priceStore=" + priceStore
				+ ", listaProdutos=" + listaProdutos + "]";
	}

	
}
