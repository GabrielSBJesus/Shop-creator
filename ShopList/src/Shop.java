
public class Shop {
	private String boss;
	private String nameStore;
	private Integer id;
	private double priceStore;
	
	Shop(String boss, String nameStore, Integer id, Double priceStore) {
		this.boss = boss;
		this.nameStore = nameStore;
		this.id = id;
		this.priceStore = priceStore;
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

	@Override
	public String toString() {
		return "Shop [boss=" + boss + ", nameStore=" + nameStore + ", id=" + id + ", priceStore=" + priceStore + "]";
	}
	
}
