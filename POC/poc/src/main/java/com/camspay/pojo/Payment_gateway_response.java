package com.camspay.pojo;

public class Payment_gateway_response
{
    private String rrn;

    private String created;

    private String txn_id;

    private String resp_code;

    private String epg_txn_id;

    private String auth_id_code;

    private String resp_message;

    public String getRrn ()
    {
        return rrn;
    }

    public void setRrn (String rrn)
    {
        this.rrn = rrn;
    }

    public String getCreated ()
    {
        return created;
    }

    public void setCreated (String created)
    {
        this.created = created;
    }

    public String getTxn_id ()
    {
        return txn_id;
    }

    public void setTxn_id (String txn_id)
    {
        this.txn_id = txn_id;
    }

    public String getResp_code ()
    {
        return resp_code;
    }

    public void setResp_code (String resp_code)
    {
        this.resp_code = resp_code;
    }

    public String getEpg_txn_id ()
    {
        return epg_txn_id;
    }

    public void setEpg_txn_id (String epg_txn_id)
    {
        this.epg_txn_id = epg_txn_id;
    }

    public String getAuth_id_code ()
    {
        return auth_id_code;
    }

    public void setAuth_id_code (String auth_id_code)
    {
        this.auth_id_code = auth_id_code;
    }

    public String getResp_message ()
    {
        return resp_message;
    }

    public void setResp_message (String resp_message)
    {
        this.resp_message = resp_message;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [rrn = "+rrn+", created = "+created+", txn_id = "+txn_id+", resp_code = "+resp_code+", epg_txn_id = "+epg_txn_id+", auth_id_code = "+auth_id_code+", resp_message = "+resp_message+"]";
    }
}