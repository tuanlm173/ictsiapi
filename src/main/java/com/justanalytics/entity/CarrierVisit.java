package com.justanalytics.entity;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Container(containerName = "carrier_visit", ru = "400")
public class CarrierVisit {

    @JsonProperty(value = "run_id")
    private int runId;
    @JsonProperty(value = "update_ts")
    private long updateTs;
    @PartitionKey
    @JsonProperty(value = "partition_key")
    private String partitionKey;
    @JsonProperty(value = "batch_id")
    private int batchId;
    @JsonProperty(value = "Carrier_Mode")
    private String carrierMode;
    @JsonProperty(value = "Visit_Nbr")
    private int visitNumber;
    @JsonProperty(value = "ATA")
    private long ata;
    @JsonProperty(value = "Facility_ID")
    private String facilityId;
    @JsonProperty(value = "insert_ts")
    private long insertTs;
    @JsonProperty(value = "ATD")
    private long atd;
    @JsonProperty(value = "Visit_Phase")
    private String visitPhase;
    @JsonProperty(value = "terminal_name")
    private String terminalName;
    @JsonProperty(value = "UniqueKey")
    private String uniqueKey;
    @JsonProperty(value = "job_id")
    private int jobId;
    @JsonProperty(value = "Carrier_Visit_ID")
    private String carrierVisitId;
    @JsonProperty(value = "Complex_ID")
    private String complexId;
    @JsonProperty(value = "Terminal_Operator_ID")
    private String terminalOperatorId;
    @JsonProperty(value = "delete_flag")
    private String deleteFlag;
    @Id
    private String id;
}
