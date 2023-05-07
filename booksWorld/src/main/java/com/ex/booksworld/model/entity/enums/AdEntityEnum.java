package com.ex.booksworld.model.entity.enums;

public enum AdEntityEnum {
    SEARCH("Search") ,
    SELL("Sell") ,
    BUY("Buy") ,
    GIFT("Gift");

    private final String displayValue;



   private AdEntityEnum(String displayValue) {
        this.displayValue = displayValue;
    }
    public String getDisplayValue(){
       return displayValue;
    }
}
