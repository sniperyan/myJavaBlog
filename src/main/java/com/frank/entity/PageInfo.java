package com.frank.entity;

/**
 * Created by Administrator on 2016/5/4 0004.
 */
public class PageInfo {
    private int page; // 第几页
    private int pageSize; // 每页记录数
    private int start;  // 起始页
    private long totalRows;//总条数
    private String typeId;//查询参数
    private String releaseDateStr;//查询参数

    public PageInfo(int page, int pageSize, int start, long totalRows, String typeId, String releaseDateStr) {
        this.page = page;
        this.pageSize = pageSize;
        this.start = start;
        this.totalRows = totalRows;
        this.typeId = typeId;
        this.releaseDateStr = releaseDateStr;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getReleaseDateStr() {
        return releaseDateStr;
    }

    public void setReleaseDateStr(String releaseDateStr) {
        this.releaseDateStr = releaseDateStr;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public long getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(long totalRows) {
        this.totalRows = totalRows;
    }
}
