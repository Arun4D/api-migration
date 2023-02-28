
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
    "cert_digest",
    "created_at",
    "id",
    "tags"
})
@Generated("jsonschema2pojo")
public class FCACertificate {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cert")
    private String cert;
    @JsonProperty("cert_digest")
    private String certDigest;
    @JsonProperty("created_at")
    private Integer createdAt;
    @JsonProperty("id")
    private String id;
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cert")
    public String getCert() {
        return cert;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cert")
    public void setCert(String cert) {
        this.cert = cert;
    }

    @JsonProperty("cert_digest")
    public String getCertDigest() {
        return certDigest;
    }

    @JsonProperty("cert_digest")
    public void setCertDigest(String certDigest) {
        this.certDigest = certDigest;
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
        sb.append(FCACertificate.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cert");
        sb.append('=');
        sb.append(((this.cert == null)?"<null>":this.cert));
        sb.append(',');
        sb.append("certDigest");
        sb.append('=');
        sb.append(((this.certDigest == null)?"<null>":this.certDigest));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
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
        result = ((result* 31)+((this.certDigest == null)? 0 :this.certDigest.hashCode()));
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.cert == null)? 0 :this.cert.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FCACertificate) == false) {
            return false;
        }
        FCACertificate rhs = ((FCACertificate) other);
        return ((((((this.certDigest == rhs.certDigest)||((this.certDigest!= null)&&this.certDigest.equals(rhs.certDigest)))&&((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt))))&&((this.cert == rhs.cert)||((this.cert!= null)&&this.cert.equals(rhs.cert))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))));
    }

}
