
package in.co.ad.apimigration.apimigration.kong.dto.generated;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "comment",
    "created_at",
    "endpoint_permissions",
    "id",
    "is_default",
    "name"
})
@Generated("jsonschema2pojo")
public class FRBACRole {

    @JsonProperty("comment")
    private String comment;
    @JsonProperty("created_at")
    private Integer createdAt;
    @JsonProperty("endpoint_permissions")
    private List<FRBACEndpointPermission> endpointPermissions = new ArrayList<FRBACEndpointPermission>();
    @JsonProperty("id")
    private String id;
    @JsonProperty("is_default")
    private Boolean isDefault;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;

    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    @JsonProperty("created_at")
    public Integer getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("endpoint_permissions")
    public List<FRBACEndpointPermission> getEndpointPermissions() {
        return endpointPermissions;
    }

    @JsonProperty("endpoint_permissions")
    public void setEndpointPermissions(List<FRBACEndpointPermission> endpointPermissions) {
        this.endpointPermissions = endpointPermissions;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("is_default")
    public Boolean getIsDefault() {
        return isDefault;
    }

    @JsonProperty("is_default")
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FRBACRole.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("endpointPermissions");
        sb.append('=');
        sb.append(((this.endpointPermissions == null)?"<null>":this.endpointPermissions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("isDefault");
        sb.append('=');
        sb.append(((this.isDefault == null)?"<null>":this.isDefault));
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
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.isDefault == null)? 0 :this.isDefault.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.endpointPermissions == null)? 0 :this.endpointPermissions.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FRBACRole) == false) {
            return false;
        }
        FRBACRole rhs = ((FRBACRole) other);
        return (((((((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt)))&&((this.isDefault == rhs.isDefault)||((this.isDefault!= null)&&this.isDefault.equals(rhs.isDefault))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.endpointPermissions == rhs.endpointPermissions)||((this.endpointPermissions!= null)&&this.endpointPermissions.equals(rhs.endpointPermissions))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
