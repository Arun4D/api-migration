
package in.co.ad.apimigration.apimigration.kong.dto.generated;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "_format_version",
    "_info",
    "_konnect",
    "_plugin_configs",
    "_transform",
    "_workspace",
    "ca_certificates",
    "certificates",
    "consumer_groups",
    "consumers",
    "plugins",
    "rbac_roles",
    "routes",
    "service_packages",
    "services",
    "upstreams",
    "vaults"
})
@Generated("jsonschema2pojo")
public class KongJsonSchema {

    @JsonProperty("_format_version")
    private String formatVersion;
    @JsonProperty("_info")
    private Info info;
    @JsonProperty("_konnect")
    private Konnect konnect;
    @JsonProperty("_plugin_configs")
    private PluginConfigs pluginConfigs;
    @JsonProperty("_transform")
    private Boolean transform;
    @JsonProperty("_workspace")
    private String workspace;
    @JsonProperty("ca_certificates")
    private List<FCACertificate> caCertificates = new ArrayList<FCACertificate>();
    @JsonProperty("certificates")
    private List<FCertificate> certificates = new ArrayList<FCertificate>();
    @JsonProperty("consumer_groups")
    private List<FConsumerGroupObject> consumerGroups = new ArrayList<FConsumerGroupObject>();
    @JsonProperty("consumers")
    private List<FConsumer> consumers = new ArrayList<FConsumer>();
    @JsonProperty("plugins")
    private List<FPlugin> plugins = new ArrayList<FPlugin>();
    @JsonProperty("rbac_roles")
    private List<FRBACRole> rbacRoles = new ArrayList<FRBACRole>();
    @JsonProperty("routes")
    private List<FRoute> routes = new ArrayList<FRoute>();
    @JsonProperty("service_packages")
    private List<FServicePackage> servicePackages = new ArrayList<FServicePackage>();
    @JsonProperty("services")
    private List<FService> services = new ArrayList<FService>();
    @JsonProperty("upstreams")
    private List<FUpstream> upstreams = new ArrayList<FUpstream>();
    @JsonProperty("vaults")
    private List<FVault> vaults = new ArrayList<FVault>();

    @JsonProperty("_format_version")
    public String getFormatVersion() {
        return formatVersion;
    }

    @JsonProperty("_format_version")
    public void setFormatVersion(String formatVersion) {
        this.formatVersion = formatVersion;
    }

    @JsonProperty("_info")
    public Info getInfo() {
        return info;
    }

    @JsonProperty("_info")
    public void setInfo(Info info) {
        this.info = info;
    }

    @JsonProperty("_konnect")
    public Konnect getKonnect() {
        return konnect;
    }

    @JsonProperty("_konnect")
    public void setKonnect(Konnect konnect) {
        this.konnect = konnect;
    }

    @JsonProperty("_plugin_configs")
    public PluginConfigs getPluginConfigs() {
        return pluginConfigs;
    }

    @JsonProperty("_plugin_configs")
    public void setPluginConfigs(PluginConfigs pluginConfigs) {
        this.pluginConfigs = pluginConfigs;
    }

    @JsonProperty("_transform")
    public Boolean getTransform() {
        return transform;
    }

    @JsonProperty("_transform")
    public void setTransform(Boolean transform) {
        this.transform = transform;
    }

    @JsonProperty("_workspace")
    public String getWorkspace() {
        return workspace;
    }

    @JsonProperty("_workspace")
    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    @JsonProperty("ca_certificates")
    public List<FCACertificate> getCaCertificates() {
        return caCertificates;
    }

    @JsonProperty("ca_certificates")
    public void setCaCertificates(List<FCACertificate> caCertificates) {
        this.caCertificates = caCertificates;
    }

    @JsonProperty("certificates")
    public List<FCertificate> getCertificates() {
        return certificates;
    }

    @JsonProperty("certificates")
    public void setCertificates(List<FCertificate> certificates) {
        this.certificates = certificates;
    }

    @JsonProperty("consumer_groups")
    public List<FConsumerGroupObject> getConsumerGroups() {
        return consumerGroups;
    }

    @JsonProperty("consumer_groups")
    public void setConsumerGroups(List<FConsumerGroupObject> consumerGroups) {
        this.consumerGroups = consumerGroups;
    }

    @JsonProperty("consumers")
    public List<FConsumer> getConsumers() {
        return consumers;
    }

    @JsonProperty("consumers")
    public void setConsumers(List<FConsumer> consumers) {
        this.consumers = consumers;
    }

    @JsonProperty("plugins")
    public List<FPlugin> getPlugins() {
        return plugins;
    }

    @JsonProperty("plugins")
    public void setPlugins(List<FPlugin> plugins) {
        this.plugins = plugins;
    }

    @JsonProperty("rbac_roles")
    public List<FRBACRole> getRbacRoles() {
        return rbacRoles;
    }

    @JsonProperty("rbac_roles")
    public void setRbacRoles(List<FRBACRole> rbacRoles) {
        this.rbacRoles = rbacRoles;
    }

    @JsonProperty("routes")
    public List<FRoute> getRoutes() {
        return routes;
    }

    @JsonProperty("routes")
    public void setRoutes(List<FRoute> routes) {
        this.routes = routes;
    }

    @JsonProperty("service_packages")
    public List<FServicePackage> getServicePackages() {
        return servicePackages;
    }

    @JsonProperty("service_packages")
    public void setServicePackages(List<FServicePackage> servicePackages) {
        this.servicePackages = servicePackages;
    }

    @JsonProperty("services")
    public List<FService> getServices() {
        return services;
    }

    @JsonProperty("services")
    public void setServices(List<FService> services) {
        this.services = services;
    }

    @JsonProperty("upstreams")
    public List<FUpstream> getUpstreams() {
        return upstreams;
    }

    @JsonProperty("upstreams")
    public void setUpstreams(List<FUpstream> upstreams) {
        this.upstreams = upstreams;
    }

    @JsonProperty("vaults")
    public List<FVault> getVaults() {
        return vaults;
    }

    @JsonProperty("vaults")
    public void setVaults(List<FVault> vaults) {
        this.vaults = vaults;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(KongJsonSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("formatVersion");
        sb.append('=');
        sb.append(((this.formatVersion == null)?"<null>":this.formatVersion));
        sb.append(',');
        sb.append("info");
        sb.append('=');
        sb.append(((this.info == null)?"<null>":this.info));
        sb.append(',');
        sb.append("konnect");
        sb.append('=');
        sb.append(((this.konnect == null)?"<null>":this.konnect));
        sb.append(',');
        sb.append("pluginConfigs");
        sb.append('=');
        sb.append(((this.pluginConfigs == null)?"<null>":this.pluginConfigs));
        sb.append(',');
        sb.append("transform");
        sb.append('=');
        sb.append(((this.transform == null)?"<null>":this.transform));
        sb.append(',');
        sb.append("workspace");
        sb.append('=');
        sb.append(((this.workspace == null)?"<null>":this.workspace));
        sb.append(',');
        sb.append("caCertificates");
        sb.append('=');
        sb.append(((this.caCertificates == null)?"<null>":this.caCertificates));
        sb.append(',');
        sb.append("certificates");
        sb.append('=');
        sb.append(((this.certificates == null)?"<null>":this.certificates));
        sb.append(',');
        sb.append("consumerGroups");
        sb.append('=');
        sb.append(((this.consumerGroups == null)?"<null>":this.consumerGroups));
        sb.append(',');
        sb.append("consumers");
        sb.append('=');
        sb.append(((this.consumers == null)?"<null>":this.consumers));
        sb.append(',');
        sb.append("plugins");
        sb.append('=');
        sb.append(((this.plugins == null)?"<null>":this.plugins));
        sb.append(',');
        sb.append("rbacRoles");
        sb.append('=');
        sb.append(((this.rbacRoles == null)?"<null>":this.rbacRoles));
        sb.append(',');
        sb.append("routes");
        sb.append('=');
        sb.append(((this.routes == null)?"<null>":this.routes));
        sb.append(',');
        sb.append("servicePackages");
        sb.append('=');
        sb.append(((this.servicePackages == null)?"<null>":this.servicePackages));
        sb.append(',');
        sb.append("services");
        sb.append('=');
        sb.append(((this.services == null)?"<null>":this.services));
        sb.append(',');
        sb.append("upstreams");
        sb.append('=');
        sb.append(((this.upstreams == null)?"<null>":this.upstreams));
        sb.append(',');
        sb.append("vaults");
        sb.append('=');
        sb.append(((this.vaults == null)?"<null>":this.vaults));
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
        result = ((result* 31)+((this.workspace == null)? 0 :this.workspace.hashCode()));
        result = ((result* 31)+((this.caCertificates == null)? 0 :this.caCertificates.hashCode()));
        result = ((result* 31)+((this.plugins == null)? 0 :this.plugins.hashCode()));
        result = ((result* 31)+((this.upstreams == null)? 0 :this.upstreams.hashCode()));
        result = ((result* 31)+((this.vaults == null)? 0 :this.vaults.hashCode()));
        result = ((result* 31)+((this.services == null)? 0 :this.services.hashCode()));
        result = ((result* 31)+((this.pluginConfigs == null)? 0 :this.pluginConfigs.hashCode()));
        result = ((result* 31)+((this.routes == null)? 0 :this.routes.hashCode()));
        result = ((result* 31)+((this.transform == null)? 0 :this.transform.hashCode()));
        result = ((result* 31)+((this.consumerGroups == null)? 0 :this.consumerGroups.hashCode()));
        result = ((result* 31)+((this.konnect == null)? 0 :this.konnect.hashCode()));
        result = ((result* 31)+((this.certificates == null)? 0 :this.certificates.hashCode()));
        result = ((result* 31)+((this.servicePackages == null)? 0 :this.servicePackages.hashCode()));
        result = ((result* 31)+((this.consumers == null)? 0 :this.consumers.hashCode()));
        result = ((result* 31)+((this.rbacRoles == null)? 0 :this.rbacRoles.hashCode()));
        result = ((result* 31)+((this.formatVersion == null)? 0 :this.formatVersion.hashCode()));
        result = ((result* 31)+((this.info == null)? 0 :this.info.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof KongJsonSchema) == false) {
            return false;
        }
        KongJsonSchema rhs = ((KongJsonSchema) other);
        return ((((((((((((((((((this.workspace == rhs.workspace)||((this.workspace!= null)&&this.workspace.equals(rhs.workspace)))&&((this.caCertificates == rhs.caCertificates)||((this.caCertificates!= null)&&this.caCertificates.equals(rhs.caCertificates))))&&((this.plugins == rhs.plugins)||((this.plugins!= null)&&this.plugins.equals(rhs.plugins))))&&((this.upstreams == rhs.upstreams)||((this.upstreams!= null)&&this.upstreams.equals(rhs.upstreams))))&&((this.vaults == rhs.vaults)||((this.vaults!= null)&&this.vaults.equals(rhs.vaults))))&&((this.services == rhs.services)||((this.services!= null)&&this.services.equals(rhs.services))))&&((this.pluginConfigs == rhs.pluginConfigs)||((this.pluginConfigs!= null)&&this.pluginConfigs.equals(rhs.pluginConfigs))))&&((this.routes == rhs.routes)||((this.routes!= null)&&this.routes.equals(rhs.routes))))&&((this.transform == rhs.transform)||((this.transform!= null)&&this.transform.equals(rhs.transform))))&&((this.consumerGroups == rhs.consumerGroups)||((this.consumerGroups!= null)&&this.consumerGroups.equals(rhs.consumerGroups))))&&((this.konnect == rhs.konnect)||((this.konnect!= null)&&this.konnect.equals(rhs.konnect))))&&((this.certificates == rhs.certificates)||((this.certificates!= null)&&this.certificates.equals(rhs.certificates))))&&((this.servicePackages == rhs.servicePackages)||((this.servicePackages!= null)&&this.servicePackages.equals(rhs.servicePackages))))&&((this.consumers == rhs.consumers)||((this.consumers!= null)&&this.consumers.equals(rhs.consumers))))&&((this.rbacRoles == rhs.rbacRoles)||((this.rbacRoles!= null)&&this.rbacRoles.equals(rhs.rbacRoles))))&&((this.formatVersion == rhs.formatVersion)||((this.formatVersion!= null)&&this.formatVersion.equals(rhs.formatVersion))))&&((this.info == rhs.info)||((this.info!= null)&&this.info.equals(rhs.info))));
    }

}
