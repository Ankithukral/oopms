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
package openones.oopms.dashboard.model;

import openones.oopms.entity.Project;

/**
 * @author PNTG
 */
public class Dashboard {
    public static final String GOOD_STATUS = "good";
    public static final String NORMAL_STATUS = "normal";
    public static final String BAD_STATUS = "bad";
    private Project project;
    private Boolean visible;
    private String projectHealthStatus;
    private String costStatus;
    private String efficiencyStatus;
    private int percentProgress;
    private int percentTime;

    public Dashboard() {
        visible = true;
    }

    /**
     * Get value of projectHealthStatus.
     * @return the projectHealthStatus
     */
    public String getProjectHealthStatus() {
        return projectHealthStatus;
    }

    /**
     * Set the value for projectHealthStatus.
     * @param projectHealthStatus the projectHealthStatus to set
     */
    public void setProjectHealthStatus(String projectHealthStatus) {
        this.projectHealthStatus = projectHealthStatus;
    }

    /**
     * Get value of costStatus.
     * @return the costStatus
     */
    public String getCostStatus() {
        return costStatus;
    }

    /**
     * Set the value for costStatus.
     * @param costStatus the costStatus to set
     */
    public void setCostStatus(String costStatus) {
        this.costStatus = costStatus;
    }

    /**
     * Get value of efficiencyStatus.
     * @return the efficiencyStatus
     */
    public String getEfficiencyStatus() {
        return efficiencyStatus;
    }

    /**
     * Set the value for efficiencyStatus.
     * @param efficiencyStatus the efficiencyStatus to set
     */
    public void setEfficiencyStatus(String efficiencyStatus) {
        this.efficiencyStatus = efficiencyStatus;
    }

    /**
     * Get value of percentProgress.
     * @return the percentProgress
     */
    public int getPercentProgress() {
        return percentProgress;
    }

    /**
     * Set the value for percentProgress.
     * @param percentProgress the percentProgress to set
     */
    public void setPercentProgress(int percentProgress) {
        this.percentProgress = percentProgress;
    }

    /**
     * Get value of percentTime.
     * @return the percentTime
     */
    public int getPercentTime() {
        return percentTime;
    }

    /**
     * Set the value for percentTime.
     * @param percentTime the percentTime to set
     */
    public void setPercentTime(int percentTime) {
        this.percentTime = percentTime;
    }

    /**
     * Get value of visible.
     * @return the visible
     */
    public Boolean getVisible() {
        return visible;
    }

    /**
     * Set the value for visible.
     * @param visible the visible to set
     */
    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    /**
     * Get value of project.
     * @return the project
     */
    public Project getProject() {
        return project;
    }

    /**
     * Set the value for project.
     * @param project the project to set
     */
    public void setProject(Project project) {
        this.project = project;
    }

}