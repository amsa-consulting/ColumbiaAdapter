package com.amsaadapter.amsaadaptercolumbia.viewmodel;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@NamedStoredProcedureQuery(name = "named_master_sp", procedureName = "CCSC_AMSA_Name_Master_Ins_Upd",
        parameters = {@StoredProcedureParameter(mode = ParameterMode.IN, name = "Jenzabar_ID", type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "LastName", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "FirstName", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Middle_Name", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Suffix", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Preferred_Name", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "SSN", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "DateOfBirth", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Alias", type = String.class)
})
public class NameMaster {

    @Id
    private long id;
    private Integer janzabarId;
    private String firstName;
    private String lastName;
    private String middleName;
    private String suffix;
    private String preferredName;
    private String ssn;
    private String dateOfBirth;
    private String alias;
}
