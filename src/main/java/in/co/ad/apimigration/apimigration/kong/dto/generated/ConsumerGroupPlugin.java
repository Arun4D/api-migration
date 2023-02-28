
package in.co.ad.apimigration.apimigration.kong.dto.generated;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "config",
    "consumer_group",
    "created_at",
    "id",
    "name"
})
@Generated("jsonschema2pojo")
public class ConsumerGroupPlugin {

    @JsonProperty("config")
    private Config config;
    @JsonProperty("consumer_group")
    private ConsumerGroup consumerGroup;
    @JsonProperty("created_at")
    private Integer createdAt;
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;

    @JsonProperty("config")
    public Config getConfig() {
        return config;
    }

    @JsonProperty("config")
    public void setConfig(Config config) {
        this.config = config;
    }

    @JsonProperty("consumer_group")
    public ConsumerGroup getConsumerGroup() {
        return consumerGroup;
    }

    @JsonProperty("consumer_group")
    public void setConsumerGroup(ConsumerGroup consumerGroup) {
        this.consumerGroup = consumerGroup;
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

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConsumerGroupPlugin.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("config");
        sb.append('=');
        sb.append(((this.config == null)?"<null>":this.config));
        sb.append(',');
        sb.append("consumerGroup");
        sb.append('=');
        sb.append(((this.consumerGroup == null)?"<null>":this.consumerGroup));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.config == null)? 0 :this.config.hashCode()));
        result = ((result* 31)+((this.consumerGroup == null)? 0 :this.consumerGroup.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConsumerGroupPlugin) == false) {
            return false;
        }
        ConsumerGroupPlugin rhs = ((ConsumerGroupPlugin) other);
        return ((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.config == rhs.config)||((this.config!= null)&&this.config.equals(rhs.config))))&&((this.consumerGroup == rhs.consumerGroup)||((this.consumerGroup!= null)&&this.consumerGroup.equals(rhs.consumerGroup))));
    }

}
