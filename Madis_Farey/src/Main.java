import java.util.ArrayList;
import java.util.Collections;


public class Main {
public static void main(String[] args){
	AlgoFarey algoFarey = new AlgoFarey();
	ArrayList<Fraction> suiteFarey=algoFarey.calculSuite(1);
	suiteFarey=algoFarey.calculPoints(suiteFarey);
	Collections.sort(suiteFarey);
	for(int i=0;i <suiteFarey.size();i++){
		System.out.println(suiteFarey.get(i).numerateur+"/"+suiteFarey.get(i).denominateur+" "+
				suiteFarey.get(i).calculAngle()*360/(2*Math.PI));
	}
}

}
