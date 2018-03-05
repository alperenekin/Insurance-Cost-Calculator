package development;


public class Company {

	double weightX,weightY,weightZ;
	
	public Company(double weightX,double weightY,double weightZ) {
		if(weightX<=0) {
			weightX=1;
		}
		this.weightX=weightX;
		if(weightY<=0) {
			weightY=1;
		}
		this.weightY=weightY;
		if(weightZ<=0) {
			weightZ=1;
		}
		this.weightZ=weightZ;
	}
	public double getWeightX() {
		return weightX;
	}
	public double getWeightY() {
		return weightY;
	}
	public double getWeightZ() {
		return weightZ;
	}
	@Override
	public String toString() {
		return "Company [weightX=" + weightX + ", weightY=" + weightY + ", weightZ=" + weightZ + "]";
	}
}