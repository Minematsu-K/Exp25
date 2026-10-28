
public class Appliance extends Product{
	int warrantyYears;
	
	void showWarranty() {
		System.out.println("保証期間："+this.warrantyYears+"年");
	}
}
