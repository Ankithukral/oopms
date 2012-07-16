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
package openones.oopms.projecteye.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;

import openones.oopms.projecteye.dao.RiskDao;
import openones.oopms.projecteye.form.CreateRiskForm;
import openones.oopms.projecteye.model.Developer;
import openones.oopms.projecteye.model.RiskSource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

/**
 * @author HaiTCT
 */
@Controller
@RequestMapping("VIEW")
public class RiskIssueController {

	Developer user = new Developer();
	/** Logger for logging. */
	private static Logger log = Logger.getLogger(RiskIssueController.class);

	@ActionMapping(params = "action=GoCreateRisk")
    public void processGoCreateRisk(BindingResult result, SessionStatus status, ActionResponse response) {
        log.debug("process GoCreateRisk.START");
        response.setRenderParameter("action", "GoCreateRisk");    
    }
    
    @RenderMapping(params = "action=GoCreateRisk")
    public ModelAndView postGoCreateRisk(RenderRequest request) {
    	log.debug("post GoCreateRisk.START");
        CreateRiskForm riskFormBean = new CreateRiskForm();
		RiskDao rDao = new RiskDao();
		ArrayList<RiskSource> riskSource = rDao.getRiskSourceList();
		Map<String, String> riskSourcetMap = new LinkedHashMap<String, String>();
		riskSourcetMap.put(" ", " ");
		for (int i = 0; i < riskSource.size(); i++) {
			riskSourcetMap.put(riskSource.get(i).getSourceId().toString(),
					riskSource.get(i).getSourceName());
		}
		riskFormBean.setRiskSource(riskSourcetMap);
		riskFormBean.setRiskSource_SelectedValue(" ");
        ModelAndView mav = new ModelAndView("CreateRisk");
        request.setAttribute("CreateRiskForm", riskFormBean);
     // Set default value for risk source
        mav.addObject("riskSource", riskFormBean.getRiskSource());
        mav.addObject("riskSource_SelectedValue", riskFormBean.getRiskSource_SelectedValue());
        String projectId = request.getParameter("projectId");
        log.debug("project ID la "+ projectId);
        mav.addObject("projectId", projectId);
        return mav;
    }
    
    
    @ActionMapping(params = "action=GoCreateIssue")
    public void processGoCreateIssue(BindingResult result, SessionStatus status, ActionResponse response) {
        log.debug("process GoCreateIssue.START");
        response.setRenderParameter("action", "GoCreateIssue");    
    }
    
    @RenderMapping(params = "action=GoCreateIssue")
    public ModelAndView postGoCreateIssue(RenderRequest request) {
        log.debug("post GoCreateIssue.START");
        ModelAndView mav = new ModelAndView("CreateIssue");
        String projectId = request.getParameter("projectId");
        log.debug("project ID la "+ projectId);
        mav.addObject("projectId", projectId);
        return mav;
    }
    
}