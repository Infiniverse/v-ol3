package org.vaadin.addon.vol3.feature;

/**
 * Created by mjhosio on 27/08/14.
 */
public class OLMultiPolygon extends OLGeometry<OLPolygon> {

    public OLMultiPolygon(OLPolygon ... polygons) {
        super(polygons);
    }
}
