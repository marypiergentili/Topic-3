package topic3.Service;

public class UserServiceFactory {
	
	private UserServiceFactory(){
	}
	
	public UserService getLocalUserService(int id, String name, String email){
		return new UserServiceImplementation(id, name, email);
	}
	
	public static UserService getRemoteUserServiceUsingProxy(int id, String name, String email){
		return new UserServiceProxy(new UserServiceImplementation(id, name, email));
	}

}
