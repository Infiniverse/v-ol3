package org.vaadin.addon.vol3.demoandtestapp;

import org.vaadin.addon.vol3.source.OLHereMapsSource;
import org.vaadin.addon.vol3.source.OLHereMapsSourceOptions;
import org.vaadin.addon.vol3.source.OLSource;

public class HereMap extends BasicMap {
    protected OLSource createSource() {
        OLHereMapsSourceOptions options = new OLHereMapsSourceOptions();
        options.setApiKey("API-KEY-GOES-HERE");
        options.setBase("aerial");
        options.setType("maptile");
        options.setScheme("satellite.day");
        OLHereMapsSource source = new OLHereMapsSource(options);
        return source;
    }
}