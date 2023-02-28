
package in.co.ad.apimigration.apimigration.kong.dto.generated;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "client_id",
    "client_secret",
    "client_type",
    "consumer",
    "created_at",
    "hash_secret",
    "id",
    "name",
    "redirect_uris",
    "tags"
})
@Generated("jsonschema2pojo")
public class Oauth2Credential {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("client_id")
    private String clientId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("client_secret")
    private String clientSecret;
    @JsonProperty("client_type")
    private String clientType;
    @JsonProperty("consumer")
    private Consumer consumer;
    @JsonProperty("created_at")
    private Integer createdAt;
    @JsonProperty("hash_secret")
    private Boolean hashSecret;
    @JsonProperty("id")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;
    @JsonProperty("redirect_uris")
    private List<String> redirectUris = new ArrayList<String>();
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("client_id")
    public String getClientId() {
        return clientId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("client_id")
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("client_secret")
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("client_secret")
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    @JsonProperty("client_type")
    public String getClientType() {
        return clientType;
    }

    @JsonProperty("client_type")
    public void setClientType(String clientType) {
        this.clientType = clientType;
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

    @JsonProperty("hash_secret")
    public Boolean getHashSecret() {
        return hashSecret;
    }

    @JsonProperty("hash_secret")
    public void setHashSecret(Boolean hashSecret) {
        this.hashSecret = hashSecret;
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
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("redirect_uris")
    public List<String> getRedirectUris() {
        return redirectUris;
    }

    @JsonProperty("redirect_uris")
    public void setRedirectUris(List<String> redirectUris) {
        this.redirectUris = redirectUris;
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
        sb.append(Oauth2Credential.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("clientId");
        sb.append('=');
        sb.append(((this.clientId == null)?"<null>":this.clientId));
        sb.append(',');
        sb.append("clientSecret");
        sb.append('=');
        sb.append(((this.clientSecret == null)?"<null>":this.clientSecret));
        sb.append(',');
        sb.append("clientType");
        sb.append('=');
        sb.append(((this.clientType == null)?"<null>":this.clientType));
        sb.append(',');
        sb.append("consumer");
        sb.append('=');
        sb.append(((this.consumer == null)?"<null>":this.consumer));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("hashSecret");
        sb.append('=');
        sb.append(((this.hashSecret == null)?"<null>":this.hashSecret));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("redirectUris");
        sb.append('=');
        sb.append(((this.redirectUris == null)?"<null>":this.redirectUris));
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
        result = ((result* 31)+((this.clientId == null)? 0 :this.clientId.hashCode()));
        result = ((result* 31)+((this.clientType == null)? 0 :this.clientType.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.clientSecret == null)? 0 :this.clientSecret.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.hashSecret == null)? 0 :this.hashSecret.hashCode()));
        result = ((result* 31)+((this.redirectUris == null)? 0 :this.redirectUris.hashCode()));
        result = ((result* 31)+((this.consumer == null)? 0 :this.consumer.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Oauth2Credential) == false) {
            return false;
        }
        Oauth2Credential rhs = ((Oauth2Credential) other);
        return (((((((((((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt)))&&((this.clientId == rhs.clientId)||((this.clientId!= null)&&this.clientId.equals(rhs.clientId))))&&((this.clientType == rhs.clientType)||((this.clientType!= null)&&this.clientType.equals(rhs.clientType))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.clientSecret == rhs.clientSecret)||((this.clientSecret!= null)&&this.clientSecret.equals(rhs.clientSecret))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.hashSecret == rhs.hashSecret)||((this.hashSecret!= null)&&this.hashSecret.equals(rhs.hashSecret))))&&((this.redirectUris == rhs.redirectUris)||((this.redirectUris!= null)&&this.redirectUris.equals(rhs.redirectUris))))&&((this.consumer == rhs.consumer)||((this.consumer!= null)&&this.consumer.equals(rhs.consumer))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))));
    }

}
