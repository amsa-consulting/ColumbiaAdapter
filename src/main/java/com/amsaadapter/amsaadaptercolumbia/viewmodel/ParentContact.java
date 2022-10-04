package com.amsaadapter.amsaadaptercolumbia.viewmodel;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@NamedStoredProcedureQuery(name = "parent_contact_sp", procedureName = "CCSC_AMSA_Parent_Contact_Ins_Upd",
        parameters = {@StoredProcedureParameter(mode = ParameterMode.IN, name = "ID_Num", type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Father_Last_Name", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Father_First_Name", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Father_Middle_Name", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Father_EMAIL", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Father_Addr_Line_2", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Father_Addr_Line_3", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Father_City", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Father_State", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Father_PostalCode", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Father_Phone", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Mother_Last_Name", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Mother_First_Name", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Mother_Middle_Name", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Mother_EMAIL", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Mother_Addr_Line_2", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Mother_Addr_Line_3", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Mother_City", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Mother_State", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Mother_PostalCode", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "Mother_Phone", type = String.class)})
public class ParentContact {
    @Id
    private long id;
    private Integer idNumber;
    private String fatherLastName;
    private String fatherFirstName;
    private String fatherMiddleName;
    private String fatherEmail;
    private String fatherAddrLine2;
    private String fatherAddrLine3;
    private String fatherCity;
    private String fatherState;
    private String fatherPostalCode;
    private String fatherPhone;
    private String motherLastName;
    private String motherFirstName;
    private String motherMiddleName;
    private String motherEmail;
    private String motherAddrLine2;
    private String motherAddrLine3;
    private String motherCity;
    private String motherState;
    private String motherPostalCode;
    private String motherPhone;
}
