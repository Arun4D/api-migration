
package in.co.ad.apimigration.apimigration.kong.dto.generated;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "consumers",
    "created_at",
    "id",
    "name",
    "plugins",
    "tags"
})
@Generated("jsonschema2pojo")
public class FConsumerGroupObject {

    @JsonProperty("consumers")
    private List<Consumer> consumers = new ArrayList<Consumer>();
    @JsonProperty("created_at")
    private Integer createdAt;
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("plugins")
    private List<ConsumerGroupPlugin> plugins = new ArrayList<ConsumerGroupPlugin>();
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();

    @JsonProperty("consumers")
    public List<Consumer> getConsumers() {
        return consumers;
    }

    @JsonProperty("consumers")
    public void setConsumers(List<Consumer> consumers) {
        this.consumers = consumers;
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

    @JsonProperty("plugins")
    public List<ConsumerGroupPlugin> getPlugins() {
        return plugins;
    }

    @JsonProperty("plugins")
    public void setPlugins(List<ConsumerGroupPlugin> plugins) {
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FConsumerGroupObject.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("consumers");
        sb.append('=');
        sb.append(((this.consumers == null)?"<null>":this.consumers));
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
        sb.append("plugins");
        sb.append('=');
        sb.append(((this.plugins == null)?"<null>":this.plugins));
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
        result = ((result* 31)+((this.plugins == null)? 0 :this.plugins.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.consumers == null)? 0 :this.consumers.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FConsumerGroupObject) == false) {
            return false;
        }
        FConsumerGroupObject rhs = ((FConsumerGroupObject) other);
        return (((((((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt)))&&((this.plugins == rhs.plugins)||((this.plugins!= null)&&this.plugins.equals(rhs.plugins))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.consumers == rhs.consumers)||((this.consumers!= null)&&this.consumers.equals(rhs.consumers))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))));
    }

}
