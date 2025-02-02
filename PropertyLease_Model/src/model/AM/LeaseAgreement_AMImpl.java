package model.AM;

import java.sql.CallableStatement;

import java.sql.SQLException;
import java.sql.Types;

import model.AM.common.LeaseAgreement_AM;

import model.VO.BookingCustomer_VOImpl;
import model.VO.BookingDetail_VOImpl;
import model.VO.BookingHeader_VOImpl;
import model.VO.Booking_Milestone_VOImpl;
import model.VO.ExtCanVOImpl;
import model.VO.LeaseAgreement_VOImpl;
import model.VO.MoveInOut_VOImpl;
import model.VO.OfferHrd_VOImpl;
import model.VO.PlDiscounts_VOImpl;
import model.VO.PropertyMaster_VOImpl;
import model.VO.PropertyUnits_VOImpl;

import model.VO.Receipt_VOImpl;
import model.VO.RecommendHeader_VOImpl;

import oracle.jbo.JboException;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jul 11 15:29:53 IST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class LeaseAgreement_AMImpl extends ApplicationModuleImpl implements LeaseAgreement_AM {
    /**
     * This is the default constructor (do not remove).
     */
    public LeaseAgreement_AMImpl() {
    }

    /**
     * Container's getter for LeaseAgreement_VO1.
     * @return LeaseAgreement_VO1
     */
    public LeaseAgreement_VOImpl getLeaseAgreement_VO1() {
        return (LeaseAgreement_VOImpl)findViewObject("LeaseAgreement_VO1");
    }

    /**
     * Container's getter for getFunctionCodeROVO1.
     * @return getFunctionCodeROVO1
     */
    public ViewObjectImpl getgetFunctionCodeROVO1() {
        return (ViewObjectImpl)findViewObject("getFunctionCodeROVO1");
    }

    /**
     * Container's getter for Booking_Milestone_VO1.
     * @return Booking_Milestone_VO1
     */
    public ViewObjectImpl getBooking_Milestone_VO1() {
        return (ViewObjectImpl)findViewObject("Booking_Milestone_VO1");
    }

    /**
     * Container's getter for SearchLeaseAgreement_ROVO1.
     * @return SearchLeaseAgreement_ROVO1
     */
    public ViewObjectImpl getSearchLeaseAgreement_ROVO1() {
        return (ViewObjectImpl)findViewObject("SearchLeaseAgreement_ROVO1");
    }

    /**
     * Container's getter for Booking_Milestone_VO2.
     * @return Booking_Milestone_VO2
     */
    public ViewObjectImpl getBooking_Milestone_VO2() {
        return (ViewObjectImpl)findViewObject("Booking_Milestone_VO2");
    }

    /**
     * Container's getter for BookingDetail_VO2.
     * @return BookingDetail_VO2
     */
    public ViewObjectImpl getBookingDetail_VO2() {
        return (ViewObjectImpl)findViewObject("BookingDetail_VO2");
    }

    /**
     * Container's getter for MoveInOut_VO1.
     * @return MoveInOut_VO1
     */
    public MoveInOut_VOImpl getMoveInOut_VO1() {
        return (MoveInOut_VOImpl)findViewObject("MoveInOut_VO1");
    }

    /**
     * Container's getter for MoveInOut_VO2.
     * @return MoveInOut_VO2
     */
    public MoveInOut_VOImpl getMoveInOut_VO2() {
        return (MoveInOut_VOImpl)findViewObject("MoveInOut_VO2");
    }

    /**
     * Container's getter for PropertyMaster_VO1.
     * @return PropertyMaster_VO1
     */
    public PropertyMaster_VOImpl getPropertyMaster_VO1() {
        return (PropertyMaster_VOImpl)findViewObject("PropertyMaster_VO1");
    }

    /**
     * Container's getter for PropertyUnits_VO1.
     * @return PropertyUnits_VO1
     */
    public PropertyUnits_VOImpl getPropertyUnits_VO1() {
        return (PropertyUnits_VOImpl)findViewObject("PropertyUnits_VO1");
    }

    /**
     * Container's getter for BookingMileStoneROVO1.
     * @return BookingMileStoneROVO1
     */
    public ViewObjectImpl getBookingMileStoneROVO1() {
        return (ViewObjectImpl)findViewObject("BookingMileStoneROVO1");
    }

    /**
     * Container's getter for BookingDetailsROVO1.
     * @return BookingDetailsROVO1
     */
    public ViewObjectImpl getBookingDetailsROVO1() {
        return (ViewObjectImpl)findViewObject("BookingDetailsROVO1");
    }

    /**
     * Container's getter for getID1.
     * @return getID1
     */
    public ViewObjectImpl getgetID1() {
        return (ViewObjectImpl)findViewObject("getID1");
    }

    /**
     * Container's getter for findCustomerROVO1.
     * @return findCustomerROVO1
     */
    public ViewObjectImpl getfindCustomerROVO1() {
        return (ViewObjectImpl)findViewObject("findCustomerROVO1");
    }

    /**
     * Container's getter for custSiteROVO1.
     * @return custSiteROVO1
     */
    public ViewObjectImpl getcustSiteROVO1() {
        return (ViewObjectImpl)findViewObject("custSiteROVO1");
    }

    /**
     * Container's getter for Cancel_VO.
     * @return Cancel_VO
     */
    public ViewObjectImpl getCancel_VO() {
        return (ViewObjectImpl)findViewObject("Cancel_VO");
    }

    /**
     * Container's getter for ExtVO.
     * @return ExtVO
     */
    public ViewObjectImpl getExtVO() {
        return (ViewObjectImpl)findViewObject("ExtVO");
    }

    /**
     * Container's getter for Booking_Milestone_VO3.
     * @return Booking_Milestone_VO3
     */
    public ViewObjectImpl getBooking_Milestone_VO3() {
        return (ViewObjectImpl)findViewObject("Booking_Milestone_VO3");
    }

    /**
     * Container's getter for Receipt_VO1.
     * @return Receipt_VO1
     */
    public ViewObjectImpl getReceipt_VO1() {
        return (ViewObjectImpl)findViewObject("Receipt_VO1");
    }

    /**
     * Container's getter for Receipt_VO2.
     * @return Receipt_VO2
     */
    public ViewObjectImpl getReceipt_VO2() {
        return (ViewObjectImpl)findViewObject("Receipt_VO2");
    }

    /**
     * Container's getter for Receipt_VO3.
     * @return Receipt_VO3
     */
    public ViewObjectImpl getReceipt_VO3() {
        return (ViewObjectImpl)findViewObject("Receipt_VO3");
    }

    /**
     * Container's getter for ReceiptDtlVO1.
     * @return ReceiptDtlVO1
     */
    public ViewObjectImpl getReceiptDtlVO1() {
        return (ViewObjectImpl)findViewObject("ReceiptDtlVO1");
    }

    /**
     * Container's getter for ReceiptDtlVO2.
     * @return ReceiptDtlVO2
     */
    public ViewObjectImpl getReceiptDtlVO2() {
        return (ViewObjectImpl)findViewObject("ReceiptDtlVO2");
    }

    /**
     * Container's getter for ReceiptDtlVO3.
     * @return ReceiptDtlVO3
     */
    public ViewObjectImpl getReceiptDtlVO3() {
        return (ViewObjectImpl)findViewObject("ReceiptDtlVO3");
    }

    /**
     * Container's getter for ReceiptDtlVO4.
     * @return ReceiptDtlVO4
     */
    public ViewObjectImpl getReceiptDtlVO4() {
        return (ViewObjectImpl)findViewObject("ReceiptDtlVO4");
    }

    /**
     * Container's getter for BookingCustomer_VO1.
     * @return BookingCustomer_VO1
     */
    public BookingCustomer_VOImpl getBookingCustomer_VO1() {
        return (BookingCustomer_VOImpl)findViewObject("BookingCustomer_VO1");
    }

    /**
     * Container's getter for OfferHrd_VO1.
     * @return OfferHrd_VO1
     */
    public OfferHrd_VOImpl getOfferHrd_VO1() {
        return (OfferHrd_VOImpl)findViewObject("OfferHrd_VO1");
    }

    /**
     * Container's getter for BookingHeader_VO1.
     * @return BookingHeader_VO1
     */
    public BookingHeader_VOImpl getBookingHeader_VO1() {
        return (BookingHeader_VOImpl)findViewObject("BookingHeader_VO1");
    }

    /**
     * Container's getter for BookingHdrRecomm_ROVO1.
     * @return BookingHdrRecomm_ROVO1
     */
    public ViewObjectImpl getBookingHdrRecomm_ROVO1() {
        return (ViewObjectImpl)findViewObject("BookingHdrRecomm_ROVO1");
    }

    /**
     * Container's getter for BookingDetail_VO1.
     * @return BookingDetail_VO1
     */
    public ViewObjectImpl getBookingDetail_VO1() {
        return (ViewObjectImpl)findViewObject("BookingDetail_VO1");
    }

    /**
     * Container's getter for BookingMilestone_LeaseAgreement_VL1.
     * @return BookingMilestone_LeaseAgreement_VL1
     */
    public ViewLinkImpl getBookingMilestone_LeaseAgreement_VL1() {
        return (ViewLinkImpl)findViewLink("BookingMilestone_LeaseAgreement_VL1");
    }

    /**
     * Container's getter for BookingMilestone_LeaseAgreement_VL2.
     * @return BookingMilestone_LeaseAgreement_VL2
     */
    public ViewLinkImpl getBookingMilestone_LeaseAgreement_VL2() {
        return (ViewLinkImpl)findViewLink("BookingMilestone_LeaseAgreement_VL2");
    }

    /**
     * Container's getter for LeaseAgreement_BookingDetail_VL2.
     * @return LeaseAgreement_BookingDetail_VL2
     */
    public ViewLinkImpl getLeaseAgreement_BookingDetail_VL2() {
        return (ViewLinkImpl)findViewLink("LeaseAgreement_BookingDetail_VL2");
    }

    /**
     * Container's getter for LeaseMoveInMoveOutVL1.
     * @return LeaseMoveInMoveOutVL1
     */
    public ViewLinkImpl getLeaseMoveInMoveOutVL1() {
        return (ViewLinkImpl)findViewLink("LeaseMoveInMoveOutVL1");
    }

    /**
     * Container's getter for LeaseMoveInMoveOutVL2.
     * @return LeaseMoveInMoveOutVL2
     */
    public ViewLinkImpl getLeaseMoveInMoveOutVL2() {
        return (ViewLinkImpl)findViewLink("LeaseMoveInMoveOutVL2");
    }

    /**
     * Container's getter for LeaseAgreementcancelationExtension_VL1.
     * @return LeaseAgreementcancelationExtension_VL1
     */
    public ViewLinkImpl getLeaseAgreementcancelationExtension_VL1() {
        return (ViewLinkImpl)findViewLink("LeaseAgreementcancelationExtension_VL1");
    }

    /**
     * Container's getter for LeaseAgreementcancelationExtension_VL2.
     * @return LeaseAgreementcancelationExtension_VL2
     */
    public ViewLinkImpl getLeaseAgreementcancelationExtension_VL2() {
        return (ViewLinkImpl)findViewLink("LeaseAgreementcancelationExtension_VL2");
    }

    /**
     * Container's getter for Invoice_VL1.
     * @return Invoice_VL1
     */
    public ViewLinkImpl getInvoice_VL1() {
        return (ViewLinkImpl)findViewLink("Invoice_VL1");
    }

    /**
     * Container's getter for Receipt_VL1.
     * @return Receipt_VL1
     */
    public ViewLinkImpl getReceipt_VL1() {
        return (ViewLinkImpl)findViewLink("Receipt_VL1");
    }

    /**
     * Container's getter for ReceiptHdr_Dtl_VL1.
     * @return ReceiptHdr_Dtl_VL1
     */
    public ViewLinkImpl getReceiptHdr_Dtl_VL1() {
        return (ViewLinkImpl)findViewLink("ReceiptHdr_Dtl_VL1");
    }

    /**
     * Container's getter for ReceiptHdr_Dtl_VL2.
     * @return ReceiptHdr_Dtl_VL2
     */
    public ViewLinkImpl getReceiptHdr_Dtl_VL2() {
        return (ViewLinkImpl)findViewLink("ReceiptHdr_Dtl_VL2");
    }

    public String getARInvoiceTrxDetails(String pLeaseNo, String pChargeTyp,
                                         String pCustomerTrxId,
                                         String pCustomerTrxNo) {
        java.math.BigDecimal customerTrxId =
            new java.math.BigDecimal(pCustomerTrxId);
        java.math.BigDecimal customerTrxNo =
            new java.math.BigDecimal(pCustomerTrxNo);
        Object chargeType = pChargeTyp;
        Object leaseNo = pLeaseNo;
        String stmt =
            "begin xxpm_util_package.update_customer_trx_id (?,?,?,?); end;";
        CallableStatement cst = null;
        try {
            cst = this.getDBTransaction().createCallableStatement(stmt, 0);
            cst.setObject("p_lease_number", leaseNo);
            cst.setObject("p_charge_type_code", chargeType);
            cst.setObject("p_customer_trx_id", customerTrxId);
            cst.setObject("p_trx_number", customerTrxNo);
            cst.executeUpdate();
            return "S";
        } catch (SQLException e) {
            System.err.println("ERROR" + e);
            throw new JboException(e.getMessage());
        } finally {
            if (cst != null) {
                try {
                    cst.close();
                } catch (SQLException e) {
                    return "E";
                }
            }
        }
    }
    
    public String getCashRcptIdRspnse(String pReceiptNo, String pCshRcptId) {
        java.math.BigDecimal cshRcptIdBd = new java.math.BigDecimal(pCshRcptId);
        Object receiptNo = pReceiptNo;
        String stmt =
            "begin xxpm_util_package.update_receipt_attribute1 (?,?); end;";
        CallableStatement cst = null;
        try {
            cst = this.getDBTransaction().createCallableStatement(stmt, 0);
            cst.setObject("p_receipt_number", receiptNo);
            cst.setObject("p_csh_rcpt_id", cshRcptIdBd);
            cst.executeUpdate();
            return "S";
        } catch (SQLException e) {
            System.err.println("ERROR" + e);
            throw new JboException(e.getMessage());
        } finally {
            if (cst != null) {
                try {
                    cst.close();
                } catch (SQLException e) {
                    return "E";
                }
            }
        }
    }

    public String getCodeSegmentCombination(String pBusinessUnitId,
                                            String pChargeType,
                                            String pUnitId) {
        String returnResult = null;
        java.math.BigDecimal businessUnitId =
            new java.math.BigDecimal(pBusinessUnitId);
        Object chargeType = pChargeType;
        java.math.BigDecimal unitId = new java.math.BigDecimal(pUnitId);
        String stmt =
            "begin xxpm_util_package.get_gl_code (?,?,?,?,?,?); end;";
        CallableStatement cst = null;
        try {
            cst = this.getDBTransaction().createCallableStatement(stmt, 0);
            cst.setObject("p_business_unit_id", businessUnitId);
            cst.setObject("p_charge_type_code", chargeType);
            cst.setObject("p_unit_id", unitId);
            cst.registerOutParameter("x_gl_code", Types.VARCHAR);
            cst.registerOutParameter("x_err_code", Types.VARCHAR);
            cst.registerOutParameter("x_err_msg", Types.VARCHAR);
            cst.executeUpdate();
            returnResult = cst.getString("x_err_code");
            return cst.getString("x_gl_code");
        } catch (SQLException e) {
            e.printStackTrace();
            returnResult = e.toString();
            return returnResult;
        } finally {
            if (cst != null) {
                try {
                    cst.close();
                } catch (SQLException e) {
                    returnResult = e.toString();
                    return returnResult;
                }
            }
        }
    }
    //auto create cancellation from lease
        public String cancellationCall(String leaseId,String userName) {
            
            String flag="null";
            CallableStatement cs=this.getDBTransaction().createCallableStatement("{call auto_create_pkg.AUTOCREATE_CN(?,?,?,?)}",1);
            try {
                cs.setString(1,leaseId);
                cs.setString(2,userName);
                cs.registerOutParameter(3,Types.VARCHAR);
                cs.registerOutParameter(4,Types.VARCHAR);
                cs.execute();
           
              flag=cs.getString(4).toString();
            } catch (SQLException e) {
            }
            return flag;
        }
    //auto create Renewal offer transaction
        public String autoRoffer(String offerHdrId,String leaseId,String userName) {
            
            String flag="null";
            CallableStatement cs=this.getDBTransaction().createCallableStatement("{call auto_create_pkg.AUTOCREATE_R_OF(?,?,?,?,?)}",1);
            try {
                cs.setString(1,offerHdrId);
                cs.setString(2,leaseId);
                cs.setString(3,userName);
                cs.registerOutParameter(4,Types.VARCHAR);
                cs.registerOutParameter(5,Types.VARCHAR);
                cs.execute();
           
              flag=cs.getString(5).toString();
            } catch (SQLException e) {
            }
            return flag;
        }
    //auto create Short renewal offer transaction
        public String autoSoffer(String offerHdrId,String leaseId,String userName)
        {
            String flag="null";
            CallableStatement cs=this.getDBTransaction().createCallableStatement("{call auto_create_pkg.AUTOCREATE_SR_OF(?,?,?,?,?)}",1);
            try {
                cs.setString(1,offerHdrId);
                cs.setString(2,leaseId);
                cs.setString(3,userName);
                cs.registerOutParameter(4,Types.VARCHAR);
                cs.registerOutParameter(5,Types.VARCHAR);
                cs.execute();
           
              flag=cs.getString(5).toString();
            } catch (SQLException e) {
            }
            return flag;
        }
    //submit for approval flow new
                public String sbmtforappr(String p_func_id,String p_ref_id,String p_table_name,String p_org_id,
                                                      String p_prop_id,String p_build_id,String p_unit_id)
                {
                    String flag="null";
                    CallableStatement cs=this.getDBTransaction().createCallableStatement("{call NEW_APPROVAL_FLOW_PKG.SUBMIT_FOR_APR(?,?,?,?,?,?,?,?,?)}",1);
                    try {
                        cs.setString(1,p_func_id);
                        cs.setString(2,p_ref_id);
                        cs.setString(3,p_table_name);
                        cs.setString(4,p_org_id);
                        cs.setString(5,p_prop_id);
                        cs.setString(6,p_build_id);
                        cs.setString(7,p_unit_id);
                        cs.registerOutParameter(8,Types.VARCHAR);
                        cs.registerOutParameter(9,Types.VARCHAR);
                        cs.execute();              
                      flag=cs.getString(9).toString();
                    } catch (SQLException e) {
                    }
                    return flag;
                }
    // new response for approval or reject new
                public String forappr(String p_func_id,String p_ref_id,String p_user_grp_id,String p_level_no,
                                                      String p_flow_with_id,String p_reason,String p_apr_rej)
                {
                    String flag="null";
                    CallableStatement cs=this.getDBTransaction().createCallableStatement("{call NEW_APPROVAL_FLOW_PKG.RESPONSE_FOR_APR(?,?,?,?,?,?,?,?,?)}",1);
                    try {
                        cs.setString(1,p_func_id);
                        cs.setString(2,p_ref_id);
                        cs.setString(3,p_user_grp_id);
                        cs.setString(4,p_level_no);
                        cs.setString(5,p_flow_with_id);
                        cs.setString(6,p_reason);
                        cs.setString(7,p_apr_rej);
                        cs.registerOutParameter(8,Types.VARCHAR);
                        cs.registerOutParameter(9,Types.VARCHAR);
                        cs.execute();              
                      flag=cs.getString(9).toString();
                    } catch (SQLException e) {
                    }
                    return flag;
                }
    //submit for approval
        public String submitLaForAppr(String laId, String userName)
        {
            String flag="null";
            CallableStatement cs=this.getDBTransaction().createCallableStatement("{call NEW_APPROVAL_FLOW_PKG.SUBMIT_FOR_APR_LA(?,?,?,?)}",1);
            try {
                cs.setString(1,laId);
                cs.setString(2,userName);
                cs.registerOutParameter(3,Types.VARCHAR);
                cs.registerOutParameter(4,Types.VARCHAR);
                cs.execute();
           
              flag=cs.getString(4).toString();
            } catch (SQLException e) {
            }
            return flag;
        }
    //Respose of approval
        public String responseLaForAppr(String laId,String reason,String apr_rej)
        {
            String flag="null";
            CallableStatement cs=this.getDBTransaction().createCallableStatement("{call NEW_APPROVAL_FLOW_PKG.RESPONSE_FOR_APR_LA(?,?,?,?,?)}",1);
            try {
                cs.setString(1,laId);
                cs.setString(2,reason);
                cs.setString(3,apr_rej);
                cs.registerOutParameter(4,Types.VARCHAR);
                cs.registerOutParameter(5,Types.VARCHAR);
                cs.execute();
           
              flag=cs.getString(5).toString();
            } catch (SQLException e) {
            }
            return flag;
        }
    /**
     * Container's getter for getApprovalHistoryROVo1.
     * @return getApprovalHistoryROVo1
     */
    public ViewObjectImpl getgetApprovalHistoryROVo1() {
        return (ViewObjectImpl)findViewObject("getApprovalHistoryROVo1");
    }

    /**
     * Container's getter for LeaseApprovalVL1.
     * @return LeaseApprovalVL1
     */
    public ViewLinkImpl getLeaseApprovalVL1() {
        return (ViewLinkImpl)findViewLink("LeaseApprovalVL1");
    }

    /**
     * Container's getter for getARTrxDltsForInvoice_ROVO1.
     * @return getARTrxDltsForInvoice_ROVO1
     */
    public ViewObjectImpl getgetARTrxDltsForInvoice_ROVO1() {
        return (ViewObjectImpl)findViewObject("getARTrxDltsForInvoice_ROVO1");
    }

    /**
     * Container's getter for getARTrxDltsForReceipt_ROVO1.
     * @return getARTrxDltsForReceipt_ROVO1
     */
    public ViewObjectImpl getgetARTrxDltsForReceipt_ROVO1() {
        return (ViewObjectImpl)findViewObject("getARTrxDltsForReceipt_ROVO1");
    }


    /**
     * Container's getter for OfferDetail_VO1.
     * @return OfferDetail_VO1
     */
    public ViewObjectImpl getOfferDetail_VO1() {
        return (ViewObjectImpl)findViewObject("OfferDetail_VO1");
    }

    /**
     * Container's getter for PlDiscounts_VO1.
     * @return PlDiscounts_VO1
     */
    public PlDiscounts_VOImpl getPlDiscounts_VO1() {
        return (PlDiscounts_VOImpl)findViewObject("PlDiscounts_VO1");
    }

    /**
     * Container's getter for DiscountsROVO1.
     * @return DiscountsROVO1
     */
    public ViewObjectImpl getDiscountsROVO1() {
        return (ViewObjectImpl)findViewObject("DiscountsROVO1");
    }

    /**
     * Container's getter for getTaxCodeROVO1.
     * @return getTaxCodeROVO1
     */
    public ViewObjectImpl getgetTaxCodeROVO1() {
        return (ViewObjectImpl)findViewObject("getTaxCodeROVO1");
    }

    /**
     * Container's getter for getBookingDetailsROVO1.
     * @return getBookingDetailsROVO1
     */
    public ViewObjectImpl getgetBookingDetailsROVO1() {
        return (ViewObjectImpl)findViewObject("getBookingDetailsROVO1");
    }

    /**
     * Container's getter for getInvoiceInterfacePayloadValues_ROVO1.
     * @return getInvoiceInterfacePayloadValues_ROVO1
     */
    public ViewObjectImpl getgetInvoiceInterfacePayloadValues_ROVO1() {
        return (ViewObjectImpl)findViewObject("getInvoiceInterfacePayloadValues_ROVO1");
    }


    public String getGLCodeCombination(String pBusinessunitId,
                                       String pChargeType, String pUnitId) {
        System.err.println("BU" + pBusinessunitId);
        System.err.println("CTYPE" + pChargeType);
        System.err.println("UNIT" + pUnitId);
        return "called";
    }

    /**
     * Container's getter for getReceiptPayloadDtls_ROVO1.
     * @return getReceiptPayloadDtls_ROVO1
     */
    public ViewObjectImpl getgetReceiptPayloadDtls_ROVO1() {
        return (ViewObjectImpl)findViewObject("getReceiptPayloadDtls_ROVO1");
    }

    /**
     * Container's getter for getReceiptMethod_ROVO1.
     * @return getReceiptMethod_ROVO1
     */
    public ViewObjectImpl getgetReceiptMethod_ROVO1() {
        return (ViewObjectImpl)findViewObject("getReceiptMethod_ROVO1");
    }

    /**
     * Container's getter for getARSetupDetails_ROVO1.
     * @return getARSetupDetails_ROVO1
     */
    public ViewObjectImpl getgetARSetupDetails_ROVO1() {
        return (ViewObjectImpl)findViewObject("getARSetupDetails_ROVO1");
    }

    /**
     * Container's getter for ArSetup_ROVO1.
     * @return ArSetup_ROVO1
     */
    public ViewObjectImpl getArSetup_ROVO1() {
        return (ViewObjectImpl)findViewObject("ArSetup_ROVO1");
    }

    /**
     * Container's getter for Receipt_VO4.
     * @return Receipt_VO4
     */
    public ViewObjectImpl getReceipt_VO4() {
        return (ViewObjectImpl)findViewObject("Receipt_VO4");
    }

    /**
     * Container's getter for Receipt_VO5.
     * @return Receipt_VO5
     */
    public ViewObjectImpl getReceipt_VO5() {
        return (ViewObjectImpl)findViewObject("Receipt_VO5");
    }

    /**
     * Container's getter for Receipt_VL2.
     * @return Receipt_VL2
     */
    public ViewLinkImpl getReceipt_VL2() {
        return (ViewLinkImpl)findViewLink("Receipt_VL2");
    }

    /**
     * Container's getter for RecommendHeader_VO1.
     * @return RecommendHeader_VO1
     */
    public RecommendHeader_VOImpl getRecommendHeader_VO1() {
        return (RecommendHeader_VOImpl)findViewObject("RecommendHeader_VO1");
    }

    /**
     * Container's getter for SearchLeaseAgreementInfo_RoVo1.
     * @return SearchLeaseAgreementInfo_RoVo1
     */
    public ViewObjectImpl getSearchLeaseAgreementInfo_RoVo1() {
        return (ViewObjectImpl)findViewObject("SearchLeaseAgreementInfo_RoVo1");
    }

    /**
     * Container's getter for LeaseDuplicateROVO1.
     * @return LeaseDuplicateROVO1
     */
    public ViewObjectImpl getLeaseDuplicateROVO1() {
        return (ViewObjectImpl)findViewObject("LeaseDuplicateROVO1");
    }

    /**
     * Container's getter for SearchBkDtls_RoVo1.
     * @return SearchBkDtls_RoVo1
     */
    public ViewObjectImpl getSearchBkDtls_RoVo1() {
        return (ViewObjectImpl)findViewObject("SearchBkDtls_RoVo1");
    }
}
