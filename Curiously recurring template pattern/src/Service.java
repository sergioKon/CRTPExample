import java.text.SimpleDateFormat;
import java.util.Date;

public interface Service {
   public long getStartTime();  	
	default String doIt() {
		 Date date=new Date(getStartTime());
	     SimpleDateFormat df2 = new SimpleDateFormat("dd/MM/yy hh:mm:ss:SSS");
	     String dateText = df2.format(date);
	     return dateText;
	}
}
