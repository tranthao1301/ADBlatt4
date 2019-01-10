import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class StartUp
{
	
	public static void main(String args[]) throws IOException
	{
		Adjazenzmatrix adjazenzmatrix;
		Adjazenzliste adjazenzliste;
		
	    adjazenzmatrix = new Adjazenzmatrix(5);
	    adjazenzliste = new Adjazenzliste(5);
	    
	    
		
		adjazenzliste.setKante(4, 1, 9);
		adjazenzliste.setKante(3, 4, 8);
		adjazenzliste.setKante(2, 3, 7);
		adjazenzliste.setKante(1, 2, 6);
		adjazenzliste.setKante(0, 1, 5);
		
		adjazenzmatrix.setKante(4, 1, 9);
		adjazenzmatrix.setKante(3, 4, 8);
		adjazenzmatrix.setKante(2, 3, 7);
		adjazenzmatrix.setKante(1, 2, 6);
		adjazenzmatrix.setKante(0, 1, 5);
		
		DijkstraAlgorithm also = new DijkstraAlgorithm(adjazenzliste);    
	    adjazenzmatrix.debugAusgabe();	
	    System.out.println();
	    adjazenzliste.debugAusgabe();
	    InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(isr);
	    System.out.print("Gib den Knoten für die kürzesten Wege ein: ");
	    int eingabe = Integer.parseInt(br.readLine());
	    Map<Integer, Integer> af = also.ermittleKuerzestenWege(eingabe);
	    Integer vorgaenger = eingabe;
	    for(Integer i : af.keySet()) {
	    	if(i==eingabe) {
	    		vorgaenger = i;
	    	}
	    	System.out.println("von "+ vorgaenger +" nach " + i + " braucht es: " + af.get(i));
	    	vorgaenger = i;
	    }
	}
	
}
