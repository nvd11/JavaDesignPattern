package callBack;

public class ClientCallback {
	public static void f(){
		ExDepartment exd = new ExDepartment(new SFExpress());
		
		Employee jack = new Employee();
		jack.sendGoods(exd);
		
		exd.setExCompany(new EMS());
		jack.sendGoods(exd);
		
		exd.setExCompany(new Callbackable() {
							@Override
							public void method(){
								System.out.println("Sent goods by Jimmy!");
							}
						});
		
		jack.sendGoods(exd);
	}
}
