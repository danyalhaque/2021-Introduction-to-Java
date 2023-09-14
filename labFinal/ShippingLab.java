package labFinal;

public class ShippingLab {
	private String referenceNumber;
	private String streetNumber;
	private String streetName;
	private String streetType;
	private int weight;
	private int size;
	private int zone;
	private double cost;

	public ShippingLab() {
		
	}
	
	public ShippingLab(String referenceNumber, String streetNumber, String streetName, String streetType, int weight,
			int size, int zone) {
		this.referenceNumber = referenceNumber;
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.streetType = streetType;
		this.weight = weight;
		this.size = size;
		this.zone = zone;
		calculateWeightClass(weight);
		calculateSizeClass(size);
		calculateZone(zone);

	}

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
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

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getZone() {
		return zone;
	}

	public void setZone(int zone) {
		this.zone = zone;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String calculateWeightClass(int weight) {

		if (weight <= 50) {

			return "Light";
		} else if (weight > 50 && weight < 150) {
			this.cost += 10;
			return "Middle";

		} else if (weight > 150 && weight < 350) {
			this.cost += 20;
			return "Heavy";
		} else if (weight > 350) {
			this.cost += 35;
			return "Over Weight";
		}

		return "null";

	}

	public String calculateSizeClass(int size) {

		if (size <= 36) {

			return "Small";
		} else if (size > 36 && size < 72) {
			this.cost += 5;
			return "Medium";

		} else if (size > 72 && size < 108) {
			this.cost += 10;
			return "Large";
		} else if (size > 108) {
			this.cost += 20;
			return "Extra Large";
		}

		return "null";

	}

	public String calculateZone(int zone) {

		if (zone == 1) {

			this.cost += 25;
			return "Zone NE";
			
		} else if (zone == 2) {
			this.cost += 30;
			return "Zone SE";

		} else if (zone == 3) {
	
			this.cost += 40;
			return "Zone M";
		} else if (zone == 4) {
			this.cost += 50;
			return "Zone W";
		}

		return "null";

	}
}
