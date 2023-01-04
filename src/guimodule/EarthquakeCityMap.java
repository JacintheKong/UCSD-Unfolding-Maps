package guimodule;

import de.fhpotsdam.unfolding.UnfoldingMap;
import processing.core.PApplet;

public class EarthquakeCityMap extends PApplet {
	private UnfoldingMap map;
	public void setup() {
		List<PointFeature> bigEqs = new ArrayList<PointFeature>();
		List<Marker> markers = new ArrayList<Marker>();
		for (PointFeature eq: bigEarthquakes) {
			markers.add(new SimplePointMarker(eq.getLocation(),
					                          eq.getProperties()));
		}
		map.addMarkers(markers);
	}

}
