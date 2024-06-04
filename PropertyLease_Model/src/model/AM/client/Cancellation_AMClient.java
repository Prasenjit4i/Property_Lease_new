package model.AM.client;

import java.math.BigDecimal;

import java.util.ArrayList;

import model.AM.common.Cancellation_AM;

import oracle.jbo.client.remote.ApplicationModuleImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Sep 24 18:51:14 IST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class Cancellation_AMClient extends ApplicationModuleImpl implements Cancellation_AM {
    /**
     * This is the default constructor (do not remove).
     */
    public Cancellation_AMClient() {
    }


    public ArrayList getdetails(BigDecimal p_lease_id, BigDecimal p_org_id,
                                String p_termination_date) {
        Object _ret =
            this.riInvokeExportedMethod(this,"getdetails",new String [] {"java.math.BigDecimal","java.math.BigDecimal","java.lang.String"},new Object[] {p_lease_id, p_org_id, p_termination_date});
        return (ArrayList)_ret;
    }

    public String getCodeSegmentCombination(String pBusinessUnitId,
                                            String pChargeType,
                                            String pUnitId) {
        Object _ret =
            this.riInvokeExportedMethod(this,"getCodeSegmentCombination",new String [] {"java.lang.String","java.lang.String","java.lang.String"},new Object[] {pBusinessUnitId, pChargeType, pUnitId});
        return (String)_ret;
    }

    public void getcancellation(BigDecimal leaseid, BigDecimal DaysConsumed,
                                BigDecimal DaysRemaining,
                                BigDecimal DailyRentalRate,
                                BigDecimal DailyDiscountingRate) {
        Object _ret =
            this.riInvokeExportedMethod(this,"getcancellation",new String [] {"java.math.BigDecimal","java.math.BigDecimal","java.math.BigDecimal","java.math.BigDecimal","java.math.BigDecimal"},new Object[] {leaseid, DaysConsumed, DaysRemaining, DailyRentalRate, DailyDiscountingRate});
        return;
    }

    public void getStatusChange(BigDecimal cancelid, BigDecimal leaseid,
                                BigDecimal unitid) {
        Object _ret =
            this.riInvokeExportedMethod(this,"getStatusChange",new String [] {"java.math.BigDecimal","java.math.BigDecimal","java.math.BigDecimal"},new Object[] {cancelid, leaseid, unitid});
        return;
    }

    public void cancellation_proposal(Long P_cancellationId) {
        Object _ret =
            this.riInvokeExportedMethod(this,"cancellation_proposal",new String [] {"java.lang.Long"},new Object[] {P_cancellationId});
        return;
    }

    public String directRejectionFromDraft(String cnId, String userId,
                                           String funcId, String reasonCN) {
        Object _ret =
            this.riInvokeExportedMethod(this,"directRejectionFromDraft",new String [] {"java.lang.String","java.lang.String","java.lang.String","java.lang.String"},new Object[] {cnId, userId, funcId, reasonCN});
        return (String)_ret;
    }

    public String updateCancelledTagOnApproved(String cnId) {
        Object _ret =
            this.riInvokeExportedMethod(this,"updateCancelledTagOnApproved",new String [] {"java.lang.String"},new Object[] {cnId});
        return (String)_ret;
    }

    public String submitCnForAppr(String cnId, String userName) {
        Object _ret =
            this.riInvokeExportedMethod(this,"submitCnForAppr",new String [] {"java.lang.String","java.lang.String"},new Object[] {cnId, userName});
        return (String)_ret;
    }

    public String responseCnForAppr(String cnId, String reason,
                                    String apr_rej) {
        Object _ret =
            this.riInvokeExportedMethod(this,"responseCnForAppr",new String [] {"java.lang.String","java.lang.String","java.lang.String"},new Object[] {cnId, reason, apr_rej});
        return (String)_ret;
    }
}
