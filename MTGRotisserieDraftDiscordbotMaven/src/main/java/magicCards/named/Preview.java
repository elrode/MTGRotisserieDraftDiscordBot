
package magicCards.named;

import java.util.HashMap;
import java.util.Map;

public class Preview {

    private String source;
    private String sourceUri;
    private String previewedAt;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSourceUri() {
        return sourceUri;
    }

    public void setSourceUri(String sourceUri) {
        this.sourceUri = sourceUri;
    }

    public String getPreviewedAt() {
        return previewedAt;
    }

    public void setPreviewedAt(String previewedAt) {
        this.previewedAt = previewedAt;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
