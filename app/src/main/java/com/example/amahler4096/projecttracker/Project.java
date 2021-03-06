package com.example.amahler4096.projecttracker;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

/**
 * Created by amahler4096 on 10/24/2016.  Holds info for each individual project.
 */
public class Project {

    // Project variable declarations:
    private UUID mProjectIDTag;
    private String mProjectTitle = "";
    private String mProjectCategory = "";
    private Date mProjectStartDate = Calendar.getInstance().getTime();
    private Date mProjectEndDate = Calendar.getInstance().getTime();
    private String mProjectDescription = "";
    private String mProjectNotes = "";

    // Project properties / getters and setters:


    public UUID getmProjectIDTag() {
        return mProjectIDTag;
    }

    public void setmProjectIDTag(UUID mProjectIDTag) {
        this.mProjectIDTag = mProjectIDTag;
    }

    public String getProjectTitle() {
        return mProjectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        mProjectTitle = projectTitle;
    }

    public String getProjectCategory() {
        return mProjectCategory;
    }

    public void setProjectCategory(String projectCategory) {
        mProjectCategory = projectCategory;
    }

    public Date getProjectStartDate() {
        return mProjectStartDate;
    }

    public void setProjectStartDate(Date projectStartDate) {
        mProjectStartDate = projectStartDate;
    }

    public Date getProjectEndDate() {
        return mProjectEndDate;
    }

    public void setProjectEndDate(Date projectEndDate) {
        mProjectEndDate = projectEndDate;
    }

    public String getProjectDescription() {
        return mProjectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        mProjectDescription = projectDescription;
    }

    public String getProjectNotes() {
        return mProjectNotes;
    }

    public void setProjectNotes(String projectNotes) {
        mProjectNotes = projectNotes;
    }

    // Project constructor:
    public Project() {
        mProjectIDTag = UUID.randomUUID();
        mProjectTitle = "New Project";
        mProjectCategory= "Please Enter a Category";
        mProjectStartDate =  new Date();
        mProjectEndDate = new Date();
        mProjectDescription = "Please Enter a Description";
        mProjectNotes= "Add Notes here";

    }

    public Project (UUID id) {
        mProjectIDTag = id;
    }

    // Public method to add a new Project:
    public void AddProject(UUID uuid, String title, String category, Date startDate, Date endDate,
                           String description, String notes) {
        mProjectIDTag = uuid;
        mProjectTitle = title;
        mProjectCategory = category;
        mProjectStartDate = startDate;
        mProjectEndDate = endDate;
        mProjectDescription = description;
        mProjectNotes = notes;
    }


}
