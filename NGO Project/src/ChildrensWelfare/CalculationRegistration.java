package ChildrensWelfare;

public class CalculationRegistration {

	private double discount = 10;
	private double donation = 200;
	
	public void setDiscount(double dis) {
		this.discount = dis;
	}
	
	public void setDonation(double d) {
		this.donation = d;
	}
	
	public double totalPrice(double fee, double donate) {
		if(donate <= donation) {
			double totalPrice = fee + donate;
			return totalPrice;
		}
		else {
			double totalPrice = (fee + donate) * (100- discount)/100;
			return totalPrice;
		}
	}
}
