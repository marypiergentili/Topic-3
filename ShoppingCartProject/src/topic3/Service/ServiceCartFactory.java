package topic3.Service;

public class ServiceCartFactory {
	
	private ServiceCartFactory(){		
	}
	
	public static ServiceCart getLocalCartService(){
		return new ServiceCartImplementation();
	}
	
	public static ServiceCart getRemoteServiceCartUsingProxy(){
		return new ServiceCartProxy(new ServiceCartImplementation());
	}

}
