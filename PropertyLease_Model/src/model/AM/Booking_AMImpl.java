package model.AM;

import java.math.BigDecimal;

import java.sql.CallableStatement;
import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Types;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;


import model.AM.common.Booking_AM;

import model.VO.Billing_VOImpl;
import model.VO.BookingCustomer_VOImpl;
import model.VO.BookingDetail_VOImpl;
import model.VO.BookingHeader_VOImpl;
import model.VO.BookingMilestonesOtherChargesVOImpl;
import model.VO.Booking_Milestone_VOImpl;
import model.VO.OfferHrd_VOImpl;
import model.VO.PropertyMaster_VOImpl;
import model.VO.PropertyUnits_VOImpl;

import model.VO.Receipt_VOImpl;

import oracle.adf.share.ADFContext;

import oracle.jbo.JboException;
import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;
import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewCriteriaRow;
import oracle.jbo.ViewObject;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Apr 12 12:17:29 IST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class Booking_AMImpl extends ApplicationModuleImpl implements Booking_AM {
    /**
     * This is the default constructor (do not remove).
     */
    public Booking_AMImpl() {
    }


    /**
     * Container's getter for OfferHrd_VO1.
     * @return OfferHrd_VO1
     */
    public ViewObjectImpl getOfferHrd_VO1() {
        return (ViewObjectImpl)findViewObject("OfferHrd_VO1");
    }

    /**
     * Container's getter for OfferDetail_VO1.
     * @return OfferDetail_VO1
     */
    public ViewObjectImpl getOfferDetail_VO1() {
        return (ViewObjectImpl)findViewObject("OfferDetail_VO1");
    }

    /**
     * Container's getter for OfferHrd_Link_OfferDeta1.
     * @return OfferHrd_Link_OfferDeta1
     */
    public ViewLinkImpl getOfferHrd_Link_OfferDeta1() {
        return (ViewLinkImpl)findViewLink("OfferHrd_Link_OfferDeta1");
    }


    public String ValidateUnitStatus(Object val) {
        ViewObject OfferDtlVo = this.getPropertyUnits_VO2().getViewObject();


        ViewCriteria vc = OfferDtlVo.createViewCriteria();
        ViewCriteriaRow vcRow = vc.createViewCriteriaRow();


        vcRow.setAttribute("UnitId", val);
        vc.addRow(vcRow);

        OfferDtlVo.applyViewCriteria(vc);
        OfferDtlVo.executeQuery();
        Row re = OfferDtlVo.first();
        String St = re.getAttribute("Status").toString();
        return St;


    }

    public String InvokeLeaseNumber(String b_unitid
                                           ) {
                              oracle.jbo.domain.Number Unid= new oracle.jbo.domain.Number();//func_id.toString()
          try {
              Unid = new oracle.jbo.domain.Number(b_unitid.toString());
          } catch (SQLException e) {
          }
          
          String stmt1 =
                  //"xxpm_util_package.get_install_status (?,?,?,?,?); end;";
              
                  " begin \n" +
                              "             xxpl_property_lease_pkg.get_lease_no(:b_unitid,:b_lease_id,:p_err_code,:p_err_msg);\n" +
                              "             END;";
              CallableStatement cst = null;
              try {
                  cst = this.getDBTransaction().createCallableStatement(stmt1, 0);
                  cst.setObject("b_unitid", Unid);
                  cst.registerOutParameter("b_lease_id", Types.NUMERIC);   
                  cst.registerOutParameter("p_err_code", Types.VARCHAR);
                  cst.registerOutParameter("p_err_msg", Types.VARCHAR);
                  cst.executeUpdate();
             
                  return cst.getString("b_lease_id");
              } catch (SQLException e) {
                  System.err.println("ERROR" + e);
                  throw new JboException(e.getMessage());
              } finally {
                  if (cst != null) {
                      try {
                          cst.close();
                      } catch (SQLException e) {
                          return e.toString();
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



    public Object validateDate(String Status) {
        Object result = null;
        if (Status.equals("AVAL") || Status.equals("A")) {
            ViewObject BkHdrVo = this.getBookingHeader_VO1().getViewObject();
            Row re = BkHdrVo.getCurrentRow();
            String DateFr =
                re.getAttribute("BookingDate") == null ? "" : re.getAttribute("BookingDate").toString();
            SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
            Date date1 = new Date();
            try {
                date1 = new SimpleDateFormat("yyyy-MM-dd").parse(DateFr);
            } catch (ParseException e) {
            }
            Calendar c = Calendar.getInstance();
            c.setTime(date1);
            c.add(Calendar.DATE, 1);

            DateFormat format12 = new SimpleDateFormat("yyyy-MM-dd");
            String formatted = format12.format(c.getTime());

            result = formatted;

        } else {
            Object Val =
                ADFContext.getCurrent().getPageFlowScope().get("OfferId") ==
                null ? "" :
                ADFContext.getCurrent().getPageFlowScope().get("OfferId").toString();
            ViewObject offerHdrVO = this.getOfferHrd_VO1().getViewObject();
            ViewCriteria offerHdrVC = offerHdrVO.createViewCriteria();
            ViewCriteriaRow offerHdrVCR = offerHdrVC.createViewCriteriaRow();
            offerHdrVCR.setAttribute("OfferHdrId", Val);
            offerHdrVC.addRow(offerHdrVCR);
            offerHdrVO.applyViewCriteria(offerHdrVC);
            offerHdrVO.executeQuery();
            //            ViewObject BkHdrVo =
            //            this.getBookingHeader_VO1().getViewObject();
            Row re = offerHdrVO.getCurrentRow();
            String DateFr =
                re.getAttribute("OfferToDate") == null ? "" : re.getAttribute("OfferToDate").toString();
            SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
            Date date1 = new Date();
            try {
                date1 = new SimpleDateFormat("yyyy-MM-dd").parse(DateFr);
            } catch (ParseException e) {
            }
            Calendar c = Calendar.getInstance();
            c.setTime(date1);
            c.add(Calendar.DATE, 1);

            DateFormat format12 = new SimpleDateFormat("yy-MM-dd");
            String formatted = format12.format(c.getTime());
            result = formatted;

        }


        return result;
    }

    public String CreateBooking() {
        Object Val =
            ADFContext.getCurrent().getPageFlowScope().get("OfferId") == null ?
            "" :
            ADFContext.getCurrent().getPageFlowScope().get("OfferId").toString();

        // Insert Booking Header
        Row bookHrdRow = this.getBookingHeader_VO1().createRow();
        // bookHrdRow.setAttribute("OfferHdrId", Val);
        this.getBookingHeader_VO1().insertRow(bookHrdRow);

        // Filetering Offer Line
        //        ViewObject offerDtlVO=this.getOfferDetail_VO2().getViewObject();
        //        ViewCriteria offerDtlVC=offerDtlVO.createViewCriteria();
        //        ViewCriteriaRow offerDtlVCR=offerDtlVC.createViewCriteriaRow();
        //        offerDtlVCR.setAttribute("OfferHdrId", Val);
        //        offerDtlVC.addRow(offerDtlVCR);
        //        offerDtlVO.applyViewCriteria(offerDtlVC);
        //        offerDtlVO.executeQuery();
        //        // Iterating Lines
        //        RowSetIterator OfferDtlRS=offerDtlVO.createRowSetIterator(null);
        //        while(OfferDtlRS.hasNext()){
        //            Row OfferDtlRow=OfferDtlRS.next();
        //            // inserting Row
        //            Row bookingRow=this.getBookingDetail_VO1().createRow();
        //
        //            bookingRow.setAttribute("PropertyId", OfferDtlRow.getAttribute("PropertyId"));
        //            bookingRow.setAttribute("BuildingId", OfferDtlRow.getAttribute("BuildingId"));
        //            String UnitStatus =ValidateUnitStatus(OfferDtlRow.getAttribute("UnitId")) == null ? "" :ValidateUnitStatus(OfferDtlRow.getAttribute("UnitId")).toString();
        //            String val= validateDate(UnitStatus).toString();
        //
        //            Date date1=new Date();
        //                  try {
        //                    date1 = new SimpleDateFormat("yyyy-MM-dd").parse(val);
        //                    } catch (ParseException e) {
        //                                   }
        //            bookingRow.setAttribute("UnitId", OfferDtlRow.getAttribute("UnitId"));
        //            bookingRow.setAttribute("BaseRate", OfferDtlRow.getAttribute("BaseRate"));
        //            bookingRow.setAttribute("DiscountRate", OfferDtlRow.getAttribute("DiscountAmount"));
        //            bookingRow.setAttribute("TaxAmount", OfferDtlRow.getAttribute("TaxAmount"));
        //            bookingRow.setAttribute("TotalRate", OfferDtlRow.getAttribute("TotalRate"));
        //
        //                  java.sql.Date sqlDate = new java.sql.Date(date1.getTime());
        //                  oracle.jbo.domain.Date domadate=new oracle.jbo.domain.Date(sqlDate);
        //                  bookingRow.setAttribute("UnitAvlFrom", domadate);
        //                  bookingRow.setAttribute("UnitAvlStatus", UnitStatus);
        //
        //            this.getBookingDetail_VO1().insertRow(bookingRow);
        //        }
        //        this.getBookingDetail_VO1().executeQuery();
        //
        //
        //
        //        CreateMilestone();
        Row BRe = this.getBookingCustomer_VO1().createRow();
        this.getBookingCustomer_VO1().insertRow(BRe);
        this.getBookingCustomer_VO1().executeQuery();


        return "Suceess";
    }
    //-----MILESTONE

    public String CreateMilestone() {
        Object Val =
            ADFContext.getCurrent().getPageFlowScope().get("OfferId") == null ?
            "" :
            ADFContext.getCurrent().getPageFlowScope().get("OfferId").toString();

        // Filetering Offer Line
        ViewObject milestoneDtlVO =
            this.getOfferMilestoneDetail_VO1().getViewObject();
        ViewCriteria offerDtlVC = milestoneDtlVO.createViewCriteria();
        ViewCriteriaRow offerDtlVCR = offerDtlVC.createViewCriteriaRow();
        //1
        offerDtlVCR.setAttribute("OfferHdrId", Val);
        offerDtlVC.addRow(offerDtlVCR);
        milestoneDtlVO.applyViewCriteria(offerDtlVC);
        milestoneDtlVO.executeQuery();

        // Iterating Lines
        RowSetIterator OfferDtlRS = milestoneDtlVO.createRowSetIterator(null);
        while (OfferDtlRS.hasNext()) {
            Row OfferDtlRow = OfferDtlRS.next();
            // inserting Row
            Row bookingRow = this.getBooking_Milestone_VO1().createRow();
            //            bookingRow.setAttribute("BookingId", this.getBookingHeader_VO1().getCurrentRow().getAttribute("BookingId"));
            bookingRow.setAttribute("SeqNumber",
                                    OfferDtlRow.getAttribute("SeqNumber"));
            bookingRow.setAttribute("InstallmentType",
                                    OfferDtlRow.getAttribute("InstallmentType"));
            //            String UnitStatus =ValidateUnitStatus(OfferDtlRow.getAttribute("UnitId")) == null ? "" :ValidateUnitStatus(OfferDtlRow.getAttribute("UnitId")).toString();
            // String val= validateDate(UnitStatus).toString();
            //String val= validateDate(UnitStatus).toString();
            //            Date date1=new Date();
            //                  try {
            //                    date1 = new SimpleDateFormat("yyyy-MM-dd").parse(val);
            //                    } catch (ParseException e) {
            //                                   }
            bookingRow.setAttribute("InstallmentPct",
                                    OfferDtlRow.getAttribute("InstallmentPct"));
            bookingRow.setAttribute("InstallmentAmount",
                                    OfferDtlRow.getAttribute("InstallmentAmount"));
            bookingRow.setAttribute("Criteria",
                                    OfferDtlRow.getAttribute("Criteria"));
            bookingRow.setAttribute("ChargeType",
                                    OfferDtlRow.getAttribute("ChargeType"));
            bookingRow.setAttribute("PaymentTerm",
                                    OfferDtlRow.getAttribute("PaymentTerm"));
            bookingRow.setAttribute("DueDate",
                                    OfferDtlRow.getAttribute("DueDate"));
            bookingRow.setAttribute("MilestoneType", "BK");
            //            MilestoneType
            //                  java.sql.Date sqlDate = new java.sql.Date(date1.getTime());
            //                  oracle.jbo.domain.Date domadate=new oracle.jbo.domain.Date(sqlDate);
            //                  bookingRow.setAttribute("UnitAvlFrom", domadate);
            //                  bookingRow.setAttribute("UnitAvlStatus", UnitStatus);

            this.getBooking_Milestone_VO1().insertRow(bookingRow);
        }
        this.getBooking_Milestone_VO1().executeQuery();


        //        ViewObject OfferHdrVo=this.getOfferHrd_VO1().getViewObject();
        //        ViewCriteria vc = OfferHdrVo.createViewCriteria();
        //        ViewCriteriaRow vcRow = vc.createViewCriteriaRow();
        //        vcRow.setAttribute("OfferHdrId", Val);
        //        vc.addRow(vcRow);
        //
        //        OfferHdrVo.applyViewCriteria(vc);
        //        OfferHdrVo.executeQuery();
        //        Row OfferHdrRow=OfferHdrVo.first();
        //
        //        ViewObject BookingHdrVo=this.getBookingHeader_VO1().getViewObject();
        //        Row BHdrrow=BookingHdrVo.createRow();
        //        BHdrrow.setAttribute("OfferHdrId", OfferHdrRow.getAttribute("OfferHdrId"));
        //        BHdrrow.setAttribute("TotalRent", OfferHdrRow.getAttribute("OfferTotal"));
        //
        //        //BHdrrow.setAttribute("BookingDueDate", OfferHdrRow.getAttribute("OfferDate"));
        //
        //        BookingHdrVo.insertRow(BHdrrow);
        //       BookingHdrVo.executeQuery();


        //
        //        ViewObject BookingDtlVo=this.getBookingDetail_VO1().getViewObject();
        //        Row BKdtlRe=BookingDtlVo.createRow();
        //


        // BookingDtl.executeQuery();

        return "Suceess";
    }

    //----

    public String CreateBookingDetails() {


        ViewObject BookingDtl = this.getBookingDetail_VO1().getViewObject();


        ViewObject OfferDtlVo = this.getOfferDetail_VO1().getViewObject();
        Row detailRow = OfferDtlVo.first();
        RowSetIterator rs = OfferDtlVo.createRowSet("");
        while (rs.hasNext()) {

            detailRow = rs.next();

            Row detBokrow = BookingDtl.createRow();

            detBokrow.setAttribute("PropertyId",
                                   detailRow.getAttribute("PropertyId"));
            detBokrow.setAttribute("BuildingId",
                                   detailRow.getAttribute("BuildingId"));
            detBokrow.setAttribute("UnitId", detailRow.getAttribute("UnitId"));
            detBokrow.setAttribute("BaseRate",
                                   detailRow.getAttribute("BaseRate"));
            detBokrow.setAttribute("Attribute3",
                                   detailRow.getAttribute("Attribute3"));//discount
            detBokrow.setAttribute("TaxAmount",
                                   detailRow.getAttribute("TaxAmount"));
            detBokrow.setAttribute("TotalRate",
                                   detailRow.getAttribute("TotalRate"));

            BookingDtl.insertRow(detBokrow);

        }


        return "Success";
    }


    /**
     * Container's getter for BookingHeader_VO1.
     * @return BookingHeader_VO1
     */
    public ViewObjectImpl getBookingHeader_VO1() {
        return (ViewObjectImpl)findViewObject("BookingHeader_VO1");
    }

    /**
     * Container's getter for BookingCharges_VO1.
     * @return BookingCharges_VO1
     */
    public ViewObjectImpl getBookingCharges_VO1() {
        return (ViewObjectImpl)findViewObject("BookingCharges_VO1");
    }

    /**
     * Container's getter for BookingHeader_Charges1.
     * @return BookingHeader_Charges1
     */
    public ViewLinkImpl getBookingHeader_Charges1() {
        return (ViewLinkImpl)findViewLink("BookingHeader_Charges1");
    }

    /**
     * Container's getter for BookingCustomer_VO1.
     * @return BookingCustomer_VO1
     */
    public ViewObjectImpl getBookingCustomer_VO1() {
        return (ViewObjectImpl)findViewObject("BookingCustomer_VO1");
    }

    /**
     * Container's getter for BookingHeader_Customer1.
     * @return BookingHeader_Customer1
     */
    public ViewLinkImpl getBookingHeader_Customer1() {
        return (ViewLinkImpl)findViewLink("BookingHeader_Customer1");
    }

    /**
     * Container's getter for BookingDetail_VO1.
     * @return BookingDetail_VO1
     */
    public ViewObjectImpl getBookingDetail_VO1() {
        return (ViewObjectImpl)findViewObject("BookingDetail_VO1");
    }

    /**
     * Container's getter for BookingHeader_Detail_VL1.
     * @return BookingHeader_Detail_VL1
     */
    public ViewLinkImpl getBookingHeader_Detail_VL1() {
        return (ViewLinkImpl)findViewLink("BookingHeader_Detail_VL1");
    }

    /**
     * Container's getter for Receipt_VO1.
     * @return Receipt_VO1
     */
    public ViewObjectImpl getReceipt_VO1() {
        return (ViewObjectImpl)findViewObject("Receipt_VO1");
    }

    /**
     * Container's getter for BookingHeader_Receipt_VL1.
     * @return BookingHeader_Receipt_VL1
     */
    public ViewLinkImpl getBookingHeader_Receipt_VL1() {
        return (ViewLinkImpl)findViewLink("BookingHeader_Receipt_VL1");
    }

    /**
     * Container's getter for OfferDetail_VO2.
     * @return OfferDetail_VO2
     */
    public ViewObjectImpl getOfferDetail_VO2() {
        return (ViewObjectImpl)findViewObject("OfferDetail_VO2");
    }

    /**
     * Container's getter for SearchBookingROVO1.
     * @return SearchBookingROVO1
     */
    public ViewObjectImpl getSearchBookingROVO1() {
        return (ViewObjectImpl)findViewObject("SearchBookingROVO1");
    }

    /**
     * Container's getter for OfferHrd_VO2.
     * @return OfferHrd_VO2
     */
    public ViewObjectImpl getOfferHrd_VO2() {
        return (ViewObjectImpl)findViewObject("OfferHrd_VO2");
    }

    /**
     * Container's getter for PropertyUnits_VO1.
     * @return PropertyUnits_VO1
     */
    public ViewObjectImpl getPropertyUnits_VO1() {
        return (ViewObjectImpl)findViewObject("PropertyUnits_VO1");
    }

    /**
     * Container's getter for PropertyUnits_VO2.
     * @return PropertyUnits_VO2
     */
    public ViewObjectImpl getPropertyUnits_VO2() {
        return (ViewObjectImpl)findViewObject("PropertyUnits_VO2");
    }

    /**
     * Container's getter for OfferMilestoneDetail_VO1.
     * @return OfferMilestoneDetail_VO1
     */
    public ViewObjectImpl getOfferMilestoneDetail_VO1() {
        return (ViewObjectImpl)findViewObject("OfferMilestoneDetail_VO1");
    }

    /**
     * Container's getter for Booking_Milestone_VO1.
     * @return Booking_Milestone_VO1
     */
    public ViewObjectImpl getBooking_Milestone_VO1() {
        return (ViewObjectImpl)findViewObject("Booking_Milestone_VO1");
    }

    /**
     * Container's getter for Booking_Milestone_VL1.
     * @return Booking_Milestone_VL1
     */
    public ViewLinkImpl getBooking_Milestone_VL1() {
        return (ViewLinkImpl)findViewLink("Booking_Milestone_VL1");
    }

    /**
     * Container's getter for getFunctionCodeROVO1.
     * @return getFunctionCodeROVO1
     */
    public ViewObjectImpl getgetFunctionCodeROVO1() {
        return (ViewObjectImpl)findViewObject("getFunctionCodeROVO1");
    }

    /**
     * Container's getter for MilestonesDtl_VO1.
     * @return MilestonesDtl_VO1
     */
    public ViewObjectImpl getMilestonesDtl_VO1() {
        return (ViewObjectImpl)findViewObject("MilestonesDtl_VO1");
    }

    /**
     * Container's getter for Organizations_ROVO1.
     * @return Organizations_ROVO1
     */
    public ViewObjectImpl getOrganizations_ROVO1() {
        return (ViewObjectImpl)findViewObject("Organizations_ROVO1");
    }

    /**
     * Container's getter for PropertyMaster_VO1.
     * @return PropertyMaster_VO1
     */
    public ViewObjectImpl getPropertyMaster_VO1() {
        return (ViewObjectImpl)findViewObject("PropertyMaster_VO1");
    }

    /**
     * Container's getter for OfferHrd_VO3.
     * @return OfferHrd_VO3
     */
    public ViewObjectImpl getOfferHrd_VO3() {
        return (ViewObjectImpl)findViewObject("OfferHrd_VO3");
    }

    /**
     * Container's getter for OfferHrd_VO4.
     * @return OfferHrd_VO4
     */
    public ViewObjectImpl getOfferHrd_VO4() {
        return (ViewObjectImpl)findViewObject("OfferHrd_VO4");
    }

    /**
     * Container's getter for OfferDetail_VO3.
     * @return OfferDetail_VO3
     */
    public ViewObjectImpl getOfferDetail_VO3() {
        return (ViewObjectImpl)findViewObject("OfferDetail_VO3");
    }

    /**
     * Container's getter for PropertyUnits_VO3.
     * @return PropertyUnits_VO3
     */
    public ViewObjectImpl getPropertyUnits_VO3() {
        return (ViewObjectImpl)findViewObject("PropertyUnits_VO3");
    }

    public String getSequenceNumber() {
        String query = "SELECT AR_RECEIPT_S.NEXTVAL FROM DUAL";
        ResultSet rs;
        Integer code = null;
        try {
            rs = getDBTransaction().createStatement(0).executeQuery(query);
            if (rs.next()) {
                code = ((BigDecimal)rs.getObject(1)).intValue();
            }

            rs.close();
            System.err.println("Sequence" + code);
            return "REC-" + code;

        } catch (SQLException e) {
            throw new JboException(e);
        }
    }

    /**
     * Container's getter for GetCustomerDetailsROVO1.
     * @return GetCustomerDetailsROVO1
     */
    public ViewObjectImpl getGetCustomerDetailsROVO1() {
        return (ViewObjectImpl)findViewObject("GetCustomerDetailsROVO1");
    }

    /**
     * Container's getter for Booking_Milestone_VO2.
     * @return Booking_Milestone_VO2
     */
    public ViewObjectImpl getBooking_Milestone_VO2() {
        return (ViewObjectImpl)findViewObject("Booking_Milestone_VO2");
    }

    /**
     * Container's getter for Booking_Milestone_VL2.
     * @return Booking_Milestone_VL2
     */
    public ViewLinkImpl getBooking_Milestone_VL2() {
        return (ViewLinkImpl)findViewLink("Booking_Milestone_VL2");
    }

    /**
     * Container's getter for OfferMilestoneDetail_VO2.
     * @return OfferMilestoneDetail_VO2
     */
    public ViewObjectImpl getOfferMilestoneDetail_VO2() {
        return (ViewObjectImpl)findViewObject("OfferMilestoneDetail_VO2");
    }

    /**
     * Container's getter for OfferHrd_Link_OffMSDet1.
     * @return OfferHrd_Link_OffMSDet1
     */
    public ViewLinkImpl getOfferHrd_Link_OffMSDet1() {
        return (ViewLinkImpl)findViewLink("OfferHrd_Link_OffMSDet1");
    }

    /**
     * Container's getter for OfferDetail_VO4.
     * @return OfferDetail_VO4
     */
    public ViewObjectImpl getOfferDetail_VO4() {
        return (ViewObjectImpl)findViewObject("OfferDetail_VO4");
    }

    /**
     * Container's getter for OfferMilestoneDetail_VO3.
     * @return OfferMilestoneDetail_VO3
     */
    public ViewObjectImpl getOfferMilestoneDetail_VO3() {
        return (ViewObjectImpl)findViewObject("OfferMilestoneDetail_VO3");
    }

    /**
     * Container's getter for OfferMilestoneDetail_VO4.
     * @return OfferMilestoneDetail_VO4
     */
    public ViewObjectImpl getOfferMilestoneDetail_VO4() {
        return (ViewObjectImpl)findViewObject("OfferMilestoneDetail_VO4");
    }

    /**
     * Container's getter for Booking_OfferVL1.
     * @return Booking_OfferVL1
     */
    public ViewLinkImpl getBooking_OfferVL1() {
        return (ViewLinkImpl)findViewLink("Booking_OfferVL1");
    }

    /**
     * Container's getter for OfferMilestoneDetail_VO5.
     * @return OfferMilestoneDetail_VO5
     */
    public ViewObjectImpl getOfferMilestoneDetail_VO5() {
        return (ViewObjectImpl)findViewObject("OfferMilestoneDetail_VO5");
    }

    /**
     * Container's getter for Booking_OfferVL2.
     * @return Booking_OfferVL2
     */
    public ViewLinkImpl getBooking_OfferVL2() {
        return (ViewLinkImpl)findViewLink("Booking_OfferVL2");
    }

    /**
     * Container's getter for getApprovalHistoryROVo1.
     * @return getApprovalHistoryROVo1
     */
    public ViewObjectImpl getgetApprovalHistoryROVo1() {
        return (ViewObjectImpl)findViewObject("getApprovalHistoryROVo1");
    }

    /**
     * Container's getter for BookingApprovalVL1.
     * @return BookingApprovalVL1
     */
    public ViewLinkImpl getBookingApprovalVL1() {
        return (ViewLinkImpl)findViewLink("BookingApprovalVL1");
    }

    /**
     * Container's getter for BookingMilestonesOtherChargesVO1.
     * @return BookingMilestonesOtherChargesVO1
     */
    public ViewObjectImpl getBookingMilestonesOtherChargesVO1() {
        return (ViewObjectImpl)findViewObject("BookingMilestonesOtherChargesVO1");
    }

    /**
     * Container's getter for BookingMilestoneOtherChargesVL1.
     * @return BookingMilestoneOtherChargesVL1
     */
    public ViewLinkImpl getBookingMilestoneOtherChargesVL1() {
        return (ViewLinkImpl)findViewLink("BookingMilestoneOtherChargesVL1");
    }

    /**
     * Container's getter for getReceiptPayloadDtls_ROVO1.
     * @return getReceiptPayloadDtls_ROVO1
     */
    public ViewObjectImpl getgetReceiptPayloadDtls_ROVO1() {
        return (ViewObjectImpl)findViewObject("getReceiptPayloadDtls_ROVO1");
    }

    /**
     * Container's getter for getReceiptPayloadDtlForBooing_ROVO1.
     * @return getReceiptPayloadDtlForBooing_ROVO1
     */
    public ViewObjectImpl getgetReceiptPayloadDtlForBooing_ROVO1() {
        return (ViewObjectImpl)findViewObject("getReceiptPayloadDtlForBooing_ROVO1");
    }

    /**
     * Container's getter for getReceiptMethod_ROVO1.
     * @return getReceiptMethod_ROVO1
     */
    public ViewObjectImpl getgetReceiptMethod_ROVO1() {
        return (ViewObjectImpl)findViewObject("getReceiptMethod_ROVO1");
    }

    /**
     * Container's getter for getUserLevels1.
     * @return getUserLevels1
     */
    public ViewObjectImpl getgetUserLevels1() {
        return (ViewObjectImpl)findViewObject("getUserLevels1");
    }

    /**
     * Container's getter for SearchBilling_ROVO1.
     * @return SearchBilling_ROVO1
     */
    public ViewObjectImpl getSearchBilling_ROVO1() {
        return (ViewObjectImpl)findViewObject("SearchBilling_ROVO1");
    }

    /**
     * Container's getter for Billing_VO1.
     * @return Billing_VO1
     */
    public Billing_VOImpl getBilling_VO1() {
        return (Billing_VOImpl)findViewObject("Billing_VO1");
    }

    /**
     * Container's getter for Billing_VO2.
     * @return Billing_VO2
     */
    public Billing_VOImpl getBilling_VO2() {
        return (Billing_VOImpl)findViewObject("Billing_VO2");
    }

    /**
     * Container's getter for Booking_Milestone_VO3.
     * @return Booking_Milestone_VO3
     */
    public Booking_Milestone_VOImpl getBooking_Milestone_VO3() {
        return (Booking_Milestone_VOImpl)findViewObject("Booking_Milestone_VO3");
    }

    /**
     * Container's getter for BillingMs_VL1.
     * @return BillingMs_VL1
     */
    public ViewLinkImpl getBillingMs_VL1() {
        return (ViewLinkImpl)findViewLink("BillingMs_VL1");
    }

    /**
     * Container's getter for Booking_Milestone_VO4.
     * @return Booking_Milestone_VO4
     */
    public Booking_Milestone_VOImpl getBooking_Milestone_VO4() {
        return (Booking_Milestone_VOImpl)findViewObject("Booking_Milestone_VO4");
    }

    /**
     * Container's getter for BookingDuplicateValidation_ROVO1.
     * @return BookingDuplicateValidation_ROVO1
     */
    public ViewObjectImpl getBookingDuplicateValidation_ROVO1() {
        return (ViewObjectImpl)findViewObject("BookingDuplicateValidation_ROVO1");
    }

    /**
     * Container's getter for Receipt_VO2.
     * @return Receipt_VO2
     */
    public Receipt_VOImpl getReceipt_VO2() {
        return (Receipt_VOImpl)findViewObject("Receipt_VO2");
    }

    /**
     * Container's getter for ReceiptDtlVO1.
     * @return ReceiptDtlVO1
     */
    public ViewObjectImpl getReceiptDtlVO1() {
        return (ViewObjectImpl)findViewObject("ReceiptDtlVO1");
    }

    /**
     * Container's getter for ReceiptHdr_Dtl_VL1.
     * @return ReceiptHdr_Dtl_VL1
     */
    public ViewLinkImpl getReceiptHdr_Dtl_VL1() {
        return (ViewLinkImpl)findViewLink("ReceiptHdr_Dtl_VL1");
    }
    //auto create recom RC transaction
        public String autoRecomRC(String bookingNo,String userId)
        {
            String flag="null";
            CallableStatement cs=this.getDBTransaction().createCallableStatement("{call auto_create_pkg.AUTOCREATE_RC(?,?,?,?)}",1);
            try {
                cs.setString(1,bookingNo);
                cs.setString(2,userId);
                cs.registerOutParameter(3,Types.VARCHAR);
                cs.registerOutParameter(4,Types.VARCHAR);
                cs.execute();
           
              flag=cs.getString(4).toString();
            } catch (SQLException e) {
            }
            return flag;
        }
    //update BK from OF transaction by refresh button in bk screen
        public String refresh_update_bk(String bookingId,String offerId,String userId)
        {
            String flag="null";
            CallableStatement cs=this.getDBTransaction().createCallableStatement("{call auto_create_pkg.refresh_update_bk(?,?,?,?,?)}",1);
            try {
                cs.setString(1,bookingId);
                cs.setString(2,offerId);
                cs.setString(3,userId);
                cs.registerOutParameter(4,Types.VARCHAR);
                cs.registerOutParameter(5,Types.VARCHAR);
                cs.execute();
           
              flag=cs.getString(5).toString();
            } catch (SQLException e) {
            }
            return flag;
        }
    //Direct to draft
            public String directToDraft(String rcId,String userId,String funcId,String reason)
            {
                String flag="null";
                CallableStatement cs=this.getDBTransaction().createCallableStatement("{call XXFND_UTIL_PKG.DIRECT_TO_DRAFT(?,?,?,?,?,?)}",1);
                try {
                    cs.setString(1,rcId);
                    cs.setString(2,userId);
                    cs.setString(3,funcId);
                    cs.setString(4,reason);
                    cs.registerOutParameter(5,Types.VARCHAR);
                    cs.registerOutParameter(6,Types.VARCHAR);
                    cs.execute();
               
                  flag=cs.getString(6).toString();
                } catch (SQLException e) {
                }
                return flag;
            }
    //submit for approval
        public String submitBkForAppr(String bookingId, String userName)
        {
            String flag="null";
            CallableStatement cs=this.getDBTransaction().createCallableStatement("{call NEW_APPROVAL_FLOW_PKG.SUBMIT_FOR_APR_BK(?,?,?,?)}",1);
            try {
                cs.setString(1,bookingId);
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
        public String responseBkForAppr(String bookingId,String reason,String apr_rej)
        {
            String flag="null";
            CallableStatement cs=this.getDBTransaction().createCallableStatement("{call NEW_APPROVAL_FLOW_PKG.RESPONSE_FOR_APR_BK(?,?,?,?,?)}",1);
            try {
                cs.setString(1,bookingId);
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
     * Container's getter for BookingMilestonesOtherChargesVO2.
     * @return BookingMilestonesOtherChargesVO2
     */
    public ViewObjectImpl getBookingMilestonesOtherChargesVO2() {
        return (ViewObjectImpl)findViewObject("BookingMilestonesOtherChargesVO2");
    }

    /**
     * Container's getter for BookingMilestoneOtherChargesVL2.
     * @return BookingMilestoneOtherChargesVL2
     */
    public ViewLinkImpl getBookingMilestoneOtherChargesVL2() {
        return (ViewLinkImpl)findViewLink("BookingMilestoneOtherChargesVL2");
    }

    /**
     * Container's getter for BookingCustomer_VO2.
     * @return BookingCustomer_VO2
     */
    public BookingCustomer_VOImpl getBookingCustomer_VO2() {
        return (BookingCustomer_VOImpl)findViewObject("BookingCustomer_VO2");
    }

    /**
     * Container's getter for getCustomerSiteDetailsROVO1.
     * @return getCustomerSiteDetailsROVO1
     */
    public ViewObjectImpl getgetCustomerSiteDetailsROVO1() {
        return (ViewObjectImpl)findViewObject("getCustomerSiteDetailsROVO1");
    }

    /**
     * Container's getter for getAllOfrBkDtl_RoVo1.
     * @return getAllOfrBkDtl_RoVo1
     */
    public ViewObjectImpl getgetAllOfrBkDtl_RoVo1() {
        return (ViewObjectImpl)findViewObject("getAllOfrBkDtl_RoVo1");
    }

    /**
     * Container's getter for BkHdr_getOfrBkDtl_VL1.
     * @return BkHdr_getOfrBkDtl_VL1
     */
    public ViewLinkImpl getBkHdr_getOfrBkDtl_VL1() {
        return (ViewLinkImpl)findViewLink("BkHdr_getOfrBkDtl_VL1");
    }

    /**
     * Container's getter for SearchBkDtls_RoVo1.
     * @return SearchBkDtls_RoVo1
     */
    public ViewObjectImpl getSearchBkDtls_RoVo1() {
        return (ViewObjectImpl)findViewObject("SearchBkDtls_RoVo1");
    }
}
