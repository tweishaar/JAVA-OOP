package praxis.test.hwr.berlin.de;

public abstract class Verkehrsmittel {
	protected int transportKapa;
	protected String name;
	
	public int getTransportKapa() {
		return transportKapa;
	}
	@Override
	public String toString(){
		return name;
	}
	
}


