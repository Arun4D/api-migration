
package in.co.ad.apimigration.apimigration.kong.dto.generated;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "created_at",
    "destinations",
    "expression",
    "headers",
    "hosts",
    "https_redirect_status_code",
    "id",
    "methods",
    "name",
    "path_handling",
    "paths",
    "plugins",
    "preserve_host",
    "priority",
    "protocols",
    "regex_priority",
    "request_buffering",
    "response_buffering",
    "service",
    "snis",
    "sources",
    "strip_path",
    "tags",
    "updated_at"
})
@Generated("jsonschema2pojo")
public class FRoute {

    @JsonProperty("created_at")
    private Integer createdAt;
    @JsonProperty("destinations")
    private List<CIDRPort> destinations = new ArrayList<CIDRPort>();
    @JsonProperty("expression")
    private String expression;
    @JsonProperty("headers")
    private Headers__1 headers;
    @JsonProperty("hosts")
    private List<String> hosts = new ArrayList<String>();
    @JsonProperty("https_redirect_status_code")
    private Integer httpsRedirectStatusCode;
    @JsonProperty("id")
    private String id;
    @JsonProperty("methods")
    private List<String> methods = new ArrayList<String>();
    @JsonProperty("name")
    private String name;
    @JsonProperty("path_handling")
    private String pathHandling;
    @JsonProperty("paths")
    private List<String> paths = new ArrayList<String>();
    @JsonProperty("plugins")
    private List<FPlugin> plugins = new ArrayList<FPlugin>();
    @JsonProperty("preserve_host")
    private Boolean preserveHost;
    @JsonProperty("priority")
    private Integer priority;
    @JsonProperty("protocols")
    private List<String> protocols = new ArrayList<String>();
    @JsonProperty("regex_priority")
    private Integer regexPriority;
    @JsonProperty("request_buffering")
    private Boolean requestBuffering;
    @JsonProperty("response_buffering")
    private Boolean responseBuffering;
    @JsonProperty("service")
    private Service service;
    @JsonProperty("snis")
    private List<String> snis = new ArrayList<String>();
    @JsonProperty("sources")
    private List<CIDRPort> sources = new ArrayList<CIDRPort>();
    @JsonProperty("strip_path")
    private Boolean stripPath;
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();
    @JsonProperty("updated_at")
    private Integer updatedAt;

    @JsonProperty("created_at")
    public Integer getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("destinations")
    public List<CIDRPort> getDestinations() {
        return destinations;
    }

    @JsonProperty("destinations")
    public void setDestinations(List<CIDRPort> destinations) {
        this.destinations = destinations;
    }

    @JsonProperty("expression")
    public String getExpression() {
        return expression;
    }

    @JsonProperty("expression")
    public void setExpression(String expression) {
        this.expression = expression;
    }

    @JsonProperty("headers")
    public Headers__1 getHeaders() {
        return headers;
    }

    @JsonProperty("headers")
    public void setHeaders(Headers__1 headers) {
        this.headers = headers;
    }

    @JsonProperty("hosts")
    public List<String> getHosts() {
        return hosts;
    }

    @JsonProperty("hosts")
    public void setHosts(List<String> hosts) {
        this.hosts = hosts;
    }

    @JsonProperty("https_redirect_status_code")
    public Integer getHttpsRedirectStatusCode() {
        return httpsRedirectStatusCode;
    }

    @JsonProperty("https_redirect_status_code")
    public void setHttpsRedirectStatusCode(Integer httpsRedirectStatusCode) {
        this.httpsRedirectStatusCode = httpsRedirectStatusCode;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("methods")
    public List<String> getMethods() {
        return methods;
    }

    @JsonProperty("methods")
    public void setMethods(List<String> methods) {
        this.methods = methods;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("path_handling")
    public String getPathHandling() {
        return pathHandling;
    }

    @JsonProperty("path_handling")
    public void setPathHandling(String pathHandling) {
        this.pathHandling = pathHandling;
    }

    @JsonProperty("paths")
    public List<String> getPaths() {
        return paths;
    }

    @JsonProperty("paths")
    public void setPaths(List<String> paths) {
        this.paths = paths;
    }

    @JsonProperty("plugins")
    public List<FPlugin> getPlugins() {
        return plugins;
    }

    @JsonProperty("plugins")
    public void setPlugins(List<FPlugin> plugins) {
        this.plugins = plugins;
    }

    @JsonProperty("preserve_host")
    public Boolean getPreserveHost() {
        return preserveHost;
    }

    @JsonProperty("preserve_host")
    public void setPreserveHost(Boolean preserveHost) {
        this.preserveHost = preserveHost;
    }

    @JsonProperty("priority")
    public Integer getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @JsonProperty("protocols")
    public List<String> getProtocols() {
        return protocols;
    }

    @JsonProperty("protocols")
    public void setProtocols(List<String> protocols) {
        this.protocols = protocols;
    }

    @JsonProperty("regex_priority")
    public Integer getRegexPriority() {
        return regexPriority;
    }

    @JsonProperty("regex_priority")
    public void setRegexPriority(Integer regexPriority) {
        this.regexPriority = regexPriority;
    }

    @JsonProperty("request_buffering")
    public Boolean getRequestBuffering() {
        return requestBuffering;
    }

    @JsonProperty("request_buffering")
    public void setRequestBuffering(Boolean requestBuffering) {
        this.requestBuffering = requestBuffering;
    }

    @JsonProperty("response_buffering")
    public Boolean getResponseBuffering() {
        return responseBuffering;
    }

    @JsonProperty("response_buffering")
    public void setResponseBuffering(Boolean responseBuffering) {
        this.responseBuffering = responseBuffering;
    }

    @JsonProperty("service")
    public Service getService() {
        return service;
    }

    @JsonProperty("service")
    public void setService(Service service) {
        this.service = service;
    }

    @JsonProperty("snis")
    public List<String> getSnis() {
        return snis;
    }

    @JsonProperty("snis")
    public void setSnis(List<String> snis) {
        this.snis = snis;
    }

    @JsonProperty("sources")
    public List<CIDRPort> getSources() {
        return sources;
    }

    @JsonProperty("sources")
    public void setSources(List<CIDRPort> sources) {
        this.sources = sources;
    }

    @JsonProperty("strip_path")
    public Boolean getStripPath() {
        return stripPath;
    }

    @JsonProperty("strip_path")
    public void setStripPath(Boolean stripPath) {
        this.stripPath = stripPath;
    }

    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @JsonProperty("updated_at")
    public Integer getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FRoute.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("destinations");
        sb.append('=');
        sb.append(((this.destinations == null)?"<null>":this.destinations));
        sb.append(',');
        sb.append("expression");
        sb.append('=');
        sb.append(((this.expression == null)?"<null>":this.expression));
        sb.append(',');
        sb.append("headers");
        sb.append('=');
        sb.append(((this.headers == null)?"<null>":this.headers));
        sb.append(',');
        sb.append("hosts");
        sb.append('=');
        sb.append(((this.hosts == null)?"<null>":this.hosts));
        sb.append(',');
        sb.append("httpsRedirectStatusCode");
        sb.append('=');
        sb.append(((this.httpsRedirectStatusCode == null)?"<null>":this.httpsRedirectStatusCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("methods");
        sb.append('=');
        sb.append(((this.methods == null)?"<null>":this.methods));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("pathHandling");
        sb.append('=');
        sb.append(((this.pathHandling == null)?"<null>":this.pathHandling));
        sb.append(',');
        sb.append("paths");
        sb.append('=');
        sb.append(((this.paths == null)?"<null>":this.paths));
        sb.append(',');
        sb.append("plugins");
        sb.append('=');
        sb.append(((this.plugins == null)?"<null>":this.plugins));
        sb.append(',');
        sb.append("preserveHost");
        sb.append('=');
        sb.append(((this.preserveHost == null)?"<null>":this.preserveHost));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("protocols");
        sb.append('=');
        sb.append(((this.protocols == null)?"<null>":this.protocols));
        sb.append(',');
        sb.append("regexPriority");
        sb.append('=');
        sb.append(((this.regexPriority == null)?"<null>":this.regexPriority));
        sb.append(',');
        sb.append("requestBuffering");
        sb.append('=');
        sb.append(((this.requestBuffering == null)?"<null>":this.requestBuffering));
        sb.append(',');
        sb.append("responseBuffering");
        sb.append('=');
        sb.append(((this.responseBuffering == null)?"<null>":this.responseBuffering));
        sb.append(',');
        sb.append("service");
        sb.append('=');
        sb.append(((this.service == null)?"<null>":this.service));
        sb.append(',');
        sb.append("snis");
        sb.append('=');
        sb.append(((this.snis == null)?"<null>":this.snis));
        sb.append(',');
        sb.append("sources");
        sb.append('=');
        sb.append(((this.sources == null)?"<null>":this.sources));
        sb.append(',');
        sb.append("stripPath");
        sb.append('=');
        sb.append(((this.stripPath == null)?"<null>":this.stripPath));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
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
        result = ((result* 31)+((this.pathHandling == null)? 0 :this.pathHandling.hashCode()));
        result = ((result* 31)+((this.sources == null)? 0 :this.sources.hashCode()));
        result = ((result* 31)+((this.methods == null)? 0 :this.methods.hashCode()));
        result = ((result* 31)+((this.plugins == null)? 0 :this.plugins.hashCode()));
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.stripPath == null)? 0 :this.stripPath.hashCode()));
        result = ((result* 31)+((this.requestBuffering == null)? 0 :this.requestBuffering.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.protocols == null)? 0 :this.protocols.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        result = ((result* 31)+((this.responseBuffering == null)? 0 :this.responseBuffering.hashCode()));
        result = ((result* 31)+((this.headers == null)? 0 :this.headers.hashCode()));
        result = ((result* 31)+((this.expression == null)? 0 :this.expression.hashCode()));
        result = ((result* 31)+((this.hosts == null)? 0 :this.hosts.hashCode()));
        result = ((result* 31)+((this.preserveHost == null)? 0 :this.preserveHost.hashCode()));
        result = ((result* 31)+((this.destinations == null)? 0 :this.destinations.hashCode()));
        result = ((result* 31)+((this.regexPriority == null)? 0 :this.regexPriority.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        result = ((result* 31)+((this.snis == null)? 0 :this.snis.hashCode()));
        result = ((result* 31)+((this.paths == null)? 0 :this.paths.hashCode()));
        result = ((result* 31)+((this.service == null)? 0 :this.service.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.httpsRedirectStatusCode == null)? 0 :this.httpsRedirectStatusCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FRoute) == false) {
            return false;
        }
        FRoute rhs = ((FRoute) other);
        return (((((((((((((((((((((((((this.pathHandling == rhs.pathHandling)||((this.pathHandling!= null)&&this.pathHandling.equals(rhs.pathHandling)))&&((this.sources == rhs.sources)||((this.sources!= null)&&this.sources.equals(rhs.sources))))&&((this.methods == rhs.methods)||((this.methods!= null)&&this.methods.equals(rhs.methods))))&&((this.plugins == rhs.plugins)||((this.plugins!= null)&&this.plugins.equals(rhs.plugins))))&&((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt))))&&((this.stripPath == rhs.stripPath)||((this.stripPath!= null)&&this.stripPath.equals(rhs.stripPath))))&&((this.requestBuffering == rhs.requestBuffering)||((this.requestBuffering!= null)&&this.requestBuffering.equals(rhs.requestBuffering))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.protocols == rhs.protocols)||((this.protocols!= null)&&this.protocols.equals(rhs.protocols))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))))&&((this.responseBuffering == rhs.responseBuffering)||((this.responseBuffering!= null)&&this.responseBuffering.equals(rhs.responseBuffering))))&&((this.headers == rhs.headers)||((this.headers!= null)&&this.headers.equals(rhs.headers))))&&((this.expression == rhs.expression)||((this.expression!= null)&&this.expression.equals(rhs.expression))))&&((this.hosts == rhs.hosts)||((this.hosts!= null)&&this.hosts.equals(rhs.hosts))))&&((this.preserveHost == rhs.preserveHost)||((this.preserveHost!= null)&&this.preserveHost.equals(rhs.preserveHost))))&&((this.destinations == rhs.destinations)||((this.destinations!= null)&&this.destinations.equals(rhs.destinations))))&&((this.regexPriority == rhs.regexPriority)||((this.regexPriority!= null)&&this.regexPriority.equals(rhs.regexPriority))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.snis == rhs.snis)||((this.snis!= null)&&this.snis.equals(rhs.snis))))&&((this.paths == rhs.paths)||((this.paths!= null)&&this.paths.equals(rhs.paths))))&&((this.service == rhs.service)||((this.service!= null)&&this.service.equals(rhs.service))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.httpsRedirectStatusCode == rhs.httpsRedirectStatusCode)||((this.httpsRedirectStatusCode!= null)&&this.httpsRedirectStatusCode.equals(rhs.httpsRedirectStatusCode))));
    }

}
