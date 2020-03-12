package org.vaadin.addon.vol3.source;

/**
 * Options provided to the Here maps source on creation
 */
public class OLHereMapsSourceOptions {
    private String apiKey;
    private String base;
    private String type;
    private String scheme;

    public void setApiKey(String apiKey){
        this.apiKey = apiKey;
    }

    public String getApiKey(){
        return this.apiKey;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getBase() {
        return this.base;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public String getScheme() {
        return this.scheme;
    }
}