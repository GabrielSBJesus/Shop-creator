public class Shop {
	private String boss;
	private String nameStore;
	private Integer id;
	private double priceStore;
	private ListProducts listaProdutos;
	
	Shop(String boss, String nameStore, Integer id, Double priceStore, ListProducts listaProdutos) {
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
	
	public ListProducts getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(ListProducts listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	
	public void showItens() {
		try {
			for(int i = 0; i < thsi.listaProdutos.length; i++) {
				if(listaProdutos[i] = "") {
					throw new Exception("Um index da sua lista está sem nenhum valor ou com valor nulo");
				}
				System.out.println(listaProdutos[i]);
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
