package exam;
public class Package {
			String packageId;
			String sourcePlace;
			String destinationPlace;
			double basicFare ;
			int noOfDays ;
			double packageCost;
			public String getPackageId() {
							return packageId;
			}
			public void setPackageId(String packageId) {
						this.packageId = packageId;
			}
			public String getSourcePlace() {
						return sourcePlace;
			}
			public void setSourcePlace(String sourcePlace) {
					this.sourcePlace = sourcePlace;
			}
			public String getDestinationPlace() {
					return destinationPlace;
			}
			public void setDestinationPlace(String destinationPlace) {
						this.destinationPlace = destinationPlace;
			}
			public double getBasicFare() {
					return basicFare;
			}
			public void setBasicFare(double basicFare) {
					this.basicFare = basicFare;
			}
			public int getNoOfDays() {
					return noOfDays;
			}
			@Override
			public String toString() {
				return "Package [packageId=" + packageId + ", sourcePlace=" + sourcePlace + ", destinationPlace="
						+ destinationPlace + ", basicFare=" + basicFare + ", noOfDays=" + noOfDays + ", packageCost="
						+ packageCost + "]";
			}
			public void setNoOfDays(int noOfDays) {
					this.noOfDays = noOfDays;
			}
			public double getPackageCost() {
					return packageCost;
			}
			public void setPackageCost(double packageCost) {
				
						this.packageCost = packageCost;
			}
	
			void calculatePackageCost() {
		
			}
}