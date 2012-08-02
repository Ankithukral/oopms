package openones.oopms.requirement.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.ActionResponse;
import javax.portlet.PortletSession;
import javax.portlet.RenderRequest;

import openones.oopms.requirement.validator.RequiremendAddValidator;
import openones.oopms.requirement.dao.RequirementDAO;
import openones.oopms.requirement.form.RequirementAddForm;
import openones.oopms.requirement.form.RequirementForm;
import openones.oopms.requirement.model.Project;
import openones.oopms.requirement.model.Requirements;
import openones.portlet.PortletSupport;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

@Controller
@RequestMapping("VIEW")
public class RequirementAddController {
    /** Logger for logging. */  
    private static Logger log = Logger.getLogger(RequirementAddController.class);      
    private List<Project> projectList;
                
    /**
     * Create bean for form.
     * @return Form bean for UI.
     */
//    @ModelAttribute("RequirementForm")
//    public RequirementForm getCommandObject(RenderRequest request) {
//        log.debug("RequirementAddForm.START");                       
//               
//        RequirementForm formBean = new RequirementForm();
//        formBean.setTitle("RequirementAddForm");                                          
//        return formBean;
//    }
    
    @RenderMapping(params = "action=sort")
    public  ModelAndView postRequirementSort(RequirementForm formBean, RenderRequest request) {
        log.debug("postRequirementSortSTART");                                 
        ModelAndView mav = new ModelAndView("RequirementAdd");                
        return mav;
    }
    
    @ActionMapping(params = "action=sortAction")
    public void processSortAction(RequirementAddForm formBean, BindingResult result, SessionStatus status, ActionResponse response, PortletSession session) {
        log.debug("processSortActionSTART");
        log.debug("Sort requirement button ");
    }
    
    @ActionMapping(params = "action=goAddNewRequirementAction")
    public void processgoAddNewRequirementAction(RequirementForm formBean, BindingResult result, SessionStatus status, ActionResponse response) {
        log.debug("goAddNewRequirementActionSTART");
        log.debug("goAddNewRequirementAction Test");
        System.out.println("testgoAddNewRequirementAction");
        response.setRenderParameter("action", "goAddNewRequirement");
    }
    
    
    @RenderMapping(params = "action=goAddNewRequirement")
    public ModelAndView postRequirementAdd(RequirementForm formBean, RenderRequest request) {
        log.debug("goAddNewRequirementSTART");                         
        
        ModelAndView mav = new ModelAndView("RequirementAdd","RequirementAddForm",new RequirementAddForm());  
        
        //Get project name list
        RequirementDAO requirementDAO = new RequirementDAO();           
        projectList = requirementDAO.getAllProject();  
        log.debug("projectlist after:" +projectList.size());
        
        Map<String,String> projectMap = new LinkedHashMap<String,String>();
        log.debug("projectmap before:" +projectMap.size());
        for (int i=0; i<projectList.size();i++) {
            projectMap.put(projectList.get(i).getProjectId().toString(), projectList.get(i).getName());
        }
        log.debug("projectmap after:" +projectMap.size());
        
        formBean.setProjectMap(projectMap);        
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
    @ActionMapping(params = "action=Save")
    public void processSave(RequirementAddForm formBean, BindingResult result, SessionStatus status, ActionResponse response, PortletSession session) {
        log.debug("processLogin.START");
        log.debug("Save requirement button ");
        
        log.debug("getRequirementName: "+formBean.getRequirementName());
        log.debug("getReqSize: "+formBean.getReqSize());
        
        Validator addReqValidator = new RequiremendAddValidator();
        addReqValidator.validate(formBean, result);
        
        if (!result.hasErrors()) {
            // Prepare parameter to render phase
            log.debug("ValidationOk");
            response.setRenderParameter("action", "Save");
        } else {
            log.error("Error in binding result:" + result.getErrorCount());            
            // Re-display the Add Defect screen with errors            
            log.debug("ValidationError: "+result.toString());
            response.setRenderParameter("action", "Save");
        }        
    }
    
    @RenderMapping(params = "action=Save")
    public ModelAndView postSave(RequirementAddForm formBean, RenderRequest request) {
        log.debug("goAddNewRequirementSTART");                         
        
        RequirementDAO requirementDao = new RequirementDAO();
        Requirements requirement = new Requirements();

        // set value for project
        requirement.setProjectID(new BigDecimal(formBean.getProjectDefault()));
        
        
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
        
        //requirement.setCreateDate(createDate);
        
        requirementDao.insertReq(requirement);
        
        ModelAndView mav = new ModelAndView("hello");  
        return mav;
    }
    

}