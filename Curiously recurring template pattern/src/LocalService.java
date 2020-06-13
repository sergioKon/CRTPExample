
public class LocalService  <T extends Service>   extends SecutiryValidator{
	private T t;
	public  LocalService(T t, String user) {
		super(user);
		this.t=t;
	}

	public void  doIt  () {
		 System.out.println(t.getClass().getCanonicalName()+" planing time to start  " +t.doIt());
	 }

	public static void main(String[] args) {
		
		 Service backGroundServer= new BackgroundService();
		 Service onlineService = new OnlineService(2 * 1000);
		 LocalService<Service> backGroundEntry= new LocalService<Service>(backGroundServer,"anyUser");
		 LocalService<Service> onlineEntry= new LocalService<Service>(onlineService,"anyUser");
		 backGroundEntry.doIt();
		 onlineEntry.doIt();
	}
}
