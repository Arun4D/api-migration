
package in.co.ad.apimigration.apimigration.kong.dto.generated;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "config",
    "consumer",
    "created_at",
    "enabled",
    "id",
    "instance_name",
    "name",
    "ordering",
    "protocols",
    "route",
    "run_on",
    "service",
    "tags"
})
@Generated("jsonschema2pojo")
public class FPlugin {

    @JsonProperty("config")
    private Config__1 config;
    @JsonProperty("consumer")
    private String consumer;
    @JsonProperty("created_at")
    private Integer createdAt;
    @JsonProperty("enabled")
    private Boolean enabled;
    @JsonProperty("id")
    private String id;
    @JsonProperty("instance_name")
    private String instanceName;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;
    @JsonProperty("ordering")
    private PluginOrdering ordering;
    @JsonProperty("protocols")
    private List<String> protocols = new ArrayList<String>();
    @JsonProperty("route")
    private String route;
    @JsonProperty("run_on")
    private String runOn;
    @JsonProperty("service")
    private String service;
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();

    @JsonProperty("config")
    public Config__1 getConfig() {
        return config;
    }

    @JsonProperty("config")
    public void setConfig(Config__1 config) {
        this.config = config;
    }

    @JsonProperty("consumer")
    public String getConsumer() {
        return consumer;
    }

    @JsonProperty("consumer")
    public void setConsumer(String consumer) {
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

    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("instance_name")
    public String getInstanceName() {
        return instanceName;
    }

    @JsonProperty("instance_name")
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
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

    @JsonProperty("ordering")
    public PluginOrdering getOrdering() {
        return ordering;
    }

    @JsonProperty("ordering")
    public void setOrdering(PluginOrdering ordering) {
        this.ordering = ordering;
    }

    @JsonProperty("protocols")
    public List<String> getProtocols() {
        return protocols;
    }

    @JsonProperty("protocols")
    public void setProtocols(List<String> protocols) {
        this.protocols = protocols;
    }

    @JsonProperty("route")
    public String getRoute() {
        return route;
    }

    @JsonProperty("route")
    public void setRoute(String route) {
        this.route = route;
    }

    @JsonProperty("run_on")
    public String getRunOn() {
        return runOn;
    }

    @JsonProperty("run_on")
    public void setRunOn(String runOn) {
        this.runOn = runOn;
    }

    @JsonProperty("service")
    public String getService() {
        return service;
    }

    @JsonProperty("service")
    public void setService(String service) {
        this.service = service;
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
        sb.append(FPlugin.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("config");
        sb.append('=');
        sb.append(((this.config == null)?"<null>":this.config));
        sb.append(',');
        sb.append("consumer");
        sb.append('=');
        sb.append(((this.consumer == null)?"<null>":this.consumer));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("enabled");
        sb.append('=');
        sb.append(((this.enabled == null)?"<null>":this.enabled));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("instanceName");
        sb.append('=');
        sb.append(((this.instanceName == null)?"<null>":this.instanceName));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("ordering");
        sb.append('=');
        sb.append(((this.ordering == null)?"<null>":this.ordering));
        sb.append(',');
        sb.append("protocols");
        sb.append('=');
        sb.append(((this.protocols == null)?"<null>":this.protocols));
        sb.append(',');
        sb.append("route");
        sb.append('=');
        sb.append(((this.route == null)?"<null>":this.route));
        sb.append(',');
        sb.append("runOn");
        sb.append('=');
        sb.append(((this.runOn == null)?"<null>":this.runOn));
        sb.append(',');
        sb.append("service");
        sb.append('=');
        sb.append(((this.service == null)?"<null>":this.service));
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
        result = ((result* 31)+((this.instanceName == null)? 0 :this.instanceName.hashCode()));
        result = ((result* 31)+((this.ordering == null)? 0 :this.ordering.hashCode()));
        result = ((result* 31)+((this.enabled == null)? 0 :this.enabled.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.route == null)? 0 :this.route.hashCode()));
        result = ((result* 31)+((this.service == null)? 0 :this.service.hashCode()));
        result = ((result* 31)+((this.runOn == null)? 0 :this.runOn.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.protocols == null)? 0 :this.protocols.hashCode()));
        result = ((result* 31)+((this.config == null)? 0 :this.config.hashCode()));
        result = ((result* 31)+((this.consumer == null)? 0 :this.consumer.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FPlugin) == false) {
            return false;
        }
        FPlugin rhs = ((FPlugin) other);
        return ((((((((((((((this.instanceName == rhs.instanceName)||((this.instanceName!= null)&&this.instanceName.equals(rhs.instanceName)))&&((this.ordering == rhs.ordering)||((this.ordering!= null)&&this.ordering.equals(rhs.ordering))))&&((this.enabled == rhs.enabled)||((this.enabled!= null)&&this.enabled.equals(rhs.enabled))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt))))&&((this.route == rhs.route)||((this.route!= null)&&this.route.equals(rhs.route))))&&((this.service == rhs.service)||((this.service!= null)&&this.service.equals(rhs.service))))&&((this.runOn == rhs.runOn)||((this.runOn!= null)&&this.runOn.equals(rhs.runOn))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.protocols == rhs.protocols)||((this.protocols!= null)&&this.protocols.equals(rhs.protocols))))&&((this.config == rhs.config)||((this.config!= null)&&this.config.equals(rhs.config))))&&((this.consumer == rhs.consumer)||((this.consumer!= null)&&this.consumer.equals(rhs.consumer))));
    }

}
