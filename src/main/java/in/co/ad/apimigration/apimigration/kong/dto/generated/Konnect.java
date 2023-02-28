
package in.co.ad.apimigration.apimigration.kong.dto.generated;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "runtime_group_name"
})
@Generated("jsonschema2pojo")
public class Konnect {

    @JsonProperty("runtime_group_name")
    private String runtimeGroupName;

    @JsonProperty("runtime_group_name")
    public String getRuntimeGroupName() {
        return runtimeGroupName;
    }

    @JsonProperty("runtime_group_name")
    public void setRuntimeGroupName(String runtimeGroupName) {
        this.runtimeGroupName = runtimeGroupName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Konnect.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("runtimeGroupName");
        sb.append('=');
        sb.append(((this.runtimeGroupName == null)?"<null>":this.runtimeGroupName));
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
        result = ((result* 31)+((this.runtimeGroupName == null)? 0 :this.runtimeGroupName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Konnect) == false) {
            return false;
        }
        Konnect rhs = ((Konnect) other);
        return ((this.runtimeGroupName == rhs.runtimeGroupName)||((this.runtimeGroupName!= null)&&this.runtimeGroupName.equals(rhs.runtimeGroupName)));
    }

}
