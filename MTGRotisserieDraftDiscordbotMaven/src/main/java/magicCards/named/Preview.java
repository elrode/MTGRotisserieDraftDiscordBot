
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
    "source",
    "source_uri",
    "previewed_at"
})
public class Preview {

    @JsonProperty("source")
    private String source;
    @JsonProperty("source_uri")
    private String sourceUri;
    @JsonProperty("previewed_at")
    private String previewedAt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("source_uri")
    public String getSourceUri() {
        return sourceUri;
    }

    @JsonProperty("source_uri")
    public void setSourceUri(String sourceUri) {
        this.sourceUri = sourceUri;
    }

    @JsonProperty("previewed_at")
    public String getPreviewedAt() {
        return previewedAt;
    }

    @JsonProperty("previewed_at")
    public void setPreviewedAt(String previewedAt) {
        this.previewedAt = previewedAt;
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
