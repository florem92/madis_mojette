
public class Fraction implements Comparable {
public int numerateur;
public int denominateur;
public Fraction(int numerateur,int denominateur){
	this.numerateur=numerateur;
	this.denominateur=denominateur;
}

public double calculAngle(){
	double angle=Math.atan((double)denominateur/(double) numerateur);
	if(angle<0) angle+=Math.PI;
	return angle;
	
}

public boolean estValable(int ordre){
	return numerateur <=ordre && denominateur <=ordre;
}
public void print(){
	System.out.println(numerateur+"/"+denominateur);
}

@Override
public int compareTo(Object arg0) {
	double thisAngle=this.calculAngle();
	double objectAngle=(double)((Fraction)arg0).calculAngle();
	if(thisAngle>objectAngle) return 1;
	if(thisAngle<objectAngle) return -1;
	return 0;
}
}
