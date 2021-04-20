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
@com.azure.spring.data.cosmos.core.mapping.Container(containerName = "container", ru = "400")
public class Container {

    @JsonProperty(value = "visit_state")
    private String visitState;
    @JsonProperty(value = "TEU")
    private int teu;
    @JsonProperty(value = "arrive_pos_loctype")
    private String arrivePosLoctype;
    @JsonProperty(value = "requires_power")
    private boolean requiresPower;
    @JsonProperty(value = "goods_and_ctr_wt_kg")
    private long goodsAndCtrWtKg;
    @JsonProperty(value = "EquipmentType")
    private String equipmentType;
    @JsonProperty(value = "intend_ob_cv")
    private long intendObCv;
    @JsonProperty(value = "last_pos_slot")
    private String lastPosSlot;
    @JsonProperty(value = "arrive_pos_loc_gkey")
    private long arrivePosLocGkey;
    @JsonProperty(value = "arrive_pos_slot")
    private String arrivePosSlot;
    @Id
    private String id;
    @JsonProperty(value = "ArriveTruckGkey")
    private String arriveTruckGkey;
    @JsonProperty(value = "delete_flag")
    private String deleteFlag;
    @JsonProperty(value = "declrd_ib_cv")
    private int declrdIbCv;
    @JsonProperty(value = "OperatorName")
    private String operatorName;
    @JsonProperty(value = "create_time")
    private String createTime;
    @JsonProperty(value = "bookingNumberGkey")
    private String bookingNumberGkey;
    @JsonProperty(value = "POD")
    private String pod;
    @JsonProperty(value = "OperatorLineID")
    private String operatorLineId;
    @JsonProperty(value = "terminal_name")
    private String terminalName;
    @JsonProperty(value = "freight_kind")
    private String freightKind;
    @JsonProperty(value = "actual_ib_cv")
    private String actualIbCv;
    @JsonProperty(value = "changed")
    private long changed;
    @JsonProperty(value = "intended_ob_cv")
    private long intendedObCv;
    @JsonProperty(value = "batch_id")
    private long batchId;
    @JsonProperty(value = "actual_ob_cv")
    private long actualObCv;
    @JsonProperty(value = "OperatorID")
    private String operatorId;
    @JsonProperty(value = "insert_ts")
    private long insertTs;
    @JsonProperty(value = "FacilityID")
    private String facilityId;
    @JsonProperty(value = "arrive_pos_locid")
    private String arrivePosLocId;
    @JsonProperty(value = "stopped_vessel")
    private boolean stoppedVessel;
    @JsonProperty(value = "last_pos_loc_gkey")
    private long lastPosLocGkey;
    @JsonProperty(value = "stopped_rail")
    private boolean stoppedRail;
    @JsonProperty(value = "last_pos_locid")
    private String lastPosLocId;
    @JsonProperty(value = "goods_ctr_wt_kg_advised")
    private long goodsCtrWtKgAdvised;
    @JsonProperty(value = "transit_state")
    private String transitState;
    @JsonProperty(value = "GoodsGkey")
    private String goodsGkey;
    @JsonProperty(value = "run_id")
    private int runId;
    @JsonProperty(value = "last_pos_loctype")
    private String lastPosLocType;
    @JsonProperty(value = "update_ts")
    private long updateTs;
    @PartitionKey
    @JsonProperty(value = "partition_key")
    private String partitionKey;
    @JsonProperty(value = "LastPosVesselGkey")
    private String lastPosVesselGkey;
    @JsonProperty(value = "flex_string01")
    private String flexString01;
    @JsonProperty(value = "flex_string02")
    private String flexString02;
    @JsonProperty(value = "flex_string03")
    private String flexString03;
    @JsonProperty(value = "flex_string04")
    private String flexString04;
    @JsonProperty(value = "flex_string05")
    private String flexString05;
    @JsonProperty(value = "flex_string06")
    private String flexString06;
    @JsonProperty(value = "flex_string07")
    private String flexString07;
    @JsonProperty(value = "flex_string08")
    private String flexString08;
    @JsonProperty(value = "flex_string09")
    private String flexString09;
    @JsonProperty(value = "flex_string10")
    private String flexString10;
    @JsonProperty(value = "flex_string11")
    private String flexString11;
    @JsonProperty(value = "flex_string12")
    private String flexString12;
    @JsonProperty(value = "flex_string13")
    private String flexString13;
    @JsonProperty(value = "flex_string14")
    private String flexString14;
    @JsonProperty(value = "flex_string15")
    private String flexString15;
    @JsonProperty(value = "time_state_change")
    private long timeStateChange;
    @JsonProperty(value = "ContainerNbr")
    private String containerNbr;
    @JsonProperty(value = "time_out")
    private long timeOut;
    @JsonProperty(value = "UniqueKey")
    private String uniqueKey;
    @JsonProperty(value = "stopped_road")
    private boolean stoppedRoad;
    @JsonProperty(value = "job_id")
    private int jobId;
    @JsonProperty(value = "ComplexID")
    private String complexId;
    @JsonProperty(value = "time_in")
    private long timeIn;
    @JsonProperty(value = "category")
    private String category;



}
