
package in.co.ad.apimigration.apimigration.kong.dto.generated;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "concurrency",
    "healthy",
    "http_path",
    "https_sni",
    "https_verify_certificate",
    "timeout",
    "type",
    "unhealthy"
})
@Generated("jsonschema2pojo")
public class ActiveHealthcheck {

    @JsonProperty("concurrency")
    private Integer concurrency;
    @JsonProperty("healthy")
    private Healthy healthy;
    @JsonProperty("http_path")
    private String httpPath;
    @JsonProperty("https_sni")
    private String httpsSni;
    @JsonProperty("https_verify_certificate")
    private Boolean httpsVerifyCertificate;
    @JsonProperty("timeout")
    private Integer timeout;
    @JsonProperty("type")
    private String type;
    @JsonProperty("unhealthy")
    private Unhealthy unhealthy;

    @JsonProperty("concurrency")
    public Integer getConcurrency() {
        return concurrency;
    }

    @JsonProperty("concurrency")
    public void setConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
    }

    @JsonProperty("healthy")
    public Healthy getHealthy() {
        return healthy;
    }

    @JsonProperty("healthy")
    public void setHealthy(Healthy healthy) {
        this.healthy = healthy;
    }

    @JsonProperty("http_path")
    public String getHttpPath() {
        return httpPath;
    }

    @JsonProperty("http_path")
    public void setHttpPath(String httpPath) {
        this.httpPath = httpPath;
    }

    @JsonProperty("https_sni")
    public String getHttpsSni() {
        return httpsSni;
    }

    @JsonProperty("https_sni")
    public void setHttpsSni(String httpsSni) {
        this.httpsSni = httpsSni;
    }

    @JsonProperty("https_verify_certificate")
    public Boolean getHttpsVerifyCertificate() {
        return httpsVerifyCertificate;
    }

    @JsonProperty("https_verify_certificate")
    public void setHttpsVerifyCertificate(Boolean httpsVerifyCertificate) {
        this.httpsVerifyCertificate = httpsVerifyCertificate;
    }

    @JsonProperty("timeout")
    public Integer getTimeout() {
        return timeout;
    }

    @JsonProperty("timeout")
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("unhealthy")
    public Unhealthy getUnhealthy() {
        return unhealthy;
    }

    @JsonProperty("unhealthy")
    public void setUnhealthy(Unhealthy unhealthy) {
        this.unhealthy = unhealthy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ActiveHealthcheck.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("concurrency");
        sb.append('=');
        sb.append(((this.concurrency == null)?"<null>":this.concurrency));
        sb.append(',');
        sb.append("healthy");
        sb.append('=');
        sb.append(((this.healthy == null)?"<null>":this.healthy));
        sb.append(',');
        sb.append("httpPath");
        sb.append('=');
        sb.append(((this.httpPath == null)?"<null>":this.httpPath));
        sb.append(',');
        sb.append("httpsSni");
        sb.append('=');
        sb.append(((this.httpsSni == null)?"<null>":this.httpsSni));
        sb.append(',');
        sb.append("httpsVerifyCertificate");
        sb.append('=');
        sb.append(((this.httpsVerifyCertificate == null)?"<null>":this.httpsVerifyCertificate));
        sb.append(',');
        sb.append("timeout");
        sb.append('=');
        sb.append(((this.timeout == null)?"<null>":this.timeout));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("unhealthy");
        sb.append('=');
        sb.append(((this.unhealthy == null)?"<null>":this.unhealthy));
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
        result = ((result* 31)+((this.httpPath == null)? 0 :this.httpPath.hashCode()));
        result = ((result* 31)+((this.healthy == null)? 0 :this.healthy.hashCode()));
        result = ((result* 31)+((this.unhealthy == null)? 0 :this.unhealthy.hashCode()));
        result = ((result* 31)+((this.httpsVerifyCertificate == null)? 0 :this.httpsVerifyCertificate.hashCode()));
        result = ((result* 31)+((this.httpsSni == null)? 0 :this.httpsSni.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.timeout == null)? 0 :this.timeout.hashCode()));
        result = ((result* 31)+((this.concurrency == null)? 0 :this.concurrency.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ActiveHealthcheck) == false) {
            return false;
        }
        ActiveHealthcheck rhs = ((ActiveHealthcheck) other);
        return (((((((((this.httpPath == rhs.httpPath)||((this.httpPath!= null)&&this.httpPath.equals(rhs.httpPath)))&&((this.healthy == rhs.healthy)||((this.healthy!= null)&&this.healthy.equals(rhs.healthy))))&&((this.unhealthy == rhs.unhealthy)||((this.unhealthy!= null)&&this.unhealthy.equals(rhs.unhealthy))))&&((this.httpsVerifyCertificate == rhs.httpsVerifyCertificate)||((this.httpsVerifyCertificate!= null)&&this.httpsVerifyCertificate.equals(rhs.httpsVerifyCertificate))))&&((this.httpsSni == rhs.httpsSni)||((this.httpsSni!= null)&&this.httpsSni.equals(rhs.httpsSni))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.timeout == rhs.timeout)||((this.timeout!= null)&&this.timeout.equals(rhs.timeout))))&&((this.concurrency == rhs.concurrency)||((this.concurrency!= null)&&this.concurrency.equals(rhs.concurrency))));
    }

}
