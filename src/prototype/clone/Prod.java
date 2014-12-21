package prototype.clone;

public class Prod {
	private int prodID;
	private String prodName;
	
	public int getProdID() {
		return prodID;
	}
	public void setProdID(int prodID) {
		this.prodID = prodID;
	}
	
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	
	@Override
	public String toString(){
		return "Prod: " + this.getProdID() + " , " + this.getProdName();
	}
	
}
