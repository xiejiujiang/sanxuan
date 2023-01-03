/**
  * Copyright 2022 bejson.com 
  */
package com.example.sanxuan.entity.xcx;

/**
 * Auto-generated: 2022-10-25 10:5:46
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class SaleOrderDetails {

    private String InventoryCode;
    private String InventoryName;
    private Float OrigTaxPrice;
    private Float Quantity;
    private String UnitName;
    private String IsPresent;
    private String Memo;
    private String taxRate;
    private String sourceVoucherDetailId;
    private String sysUnitName;
    private String IsSample;

    public void setInventoryCode(String InventoryCode) {
         this.InventoryCode = InventoryCode;
     }
     public String getInventoryCode() {
         return InventoryCode;
     }

    public void setOrigTaxPrice(Float OrigTaxPrice) {
         this.OrigTaxPrice = OrigTaxPrice;
     }
     public Float getOrigTaxPrice() {
         return OrigTaxPrice;
     }

    public void setQuantity(Float Quantity) {
         this.Quantity = Quantity;
     }
     public Float getQuantity() {
         return Quantity;
     }

    public void setUnitName(String UnitName) {
         this.UnitName = UnitName;
     }
     public String getUnitName() {
         return UnitName;
     }

    public void setIsPresent(String IsPresent) {
         this.IsPresent = IsPresent;
     }
     public String getIsPresent() {
         return IsPresent;
     }

    public void setMemo(String Memo) {
         this.Memo = Memo;
     }
     public String getMemo() {
         return Memo;
     }

    public String getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate;
    }

    public String getSourceVoucherDetailId() {
        return sourceVoucherDetailId;
    }

    public void setSourceVoucherDetailId(String sourceVoucherDetailId) {
        this.sourceVoucherDetailId = sourceVoucherDetailId;
    }

    public String getSysUnitName() {
        return sysUnitName;
    }

    public void setSysUnitName(String sysUnitName) {
        this.sysUnitName = sysUnitName;
    }

    public String getInventoryName() {
        return InventoryName;
    }

    public void setInventoryName(String inventoryName) {
        InventoryName = inventoryName;
    }

    public String getIsSample() {
        return IsSample;
    }

    public void setIsSample(String isSample) {
        IsSample = isSample;
    }
}