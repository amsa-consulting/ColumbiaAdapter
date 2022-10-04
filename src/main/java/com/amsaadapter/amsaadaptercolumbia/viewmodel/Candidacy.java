package com.amsaadapter.amsaadaptercolumbia.viewmodel;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@NamedStoredProcedureQuery(name = "candidacy_sp", procedureName = "CCSC_AMSA_Candidacy_Ins_Upd",
        parameters = {@StoredProcedureParameter(mode = ParameterMode.IN, name = "ID_Num", type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "CC_Section", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Application_Term", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Transfer_Flag", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Degree_Program", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Live_On_Campus", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Sports_Participant", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Sport", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Job_Org", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Job_From_Date", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Job_To_Date", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Job_Title", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Tag", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Program_Code", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Division_Code", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Location_Code", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Candidacy_Code", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Transfer_Code", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Staff_Assigned_User", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Stage", type = String.class)
                })
public class Candidacy {
    @Id
    private long id;
    private Integer idNumber;
    private String ccSection;
    private String applicationTerm;
    private String transferFlag;
    private String degreeProgram;
    private String liveOnCampus;
    private String sportsParticipant;
    private String sport;
    private String jobOrg;
    private String jobFromDate;
    private String jobToDate;
    private String jobTitle;
    private String tag;
    private String programCode;
    private String divisionCode;
    private String locationCode;
    private String candidacyCode;
    private String transferCode;
    private String staffAssignedUser;
    private String stage;
}
