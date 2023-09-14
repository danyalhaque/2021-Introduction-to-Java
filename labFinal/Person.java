package labFinal;

public class Person {
	private String firstName;
	private String lastName;
	private String streetNumber;
	private String streetName;
	private String streetType;
	private String city;
	private String state;
	private String zipcode;
	private int heightFt;
	private int heightIn;
	private int weight;

	public Person() {
		
	}
	
	public Person(String firstName, String lastName, String streetNumber, String streetName, String streetType,
			String city, String state, String zipcode, int heightFt, int heightIn, int weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.streetType = streetType;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.heightFt = heightFt;
		this.heightIn = heightIn;
		this.weight = weight;
		calculateBMI();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getStreetType() {
		return streetType;
	}

	public void setStreetType(String streetType) {
		this.streetType = streetType;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public int getHeightFt() {
		return heightFt;
	}

	public void setHeightFt(int heightFt) {
		this.heightFt = heightFt;
	}

	public int getHeightIn() {
		return heightIn;
	}

	public void setHeightIn(int heightIn) {
		this.heightIn = heightIn;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public double calculateBMI() {
		double tmp = 0.0;
			
		double bmi = 0;
		if(bmi == 0.0) {
			bmi =(int) (((getWeight() / Math.pow((getHeightFt()+getHeightIn()), 2)) *703) *1000) / 1000.0 ;
		}
		return  bmi;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", streetNumber=" + streetNumber
				+ ", streetName=" + streetName + ", streetType=" + streetType + ", city=" + city + ", state=" + state
				+ ", zipcode=" + zipcode + ", heightFt=" + heightFt + ", heightIn=" + heightIn + ", weight=" + weight
				+ "]";
	}
	
	
}
