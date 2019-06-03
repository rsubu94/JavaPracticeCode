package com.camspay.pojo;

public class Card
{
    private String card_issuer;

    private String saved_to_locker;

    private String card_brand;

    private String card_reference;

    private String card_type;

    private String card_fingerprint;

    private String expiry_year;

    private String using_saved_card;

    private String card_isin;

    private String name_on_card;

    private String last_four_digits;

    private String expiry_month;

    public String getCard_issuer ()
    {
        return card_issuer;
    }

    public void setCard_issuer (String card_issuer)
    {
        this.card_issuer = card_issuer;
    }

    public String getSaved_to_locker ()
    {
        return saved_to_locker;
    }

    public void setSaved_to_locker (String saved_to_locker)
    {
        this.saved_to_locker = saved_to_locker;
    }

    public String getCard_brand ()
    {
        return card_brand;
    }

    public void setCard_brand (String card_brand)
    {
        this.card_brand = card_brand;
    }

    public String getCard_reference ()
    {
        return card_reference;
    }

    public void setCard_reference (String card_reference)
    {
        this.card_reference = card_reference;
    }

    public String getCard_type ()
    {
        return card_type;
    }

    public void setCard_type (String card_type)
    {
        this.card_type = card_type;
    }

    public String getCard_fingerprint ()
    {
        return card_fingerprint;
    }

    public void setCard_fingerprint (String card_fingerprint)
    {
        this.card_fingerprint = card_fingerprint;
    }

    public String getExpiry_year ()
    {
        return expiry_year;
    }

    public void setExpiry_year (String expiry_year)
    {
        this.expiry_year = expiry_year;
    }

    public String getUsing_saved_card ()
    {
        return using_saved_card;
    }

    public void setUsing_saved_card (String using_saved_card)
    {
        this.using_saved_card = using_saved_card;
    }

    public String getCard_isin ()
    {
        return card_isin;
    }

    public void setCard_isin (String card_isin)
    {
        this.card_isin = card_isin;
    }

    public String getName_on_card ()
    {
        return name_on_card;
    }

    public void setName_on_card (String name_on_card)
    {
        this.name_on_card = name_on_card;
    }

    public String getLast_four_digits ()
    {
        return last_four_digits;
    }

    public void setLast_four_digits (String last_four_digits)
    {
        this.last_four_digits = last_four_digits;
    }

    public String getExpiry_month ()
    {
        return expiry_month;
    }

    public void setExpiry_month (String expiry_month)
    {
        this.expiry_month = expiry_month;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [card_issuer = "+card_issuer+", saved_to_locker = "+saved_to_locker+", card_brand = "+card_brand+", card_reference = "+card_reference+", card_type = "+card_type+", card_fingerprint = "+card_fingerprint+", expiry_year = "+expiry_year+", using_saved_card = "+using_saved_card+", card_isin = "+card_isin+", name_on_card = "+name_on_card+", last_four_digits = "+last_four_digits+", expiry_month = "+expiry_month+"]";
    }
}
