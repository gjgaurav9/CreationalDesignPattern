package factorymethodpattern.improved;

public class BikeFactory extends TransportFactory {

	@Override
	Transport create() {
		return new Bike();
	}

}
