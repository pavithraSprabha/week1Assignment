package week1.day2assignments;

import org.apache.poi.util.SystemOutLogger;

public class Mobile {
	public void makeCall() {
	System.out.println("Make call Method");
	}
	public void sendMsg() {
		System.out.println("Send Msg Method");
}
	private void paybills(){
		System.out.println("The paybill method ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mobile mob=new Mobile();
mob.makeCall();
mob.sendMsg();
mob.paybills();
	}

}
