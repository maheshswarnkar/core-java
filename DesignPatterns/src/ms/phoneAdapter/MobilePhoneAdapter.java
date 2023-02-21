package ms.phoneAdapter;

public class MobilePhoneAdapter implements ISocket {
	
	MobilePhone mobilePhone = new MobilePhone();

	@Override
	public void start() {
		mobilePhone.charge();		
	}

	@Override
	public void stop() {
		mobilePhone.unplug();		
	}
	
	

}
