
public class OnlineService extends BaseService  implements Service {
    private long delayTime;
	public OnlineService(long delayTime) {
		super(System.currentTimeMillis() + delayTime);
	}

	@Override
	public String doIt() {
		return Service.super.doIt();	
	}



	@Override
	public long getStartTime() {
		return this.startTime; // process start delay to 2 seconds 
	}

	public long getDelayTime() {
		return delayTime;
	}

	public void setDelayTime(long delayTime) {
		this.delayTime = delayTime;
	}

}
