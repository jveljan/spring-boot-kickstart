package com.generic.startup.dto;

/**
 * Created by joco on 4/20/16.
 */
public class AwesomeThing {
    private String title;
    private String url;
    private String description;
    private String logo;

    public AwesomeThing() {
    }

    public AwesomeThing(String title, String url, String description, String logo) {
        this.title = title;
        this.url = url;
        this.description = description;
        this.logo = logo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
