package com.amsaadapter.amsaadaptercolumbia.viewmodel;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@NamedStoredProcedureQuery(name = "record_fetch_sp", procedureName = "CCSC_AMSA_Record_Fetch",
        parameters = {@StoredProcedureParameter(mode = ParameterMode.IN, name = "SearchIDNum", type = Integer.class)})
public class RecordFetch {
    @Id
    private long id;
    private Integer searchId;
}
