/**
 * 
 */
package model;

/**
 * @author Dee
 *
 */
public class Product {
	
	private int productID;
	private String name;
	private String category;
	private double cost;
	private double price;
	private int quantity;
	private String img;
	
	/**
	 * default constructor
	 */
	public Product() {
		this.productID = "";
		this.name = "";
		this.category = "";
		this.cost = 0;
		this.price = 0;
		this.quantity = 0;
		this.img = "";
	}
	
	/**
	 * @param productID
	 * @param name
	 * @param category
	 * @param cost
	 * @param price
	 * @param quantity
	 */	
	public Product(int productID, String name, String category, double cost,
			double price, int quantity, String img) {
		productID = productID;
		this.name = name;
		this.category = category;
		this.cost = cost;
		this.price = price;
		this.quantity = quantity;
		this.img = img;
	}

	/**
	 * @return the productID
	 */
	public int getProductID() {
		return productID;
	}

	/**
	 * @param productID the productID to set
	 */
	public void setProductID(int productID) {
		this.productID = productID;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String getImg(){
		return img;
	}
	
	public void setImg(String img){
		this.img = img;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product [productID=" + productID + ", name=" + name
				+ ", category=" + category + ", cost=" + cost + ", price=" + price
				+ ", quantity=" + quantity + ", img=" + img + "]";
	}
	
	
	
}
