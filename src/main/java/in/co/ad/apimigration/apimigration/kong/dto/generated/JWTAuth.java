
package in.co.ad.apimigration.apimigration.kong.dto.generated;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "algorithm",
    "consumer",
    "created_at",
    "id",
    "key",
    "rsa_public_key",
    "secret",
    "tags"
})
@Generated("jsonschema2pojo")
public class JWTAuth {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("algorithm")
    private String algorithm;
    @JsonProperty("consumer")
    private Consumer consumer;
    @JsonProperty("created_at")
    private Integer createdAt;
    @JsonProperty("id")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("key")
    private String key;
    @JsonProperty("rsa_public_key")
    private String rsaPublicKey;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("secret")
    private String secret;
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("algorithm")
    public String getAlgorithm() {
        return algorithm;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("algorithm")
    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
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

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    @JsonProperty("rsa_public_key")
    public String getRsaPublicKey() {
        return rsaPublicKey;
    }

    @JsonProperty("rsa_public_key")
    public void setRsaPublicKey(String rsaPublicKey) {
        this.rsaPublicKey = rsaPublicKey;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("secret")
    public String getSecret() {
        return secret;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("secret")
    public void setSecret(String secret) {
        this.secret = secret;
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
        sb.append(JWTAuth.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("algorithm");
        sb.append('=');
        sb.append(((this.algorithm == null)?"<null>":this.algorithm));
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
        sb.append("key");
        sb.append('=');
        sb.append(((this.key == null)?"<null>":this.key));
        sb.append(',');
        sb.append("rsaPublicKey");
        sb.append('=');
        sb.append(((this.rsaPublicKey == null)?"<null>":this.rsaPublicKey));
        sb.append(',');
        sb.append("secret");
        sb.append('=');
        sb.append(((this.secret == null)?"<null>":this.secret));
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
        result = ((result* 31)+((this.secret == null)? 0 :this.secret.hashCode()));
        result = ((result* 31)+((this.rsaPublicKey == null)? 0 :this.rsaPublicKey.hashCode()));
        result = ((result* 31)+((this.consumer == null)? 0 :this.consumer.hashCode()));
        result = ((result* 31)+((this.key == null)? 0 :this.key.hashCode()));
        result = ((result* 31)+((this.algorithm == null)? 0 :this.algorithm.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JWTAuth) == false) {
            return false;
        }
        JWTAuth rhs = ((JWTAuth) other);
        return (((((((((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.secret == rhs.secret)||((this.secret!= null)&&this.secret.equals(rhs.secret))))&&((this.rsaPublicKey == rhs.rsaPublicKey)||((this.rsaPublicKey!= null)&&this.rsaPublicKey.equals(rhs.rsaPublicKey))))&&((this.consumer == rhs.consumer)||((this.consumer!= null)&&this.consumer.equals(rhs.consumer))))&&((this.key == rhs.key)||((this.key!= null)&&this.key.equals(rhs.key))))&&((this.algorithm == rhs.algorithm)||((this.algorithm!= null)&&this.algorithm.equals(rhs.algorithm))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))));
    }

}
