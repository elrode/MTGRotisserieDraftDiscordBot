
package magicCards.named;

import java.util.HashMap;
import java.util.Map;

public class Prices {

    private String usd;
    private String usdFoil;
    private String eur;
    private String tix;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getUsd() {
        return usd;
    }

    public void setUsd(String usd) {
        this.usd = usd;
    }

    public String getUsdFoil() {
        return usdFoil;
    }

    public void setUsdFoil(String usdFoil) {
        this.usdFoil = usdFoil;
    }

    public String getEur() {
        return eur;
    }

    public void setEur(String eur) {
        this.eur = eur;
    }

    public String getTix() {
        return tix;
    }

    public void setTix(String tix) {
        this.tix = tix;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
