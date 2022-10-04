package com.amsaadapter.amsaadaptercolumbia.viewmodel;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@NamedStoredProcedureQuery(name = "address_contact_sp", procedureName = "CCSC_AMSA_Address_Contact_Ins_Upd",
        parameters = {@StoredProcedureParameter(mode = ParameterMode.IN, name = "ID_Num", type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "EMAIL", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "DaytimePhone", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "MobilePhone", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "EveningPhone", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Addr_Line_1", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Addr_Line_2", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "City", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "State", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "County", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "PostalCode", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "AddrCountry", type = String.class)})
public class AddressContact {

    @Id
    private long id;
    private Integer idNum;
    private String email;
    private String daytimePhone;
    private String mobilePhone;
    private String eveningPhone;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String county;
    private String postalCode;
    private String addrCountry;
}
