package com.amsaadapter.amsaadaptercolumbia.controller;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.StoredProcedureQuery;

import com.amsaadapter.amsaadaptercolumbia.viewmodel.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/api"})
public class JdbcSpController {
    public JdbcSpController(EntityManager em) {
        /*  15 */     this.em = em;
        /*     */   }

    Logger logger = LoggerFactory.getLogger(JdbcSpController.class);
    private final EntityManager em;

    @GetMapping({"hello-world/msg-requested/{msgRequested}"})
    @ResponseBody
    public List test(@PathVariable String msgRequested) {
        StoredProcedureQuery proc = this.em.createNamedStoredProcedureQuery("hello_world_sp");

        proc.setParameter("MsgRequested", msgRequested);

        System.out.println("===>>> start exec");
        proc.execute();
        System.out.println("===>>> end exec");

        return proc.getResultList();
    }
    /*
    @GetMapping({"recored-fetch/{searchIDNum}"})
    @ResponseBody
    public List recordFetch(@PathVariable String searchIDNum) {
        StoredProcedureQuery proc = this.em.createNamedStoredProcedureQuery("recored_fetch_sp");

        proc.setParameter("SearchIDNum", searchIDNum);

        logger.info("CCSC_AMSA_Record_Fetch {}",searchIDNum.toString());

        System.out.println("===>>> start exec");
        proc.execute();
        System.out.println("===>>> end exec");

        return proc.getResultList();
    }
    */
    @PostMapping({"record-fetch"})
    @ResponseBody
    public List recordFetch(@RequestBody SearchParams searchParams) {
        StoredProcedureQuery proc = this.em.createNamedStoredProcedureQuery("record_fetch_sp");

        proc.setParameter("SearchIDNum", searchParams.getSearchId());
        //logger.info("record-fetch {}", proc);

        logger.info("CCSC_AMSA_Record_Fetch {}",searchParams.toString());

        System.out.println("===>>> start exec");
        proc.execute();
        System.out.println("===>>> end exec");
        return proc.getResultList();
    }
    @PostMapping({"record-match"})
    @ResponseBody
    public List recordMatch(@RequestBody SearchParams searchParams) {
        StoredProcedureQuery proc = this.em.createNamedStoredProcedureQuery("record_match_sp");

        proc.setParameter("SearchIDNum", searchParams.getSearchId());
        proc.setParameter("SearchLastName", searchParams.getSearchLastName());
        proc.setParameter("SearchFirstName", searchParams.getSearchFirstName());
        proc.setParameter("SearchSSN", searchParams.getSearchSSN());
        proc.setParameter("SearchDateOfBirth", searchParams.getSearchDateOfBirth());
        //logger.info("record-match {}", proc);

        logger.info("CCSC_AMSA_Record_Match {}",searchParams.toString());

        System.out.println("===>>> start exec");
        proc.execute();
        System.out.println("===>>> end exec");
          return proc.getResultList();
        }


    @PostMapping({"name-master"})
    @ResponseBody
    public List nameMaster(@RequestBody NameMaster nameMaster) {
        StoredProcedureQuery proc = this.em.createNamedStoredProcedureQuery("named_master_sp");

        proc.setParameter("Jenzabar_ID", nameMaster.getJanzabarId());
        proc.setParameter("LastName", nameMaster.getLastName());
        proc.setParameter("FirstName", nameMaster.getFirstName());
        proc.setParameter("Middle_Name", nameMaster.getMiddleName());
        proc.setParameter("Suffix", nameMaster.getSuffix());
        proc.setParameter("Preferred_Name", nameMaster.getPreferredName());
        proc.setParameter("SSN", nameMaster.getSsn());
        proc.setParameter("DateOfBirth", nameMaster.getDateOfBirth());
        proc.setParameter("Alias", nameMaster.getAlias());

        logger.info("CCSC_AMSA_Name_Master_Ins_Upd {}",nameMaster.toString());
        System.out.println("===>>> start exec");
        proc.execute();
        System.out.println("===>>> end exec");

        return proc.getResultList();
    }


    @PostMapping({"address-contact"})
    @ResponseBody
    public List addressContact(@RequestBody AddressContact addressContact) {
        StoredProcedureQuery proc = this.em.createNamedStoredProcedureQuery("address_contact_sp");

        proc.setParameter("ID_Num", addressContact.getIdNum());
        proc.setParameter("EMAIL", addressContact.getEmail());
        proc.setParameter("DaytimePhone", addressContact.getDaytimePhone());
        proc.setParameter("MobilePhone", addressContact.getMobilePhone());
        proc.setParameter("EveningPhone", addressContact.getEveningPhone());
        proc.setParameter("Addr_Line_1", addressContact.getAddressLine1());
        proc.setParameter("Addr_Line_2", addressContact.getAddressLine2());
        proc.setParameter("City", addressContact.getCity());
        proc.setParameter("State", addressContact.getState());
        proc.setParameter("County", addressContact.getCounty());
        proc.setParameter("PostalCode", addressContact.getPostalCode());
        proc.setParameter("AddrCountry", addressContact.getAddrCountry());

        logger.info("CCSC_AMSA_Address_Contact_Ins_Upd {}",addressContact.toString());

        System.out.println("===>>> start exec");
        proc.execute();
        System.out.println("===>>> end exec");

        return proc.getResultList();
    }


    @PostMapping({"biograph-master"})
    @ResponseBody
    public List bioGraphMaster(@RequestBody BiographMaster biographMaster) {
        StoredProcedureQuery proc = this.em.createNamedStoredProcedureQuery("biograph_master_sp");

        proc.setParameter("Jenzabar_ID", biographMaster.getJanzabarId());
        proc.setParameter("Gender", biographMaster.getGender());
        proc.setParameter("DateOfBirth", biographMaster.getDateOfBirth());
        proc.setParameter("Citizenship", biographMaster.getCitizenship());
        proc.setParameter("SSN", biographMaster.getSsn());
        proc.setParameter("Hispanic", biographMaster.getHispanic());
        proc.setParameter("Ethnic", biographMaster.getEthnic());

        System.out.println("SSN: " + proc.getParameterValue("SSN"));

        logger.info("CCSC_AMSA_Biograph_Master_Ins_Upd {}",biographMaster.toString());

        System.out.println("===>>> start exec");
        proc.execute();
        System.out.println("===>>> end exec");

        return proc.getResultList();
    }


    @PostMapping({"parent-contact"})
    @ResponseBody
    public List parentContact(@RequestBody ParentContact parentContact) {
        StoredProcedureQuery proc = this.em.createNamedStoredProcedureQuery("parent_contact_sp");

        proc.setParameter("ID_Num", parentContact.getIdNumber());
        proc.setParameter("Father_Last_Name", parentContact.getFatherLastName());
        proc.setParameter("Father_First_Name", parentContact.getFatherFirstName());
        proc.setParameter("Father_Middle_Name", parentContact.getFatherMiddleName());
        proc.setParameter("Father_EMAIL", parentContact.getFatherEmail());
        proc.setParameter("Father_Addr_Line_2", parentContact.getFatherAddrLine2());
        proc.setParameter("Father_Addr_Line_3", parentContact.getFatherAddrLine3());
        proc.setParameter("Father_City", parentContact.getFatherCity());
        proc.setParameter("Father_State", parentContact.getFatherState());
        proc.setParameter("Father_PostalCode", parentContact.getFatherPostalCode());
        proc.setParameter("Father_Phone", parentContact.getFatherPhone());
        proc.setParameter("Mother_Last_Name", parentContact.getMotherLastName());
        proc.setParameter("Mother_First_Name", parentContact.getMotherFirstName());
        proc.setParameter("Mother_Middle_Name", parentContact.getMotherMiddleName());
        proc.setParameter("Mother_EMAIL", parentContact.getMotherEmail());
        proc.setParameter("Mother_Addr_Line_2", parentContact.getMotherAddrLine2());
        proc.setParameter("Mother_Addr_Line_3", parentContact.getMotherAddrLine3());
        proc.setParameter("Mother_City", parentContact.getMotherCity());
        proc.setParameter("Mother_State", parentContact.getMotherState());
        proc.setParameter("Mother_PostalCode", parentContact.getMotherPostalCode());
        proc.setParameter("Mother_Phone", parentContact.getMotherPhone());

        logger.info("CCSC_AMSA_Parent_Contact_Ins_Upd {}",parentContact.toString());

        System.out.println("===>>> start exec");
        proc.execute();
        System.out.println("===>>> end exec");

        return proc.getResultList();
    }


    @PostMapping({"candidacy"})
    @ResponseBody
    public List candidacy(@RequestBody Candidacy candidacy) {
        StoredProcedureQuery proc = this.em.createNamedStoredProcedureQuery("candidacy_sp");

        proc.setParameter("ID_Num", candidacy.getIdNumber());
        proc.setParameter("CC_Section", candidacy.getCcSection());
        proc.setParameter("Application_Term", candidacy.getApplicationTerm());
        proc.setParameter("Transfer_Flag", candidacy.getTransferFlag());
        proc.setParameter("Degree_Program", candidacy.getDegreeProgram());
        proc.setParameter("Live_On_Campus", candidacy.getLiveOnCampus());
        proc.setParameter("Sports_Participant", candidacy.getSportsParticipant());
        proc.setParameter("Sport", candidacy.getSport());
        proc.setParameter("Job_Org", candidacy.getJobOrg());
        proc.setParameter("Job_From_Date", candidacy.getJobFromDate());
        proc.setParameter("Job_To_Date", candidacy.getJobToDate());
        proc.setParameter("Job_Title", candidacy.getJobTitle());
        proc.setParameter("Tag", candidacy.getTag());
        proc.setParameter("Program_Code", candidacy.getProgramCode());
        proc.setParameter("Division_Code", candidacy.getDivisionCode());
        proc.setParameter("Location_Code", candidacy.getLocationCode());
        proc.setParameter("Candidacy_Code", candidacy.getCandidacyCode());
        proc.setParameter("Transfer_Code", candidacy.getTransferCode());
        proc.setParameter("Staff_Assigned_User", candidacy.getStaffAssignedUser());
        proc.setParameter("Stage", candidacy.getStage());

        logger.info("CCSC_AMSA_Candidacy_Ins_Upd {}",candidacy.toString());

        System.out.println("===>>> start exec");
        proc.execute();
        System.out.println("===>>> end exec");

        return proc.getResultList();
    }


    @PostMapping({"academic-history"})
    @ResponseBody
    public List academicHistory(@RequestBody AcademicHistory academicHistory) {
        StoredProcedureQuery proc = this.em.createNamedStoredProcedureQuery("academic_history_sp");

        proc.setParameter("Jenzabar_ID", academicHistory.getJanzabarId());
        proc.setParameter("School_Code", academicHistory.getSchoolCode());
        proc.setParameter("Degree", academicHistory.getDegree());
        proc.setParameter("GPA", academicHistory.getGpa());

        logger.info("CCSC_AMSA_Academic_History_Ins_Upd {}",academicHistory.toString());

        System.out.println("===>>> start exec");
        proc.execute();
        System.out.println("===>>> end exec");

        return proc.getResultList();
    }
}
