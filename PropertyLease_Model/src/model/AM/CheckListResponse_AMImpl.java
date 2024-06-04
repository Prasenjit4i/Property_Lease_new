package model.AM;

import model.AM.common.CheckListResponse_AM;

import model.VO.ChecklistResponse_VOImpl;

import oracle.jbo.ViewCriteria;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed May 23 12:51:28 IST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CheckListResponse_AMImpl extends ApplicationModuleImpl implements CheckListResponse_AM {
    /**
     * This is the default constructor (do not remove).
     */
    public CheckListResponse_AMImpl() {
    }

    /**
     * Container's getter for ChecklistResponse_VO1.
     * @return ChecklistResponse_VO1
     */
    public ChecklistResponse_VOImpl getChecklistResponse_VO1() {
        return (ChecklistResponse_VOImpl)findViewObject("ChecklistResponse_VO1");
    }
    public void refreshchecklist(String funcid, String funcrefid, String Lookup) {
        ViewObjectImpl vo = this.getChecklistResponse_VO1();
        ViewCriteria vc = vo.getViewCriteria("FilterCheckList");
        vo.setNamedWhereClauseParam("bv_func_id", funcid);
        vo.setNamedWhereClauseParam("bv_funcref_id", funcrefid);
        vo.setNamedWhereClauseParam("bv_lookup", Lookup);
        vo.applyViewCriteria(vc);
        vo.executeQuery();
        //vo.first();
    }
    /**
     * Container's getter for CheckListResponse_ROVO1.
     * @return CheckListResponse_ROVO1
     */
    public ViewObjectImpl getCheckListResponse_ROVO1() {
        return (ViewObjectImpl)findViewObject("CheckListResponse_ROVO1");
    }
}
