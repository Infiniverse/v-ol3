package org.vaadin.addon.vol3.client.source;

import com.vaadin.shared.ui.Connect;
import org.vaadin.addon.vol3.source.OLHereMapsSource;
import org.vaadin.gwtol3.client.source.Source;
import org.vaadin.gwtol3.client.source.XYZTileSource;
import org.vaadin.gwtol3.client.source.XYZTileSourceOptions;

@Connect(OLHereMapsSource.class)
public class OLHereMapsSourceConnector extends OLXYZSourceConnector{
    @Override
    protected Source createSource() {
        XYZTileSourceOptions options = XYZTileSourceOptions.create();

        if (getState().urlTemplate != null) {
            options.setUrl(getState().urlTemplate);
        }

        return XYZTileSource.create(options);
    }

    @Override
    public XYZTileSource getSource() {
        return (XYZTileSource) super.getSource();
    }

    @Override
    public OLHereMapsSourceState getState() {
        return (OLHereMapsSourceState) super.getState();
    }
}