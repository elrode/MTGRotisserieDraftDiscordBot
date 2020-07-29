
package magicCards.named;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "usd",
    "usd_foil",
    "eur",
    "tix"
})
public class Prices {

    @JsonProperty("usd")
    private String usd;
    @JsonProperty("usd_foil")
    private String usdFoil;
    @JsonProperty("eur")
    private String eur;
    @JsonProperty("tix")
    private String tix;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("usd")
    public String getUsd() {
        return usd;
    }

    @JsonProperty("usd")
    public void setUsd(String usd) {
        this.usd = usd;
    }

    @JsonProperty("usd_foil")
    public String getUsdFoil() {
        return usdFoil;
    }

    @JsonProperty("usd_foil")
    public void setUsdFoil(String usdFoil) {
        this.usdFoil = usdFoil;
    }

    @JsonProperty("eur")
    public String getEur() {
        return eur;
    }

    @JsonProperty("eur")
    public void setEur(String eur) {
        this.eur = eur;
    }

    @JsonProperty("tix")
    public String getTix() {
        return tix;
    }

    @JsonProperty("tix")
    public void setTix(String tix) {
        this.tix = tix;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
