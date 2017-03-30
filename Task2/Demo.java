
public class Demo {
	
	public static void main(String[] args) {
		
		GSM phone= new GSM("IPhone");
		phone.insertSimCard("0899999999");
		
		GSM phone1= new GSM("Samsung");
		phone1.insertSimCard("0811111111");
		
		
		phone.call(phone1, 9);
		phone.call(phone1, 10);
		
		Call.setPriceForAMinute(0.90);
		
		System.out.println(phone.getSumForCalls());
		
		phone.printInfoForTheLastOutgoingCall();
		phone.printInfoForTheLastIncomingCall();
		
	}

}
