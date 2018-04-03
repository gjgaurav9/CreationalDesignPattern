package factorymethodpattern.improved;

public class Client {

	public static void main(String[] args) {

		TransportFactory factory = new BikeFactory();
		Transport transport =factory.create();
		System.out.println(transport.drive());
		
		factory = new CarFactory();
		transport =factory.create();
		System.out.println(transport.drive());
	}

}
