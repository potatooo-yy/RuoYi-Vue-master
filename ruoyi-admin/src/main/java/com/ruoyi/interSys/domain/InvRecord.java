package com.ruoyi.interSys.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 面试信息查询对象 inv_record
 * 
 * @author ruoyi
 * @date 2025-05-28
 */
public class InvRecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 面试ID */
    private Long id;

    /** 学生ID */
    @Excel(name = "学生ID")
    private Long invStudentId;

    /** 面试日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "面试日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date invDate;

    /** 面试结果 */
    @Excel(name = "面试结果")
    private String invResult;

    /** 面试备注 */
    @Excel(name = "面试备注")
    private String invNotes;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setInvStudentId(Long invStudentId) 
    {
        this.invStudentId = invStudentId;
    }

    public Long getInvStudentId() 
    {
        return invStudentId;
    }

    public void setInvDate(Date invDate) 
    {
        this.invDate = invDate;
    }

    public Date getInvDate() 
    {
        return invDate;
    }

    public void setInvResult(String invResult) 
    {
        this.invResult = invResult;
    }

    public String getInvResult() 
    {
        return invResult;
    }

    public void setInvNotes(String invNotes) 
    {
        this.invNotes = invNotes;
    }

    public String getInvNotes() 
    {
        return invNotes;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("invStudentId", getInvStudentId())
            .append("invDate", getInvDate())
            .append("invResult", getInvResult())
            .append("invNotes", getInvNotes())
            .toString();
    }
}
