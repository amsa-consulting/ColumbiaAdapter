package com.amsaadapter.amsaadaptercolumbia.viewmodel;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@NamedStoredProcedureQuery(name = "biograph_master_sp", procedureName = "CCSC_AMSA_Biograph_Master_Ins_Upd",
        parameters = {@StoredProcedureParameter(mode = ParameterMode.IN, name = "Jenzabar_ID", type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Gender", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "DateOfBirth", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Citizenship", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "SSN", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Hispanic", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Ethnic", type = String.class)})
public class BiographMaster {
    @Id
    private long id;
    private Integer janzabarId;
    private String gender;
    private String dateOfBirth;
    private String citizenship;
    private String ssn;
    private String hispanic;
    private String ethnic;
}
