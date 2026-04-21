package org.automation.models.status;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonPropertyOrder({
        "mid",
        "mid_descriptor",
        "route_id",
        "cascade_number",
        "segment_id"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CascadeStepsModel {

    @JsonProperty("mid")
    private String mid;
    @JsonProperty("mid_descriptor")
    private String midDescriptor;
    @JsonProperty("route_id")
    private String routeId;
    @JsonProperty("cascade_number")
    private Integer cascadeNumber;
    @JsonProperty("segment_id")
    private String segmentId;

}
