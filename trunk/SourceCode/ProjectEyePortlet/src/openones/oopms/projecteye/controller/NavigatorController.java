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

import javax.portlet.RenderRequest;

import openones.oopms.projecteye.model.Developer;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

/**
 * @author HaiTCT
 */
@Controller
@RequestMapping("VIEW")
public class NavigatorController {

	Developer user = new Developer();
	/** Logger for logging. */
	private static Logger log = Logger.getLogger(NavigatorController.class);

	@RenderMapping(params = "action=GoRiskIssue")
	public ModelAndView postGoRiskIssue(RenderRequest request) {
		log.debug("post GoRiskIssue.START");
		ModelAndView mav = new ModelAndView("RiskIssue");
		String projectId = request.getParameter("projectId");
		log.debug("project ID la " + projectId);
		mav.addObject("projectId", projectId);
		return mav;
	}

	@RenderMapping(params = "action=GoChangeRequest")
	public ModelAndView postGoChangeRequest(RenderRequest request) {
		log.debug("post GoChangeRequest.START");
		ModelAndView mav = new ModelAndView("ChangeRequest");
		String projectId = request.getParameter("projectId");
		log.debug("project ID la " + projectId);
		mav.addObject("projectId", projectId);
		return mav;
	}

	@RenderMapping(params = "action=GoProduct")
	public ModelAndView postGoProduct(RenderRequest request) {
		log.debug("post GoProduct.START");
		ModelAndView mav = new ModelAndView("Product");
		String projectId = request.getParameter("projectId");
		log.debug("project ID la " + projectId);
		mav.addObject("projectId", projectId);
		return mav;
	}

	@RenderMapping(params = "action=GoWorkOrder")
	public ModelAndView postGoWorkOrder(RenderRequest request) {
		log.debug("post GoWorkOrder.START");
		ModelAndView mav = new ModelAndView("WorkOrder");
		String projectId = request.getParameter("projectId");
		log.debug("project ID la " + projectId);
		mav.addObject("projectId", projectId);
		return mav;
	}

	@RenderMapping(params = "action=GoCostManagement")
	public ModelAndView postGoCostManagement(RenderRequest request) {
		log.debug("post GoCostManagement.START");
		ModelAndView mav = new ModelAndView("CostManagement");
		String projectId = request.getParameter("projectId");
		log.debug("project ID la " + projectId);
		mav.addObject("projectId", projectId);
		return mav;
	}
}