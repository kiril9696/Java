
public class Call {
	
	private static double priceForAMinute;
	private GSM caller;
	private GSM receiver;
	private int duration;
	
	public void setDuration(int duration) {
		if(duration > 0){
			this.duration = duration;
		}
	}

	public void setCaller(GSM caller) {
		if(caller != null){
			this.caller = caller;
		}
	}

	public void setReceiver(GSM receiver) {
		if(receiver != null){
			this.receiver = receiver;
		}
	}

	public static void setPriceForAMinute(double priceForAMinute) {
		if(priceForAMinute > 0 && priceForAMinute <= 0.9){
			Call.priceForAMinute = priceForAMinute;
		}
		else{
			System.out.println("This is too expensive for only one minute!");
		}
	}

	public static double getPriceForAMinute() {
		return priceForAMinute;
	}

	public int getDuration() {
		return duration;
	}

	public GSM getReceiver() {
		return receiver;
	}

	public GSM getCaller() {
		return caller;
	}

}
