package com.amsaadapter.amsaadaptercolumbia.viewmodel;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@NamedStoredProcedureQuery(name = "record_match_sp", procedureName = "CCSC_AMSA_Record_Match",
        parameters = {@StoredProcedureParameter(mode = ParameterMode.IN, name = "SearchIDNum", type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "SearchLastName", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "SearchFirstName", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "SearchSSN", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "SearchDateOfBirth", type = String.class)})
public class SearchParams {
    @Id
    private long id;
    private Integer searchId;
    private String searchFirstName;
    private String searchLastName;
    private String searchSSN;
    private String searchDateOfBirth;
}
