
public class GSM {
	
	private String model;
	private boolean hasSimCard;
	private String simMobileNumber;
	private int outGoingCallsDuration;
	private Call lastIncomingCall;
	private Call lastOutgoingCall;
	
	public GSM(String model) {
		if(model != null && !model.isEmpty()){
			this.model = model;
		}
	}

	void insertSimCard(String simMobileNumber){
		if(isValidSimMobileNumber(simMobileNumber)){
			this.simMobileNumber = simMobileNumber;
			this.hasSimCard = true;
		}
		else{
			System.out.println("This mobile number is incorrect!");
		}
	}
	
	private boolean isValidSimMobileNumber(String simMobileNumber){
		if(simMobileNumber != null && simMobileNumber.length() == 10 && simMobileNumber.charAt(0) == '0' && simMobileNumber.charAt(1) == '8'){
			return true;
		}
		return false;
	}
	
	void removeSimCard(){
		if(this.hasSimCard){
			this.hasSimCard = false;
		}
		else{
			System.out.println("No sim card in phone!");
		}
	}
	
	void call(GSM receiver, int duration){
		if(duration>0 && receiver != this && this.hasSimCard && receiver.hasSimCard){
			Call call = new Call();
			this.outGoingCallsDuration += duration;
			call.setDuration(duration);
			call.setCaller(this);
			call.setReceiver(receiver);
			this.lastOutgoingCall = call;
			receiver.lastIncomingCall = this.lastOutgoingCall;
		}
		else{
			System.out.println("Incorrect receiver or duration!");
		}
	}
	
	double getSumForCalls(){
		return this.outGoingCallsDuration*Call.getPriceForAMinute();
	}

	void printInfoForTheLastOutgoingCall(){
		if(this.lastOutgoingCall != null){
			System.out.println("Last outgoing call duration and receiver's mobile number: ");
			System.out.println(this.lastOutgoingCall.getDuration());
			System.out.println(this.lastOutgoingCall.getReceiver().simMobileNumber);
		}
		else{
			System.out.println("No outgoing call!");
		}
	}
	
	void printInfoForTheLastIncomingCall(){
		if(this.lastIncomingCall != null){
			System.out.println("Last incoming call duration and caller's mobile number: ");
			System.out.println(this.lastIncomingCall.getDuration());
			System.out.println(this.lastIncomingCall.getCaller().simMobileNumber);
		}
		else{
			System.out.println("No incoming call!");
		}
	}
}
