package week1.day1;

public class Mobile {
	public void makecall() {
		String MobileModel="Samsung";
		float Mobileweight=5.62f;
		System.out.println("Model "+MobileModel);
		System.out.println("Weight "+Mobileweight);
	}		
		public void sendMsg() {
			int cost=5000;
			boolean isFullycharged =true;
			System.out.println("isFullycharged");
			System.out.println(cost);			
		}
			public static void main(String[]args)
			{
				Mobile mob = new Mobile();
				mob.makecall();
				mob.sendMsg();
			}		
}
