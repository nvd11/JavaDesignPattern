package prototype.clone;

public class Order implements Cloneable{
	private int orderID;
	private Prod prod;
	private int amount;
	
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	
	public Prod getProd() {
		return prod;
	}
	public void setProd(Prod prod) {
		this.prod = prod;
	}
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public String toString(){
		return "Order: " + this.getOrderID() + " , " + this.getAmount() + " " + this.getProd().toString();
	}
	
	@Override
	public Object clone(){
		Object o = null;
		try{
			o = super.clone();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return o;
	}
}
