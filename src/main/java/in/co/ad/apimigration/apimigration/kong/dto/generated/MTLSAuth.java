
package in.co.ad.apimigration.apimigration.kong.dto.generated;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ca_certificate",
    "consumer",
    "created_at",
    "id",
    "subject_name",
    "tags"
})
@Generated("jsonschema2pojo")
public class MTLSAuth {

    @JsonProperty("ca_certificate")
    private CACertificate caCertificate;
    @JsonProperty("consumer")
    private Consumer consumer;
    @JsonProperty("created_at")
    private Integer createdAt;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("subject_name")
    private String subjectName;
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();

    @JsonProperty("ca_certificate")
    public CACertificate getCaCertificate() {
        return caCertificate;
    }

    @JsonProperty("ca_certificate")
    public void setCaCertificate(CACertificate caCertificate) {
        this.caCertificate = caCertificate;
    }

    @JsonProperty("consumer")
    public Consumer getConsumer() {
        return consumer;
    }

    @JsonProperty("consumer")
    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    @JsonProperty("created_at")
    public Integer getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("subject_name")
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("subject_name")
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
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
        sb.append(MTLSAuth.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("caCertificate");
        sb.append('=');
        sb.append(((this.caCertificate == null)?"<null>":this.caCertificate));
        sb.append(',');
        sb.append("consumer");
        sb.append('=');
        sb.append(((this.consumer == null)?"<null>":this.consumer));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("subjectName");
        sb.append('=');
        sb.append(((this.subjectName == null)?"<null>":this.subjectName));
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
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.caCertificate == null)? 0 :this.caCertificate.hashCode()));
        result = ((result* 31)+((this.consumer == null)? 0 :this.consumer.hashCode()));
        result = ((result* 31)+((this.subjectName == null)? 0 :this.subjectName.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MTLSAuth) == false) {
            return false;
        }
        MTLSAuth rhs = ((MTLSAuth) other);
        return (((((((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.caCertificate == rhs.caCertificate)||((this.caCertificate!= null)&&this.caCertificate.equals(rhs.caCertificate))))&&((this.consumer == rhs.consumer)||((this.consumer!= null)&&this.consumer.equals(rhs.consumer))))&&((this.subjectName == rhs.subjectName)||((this.subjectName!= null)&&this.subjectName.equals(rhs.subjectName))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))));
    }

}
