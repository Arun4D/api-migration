
package in.co.ad.apimigration.apimigration.kong.dto.generated;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "http_failures",
    "http_statuses",
    "interval",
    "tcp_failures",
    "timeouts"
})
@Generated("jsonschema2pojo")
public class Unhealthy {

    @JsonProperty("http_failures")
    private Integer httpFailures;
    @JsonProperty("http_statuses")
    private List<Integer> httpStatuses = new ArrayList<Integer>();
    @JsonProperty("interval")
    private Integer interval;
    @JsonProperty("tcp_failures")
    private Integer tcpFailures;
    @JsonProperty("timeouts")
    private Integer timeouts;

    @JsonProperty("http_failures")
    public Integer getHttpFailures() {
        return httpFailures;
    }

    @JsonProperty("http_failures")
    public void setHttpFailures(Integer httpFailures) {
        this.httpFailures = httpFailures;
    }

    @JsonProperty("http_statuses")
    public List<Integer> getHttpStatuses() {
        return httpStatuses;
    }

    @JsonProperty("http_statuses")
    public void setHttpStatuses(List<Integer> httpStatuses) {
        this.httpStatuses = httpStatuses;
    }

    @JsonProperty("interval")
    public Integer getInterval() {
        return interval;
    }

    @JsonProperty("interval")
    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    @JsonProperty("tcp_failures")
    public Integer getTcpFailures() {
        return tcpFailures;
    }

    @JsonProperty("tcp_failures")
    public void setTcpFailures(Integer tcpFailures) {
        this.tcpFailures = tcpFailures;
    }

    @JsonProperty("timeouts")
    public Integer getTimeouts() {
        return timeouts;
    }

    @JsonProperty("timeouts")
    public void setTimeouts(Integer timeouts) {
        this.timeouts = timeouts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Unhealthy.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("httpFailures");
        sb.append('=');
        sb.append(((this.httpFailures == null)?"<null>":this.httpFailures));
        sb.append(',');
        sb.append("httpStatuses");
        sb.append('=');
        sb.append(((this.httpStatuses == null)?"<null>":this.httpStatuses));
        sb.append(',');
        sb.append("interval");
        sb.append('=');
        sb.append(((this.interval == null)?"<null>":this.interval));
        sb.append(',');
        sb.append("tcpFailures");
        sb.append('=');
        sb.append(((this.tcpFailures == null)?"<null>":this.tcpFailures));
        sb.append(',');
        sb.append("timeouts");
        sb.append('=');
        sb.append(((this.timeouts == null)?"<null>":this.timeouts));
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
        result = ((result* 31)+((this.httpStatuses == null)? 0 :this.httpStatuses.hashCode()));
        result = ((result* 31)+((this.timeouts == null)? 0 :this.timeouts.hashCode()));
        result = ((result* 31)+((this.httpFailures == null)? 0 :this.httpFailures.hashCode()));
        result = ((result* 31)+((this.interval == null)? 0 :this.interval.hashCode()));
        result = ((result* 31)+((this.tcpFailures == null)? 0 :this.tcpFailures.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Unhealthy) == false) {
            return false;
        }
        Unhealthy rhs = ((Unhealthy) other);
        return ((((((this.httpStatuses == rhs.httpStatuses)||((this.httpStatuses!= null)&&this.httpStatuses.equals(rhs.httpStatuses)))&&((this.timeouts == rhs.timeouts)||((this.timeouts!= null)&&this.timeouts.equals(rhs.timeouts))))&&((this.httpFailures == rhs.httpFailures)||((this.httpFailures!= null)&&this.httpFailures.equals(rhs.httpFailures))))&&((this.interval == rhs.interval)||((this.interval!= null)&&this.interval.equals(rhs.interval))))&&((this.tcpFailures == rhs.tcpFailures)||((this.tcpFailures!= null)&&this.tcpFailures.equals(rhs.tcpFailures))));
    }

}
