
package in.co.ad.apimigration.apimigration.kong.dto.generated;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "cert",
    "cert_alt",
    "created_at",
    "id",
    "key",
    "key_alt",
    "snis",
    "tags"
})
@Generated("jsonschema2pojo")
public class Certificate {

    @JsonProperty("cert")
    private String cert;
    @JsonProperty("cert_alt")
    private String certAlt;
    @JsonProperty("created_at")
    private Integer createdAt;
    @JsonProperty("id")
    private String id;
    @JsonProperty("key")
    private String key;
    @JsonProperty("key_alt")
    private String keyAlt;
    @JsonProperty("snis")
    private List<String> snis = new ArrayList<String>();
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();

    @JsonProperty("cert")
    public String getCert() {
        return cert;
    }

    @JsonProperty("cert")
    public void setCert(String cert) {
        this.cert = cert;
    }

    @JsonProperty("cert_alt")
    public String getCertAlt() {
        return certAlt;
    }

    @JsonProperty("cert_alt")
    public void setCertAlt(String certAlt) {
        this.certAlt = certAlt;
    }

    @JsonProperty("created_at")
    public Integer getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    @JsonProperty("key_alt")
    public String getKeyAlt() {
        return keyAlt;
    }

    @JsonProperty("key_alt")
    public void setKeyAlt(String keyAlt) {
        this.keyAlt = keyAlt;
    }

    @JsonProperty("snis")
    public List<String> getSnis() {
        return snis;
    }

    @JsonProperty("snis")
    public void setSnis(List<String> snis) {
        this.snis = snis;
    }

    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Certificate.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cert");
        sb.append('=');
        sb.append(((this.cert == null)?"<null>":this.cert));
        sb.append(',');
        sb.append("certAlt");
        sb.append('=');
        sb.append(((this.certAlt == null)?"<null>":this.certAlt));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("key");
        sb.append('=');
        sb.append(((this.key == null)?"<null>":this.key));
        sb.append(',');
        sb.append("keyAlt");
        sb.append('=');
        sb.append(((this.keyAlt == null)?"<null>":this.keyAlt));
        sb.append(',');
        sb.append("snis");
        sb.append('=');
        sb.append(((this.snis == null)?"<null>":this.snis));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.snis == null)? 0 :this.snis.hashCode()));
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.keyAlt == null)? 0 :this.keyAlt.hashCode()));
        result = ((result* 31)+((this.cert == null)? 0 :this.cert.hashCode()));
        result = ((result* 31)+((this.certAlt == null)? 0 :this.certAlt.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.key == null)? 0 :this.key.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Certificate) == false) {
            return false;
        }
        Certificate rhs = ((Certificate) other);
        return (((((((((this.snis == rhs.snis)||((this.snis!= null)&&this.snis.equals(rhs.snis)))&&((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt))))&&((this.keyAlt == rhs.keyAlt)||((this.keyAlt!= null)&&this.keyAlt.equals(rhs.keyAlt))))&&((this.cert == rhs.cert)||((this.cert!= null)&&this.cert.equals(rhs.cert))))&&((this.certAlt == rhs.certAlt)||((this.certAlt!= null)&&this.certAlt.equals(rhs.certAlt))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.key == rhs.key)||((this.key!= null)&&this.key.equals(rhs.key))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))));
    }

}
