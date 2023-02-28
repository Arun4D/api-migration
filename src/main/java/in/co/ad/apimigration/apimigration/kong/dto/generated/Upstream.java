
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
    "client_certificate",
    "created_at",
    "hash_fallback",
    "hash_fallback_header",
    "hash_fallback_query_arg",
    "hash_fallback_uri_capture",
    "hash_on",
    "hash_on_cookie",
    "hash_on_cookie_path",
    "hash_on_header",
    "hash_on_query_arg",
    "hash_on_uri_capture",
    "healthchecks",
    "host_header",
    "id",
    "name",
    "slots",
    "tags"
})
@Generated("jsonschema2pojo")
public class Upstream {

    @JsonProperty("algorithm")
    private String algorithm;
    @JsonProperty("client_certificate")
    private Certificate clientCertificate;
    @JsonProperty("created_at")
    private Integer createdAt;
    @JsonProperty("hash_fallback")
    private String hashFallback;
    @JsonProperty("hash_fallback_header")
    private String hashFallbackHeader;
    @JsonProperty("hash_fallback_query_arg")
    private String hashFallbackQueryArg;
    @JsonProperty("hash_fallback_uri_capture")
    private String hashFallbackUriCapture;
    @JsonProperty("hash_on")
    private String hashOn;
    @JsonProperty("hash_on_cookie")
    private String hashOnCookie;
    @JsonProperty("hash_on_cookie_path")
    private String hashOnCookiePath;
    @JsonProperty("hash_on_header")
    private String hashOnHeader;
    @JsonProperty("hash_on_query_arg")
    private String hashOnQueryArg;
    @JsonProperty("hash_on_uri_capture")
    private String hashOnUriCapture;
    @JsonProperty("healthchecks")
    private Healthcheck healthchecks;
    @JsonProperty("host_header")
    private String hostHeader;
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("slots")
    private Integer slots;
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();

    @JsonProperty("algorithm")
    public String getAlgorithm() {
        return algorithm;
    }

    @JsonProperty("algorithm")
    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    @JsonProperty("client_certificate")
    public Certificate getClientCertificate() {
        return clientCertificate;
    }

    @JsonProperty("client_certificate")
    public void setClientCertificate(Certificate clientCertificate) {
        this.clientCertificate = clientCertificate;
    }

    @JsonProperty("created_at")
    public Integer getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("hash_fallback")
    public String getHashFallback() {
        return hashFallback;
    }

    @JsonProperty("hash_fallback")
    public void setHashFallback(String hashFallback) {
        this.hashFallback = hashFallback;
    }

    @JsonProperty("hash_fallback_header")
    public String getHashFallbackHeader() {
        return hashFallbackHeader;
    }

    @JsonProperty("hash_fallback_header")
    public void setHashFallbackHeader(String hashFallbackHeader) {
        this.hashFallbackHeader = hashFallbackHeader;
    }

    @JsonProperty("hash_fallback_query_arg")
    public String getHashFallbackQueryArg() {
        return hashFallbackQueryArg;
    }

    @JsonProperty("hash_fallback_query_arg")
    public void setHashFallbackQueryArg(String hashFallbackQueryArg) {
        this.hashFallbackQueryArg = hashFallbackQueryArg;
    }

    @JsonProperty("hash_fallback_uri_capture")
    public String getHashFallbackUriCapture() {
        return hashFallbackUriCapture;
    }

    @JsonProperty("hash_fallback_uri_capture")
    public void setHashFallbackUriCapture(String hashFallbackUriCapture) {
        this.hashFallbackUriCapture = hashFallbackUriCapture;
    }

    @JsonProperty("hash_on")
    public String getHashOn() {
        return hashOn;
    }

    @JsonProperty("hash_on")
    public void setHashOn(String hashOn) {
        this.hashOn = hashOn;
    }

    @JsonProperty("hash_on_cookie")
    public String getHashOnCookie() {
        return hashOnCookie;
    }

    @JsonProperty("hash_on_cookie")
    public void setHashOnCookie(String hashOnCookie) {
        this.hashOnCookie = hashOnCookie;
    }

    @JsonProperty("hash_on_cookie_path")
    public String getHashOnCookiePath() {
        return hashOnCookiePath;
    }

    @JsonProperty("hash_on_cookie_path")
    public void setHashOnCookiePath(String hashOnCookiePath) {
        this.hashOnCookiePath = hashOnCookiePath;
    }

    @JsonProperty("hash_on_header")
    public String getHashOnHeader() {
        return hashOnHeader;
    }

    @JsonProperty("hash_on_header")
    public void setHashOnHeader(String hashOnHeader) {
        this.hashOnHeader = hashOnHeader;
    }

    @JsonProperty("hash_on_query_arg")
    public String getHashOnQueryArg() {
        return hashOnQueryArg;
    }

    @JsonProperty("hash_on_query_arg")
    public void setHashOnQueryArg(String hashOnQueryArg) {
        this.hashOnQueryArg = hashOnQueryArg;
    }

    @JsonProperty("hash_on_uri_capture")
    public String getHashOnUriCapture() {
        return hashOnUriCapture;
    }

    @JsonProperty("hash_on_uri_capture")
    public void setHashOnUriCapture(String hashOnUriCapture) {
        this.hashOnUriCapture = hashOnUriCapture;
    }

    @JsonProperty("healthchecks")
    public Healthcheck getHealthchecks() {
        return healthchecks;
    }

    @JsonProperty("healthchecks")
    public void setHealthchecks(Healthcheck healthchecks) {
        this.healthchecks = healthchecks;
    }

    @JsonProperty("host_header")
    public String getHostHeader() {
        return hostHeader;
    }

    @JsonProperty("host_header")
    public void setHostHeader(String hostHeader) {
        this.hostHeader = hostHeader;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("slots")
    public Integer getSlots() {
        return slots;
    }

    @JsonProperty("slots")
    public void setSlots(Integer slots) {
        this.slots = slots;
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
        sb.append(Upstream.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("algorithm");
        sb.append('=');
        sb.append(((this.algorithm == null)?"<null>":this.algorithm));
        sb.append(',');
        sb.append("clientCertificate");
        sb.append('=');
        sb.append(((this.clientCertificate == null)?"<null>":this.clientCertificate));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("hashFallback");
        sb.append('=');
        sb.append(((this.hashFallback == null)?"<null>":this.hashFallback));
        sb.append(',');
        sb.append("hashFallbackHeader");
        sb.append('=');
        sb.append(((this.hashFallbackHeader == null)?"<null>":this.hashFallbackHeader));
        sb.append(',');
        sb.append("hashFallbackQueryArg");
        sb.append('=');
        sb.append(((this.hashFallbackQueryArg == null)?"<null>":this.hashFallbackQueryArg));
        sb.append(',');
        sb.append("hashFallbackUriCapture");
        sb.append('=');
        sb.append(((this.hashFallbackUriCapture == null)?"<null>":this.hashFallbackUriCapture));
        sb.append(',');
        sb.append("hashOn");
        sb.append('=');
        sb.append(((this.hashOn == null)?"<null>":this.hashOn));
        sb.append(',');
        sb.append("hashOnCookie");
        sb.append('=');
        sb.append(((this.hashOnCookie == null)?"<null>":this.hashOnCookie));
        sb.append(',');
        sb.append("hashOnCookiePath");
        sb.append('=');
        sb.append(((this.hashOnCookiePath == null)?"<null>":this.hashOnCookiePath));
        sb.append(',');
        sb.append("hashOnHeader");
        sb.append('=');
        sb.append(((this.hashOnHeader == null)?"<null>":this.hashOnHeader));
        sb.append(',');
        sb.append("hashOnQueryArg");
        sb.append('=');
        sb.append(((this.hashOnQueryArg == null)?"<null>":this.hashOnQueryArg));
        sb.append(',');
        sb.append("hashOnUriCapture");
        sb.append('=');
        sb.append(((this.hashOnUriCapture == null)?"<null>":this.hashOnUriCapture));
        sb.append(',');
        sb.append("healthchecks");
        sb.append('=');
        sb.append(((this.healthchecks == null)?"<null>":this.healthchecks));
        sb.append(',');
        sb.append("hostHeader");
        sb.append('=');
        sb.append(((this.hostHeader == null)?"<null>":this.hostHeader));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("slots");
        sb.append('=');
        sb.append(((this.slots == null)?"<null>":this.slots));
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
        result = ((result* 31)+((this.hostHeader == null)? 0 :this.hostHeader.hashCode()));
        result = ((result* 31)+((this.clientCertificate == null)? 0 :this.clientCertificate.hashCode()));
        result = ((result* 31)+((this.healthchecks == null)? 0 :this.healthchecks.hashCode()));
        result = ((result* 31)+((this.hashFallback == null)? 0 :this.hashFallback.hashCode()));
        result = ((result* 31)+((this.hashOn == null)? 0 :this.hashOn.hashCode()));
        result = ((result* 31)+((this.hashOnCookiePath == null)? 0 :this.hashOnCookiePath.hashCode()));
        result = ((result* 31)+((this.hashFallbackHeader == null)? 0 :this.hashFallbackHeader.hashCode()));
        result = ((result* 31)+((this.hashOnQueryArg == null)? 0 :this.hashOnQueryArg.hashCode()));
        result = ((result* 31)+((this.hashFallbackQueryArg == null)? 0 :this.hashFallbackQueryArg.hashCode()));
        result = ((result* 31)+((this.hashFallbackUriCapture == null)? 0 :this.hashFallbackUriCapture.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.slots == null)? 0 :this.slots.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.hashOnHeader == null)? 0 :this.hashOnHeader.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.hashOnCookie == null)? 0 :this.hashOnCookie.hashCode()));
        result = ((result* 31)+((this.algorithm == null)? 0 :this.algorithm.hashCode()));
        result = ((result* 31)+((this.hashOnUriCapture == null)? 0 :this.hashOnUriCapture.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Upstream) == false) {
            return false;
        }
        Upstream rhs = ((Upstream) other);
        return ((((((((((((((((((((this.hostHeader == rhs.hostHeader)||((this.hostHeader!= null)&&this.hostHeader.equals(rhs.hostHeader)))&&((this.clientCertificate == rhs.clientCertificate)||((this.clientCertificate!= null)&&this.clientCertificate.equals(rhs.clientCertificate))))&&((this.healthchecks == rhs.healthchecks)||((this.healthchecks!= null)&&this.healthchecks.equals(rhs.healthchecks))))&&((this.hashFallback == rhs.hashFallback)||((this.hashFallback!= null)&&this.hashFallback.equals(rhs.hashFallback))))&&((this.hashOn == rhs.hashOn)||((this.hashOn!= null)&&this.hashOn.equals(rhs.hashOn))))&&((this.hashOnCookiePath == rhs.hashOnCookiePath)||((this.hashOnCookiePath!= null)&&this.hashOnCookiePath.equals(rhs.hashOnCookiePath))))&&((this.hashFallbackHeader == rhs.hashFallbackHeader)||((this.hashFallbackHeader!= null)&&this.hashFallbackHeader.equals(rhs.hashFallbackHeader))))&&((this.hashOnQueryArg == rhs.hashOnQueryArg)||((this.hashOnQueryArg!= null)&&this.hashOnQueryArg.equals(rhs.hashOnQueryArg))))&&((this.hashFallbackQueryArg == rhs.hashFallbackQueryArg)||((this.hashFallbackQueryArg!= null)&&this.hashFallbackQueryArg.equals(rhs.hashFallbackQueryArg))))&&((this.hashFallbackUriCapture == rhs.hashFallbackUriCapture)||((this.hashFallbackUriCapture!= null)&&this.hashFallbackUriCapture.equals(rhs.hashFallbackUriCapture))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt))))&&((this.slots == rhs.slots)||((this.slots!= null)&&this.slots.equals(rhs.slots))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.hashOnHeader == rhs.hashOnHeader)||((this.hashOnHeader!= null)&&this.hashOnHeader.equals(rhs.hashOnHeader))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.hashOnCookie == rhs.hashOnCookie)||((this.hashOnCookie!= null)&&this.hashOnCookie.equals(rhs.hashOnCookie))))&&((this.algorithm == rhs.algorithm)||((this.algorithm!= null)&&this.algorithm.equals(rhs.algorithm))))&&((this.hashOnUriCapture == rhs.hashOnUriCapture)||((this.hashOnUriCapture!= null)&&this.hashOnUriCapture.equals(rhs.hashOnUriCapture))));
    }

}
