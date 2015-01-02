package callBack;

public class ExDepartment {
	private Callbackable exCompany;

	public void setExCompany(Callbackable exCompany) {
		this.exCompany = exCompany;
	}
	
	public ExDepartment(Callbackable exCompany){
		this.setExCompany(exCompany);
	}
	
	public void sendGoods(){
		exCompany.method();
	}
}
