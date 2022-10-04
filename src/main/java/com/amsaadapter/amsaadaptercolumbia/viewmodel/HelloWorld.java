package com.amsaadapter.amsaadaptercolumbia.viewmodel;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@NamedStoredProcedureQuery(name = "hello_world_sp", procedureName = "CCSC_AMSA_Hello_World",
        parameters = {@StoredProcedureParameter(mode = ParameterMode.IN, name = "MsgRequested", type = String.class)})
public class HelloWorld {
    @Id
    private Long id;
}
