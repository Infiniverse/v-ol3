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
        getState().urlTemplate =
                String.format(
                        "https://{1-4}.%s.maps.ls.hereapi.com/maptile/2.1/%s/newest/%s/{z}/{x}/{y}/256/png?apiKey=%s",
                        options.getBase(),
                        options.getType(),
                        options.getScheme(),
                        options.getApiKey());
    }

    @Override
    public OLHereMapsSourceState getState() {
        return (OLHereMapsSourceState)super.getState();
    }
}