
public class Exp25_1 {

	public static void main(String[] args) {
		Food food=new Food();
		Appliance appliance=new Appliance();
		
		food.name="りんご";
		food.price=150;
		
		food.showInfo();
		food.expirationDate="2026年10月25日";
		food.showExpirationDate();
		System.out.println();
		
		appliance.name="電子レンジ";
		appliance.price=15000;
		
		appliance.showInfo();
		
		appliance.warrantyYears=2;
		appliance.showWarranty();
	}

}
