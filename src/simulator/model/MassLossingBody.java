package simulator.model;

import simulator.misc.Vector;

public class MassLossingBody extends Body{
	
	private double lossFactor;
	private double lossFrequency;
	private double c;
	
	//CONSTRUCTOR 1
	public MassLossingBody(String id, Vector v, Vector a, Vector p, double m) {
		super(id, v, a, p, m);
	}
	
	//CONSTRUCTOR 2
	public MassLossingBody (double lossFac, double lossFre){
		super();
		this.c = 0.0;
		this.lossFactor = lossFac;
		this.lossFrequency = lossFre;
	}
	
	//FUNCIONES DE LA CLASE
	void move(double t) {
		super.move(t);
		c += t;
		
		if(c >= this.lossFrequency) {
			this.m = m * (1 - this.lossFactor);
			c = 0.0;
		}
	}

	
}
