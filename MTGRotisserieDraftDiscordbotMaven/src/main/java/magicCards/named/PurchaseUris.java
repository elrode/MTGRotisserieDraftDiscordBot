
package magicCards.named;

import java.util.HashMap;
import java.util.Map;

public class PurchaseUris {

    private String tcgplayer;
    private String cardmarket;
    private String cardhoarder;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getTcgplayer() {
        return tcgplayer;
    }

    public void setTcgplayer(String tcgplayer) {
        this.tcgplayer = tcgplayer;
    }

    public String getCardmarket() {
        return cardmarket;
    }

    public void setCardmarket(String cardmarket) {
        this.cardmarket = cardmarket;
    }

    public String getCardhoarder() {
        return cardhoarder;
    }

    public void setCardhoarder(String cardhoarder) {
        this.cardhoarder = cardhoarder;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
