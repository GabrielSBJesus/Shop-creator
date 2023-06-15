public class Produto {
	private String name;
	private Double price;
	private String validity;
	private Integer id;
	
	public Produto(String name, Double price,String validity, Integer id) {
		this.name = name;
		this.price = price;
		this.validity = validity;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getValidity() {
		return validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Produto [name=" + name + ", price=" + price + ", validity=" + validity + ", id=" + id + "]";
	}
	
}
