//import processing.core.PApplet;
//import de.fhpotsdam.unfolding.UnfoldingMap;
//import de.fhpotsdam.unfolding.geo.Location;
//import de.fhpotsdam.unfolding.providers.Google;
//import de.fhpotsdam.unfolding.utils.MapUtils;
//
///**
// * Hello World!
// * 
// * This is the basic stub to start creating interactive maps.
// */
//public class HelloUCSDWorld extends PApplet {
//
//	UnfoldingMap map;
//
//	public void setup() {
//		size(800, 600, OPENGL);
//
//		map = new UnfoldingMap(this, new Google.GoogleTerrainProvider());
//		map.zoomAndPanTo(14, new Location(32.881, -117.238)); // UCSD
//
//		MapUtils.createDefaultEventDispatcher(this, map);
//	}
//
//	public void draw() {
//		background(0);
//		map.draw();
//	}
//
//}

//public class HelloUCSDWorld {
//	public static void main(String[] args) {
//		int var1 = 17;
//		int var2 = var1 + 1;
//		var1 = var2 + 1;
//		System.out.println("var1: " + var1 + " var2: " + var2);
//	}
//}

public class HelloUCSDWorld {
	private double coords[];
	public HelloUCSDWorld (double[] coords) {
		this.coords = coords;
	}
	public static void main (String[] args) {
		double coords[] = {5.0, 0.0};
		HelloUCSDWorld accra = new HelloUCSDWorld(coords);
		coords[0]=32.9;
		coords[1]=-117.2;
		System.out.println(accra.coords[0]);
	}
}