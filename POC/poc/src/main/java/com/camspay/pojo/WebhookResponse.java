package com.camspay.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class WebhookResponse
{
    private Content content;

    private String id;

    private String date_created;

    private String event_name;

    public Content getContent ()
    {
        return content;
    }

    public void setContent (Content content)
    {
        this.content = content;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getDate_created ()
    {
        return date_created;
    }

    public void setDate_created (String date_created)
    {
        this.date_created = date_created;
    }

    public String getEvent_name ()
    {
        return event_name;
    }

    public void setEvent_name (String event_name)
    {
        this.event_name = event_name;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [content = "+content+", id = "+id+", date_created = "+date_created+", event_name = "+event_name+"]";
    }
}