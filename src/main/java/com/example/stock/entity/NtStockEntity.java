package com.example.stock.entity;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

public class NtStockEntity {
    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public NtStockBody getResult() {
        return result;
    }

    public void setResult(NtStockBody result) {
        this.result = result;
    }

    private int error_code;
    private String reason;
    private NtStockBody result;

    class NtStockBody {
        @Override
        public String toString() {
            return JSON.toJSONString(this);
        }

        public List<StockIndex> getResult() {
            return result;
        }

        public void setResult(List<StockIndex> result) {
            this.result = result;
        }

        public int getCurrentPage() {
            return currentPage;
        }

        public void setCurrentPage(int currentPage) {
            this.currentPage = currentPage;
        }

        public int getTotalPages() {
            return totalPages;
        }

        public void setTotalPages(int totalPages) {
            this.totalPages = totalPages;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public int getTotalRows() {
            return totalRows;
        }

        public void setTotalRows(int totalRows) {
            this.totalRows = totalRows;
        }

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        private List<StockIndex> result = new ArrayList<>();
        private int currentPage;
        private int totalPages;
        private int pageSize;
        private int totalRows;
        private int start;
    }

    class StockIndex {
        @Override
        public String toString() {
            return JSON.toJSONString(this);
        }

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getShortName() {
            return shortName;
        }

        public void setShortName(String shortName) {
            this.shortName = shortName;
        }

        public float getZd() {
            return zd;
        }

        public void setZd(float zd) {
            this.zd = zd;
        }

        public float getZdf() {
            return zdf;
        }

        public void setZdf(float zdf) {
            this.zdf = zdf;
        }

        public float getZRSP() {
            return ZRSP;
        }

        public void setZRSP(float ZRSP) {
            this.ZRSP = ZRSP;
        }

        public float getZJCJ() {
            return ZJCJ;
        }

        public void setZJCJ(float ZJCJ) {
            this.ZJCJ = ZJCJ;
        }

        public float getCJJE() {
            return CJJE;
        }

        public void setCJJE(float CJJE) {
            this.CJJE = CJJE;
        }

        public float getCJSL() {
            return CJSL;
        }

        public void setCJSL(float CJSL) {
            this.CJSL = CJSL;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public float getRegistCapi() {
            return registCapi;
        }

        public void setRegistCapi(float registCapi) {
            this.registCapi = registCapi;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getOperName() {
            return operName;
        }

        public void setOperName(String operName) {
            this.operName = operName;
        }

        public String getUpDate() {
            return upDate;
        }

        public void setUpDate(String upDate) {
            this.upDate = upDate;
        }

        public long getTotalStock() {
            return totalStock;
        }

        public void setTotalStock(long totalStock) {
            this.totalStock = totalStock;
        }

        public String getCategoryStr() {
            return categoryStr;
        }

        public void setCategoryStr(String categoryStr) {
            this.categoryStr = categoryStr;
        }

        public String getUpdateDate() {
            return updateDate;
        }

        public void setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public float getZGCJ() {
            return ZGCJ;
        }

        public void setZGCJ(float ZGCJ) {
            this.ZGCJ = ZGCJ;
        }

        public float getZDCJ() {
            return ZDCJ;
        }

        public void setZDCJ(float ZDCJ) {
            this.ZDCJ = ZDCJ;
        }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        private String _id;
        private String shortName;
        private float zd;
        private float zdf;
        private float ZRSP;
        private float ZJCJ;
        private float CJJE;
        private float CJSL;
        private int type;
        private String province;
        private String address;
        private float registCapi;
        private String company;
        private String operName;
        private String upDate;
        private long totalStock;
        private String categoryStr;
        private String updateDate;
        private String updateTime;
        private float ZGCJ;
        private float ZDCJ;
        private String companyName;
    }
}
