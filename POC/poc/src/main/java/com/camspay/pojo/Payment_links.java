package com.camspay.pojo;

public class Payment_links
{
    private String iframe;

    private String web;

    private String mobile;

    public String getIframe ()
    {
        return iframe;
    }

    public void setIframe (String iframe)
    {
        this.iframe = iframe;
    }

    public String getWeb ()
    {
        return web;
    }

    public void setWeb (String web)
    {
        this.web = web;
    }

    public String getMobile ()
    {
        return mobile;
    }

    public void setMobile (String mobile)
    {
        this.mobile = mobile;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [iframe = "+iframe+", web = "+web+", mobile = "+mobile+"]";
    }
}