import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Map;

import org.junit.jupiter.api.Test;
/**
 * Testklasse für den Algorithmus von Dijkstra
 * 
 * @author	Paulina Pansow
 * 			Thu Thao Tran
 * @version Dezember 2018
 */
public class DijkstraTest
{
	private Graphen _graph;
	private int _graphGroesse;
	private int _dijkstraStart;
	public DijkstraTest() {
		_graphGroesse = 7;//(int) Math.pow(10, 1);
		_dijkstraStart = 0;
		_graph = new Adjazenzliste(_graphGroesse);
	}
	@Test
	public void testeDijkstra() {
		generiereGraph();
		_graph.debugAusgabe();
		assertEquals(_graph.getGroesse(),_graphGroesse);
		DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(_graph);
		Map<Integer, Integer> kurzeWege = dijkstra.ermittleKuerzestenWege(_dijkstraStart);
		System.out.println();
		System.out.println("Dikjstras kürzeste Wege:");
		Integer vorgaenger = _dijkstraStart;
	    for(Integer i : kurzeWege.keySet()) {
//	    	if(i==_dijkstraStart) {
//	    		vorgaenger = i;
//	    	}
	    	System.out.println();
	    	System.out.println("von "+ vorgaenger +" nach " + i + " braucht es: " + kurzeWege.get(i));
	    	//vorgaenger = i;
	    }
	    Map<Integer, Integer> data = dijkstra.getData();
	    System.out.println("Data:");
	    for(Integer i: data.keySet()) {
	    	System.out.println("key: " + i + " value: " + data.get(i));
	    }
	    System.out.println();
	    System.out.println("Bisherige Distanz:");
	    for(Integer i: dijkstra.getBisherigeistanz()) {
	    	System.out.print(i + " ");
	    }
	    System.out.println("end");
	}
	private void generiereGraph() {
		_graph.setKante(0, 1, 4);
		_graph.setKante(1, 0, 4);
		_graph.setKante(0, 5, 10);
		_graph.setKante(5, 0, 10);
		_graph.setKante(0, 6, 5);
		_graph.setKante(6, 0, 5);
		_graph.setKante(1, 2, 7);
		_graph.setKante(2, 1, 7);
		_graph.setKante(1, 6, 2);
		_graph.setKante(6, 1, 2);//
		_graph.setKante(2, 3, 12);
		_graph.setKante(3, 2, 12);
		_graph.setKante(2, 6, 1);
		_graph.setKante(6, 2, 1);//
		_graph.setKante(3, 4, 4);
		_graph.setKante(4, 3, 4);//
		_graph.setKante(4, 5, 3);
		_graph.setKante(5, 4, 3);
		_graph.setKante(4, 6, 8);
		_graph.setKante(6, 4, 8);
		_graph.setKante(5, 6, 4);//
		_graph.setKante(6, 5, 4);//
	}

}
