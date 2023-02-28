
package in.co.ad.apimigration.apimigration.kong.dto.generated;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ca_certificates",
    "client_certificate",
    "connect_timeout",
    "created_at",
    "enabled",
    "host",
    "id",
    "name",
    "path",
    "plugins",
    "port",
    "protocol",
    "read_timeout",
    "retries",
    "routes",
    "tags",
    "tls_verify",
    "tls_verify_depth",
    "updated_at",
    "url",
    "write_timeout"
})
@Generated("jsonschema2pojo")
public class FService {

    @JsonProperty("ca_certificates")
    private List<String> caCertificates = new ArrayList<String>();
    @JsonProperty("client_certificate")
    private String clientCertificate;
    @JsonProperty("connect_timeout")
    private Integer connectTimeout;
    @JsonProperty("created_at")
    private Integer createdAt;
    @JsonProperty("enabled")
    private Boolean enabled;
    @JsonProperty("host")
    private String host;
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("path")
    private String path;
    @JsonProperty("plugins")
    private List<FPlugin> plugins = new ArrayList<FPlugin>();
    @JsonProperty("port")
    private Integer port;
    @JsonProperty("protocol")
    private String protocol;
    @JsonProperty("read_timeout")
    private Integer readTimeout;
    @JsonProperty("retries")
    private Integer retries;
    @JsonProperty("routes")
    private List<FRoute> routes = new ArrayList<FRoute>();
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();
    @JsonProperty("tls_verify")
    private Boolean tlsVerify;
    @JsonProperty("tls_verify_depth")
    private Integer tlsVerifyDepth;
    @JsonProperty("updated_at")
    private Integer updatedAt;
    @JsonProperty("url")
    private String url;
    @JsonProperty("write_timeout")
    private Integer writeTimeout;

    @JsonProperty("ca_certificates")
    public List<String> getCaCertificates() {
        return caCertificates;
    }

    @JsonProperty("ca_certificates")
    public void setCaCertificates(List<String> caCertificates) {
        this.caCertificates = caCertificates;
    }

    @JsonProperty("client_certificate")
    public String getClientCertificate() {
        return clientCertificate;
    }

    @JsonProperty("client_certificate")
    public void setClientCertificate(String clientCertificate) {
        this.clientCertificate = clientCertificate;
    }

    @JsonProperty("connect_timeout")
    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    @JsonProperty("connect_timeout")
    public void setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    @JsonProperty("created_at")
    public Integer getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @JsonProperty("host")
    public String getHost() {
        return host;
    }

    @JsonProperty("host")
    public void setHost(String host) {
        this.host = host;
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

    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    @JsonProperty("plugins")
    public List<FPlugin> getPlugins() {
        return plugins;
    }

    @JsonProperty("plugins")
    public void setPlugins(List<FPlugin> plugins) {
        this.plugins = plugins;
    }

    @JsonProperty("port")
    public Integer getPort() {
        return port;
    }

    @JsonProperty("port")
    public void setPort(Integer port) {
        this.port = port;
    }

    @JsonProperty("protocol")
    public String getProtocol() {
        return protocol;
    }

    @JsonProperty("protocol")
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    @JsonProperty("read_timeout")
    public Integer getReadTimeout() {
        return readTimeout;
    }

    @JsonProperty("read_timeout")
    public void setReadTimeout(Integer readTimeout) {
        this.readTimeout = readTimeout;
    }

    @JsonProperty("retries")
    public Integer getRetries() {
        return retries;
    }

    @JsonProperty("retries")
    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    @JsonProperty("routes")
    public List<FRoute> getRoutes() {
        return routes;
    }

    @JsonProperty("routes")
    public void setRoutes(List<FRoute> routes) {
        this.routes = routes;
    }

    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @JsonProperty("tls_verify")
    public Boolean getTlsVerify() {
        return tlsVerify;
    }

    @JsonProperty("tls_verify")
    public void setTlsVerify(Boolean tlsVerify) {
        this.tlsVerify = tlsVerify;
    }

    @JsonProperty("tls_verify_depth")
    public Integer getTlsVerifyDepth() {
        return tlsVerifyDepth;
    }

    @JsonProperty("tls_verify_depth")
    public void setTlsVerifyDepth(Integer tlsVerifyDepth) {
        this.tlsVerifyDepth = tlsVerifyDepth;
    }

    @JsonProperty("updated_at")
    public Integer getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("write_timeout")
    public Integer getWriteTimeout() {
        return writeTimeout;
    }

    @JsonProperty("write_timeout")
    public void setWriteTimeout(Integer writeTimeout) {
        this.writeTimeout = writeTimeout;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FService.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("caCertificates");
        sb.append('=');
        sb.append(((this.caCertificates == null)?"<null>":this.caCertificates));
        sb.append(',');
        sb.append("clientCertificate");
        sb.append('=');
        sb.append(((this.clientCertificate == null)?"<null>":this.clientCertificate));
        sb.append(',');
        sb.append("connectTimeout");
        sb.append('=');
        sb.append(((this.connectTimeout == null)?"<null>":this.connectTimeout));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("enabled");
        sb.append('=');
        sb.append(((this.enabled == null)?"<null>":this.enabled));
        sb.append(',');
        sb.append("host");
        sb.append('=');
        sb.append(((this.host == null)?"<null>":this.host));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("path");
        sb.append('=');
        sb.append(((this.path == null)?"<null>":this.path));
        sb.append(',');
        sb.append("plugins");
        sb.append('=');
        sb.append(((this.plugins == null)?"<null>":this.plugins));
        sb.append(',');
        sb.append("port");
        sb.append('=');
        sb.append(((this.port == null)?"<null>":this.port));
        sb.append(',');
        sb.append("protocol");
        sb.append('=');
        sb.append(((this.protocol == null)?"<null>":this.protocol));
        sb.append(',');
        sb.append("readTimeout");
        sb.append('=');
        sb.append(((this.readTimeout == null)?"<null>":this.readTimeout));
        sb.append(',');
        sb.append("retries");
        sb.append('=');
        sb.append(((this.retries == null)?"<null>":this.retries));
        sb.append(',');
        sb.append("routes");
        sb.append('=');
        sb.append(((this.routes == null)?"<null>":this.routes));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("tlsVerify");
        sb.append('=');
        sb.append(((this.tlsVerify == null)?"<null>":this.tlsVerify));
        sb.append(',');
        sb.append("tlsVerifyDepth");
        sb.append('=');
        sb.append(((this.tlsVerifyDepth == null)?"<null>":this.tlsVerifyDepth));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("writeTimeout");
        sb.append('=');
        sb.append(((this.writeTimeout == null)?"<null>":this.writeTimeout));
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
        result = ((result* 31)+((this.clientCertificate == null)? 0 :this.clientCertificate.hashCode()));
        result = ((result* 31)+((this.caCertificates == null)? 0 :this.caCertificates.hashCode()));
        result = ((result* 31)+((this.plugins == null)? 0 :this.plugins.hashCode()));
        result = ((result* 31)+((this.tlsVerify == null)? 0 :this.tlsVerify.hashCode()));
        result = ((result* 31)+((this.writeTimeout == null)? 0 :this.writeTimeout.hashCode()));
        result = ((result* 31)+((this.enabled == null)? 0 :this.enabled.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.path == null)? 0 :this.path.hashCode()));
        result = ((result* 31)+((this.retries == null)? 0 :this.retries.hashCode()));
        result = ((result* 31)+((this.routes == null)? 0 :this.routes.hashCode()));
        result = ((result* 31)+((this.protocol == null)? 0 :this.protocol.hashCode()));
        result = ((result* 31)+((this.port == null)? 0 :this.port.hashCode()));
        result = ((result* 31)+((this.tlsVerifyDepth == null)? 0 :this.tlsVerifyDepth.hashCode()));
        result = ((result* 31)+((this.readTimeout == null)? 0 :this.readTimeout.hashCode()));
        result = ((result* 31)+((this.connectTimeout == null)? 0 :this.connectTimeout.hashCode()));
        result = ((result* 31)+((this.host == null)? 0 :this.host.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FService) == false) {
            return false;
        }
        FService rhs = ((FService) other);
        return ((((((((((((((((((((((this.clientCertificate == rhs.clientCertificate)||((this.clientCertificate!= null)&&this.clientCertificate.equals(rhs.clientCertificate)))&&((this.caCertificates == rhs.caCertificates)||((this.caCertificates!= null)&&this.caCertificates.equals(rhs.caCertificates))))&&((this.plugins == rhs.plugins)||((this.plugins!= null)&&this.plugins.equals(rhs.plugins))))&&((this.tlsVerify == rhs.tlsVerify)||((this.tlsVerify!= null)&&this.tlsVerify.equals(rhs.tlsVerify))))&&((this.writeTimeout == rhs.writeTimeout)||((this.writeTimeout!= null)&&this.writeTimeout.equals(rhs.writeTimeout))))&&((this.enabled == rhs.enabled)||((this.enabled!= null)&&this.enabled.equals(rhs.enabled))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt))))&&((this.path == rhs.path)||((this.path!= null)&&this.path.equals(rhs.path))))&&((this.retries == rhs.retries)||((this.retries!= null)&&this.retries.equals(rhs.retries))))&&((this.routes == rhs.routes)||((this.routes!= null)&&this.routes.equals(rhs.routes))))&&((this.protocol == rhs.protocol)||((this.protocol!= null)&&this.protocol.equals(rhs.protocol))))&&((this.port == rhs.port)||((this.port!= null)&&this.port.equals(rhs.port))))&&((this.tlsVerifyDepth == rhs.tlsVerifyDepth)||((this.tlsVerifyDepth!= null)&&this.tlsVerifyDepth.equals(rhs.tlsVerifyDepth))))&&((this.readTimeout == rhs.readTimeout)||((this.readTimeout!= null)&&this.readTimeout.equals(rhs.readTimeout))))&&((this.connectTimeout == rhs.connectTimeout)||((this.connectTimeout!= null)&&this.connectTimeout.equals(rhs.connectTimeout))))&&((this.host == rhs.host)||((this.host!= null)&&this.host.equals(rhs.host))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))));
    }

}
