package com.justanalytics.entity;

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
@com.azure.spring.data.cosmos.core.mapping.Container(containerName = "vessel_visit", ru = "400")
public class VesselVisit {

    @JsonProperty(value = "batch_id")
    private int batchId;
    @JsonProperty(value = "Visit_Nbr")
    private String visitNbr;
    @JsonProperty(value = "Facility_ID")
    private String facilityId;
    @JsonProperty(value = "insert_ts")
    private long insertTs;
    @JsonProperty(value = "service_Name")
    private String serviceName;
    @JsonProperty(value = "End_Work")
    private long endWork;
    @JsonProperty(value = "Visit_Phase")
    private String visitPhase;
    @JsonProperty(value = "Lloyds_ID")
    private String lloydsId;
    @JsonProperty(value = "service_ID")
    private String serviceId;
    @JsonProperty(value = "Carrier_Visit_ID")
    private String carrierVisitId;
    @Id
    private String id;
    @JsonProperty(value = "CountryCode")
    private String countryCode;
    @JsonProperty(value = "delete_flag")
    private String deleteFlag;
    @JsonProperty(value = "Carrier_Name")
    private String carrierName;
    @JsonProperty(value = "ib_vyg")
    private String ibVyg;
    @JsonProperty(value = "Start_work")
    private long startWork;
    @JsonProperty(value = "ob_vyg")
    private String obVyg;
    @JsonProperty(value = "run_id")
    private int runId;
    @JsonProperty(value = "update_ts")
    private long updateTs;
    @PartitionKey
    @JsonProperty(value = "partition_key")
    private String partitionKey;
    @JsonProperty(value = "Carrier_Mode")
    private String carrierMode;
    @JsonProperty(value = "Carrier_Operator_Name")
    private String carrierOperatorName;
    @JsonProperty(value = "ATA")
    private long ata;
    @JsonProperty(value = "ATD")
    private long atd;
    @JsonProperty(value = "Quay_ID")
    private String quayId;
    @JsonProperty(value = "ETA")
    private long eta;
    @JsonProperty(value = "ETD")
    private long etd;
    @JsonProperty(value = "terminal_name")
    private String terminalName;
    @JsonProperty(value = "UniqueKey")
    private String uniqueKey;
    @JsonProperty(value = "job_id")
    private int jobId;
    @JsonProperty(value = "Carrier_Operator_ID")
    private String carrierOperatorId;
    @JsonProperty(value = "Complex_ID")
    private String complexId;
    @JsonProperty(value = "Terminal_Operator_ID")
    private String terminalOperatorId;

}
