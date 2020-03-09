package org.vaadin.addon.vol3.source;

import org.vaadin.addon.vol3.client.source.OLHereMapsSourceState;

/**
 * Layer source for Here maps tile server
 */
public class OLHereMapsSource extends OLXYZSource {

    /**
     * Creates a new instance of the Here Maps source
     */
    public OLHereMapsSource() {
        super();
    }

    public OLHereMapsSource(OLHereMapsSourceOptions options) {
        this();
        setOptions(options);
    }

    private void setOptions(OLHereMapsSourceOptions options) {

        String host = "{1-4}." + options.getBase() + ".maps.ls.hereapi.com";
        String path = "/maptile/2.1/" + options.getType() + "/newest/" + options.getScheme() + "/{z}/{x}/{y}/256/png";
        String params = "?apiKey=" + options.getApiKey();

        getState().urlTemplate = "https://" + host + path + params;
    }

    @Override
    public OLHereMapsSourceState getState() {
        return (OLHereMapsSourceState)super.getState();
    }
}