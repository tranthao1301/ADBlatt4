import java.util.List;
import java.util.Set;

/**
 * Ein Interface für Graphen mit entsprechendenn zugriffsfunktionen
 * 
 * @author	Thu Thao Tran
 * 			Paulina Pansow
 * @version Dezember 2018
 */
public interface Graphen
{
	/** 
	 * fügt einen Knoten in den Graphen ein.
	 */
	public void setKnoten();

	/**
	 * fügt eine Kante in den Graphen ein
	 * @param start die Start position des Knoten von dem die Kante ausgeht
	 * @param ziel die Ziel position des Knoten auf den die Kante zeigt
	 * @param gewicht die Gewichtung der Kante
	 */
	public void setKante(int startKnoten, int zielKnoten, int gewicht);

	/**
	 * gibt den Nachbarknoten wieder 
	 */
	public Set<Integer> getNachbarknoten(int knotenIndex);
	
	/**
	 * gibt die Gewichtung des Graphen wieder
	 */
	public int getGewichtung(int knoten1, int knoten2);

	/**
	 * schreibt den Graphen auf die Konsole, zur debug Hilfe
	 */
	public void debugAusgabe();

	/**
	 * Gibt die Anzahl der Knoten des Graphen zurück
	 */
	public int getGroesse();
}