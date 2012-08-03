package openones.oopms.requirement.controller;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.ActionResponse;
import javax.portlet.PortletSession;
import javax.portlet.RenderRequest;

import openones.oopms.requirement.validator.RequiremendAddValidator;
import openones.oopms.requirement.dao.RequirementDAO;
import openones.oopms.requirement.form.RequirementForm;
import openones.oopms.requirement.form.RequirementUpdateForm;
import openones.oopms.requirement.model.Project;
import openones.oopms.requirement.model.Requirements;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

@Controller
@RequestMapping("VIEW")
public class RequirementUpdateController {
    /** Logger for logging. */  
    private static Logger log = Logger.getLogger(RequirementUpdateController.class);      
    private List<Project> projectList;    
    private BigDecimal updatedReqID;
        
    //not in use
    @ActionMapping(params = "action=goUpdateRequirement")
    public void processgoAddNewRequirementAction(RequirementForm formBean, BindingResult result, SessionStatus status, ActionResponse response) {
        log.debug("goUpdateRequirementAction");                 
        response.setRenderParameter("action", "goUpdateRequirement");
    }
    
    
    @RenderMapping(params = "action=goUpdateRequirement")
    public ModelAndView postRequirementAdd(RequirementForm formBean, RenderRequest request) {
        log.debug("goUpdateRequirementRender");                         
        
        RequirementDAO requirementDAO = new RequirementDAO();        
        ModelAndView mav = new ModelAndView("RequirementUpdate","RequirementUpdateForm",new RequirementUpdateForm());  
               
        List<Requirements> toBeUpdatedReq = new ArrayList<Requirements>(1);
        List<Requirements> tempList;        
        tempList = formBean.getRequirementList();
        if(tempList == null) {
            log.debug("ListdeleteRequirementHereNULLor>1");
        }
        else {            
            for (int i = 0; i < tempList.size(); i++) {
                if (tempList.get(i).getRequirementID() != null) {
                    String reqID = tempList.get(i).getRequirementID().toString();
                    try {
                        toBeUpdatedReq.add(requirementDAO.getReq(reqID));
                    } catch (ParseException ex) {
                        // TODO Auto-generated catch block
                        ex.printStackTrace();
                    }
                    break;
                }
            }
            
            updatedReqID = toBeUpdatedReq.get(0).getRequirementID();
            
            log.debug("=============================================================================");
            log.debug("updaterender: "+toBeUpdatedReq.get(0).getRequirementID());
            log.debug("updaterender: "+toBeUpdatedReq.get(0).getRequirement());
            log.debug("updaterender: "+toBeUpdatedReq.get(0).getReqSize());
            log.debug("updaterender: "+toBeUpdatedReq.get(0).getType());
            log.debug("updaterender: "+toBeUpdatedReq.get(0).getSrs());
            log.debug("updaterender: "+toBeUpdatedReq.get(0).getReleaseNote());
            log.debug("updaterender: "+toBeUpdatedReq.get(0).getDd());
            log.debug("updaterender: "+toBeUpdatedReq.get(0).getEffort());
            log.debug("updaterender: "+toBeUpdatedReq.get(0).getElapsedDay());
            log.debug("updaterender: "+toBeUpdatedReq.get(0).getTestcase());
            log.debug("updaterender: "+toBeUpdatedReq.get(0).getCodeModule());
            try
            {
            log.debug("updaterender: "+toBeUpdatedReq.get(0).getCreateDate().toString());
            log.debug("updaterender: "+toBeUpdatedReq.get(0).getDesignedDate().toString());
            log.debug("updaterender: "+toBeUpdatedReq.get(0).getCodedDate().toString());
            log.debug("updaterender: "+toBeUpdatedReq.get(0).getTestedDate().toString());
            log.debug("updaterender: "+toBeUpdatedReq.get(0).getDeployedDate().toString());
            log.debug("updaterender: "+toBeUpdatedReq.get(0).getAcceptedDate().toString());
            log.debug("updaterender: "+toBeUpdatedReq.get(0).getResponseDate().toString());
            log.debug("updaterender: "+toBeUpdatedReq.get(0).getCommmitedDate().toString());
            log.debug("updaterender: "+toBeUpdatedReq.get(0).getCancelledDate().toString());
            }catch(Exception e)
            {
                e.printStackTrace();
                log.debug("Print date problems");
            }
            log.debug("=============================================================================");
        }
        
        
        
      //Get project name list                  
        projectList = requirementDAO.getAllProject();  
        log.debug("projectlist after:" +projectList.size());
        
        Map<String,String> projectMap = new LinkedHashMap<String,String>();
        log.debug("projectmap before:" +projectMap.size());
        for (int i=0; i<projectList.size();i++) {
            projectMap.put(projectList.get(i).getProjectId().toString(), projectList.get(i).getName());
        }
        log.debug("projectmap after:" +projectMap.size());
        
        formBean.setProjectMap(projectMap);        
        mav.addObject("currentRequirement", toBeUpdatedReq.get(0));
        mav.addObject("projectDefault", formBean.getProjectDefault());
        mav.addObject("projectMap", formBean.getProjectMap());
        
        return mav;
    }
    
    
    /**
     * Process submitted form by clicking "Add" button.
     * @param formBean bean captures input data
     * @param result result of binding data
     * @param status status of session
     * @param response response of action
     */
    @ActionMapping(params = "action=SaveUpdate")
    public void processSave(RequirementUpdateForm formBean, BindingResult result, SessionStatus status, ActionResponse response, PortletSession session) {
        log.debug("SaveUpdateRequirementAction.START");        
        
        log.debug("getRequirementUpdateName: "+formBean.getRequirementName());
        log.debug("getReqUpdateSize: "+formBean.getReqSize());
        
        Validator addReqValidator = new RequiremendAddValidator();
        addReqValidator.validate(formBean, result);
        
        if (!result.hasErrors()) {
            // Prepare parameter to render phase
            log.debug("ValidationOk");
            response.setRenderParameter("action", "SaveUpdate");
        } else {
            log.error("Error in binding result:" + result.getErrorCount());            
            // Re-display the Add Defect screen with errors            
            log.debug("ValidationError: "+result.toString());
            response.setRenderParameter("action", "SaveUpdate");
        }        
    }
    
    @RenderMapping(params = "action=SaveUpdate")
    public ModelAndView postSave(RequirementUpdateForm formBean, RenderRequest request) {
        log.debug("SaveUpdateRequirementActionRender");                         
        
        RequirementDAO requirementDao = new RequirementDAO();
        Requirements requirement = new Requirements();

        // set value for project
        requirement.setProjectID(new BigDecimal(formBean.getProjectDefault()));
        
        log.debug("getRequirementIDIDIDIDIDID: "+requirement.getRequirementID());  
        log.debug("getProjectIDIDIDIDIDID: "+requirement.getProjectID());
        log.debug("updatedReqID: "+updatedReqID);
        
        requirement.setRequirementID(updatedReqID);
        log.debug("getRequirementIDIDIDIDIDID2222: "+requirement.getRequirementID());
        
        requirement.setRequirement(formBean.getRequirementName());
        log.debug("getRequirementName: "+requirement.getRequirement());
        
        requirement.setReqSize(formBean.getReqSize());
        log.debug("getReqSize: "+requirement.getReqSize());
        
        requirement.setType(formBean.getReqType());
        log.debug("getReqType: "+requirement.getType());
        
        requirement.setSrs(formBean.getSrs());
        log.debug("getSrs: "+requirement.getSrs());
        
        requirement.setReleaseNote(formBean.getReleaseNote());
        log.debug("getReleaseNote: "+requirement.getReleaseNote());
        
        requirement.setDd(formBean.getDocument());
        log.debug("getDocument: "+requirement.getDd());
        
        requirement.setEffort(formBean.getEffort());
        log.debug("getEffort: "+requirement.getEffort());       
        
        requirement.setElapsedDay(formBean.getElapsedDay());
        log.debug("getElapsedDay: "+requirement.getElapsedDay());
        
        requirement.setTestcase(formBean.getTestCase());
        log.debug("getTestCase: "+requirement.getTestcase());
        
        requirement.setCodeModule(formBean.getCodeModule());
        log.debug("getCodeModule: "+requirement.getCodeModule());
        
        DateFormat formatter;
        formatter = new SimpleDateFormat("MM/dd/yyyy");                
        
        try {
            requirement.setCreateDate((Date) formatter.parse(formBean.getCreatedDate()));
            requirement.setDesignedDate((Date) formatter.parse(formBean.getDesignedDate()));
            requirement.setCodedDate((Date) formatter.parse(formBean.getCodedDate()));
            requirement.setTestedDate((Date) formatter.parse(formBean.getTestedDate()));
            requirement.setDeployedDate((Date) formatter.parse(formBean.getDeployedDate()));
            requirement.setAcceptedDate((Date) formatter.parse(formBean.getAcceptedDate()));
            requirement.setResponseDate((Date) formatter.parse(formBean.getResponseDate()));
            requirement.setCommmitedDate((Date) formatter.parse(formBean.getCommittedDate()));
            requirement.setCancelledDate((Date) formatter.parse(formBean.getCancelledDate()));
            
        } catch (ParseException ex) {
            // TODO Auto-generated catch block
            ex.printStackTrace();
        }        
        log.debug("SaveUpdateRequirementActionRenderGetUpdateInforOk");
        requirementDao.updateReq(requirement);
        
        ModelAndView mav = new ModelAndView("hello");  
        return mav;
    }
    

}