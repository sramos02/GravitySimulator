package simulator.model;

import simulator.misc.Vector;

public class Body {
	private String id;
	protected Vector v;
	protected Vector a;
	protected Vector p;
	protected double m;
	
	
	//CONSTRUCTOR 1
	public Body(String id, Vector v, Vector a, Vector p, double m) {
		this.id = id;
		this.v = v;
		this.a = a;
		this.p = p;
		this.m = m;
	}
	
<<<<<<< HEAD
	//CONSTRUCTOR 2
	public Body() {}
	
	//FUNCIONES DE LA CLASE
=======
	
	//FUNCIONES DEL PROGRAMA
>>>>>>> 197d6b552d7a550235c92f611b3fe400d5943ffd
	public String getId() {
		return this.id;
	}
	
	public Vector getVelocity() {
		return this.v;
	}
	
	public Vector getPosition() {
		return this.p;
	}
	
	double getMass() {
		return this.m;
	}
	
	void setVelocity(Vector v) {
		this.v = v;
	}
	
	void setAceleration(Vector a) {
		this.a = a;
	}
	
	void setPosition(Vector p) {
		this.p = p;
	}
	
	void move(double t) {
		//p += vt + 0.5at²
		double aux = t*t;
		Vector u = (v.scale(t));
		Vector v = (a.scale(aux));
		this.p = (this.p).plus(u).plus(v.scale(0.5));		//SUJETO A CAMBIOS  
		
		//v += at
		this.v = (this.v).plus(a.scale(t));
	}
	
	public String toString() {
		return "id: " + this.id + ",mass: " + this.m + ",pos: " + this.p + ",vel: " + this.v + ",acc: " + this.a;
	}
}
