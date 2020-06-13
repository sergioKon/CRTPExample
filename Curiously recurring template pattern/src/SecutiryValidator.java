

public class SecutiryValidator {
  public SecutiryValidator(String user) {
	  if(!Permit(user)) {
		  new RuntimeException(" user is not authorise ");
	  }
  }

protected  boolean Permit(String user) {
	  return true;
 }
}  
