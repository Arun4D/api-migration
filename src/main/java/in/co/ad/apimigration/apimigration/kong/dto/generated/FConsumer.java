
package in.co.ad.apimigration.apimigration.kong.dto.generated;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "acls",
    "basicauth_credentials",
    "created_at",
    "custom_id",
    "groups",
    "hmacauth_credentials",
    "id",
    "jwt_secrets",
    "keyauth_credentials",
    "mtls_auth_credentials",
    "oauth2_credentials",
    "plugins",
    "tags",
    "username"
})
@Generated("jsonschema2pojo")
public class FConsumer {

    @JsonProperty("acls")
    private List<ACLGroup> acls = new ArrayList<ACLGroup>();
    @JsonProperty("basicauth_credentials")
    private List<BasicAuth> basicauthCredentials = new ArrayList<BasicAuth>();
    @JsonProperty("created_at")
    private Integer createdAt;
    @JsonProperty("custom_id")
    private String customId;
    @JsonProperty("groups")
    private List<ConsumerGroup> groups = new ArrayList<ConsumerGroup>();
    @JsonProperty("hmacauth_credentials")
    private List<HMACAuth> hmacauthCredentials = new ArrayList<HMACAuth>();
    @JsonProperty("id")
    private String id;
    @JsonProperty("jwt_secrets")
    private List<JWTAuth> jwtSecrets = new ArrayList<JWTAuth>();
    @JsonProperty("keyauth_credentials")
    private List<KeyAuth> keyauthCredentials = new ArrayList<KeyAuth>();
    @JsonProperty("mtls_auth_credentials")
    private List<MTLSAuth> mtlsAuthCredentials = new ArrayList<MTLSAuth>();
    @JsonProperty("oauth2_credentials")
    private List<Oauth2Credential> oauth2Credentials = new ArrayList<Oauth2Credential>();
    @JsonProperty("plugins")
    private List<FPlugin> plugins = new ArrayList<FPlugin>();
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();
    @JsonProperty("username")
    private String username;

    @JsonProperty("acls")
    public List<ACLGroup> getAcls() {
        return acls;
    }

    @JsonProperty("acls")
    public void setAcls(List<ACLGroup> acls) {
        this.acls = acls;
    }

    @JsonProperty("basicauth_credentials")
    public List<BasicAuth> getBasicauthCredentials() {
        return basicauthCredentials;
    }

    @JsonProperty("basicauth_credentials")
    public void setBasicauthCredentials(List<BasicAuth> basicauthCredentials) {
        this.basicauthCredentials = basicauthCredentials;
    }

    @JsonProperty("created_at")
    public Integer getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("custom_id")
    public String getCustomId() {
        return customId;
    }

    @JsonProperty("custom_id")
    public void setCustomId(String customId) {
        this.customId = customId;
    }

    @JsonProperty("groups")
    public List<ConsumerGroup> getGroups() {
        return groups;
    }

    @JsonProperty("groups")
    public void setGroups(List<ConsumerGroup> groups) {
        this.groups = groups;
    }

    @JsonProperty("hmacauth_credentials")
    public List<HMACAuth> getHmacauthCredentials() {
        return hmacauthCredentials;
    }

    @JsonProperty("hmacauth_credentials")
    public void setHmacauthCredentials(List<HMACAuth> hmacauthCredentials) {
        this.hmacauthCredentials = hmacauthCredentials;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("jwt_secrets")
    public List<JWTAuth> getJwtSecrets() {
        return jwtSecrets;
    }

    @JsonProperty("jwt_secrets")
    public void setJwtSecrets(List<JWTAuth> jwtSecrets) {
        this.jwtSecrets = jwtSecrets;
    }

    @JsonProperty("keyauth_credentials")
    public List<KeyAuth> getKeyauthCredentials() {
        return keyauthCredentials;
    }

    @JsonProperty("keyauth_credentials")
    public void setKeyauthCredentials(List<KeyAuth> keyauthCredentials) {
        this.keyauthCredentials = keyauthCredentials;
    }

    @JsonProperty("mtls_auth_credentials")
    public List<MTLSAuth> getMtlsAuthCredentials() {
        return mtlsAuthCredentials;
    }

    @JsonProperty("mtls_auth_credentials")
    public void setMtlsAuthCredentials(List<MTLSAuth> mtlsAuthCredentials) {
        this.mtlsAuthCredentials = mtlsAuthCredentials;
    }

    @JsonProperty("oauth2_credentials")
    public List<Oauth2Credential> getOauth2Credentials() {
        return oauth2Credentials;
    }

    @JsonProperty("oauth2_credentials")
    public void setOauth2Credentials(List<Oauth2Credential> oauth2Credentials) {
        this.oauth2Credentials = oauth2Credentials;
    }

    @JsonProperty("plugins")
    public List<FPlugin> getPlugins() {
        return plugins;
    }

    @JsonProperty("plugins")
    public void setPlugins(List<FPlugin> plugins) {
        this.plugins = plugins;
    }

    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FConsumer.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("acls");
        sb.append('=');
        sb.append(((this.acls == null)?"<null>":this.acls));
        sb.append(',');
        sb.append("basicauthCredentials");
        sb.append('=');
        sb.append(((this.basicauthCredentials == null)?"<null>":this.basicauthCredentials));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("customId");
        sb.append('=');
        sb.append(((this.customId == null)?"<null>":this.customId));
        sb.append(',');
        sb.append("groups");
        sb.append('=');
        sb.append(((this.groups == null)?"<null>":this.groups));
        sb.append(',');
        sb.append("hmacauthCredentials");
        sb.append('=');
        sb.append(((this.hmacauthCredentials == null)?"<null>":this.hmacauthCredentials));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("jwtSecrets");
        sb.append('=');
        sb.append(((this.jwtSecrets == null)?"<null>":this.jwtSecrets));
        sb.append(',');
        sb.append("keyauthCredentials");
        sb.append('=');
        sb.append(((this.keyauthCredentials == null)?"<null>":this.keyauthCredentials));
        sb.append(',');
        sb.append("mtlsAuthCredentials");
        sb.append('=');
        sb.append(((this.mtlsAuthCredentials == null)?"<null>":this.mtlsAuthCredentials));
        sb.append(',');
        sb.append("oauth2Credentials");
        sb.append('=');
        sb.append(((this.oauth2Credentials == null)?"<null>":this.oauth2Credentials));
        sb.append(',');
        sb.append("plugins");
        sb.append('=');
        sb.append(((this.plugins == null)?"<null>":this.plugins));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null)?"<null>":this.username));
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
        result = ((result* 31)+((this.oauth2Credentials == null)? 0 :this.oauth2Credentials.hashCode()));
        result = ((result* 31)+((this.acls == null)? 0 :this.acls.hashCode()));
        result = ((result* 31)+((this.hmacauthCredentials == null)? 0 :this.hmacauthCredentials.hashCode()));
        result = ((result* 31)+((this.plugins == null)? 0 :this.plugins.hashCode()));
        result = ((result* 31)+((this.keyauthCredentials == null)? 0 :this.keyauthCredentials.hashCode()));
        result = ((result* 31)+((this.groups == null)? 0 :this.groups.hashCode()));
        result = ((result* 31)+((this.basicauthCredentials == null)? 0 :this.basicauthCredentials.hashCode()));
        result = ((result* 31)+((this.customId == null)? 0 :this.customId.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        result = ((result* 31)+((this.mtlsAuthCredentials == null)? 0 :this.mtlsAuthCredentials.hashCode()));
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.jwtSecrets == null)? 0 :this.jwtSecrets.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FConsumer) == false) {
            return false;
        }
        FConsumer rhs = ((FConsumer) other);
        return (((((((((((((((this.oauth2Credentials == rhs.oauth2Credentials)||((this.oauth2Credentials!= null)&&this.oauth2Credentials.equals(rhs.oauth2Credentials)))&&((this.acls == rhs.acls)||((this.acls!= null)&&this.acls.equals(rhs.acls))))&&((this.hmacauthCredentials == rhs.hmacauthCredentials)||((this.hmacauthCredentials!= null)&&this.hmacauthCredentials.equals(rhs.hmacauthCredentials))))&&((this.plugins == rhs.plugins)||((this.plugins!= null)&&this.plugins.equals(rhs.plugins))))&&((this.keyauthCredentials == rhs.keyauthCredentials)||((this.keyauthCredentials!= null)&&this.keyauthCredentials.equals(rhs.keyauthCredentials))))&&((this.groups == rhs.groups)||((this.groups!= null)&&this.groups.equals(rhs.groups))))&&((this.basicauthCredentials == rhs.basicauthCredentials)||((this.basicauthCredentials!= null)&&this.basicauthCredentials.equals(rhs.basicauthCredentials))))&&((this.customId == rhs.customId)||((this.customId!= null)&&this.customId.equals(rhs.customId))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.mtlsAuthCredentials == rhs.mtlsAuthCredentials)||((this.mtlsAuthCredentials!= null)&&this.mtlsAuthCredentials.equals(rhs.mtlsAuthCredentials))))&&((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.jwtSecrets == rhs.jwtSecrets)||((this.jwtSecrets!= null)&&this.jwtSecrets.equals(rhs.jwtSecrets))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))));
    }

}
