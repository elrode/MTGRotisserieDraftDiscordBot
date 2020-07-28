
package magicCards.named;

import java.util.HashMap;
import java.util.Map;

public class RelatedUris {

    private String gatherer;
    private String tcgplayerDecks;
    private String edhrec;
    private String mtgtop8;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getGatherer() {
        return gatherer;
    }

    public void setGatherer(String gatherer) {
        this.gatherer = gatherer;
    }

    public String getTcgplayerDecks() {
        return tcgplayerDecks;
    }

    public void setTcgplayerDecks(String tcgplayerDecks) {
        this.tcgplayerDecks = tcgplayerDecks;
    }

    public String getEdhrec() {
        return edhrec;
    }

    public void setEdhrec(String edhrec) {
        this.edhrec = edhrec;
    }

    public String getMtgtop8() {
        return mtgtop8;
    }

    public void setMtgtop8(String mtgtop8) {
        this.mtgtop8 = mtgtop8;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
