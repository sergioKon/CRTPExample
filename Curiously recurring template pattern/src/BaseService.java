
public class BaseService {
   protected long startTime;
   
   public BaseService(long startTime) {
	this.startTime= startTime;
}
    
	public long getStartTime() {
		return startTime;
	}

}
