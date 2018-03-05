package development;


/**
 * @author Alperen Ekin-Seymur Babaþlý,230201010-220201064
 *
 */
public class Calculation {
	double age,year_cost,hp_cost,ap_cost;
	double insurance_cost;
	public double calculate (Vehicle arac,Company company) {
		if (arac.getType()==VehicleType.CAR) {
			age=2017-arac.getProducedYear();
			year_cost=1000/Math.pow(2, age);
			hp_cost=arac.getHorsePower()*10;
			if (age<3) {
				ap_cost=arac.getAccidentpenalty()*200;
			}
			else{
				ap_cost=arac.getAccidentpenalty()*100;
			}
			insurance_cost=company.getWeightX()*year_cost+company.getWeightY()*hp_cost+company.getWeightZ()*ap_cost;
		}
		if (arac.getType()==VehicleType.BUS) {
			age=2017-arac.getProducedYear();
			year_cost=2000/Math.pow(2, age);
			hp_cost=arac.getHorsePower()*10;
			if (age<5) {
				ap_cost=arac.getAccidentpenalty()*400;
			}
			else{
				ap_cost=arac.getAccidentpenalty()*200;
			}
			insurance_cost=company.getWeightX()*year_cost+company.getWeightY()*hp_cost+company.getWeightZ()*ap_cost;
		}
		if (arac.getType()==VehicleType.MOTORCYCLE) {
			age=2017-arac.getProducedYear();
			year_cost=500/Math.pow(2, age);
			hp_cost=arac.getHorsePower()*3;
			if (age<1) {
				ap_cost=arac.getAccidentpenalty()*100;
			}
			else{
				ap_cost=arac.getAccidentpenalty()*50;
			}
			insurance_cost=company.getWeightX()*year_cost+company.getWeightY()*hp_cost+company.getWeightZ()*ap_cost;
		}
		return insurance_cost;
		
	}
	
}
