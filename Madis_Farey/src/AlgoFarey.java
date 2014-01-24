import java.util.ArrayList;


public class AlgoFarey {


	public ArrayList<Fraction> calculSuite(int ordre){
		ArrayList<Fraction> suiteFaray=new ArrayList<Fraction>();
		suiteFaray.add(new Fraction(0,1));
		suiteFaray.add(new Fraction(1,1));
		if(ordre>1){
			for(int i=1;i<ordre;i++)
				for(int j=0;j<suiteFaray.size()-1;j++){
					Fraction fraction=new Fraction(suiteFaray.get(j).numerateur+suiteFaray.get(j+1).numerateur,
							suiteFaray.get(j).denominateur+suiteFaray.get(j+1).denominateur);
					if(fraction.estValable(ordre)){
						suiteFaray.add(j+1,fraction);
						j++;
					}
				}
		}
		return suiteFaray;
	}
	
	public ArrayList<Fraction> calculPoints(ArrayList<Fraction> suiteFarey){
		ArrayList<Fraction> temp=new ArrayList<Fraction>();
		for(int i=0;i<suiteFarey.size();i++){
			temp.add(new Fraction(suiteFarey.get(i).numerateur*-1,suiteFarey.get(i).denominateur));
			temp.add(new Fraction(suiteFarey.get(i).denominateur,suiteFarey.get(i).numerateur));
		}
		suiteFarey.addAll(temp);
		return suiteFarey;
		
		
	}
}
