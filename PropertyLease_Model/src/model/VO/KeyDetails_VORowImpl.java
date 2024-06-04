package model.VO;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.RowSet;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed May 16 08:44:06 IST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class KeyDetails_VORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Attribute1 {
            public Object get(KeyDetails_VORowImpl obj) {
                return obj.getAttribute1();
            }

            public void put(KeyDetails_VORowImpl obj, Object value) {
                obj.setAttribute1((String)value);
            }
        }
        ,
        Attribute10 {
            public Object get(KeyDetails_VORowImpl obj) {
                return obj.getAttribute10();
            }

            public void put(KeyDetails_VORowImpl obj, Object value) {
                obj.setAttribute10((String)value);
            }
        }
        ,
        Attribute2 {
            public Object get(KeyDetails_VORowImpl obj) {
                return obj.getAttribute2();
            }

            public void put(KeyDetails_VORowImpl obj, Object value) {
                obj.setAttribute2((String)value);
            }
        }
        ,
        Attribute3 {
            public Object get(KeyDetails_VORowImpl obj) {
                return obj.getAttribute3();
            }

            public void put(KeyDetails_VORowImpl obj, Object value) {
                obj.setAttribute3((String)value);
            }
        }
        ,
        Attribute4 {
            public Object get(KeyDetails_VORowImpl obj) {
                return obj.getAttribute4();
            }

            public void put(KeyDetails_VORowImpl obj, Object value) {
                obj.setAttribute4((String)value);
            }
        }
        ,
        Attribute5 {
            public Object get(KeyDetails_VORowImpl obj) {
                return obj.getAttribute5();
            }

            public void put(KeyDetails_VORowImpl obj, Object value) {
                obj.setAttribute5((String)value);
            }
        }
        ,
        Attribute6 {
            public Object get(KeyDetails_VORowImpl obj) {
                return obj.getAttribute6();
            }

            public void put(KeyDetails_VORowImpl obj, Object value) {
                obj.setAttribute6((String)value);
            }
        }
        ,
        Attribute7 {
            public Object get(KeyDetails_VORowImpl obj) {
                return obj.getAttribute7();
            }

            public void put(KeyDetails_VORowImpl obj, Object value) {
                obj.setAttribute7((String)value);
            }
        }
        ,
        Attribute8 {
            public Object get(KeyDetails_VORowImpl obj) {
                return obj.getAttribute8();
            }

            public void put(KeyDetails_VORowImpl obj, Object value) {
                obj.setAttribute8((String)value);
            }
        }
        ,
        Attribute9 {
            public Object get(KeyDetails_VORowImpl obj) {
                return obj.getAttribute9();
            }

            public void put(KeyDetails_VORowImpl obj, Object value) {
                obj.setAttribute9((String)value);
            }
        }
        ,
        AttributeCategory {
            public Object get(KeyDetails_VORowImpl obj) {
                return obj.getAttributeCategory();
            }

            public void put(KeyDetails_VORowImpl obj, Object value) {
                obj.setAttributeCategory((String)value);
            }
        }
        ,
        BookingId {
            public Object get(KeyDetails_VORowImpl obj) {
                return obj.getBookingId();
            }

            public void put(KeyDetails_VORowImpl obj, Object value) {
                obj.setBookingId((BigDecimal)value);
            }
        }
        ,
        CreatedBy {
            public Object get(KeyDetails_VORowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(KeyDetails_VORowImpl obj, Object value) {
                obj.setCreatedBy((String)value);
            }
        }
        ,
        CreationDate {
            public Object get(KeyDetails_VORowImpl obj) {
                return obj.getCreationDate();
            }

            public void put(KeyDetails_VORowImpl obj, Object value) {
                obj.setCreationDate((Timestamp)value);
            }
        }
        ,
        Description {
            public Object get(KeyDetails_VORowImpl obj) {
                return obj.getDescription();
            }

            public void put(KeyDetails_VORowImpl obj, Object value) {
                obj.setDescription((String)value);
            }
        }
        ,
        KeyCode {
            public Object get(KeyDetails_VORowImpl obj) {
                return obj.getKeyCode();
            }

            public void put(KeyDetails_VORowImpl obj, Object value) {
                obj.setKeyCode((String)value);
            }
        }
        ,
        KeyId {
            public Object get(KeyDetails_VORowImpl obj) {
                return obj.getKeyId();
            }

            public void put(KeyDetails_VORowImpl obj, Object value) {
                obj.setKeyId((BigDecimal)value);
            }
        }
        ,
        KeyQty {
            public Object get(KeyDetails_VORowImpl obj) {
                return obj.getKeyQty();
            }

            public void put(KeyDetails_VORowImpl obj, Object value) {
                obj.setKeyQty((BigDecimal)value);
            }
        }
        ,
        LastUpdateDate {
            public Object get(KeyDetails_VORowImpl obj) {
                return obj.getLastUpdateDate();
            }

            public void put(KeyDetails_VORowImpl obj, Object value) {
                obj.setLastUpdateDate((Timestamp)value);
            }
        }
        ,
        LastUpdateLogin {
            public Object get(KeyDetails_VORowImpl obj) {
                return obj.getLastUpdateLogin();
            }

            public void put(KeyDetails_VORowImpl obj, Object value) {
                obj.setLastUpdateLogin((String)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(KeyDetails_VORowImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(KeyDetails_VORowImpl obj, Object value) {
                obj.setLastUpdatedBy((String)value);
            }
        }
        ,
        LeaseAgreementId {
            public Object get(KeyDetails_VORowImpl obj) {
                return obj.getLeaseAgreementId();
            }

            public void put(KeyDetails_VORowImpl obj, Object value) {
                obj.setLeaseAgreementId((BigDecimal)value);
            }
        }
        ,
        MoveInOutId {
            public Object get(KeyDetails_VORowImpl obj) {
                return obj.getMoveInOutId();
            }

            public void put(KeyDetails_VORowImpl obj, Object value) {
                obj.setMoveInOutId((BigDecimal)value);
            }
        }
        ,
        Status {
            public Object get(KeyDetails_VORowImpl obj) {
                return obj.getStatus();
            }

            public void put(KeyDetails_VORowImpl obj, Object value) {
                obj.setStatus((String)value);
            }
        }
        ,
        CheckBox_Trans {
            public Object get(KeyDetails_VORowImpl obj) {
                return obj.getCheckBox_Trans();
            }

            public void put(KeyDetails_VORowImpl obj, Object value) {
                obj.setCheckBox_Trans((Boolean)value);
            }
        }
        ,
        Lookup_View_ROVO1 {
            public Object get(KeyDetails_VORowImpl obj) {
                return obj.getLookup_View_ROVO1();
            }

            public void put(KeyDetails_VORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(KeyDetails_VORowImpl object);

        public abstract void put(KeyDetails_VORowImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int ATTRIBUTE1 = AttributesEnum.Attribute1.index();
    public static final int ATTRIBUTE10 = AttributesEnum.Attribute10.index();
    public static final int ATTRIBUTE2 = AttributesEnum.Attribute2.index();
    public static final int ATTRIBUTE3 = AttributesEnum.Attribute3.index();
    public static final int ATTRIBUTE4 = AttributesEnum.Attribute4.index();
    public static final int ATTRIBUTE5 = AttributesEnum.Attribute5.index();
    public static final int ATTRIBUTE6 = AttributesEnum.Attribute6.index();
    public static final int ATTRIBUTE7 = AttributesEnum.Attribute7.index();
    public static final int ATTRIBUTE8 = AttributesEnum.Attribute8.index();
    public static final int ATTRIBUTE9 = AttributesEnum.Attribute9.index();
    public static final int ATTRIBUTECATEGORY = AttributesEnum.AttributeCategory.index();
    public static final int BOOKINGID = AttributesEnum.BookingId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int KEYCODE = AttributesEnum.KeyCode.index();
    public static final int KEYID = AttributesEnum.KeyId.index();
    public static final int KEYQTY = AttributesEnum.KeyQty.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATELOGIN = AttributesEnum.LastUpdateLogin.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LEASEAGREEMENTID = AttributesEnum.LeaseAgreementId.index();
    public static final int MOVEINOUTID = AttributesEnum.MoveInOutId.index();
    public static final int STATUS = AttributesEnum.Status.index();
    public static final int CHECKBOX_TRANS = AttributesEnum.CheckBox_Trans.index();
    public static final int LOOKUP_VIEW_ROVO1 = AttributesEnum.Lookup_View_ROVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public KeyDetails_VORowImpl() {
    }

    /**
     * Gets KeyDetails_EO entity object.
     * @return the KeyDetails_EO
     */
    public EntityImpl getKeyDetails_EO() {
        return (EntityImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for ATTRIBUTE1 using the alias name Attribute1.
     * @return the ATTRIBUTE1
     */
    public String getAttribute1() {
        return (String) getAttributeInternal(ATTRIBUTE1);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE1 using the alias name Attribute1.
     * @param value value to set the ATTRIBUTE1
     */
    public void setAttribute1(String value) {
        setAttributeInternal(ATTRIBUTE1, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE10 using the alias name Attribute10.
     * @return the ATTRIBUTE10
     */
    public String getAttribute10() {
        return (String) getAttributeInternal(ATTRIBUTE10);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE10 using the alias name Attribute10.
     * @param value value to set the ATTRIBUTE10
     */
    public void setAttribute10(String value) {
        setAttributeInternal(ATTRIBUTE10, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE2 using the alias name Attribute2.
     * @return the ATTRIBUTE2
     */
    public String getAttribute2() {
        return (String) getAttributeInternal(ATTRIBUTE2);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE2 using the alias name Attribute2.
     * @param value value to set the ATTRIBUTE2
     */
    public void setAttribute2(String value) {
        setAttributeInternal(ATTRIBUTE2, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE3 using the alias name Attribute3.
     * @return the ATTRIBUTE3
     */
    public String getAttribute3() {
        return (String) getAttributeInternal(ATTRIBUTE3);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE3 using the alias name Attribute3.
     * @param value value to set the ATTRIBUTE3
     */
    public void setAttribute3(String value) {
        setAttributeInternal(ATTRIBUTE3, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE4 using the alias name Attribute4.
     * @return the ATTRIBUTE4
     */
    public String getAttribute4() {
        return (String) getAttributeInternal(ATTRIBUTE4);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE4 using the alias name Attribute4.
     * @param value value to set the ATTRIBUTE4
     */
    public void setAttribute4(String value) {
        setAttributeInternal(ATTRIBUTE4, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE5 using the alias name Attribute5.
     * @return the ATTRIBUTE5
     */
    public String getAttribute5() {
        return (String) getAttributeInternal(ATTRIBUTE5);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE5 using the alias name Attribute5.
     * @param value value to set the ATTRIBUTE5
     */
    public void setAttribute5(String value) {
        setAttributeInternal(ATTRIBUTE5, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE6 using the alias name Attribute6.
     * @return the ATTRIBUTE6
     */
    public String getAttribute6() {
        return (String) getAttributeInternal(ATTRIBUTE6);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE6 using the alias name Attribute6.
     * @param value value to set the ATTRIBUTE6
     */
    public void setAttribute6(String value) {
        setAttributeInternal(ATTRIBUTE6, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE7 using the alias name Attribute7.
     * @return the ATTRIBUTE7
     */
    public String getAttribute7() {
        return (String) getAttributeInternal(ATTRIBUTE7);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE7 using the alias name Attribute7.
     * @param value value to set the ATTRIBUTE7
     */
    public void setAttribute7(String value) {
        setAttributeInternal(ATTRIBUTE7, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE8 using the alias name Attribute8.
     * @return the ATTRIBUTE8
     */
    public String getAttribute8() {
        return (String) getAttributeInternal(ATTRIBUTE8);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE8 using the alias name Attribute8.
     * @param value value to set the ATTRIBUTE8
     */
    public void setAttribute8(String value) {
        setAttributeInternal(ATTRIBUTE8, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE9 using the alias name Attribute9.
     * @return the ATTRIBUTE9
     */
    public String getAttribute9() {
        return (String) getAttributeInternal(ATTRIBUTE9);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE9 using the alias name Attribute9.
     * @param value value to set the ATTRIBUTE9
     */
    public void setAttribute9(String value) {
        setAttributeInternal(ATTRIBUTE9, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE_CATEGORY using the alias name AttributeCategory.
     * @return the ATTRIBUTE_CATEGORY
     */
    public String getAttributeCategory() {
        return (String) getAttributeInternal(ATTRIBUTECATEGORY);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE_CATEGORY using the alias name AttributeCategory.
     * @param value value to set the ATTRIBUTE_CATEGORY
     */
    public void setAttributeCategory(String value) {
        setAttributeInternal(ATTRIBUTECATEGORY, value);
    }

    /**
     * Gets the attribute value for BOOKING_ID using the alias name BookingId.
     * @return the BOOKING_ID
     */
    public BigDecimal getBookingId() {
        return (BigDecimal) getAttributeInternal(BOOKINGID);
    }

    /**
     * Sets <code>value</code> as attribute value for BOOKING_ID using the alias name BookingId.
     * @param value value to set the BOOKING_ID
     */
    public void setBookingId(BigDecimal value) {
        setAttributeInternal(BOOKINGID, value);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy.
     * @param value value to set the CREATED_BY
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CREATION_DATE using the alias name CreationDate.
     * @return the CREATION_DATE
     */
    public Timestamp getCreationDate() {
        return (Timestamp) getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATION_DATE using the alias name CreationDate.
     * @param value value to set the CREATION_DATE
     */
    public void setCreationDate(Timestamp value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for DESCRIPTION using the alias name Description.
     * @return the DESCRIPTION
     */
    public String getDescription() {
        return (String) getAttributeInternal(DESCRIPTION);
    }

    /**
     * Sets <code>value</code> as attribute value for DESCRIPTION using the alias name Description.
     * @param value value to set the DESCRIPTION
     */
    public void setDescription(String value) {
        setAttributeInternal(DESCRIPTION, value);
    }

    /**
     * Gets the attribute value for KEY_CODE using the alias name KeyCode.
     * @return the KEY_CODE
     */
    public String getKeyCode() {
        return (String) getAttributeInternal(KEYCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for KEY_CODE using the alias name KeyCode.
     * @param value value to set the KEY_CODE
     */
    public void setKeyCode(String value) {
        setAttributeInternal(KEYCODE, value);
    }

    /**
     * Gets the attribute value for KEY_ID using the alias name KeyId.
     * @return the KEY_ID
     */
    public BigDecimal getKeyId() {
        return (BigDecimal) getAttributeInternal(KEYID);
    }

    /**
     * Sets <code>value</code> as attribute value for KEY_ID using the alias name KeyId.
     * @param value value to set the KEY_ID
     */
    public void setKeyId(BigDecimal value) {
        setAttributeInternal(KEYID, value);
    }

    /**
     * Gets the attribute value for KEY_QTY using the alias name KeyQty.
     * @return the KEY_QTY
     */
    public BigDecimal getKeyQty() {
        return (BigDecimal) getAttributeInternal(KEYQTY);
    }

    /**
     * Sets <code>value</code> as attribute value for KEY_QTY using the alias name KeyQty.
     * @param value value to set the KEY_QTY
     */
    public void setKeyQty(BigDecimal value) {
        setAttributeInternal(KEYQTY, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     * @return the LAST_UPDATE_DATE
     */
    public Timestamp getLastUpdateDate() {
        return (Timestamp) getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     * @param value value to set the LAST_UPDATE_DATE
     */
    public void setLastUpdateDate(Timestamp value) {
        setAttributeInternal(LASTUPDATEDATE, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATE_LOGIN using the alias name LastUpdateLogin.
     * @return the LAST_UPDATE_LOGIN
     */
    public String getLastUpdateLogin() {
        return (String) getAttributeInternal(LASTUPDATELOGIN);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATE_LOGIN using the alias name LastUpdateLogin.
     * @param value value to set the LAST_UPDATE_LOGIN
     */
    public void setLastUpdateLogin(String value) {
        setAttributeInternal(LASTUPDATELOGIN, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @return the LAST_UPDATED_BY
     */
    public String getLastUpdatedBy() {
        return (String) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @param value value to set the LAST_UPDATED_BY
     */
    public void setLastUpdatedBy(String value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LEASE_AGREEMENT_ID using the alias name LeaseAgreementId.
     * @return the LEASE_AGREEMENT_ID
     */
    public BigDecimal getLeaseAgreementId() {
        return (BigDecimal) getAttributeInternal(LEASEAGREEMENTID);
    }

    /**
     * Sets <code>value</code> as attribute value for LEASE_AGREEMENT_ID using the alias name LeaseAgreementId.
     * @param value value to set the LEASE_AGREEMENT_ID
     */
    public void setLeaseAgreementId(BigDecimal value) {
        setAttributeInternal(LEASEAGREEMENTID, value);
    }

    /**
     * Gets the attribute value for MOVE_IN_OUT_ID using the alias name MoveInOutId.
     * @return the MOVE_IN_OUT_ID
     */
    public BigDecimal getMoveInOutId() {
        return (BigDecimal) getAttributeInternal(MOVEINOUTID);
    }

    /**
     * Sets <code>value</code> as attribute value for MOVE_IN_OUT_ID using the alias name MoveInOutId.
     * @param value value to set the MOVE_IN_OUT_ID
     */
    public void setMoveInOutId(BigDecimal value) {
        setAttributeInternal(MOVEINOUTID, value);
    }

    /**
     * Gets the attribute value for STATUS using the alias name Status.
     * @return the STATUS
     */
    public String getStatus() {
        return (String) getAttributeInternal(STATUS);
    }

    /**
     * Sets <code>value</code> as attribute value for STATUS using the alias name Status.
     * @param value value to set the STATUS
     */
    public void setStatus(String value) {
        setAttributeInternal(STATUS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CheckBox_Trans.
     * @return the CheckBox_Trans
     */
    public Boolean getCheckBox_Trans() {
        Boolean flag = false;
               if (this.getStatus() != null && this.getStatus().equals("Y")) {
                   flag = true;
               } else {
                   flag = false;
               }
               return flag;
       // return (Boolean) getAttributeInternal(CHECKBOX_TRANS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CheckBox_Trans.
     * @param value value to set the  CheckBox_Trans
     */
    public void setCheckBox_Trans(Boolean value) {
        if (value) {
                    setStatus("Y");
                } else {
                    setStatus("N");
                }
        //setAttributeInternal(CHECKBOX_TRANS, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> Lookup_View_ROVO1.
     */
    public RowSet getLookup_View_ROVO1() {
        return (RowSet)getAttributeInternal(LOOKUP_VIEW_ROVO1);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}