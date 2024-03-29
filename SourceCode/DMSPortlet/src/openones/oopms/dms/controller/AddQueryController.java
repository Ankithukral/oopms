/**
 * Licensed to Open-Ones Group under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Open-Ones Group licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a
 * copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package openones.oopms.dms.controller;

import java.util.Map;

import javax.portlet.ActionResponse;
import javax.portlet.PortletSession;
import javax.portlet.RenderRequest;

import openones.oopms.dms.biz.DMSWorkspace;
import openones.oopms.dms.form.DefectForm;
import openones.oopms.dms.form.QueryForm;
import openones.oopms.dms.validator.AddDefectValidator;
import openones.oopms.portlet.controller.BaseController;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

/**
 * @author Thach.Le
 */
@Controller
@RequestMapping(value = "VIEW")
public class AddQueryController extends BaseController {

    /**
     * Create bean for form.
     * @return Form bean for UI.
     */
    @ModelAttribute("queryForm")
    public QueryForm getCommandObject() {
        log.debug("getCommandObject.START");
        QueryForm formBean = new QueryForm();

        return formBean;
    }
    
    @RenderMapping(params = "action=goAddQuery")
    public ModelAndView processGoAddQuery(RenderRequest request, PortletSession session) {
        log.debug("processGoAddQuery");

        ModelAndView mav = new ModelAndView("AddQuery"); // display AddDefect.jsp
        Map<Integer, String> qcActivityMap = DMSWorkspace.getDefaultWorkspace().getActivityMap();
        
        mav.addObject("defect", new DefectForm());
        mav.addObject("qcActivity", qcActivityMap);

        return mav;
    }
    
    /**
     * Process submitted form by clicking "Add" button.
     * @param formBean bean captures input data
     * @param result result of binding data
     * @param status status of session
     * @param response response of action
     */
    @ActionMapping(params = "action=saveQuery")
    public void processSave(QueryForm formBean, BindingResult result, SessionStatus status, ActionResponse response) {
        log.debug("processSave.START");

    }   
}
