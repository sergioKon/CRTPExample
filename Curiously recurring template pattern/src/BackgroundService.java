
public class BackgroundService extends BaseService implements Service{
   
	public BackgroundService() {
		super(System.currentTimeMillis());
	}

	@Override
	public String doIt() {
		return  Service.super.doIt();
	}


	@Override
	public long getStartTime() {
		return startTime;
	}
}
