
package in.co.ad.apimigration.apimigration.kong.dto.generated;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "defaults",
    "select_tags"
})
@Generated("jsonschema2pojo")
public class Info {

    @JsonProperty("defaults")
    private KongDefaults defaults;
    @JsonProperty("select_tags")
    private List<String> selectTags = new ArrayList<String>();

    @JsonProperty("defaults")
    public KongDefaults getDefaults() {
        return defaults;
    }

    @JsonProperty("defaults")
    public void setDefaults(KongDefaults defaults) {
        this.defaults = defaults;
    }

    @JsonProperty("select_tags")
    public List<String> getSelectTags() {
        return selectTags;
    }

    @JsonProperty("select_tags")
    public void setSelectTags(List<String> selectTags) {
        this.selectTags = selectTags;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Info.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("defaults");
        sb.append('=');
        sb.append(((this.defaults == null)?"<null>":this.defaults));
        sb.append(',');
        sb.append("selectTags");
        sb.append('=');
        sb.append(((this.selectTags == null)?"<null>":this.selectTags));
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
        result = ((result* 31)+((this.defaults == null)? 0 :this.defaults.hashCode()));
        result = ((result* 31)+((this.selectTags == null)? 0 :this.selectTags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Info) == false) {
            return false;
        }
        Info rhs = ((Info) other);
        return (((this.defaults == rhs.defaults)||((this.defaults!= null)&&this.defaults.equals(rhs.defaults)))&&((this.selectTags == rhs.selectTags)||((this.selectTags!= null)&&this.selectTags.equals(rhs.selectTags))));
    }

}
