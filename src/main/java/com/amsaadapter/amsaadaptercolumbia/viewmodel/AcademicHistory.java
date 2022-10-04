package com.amsaadapter.amsaadaptercolumbia.viewmodel;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@NamedStoredProcedureQuery(name = "academic_history_sp",
        procedureName = "CCSC_AMSA_Academic_History_Ins_Upd",
        parameters = {@StoredProcedureParameter(mode = ParameterMode.IN, name = "Jenzabar_ID", type = Integer.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "School_Code", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "Degree", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "GPA", type = String.class)})
public class AcademicHistory {
    @Id
    private long id;
    private Integer janzabarId;
    private String schoolCode;
    private String degree;
    private String gpa;
}
