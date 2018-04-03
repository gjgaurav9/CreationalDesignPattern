package factorymethodpattern.improved;

public class CarFactory extends TransportFactory {

	@Override
	Transport create() {
		// TODO Auto-generated method stub
		return new Car();
	}

}
