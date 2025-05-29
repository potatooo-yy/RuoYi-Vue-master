package com.ruoyi.interSys.service;

import java.util.List;
import com.ruoyi.interSys.domain.InvRecord;

/**
 * 面试信息查询Service接口
 * 
 * @author ruoyi
 * @date 2025-05-28
 */
public interface IInvRecordService 
{
    /**
     * 查询面试信息查询
     * 
     * @param id 面试信息查询主键
     * @return 面试信息查询
     */
    public InvRecord selectInvRecordById(Long id);

    /**
     * 查询面试信息查询列表
     * 
     * @param invRecord 面试信息查询
     * @return 面试信息查询集合
     */
    public List<InvRecord> selectInvRecordList(InvRecord invRecord);

    /**
     * 新增面试信息查询
     * 
     * @param invRecord 面试信息查询
     * @return 结果
     */
    public int insertInvRecord(InvRecord invRecord);

    /**
     * 修改面试信息查询
     * 
     * @param invRecord 面试信息查询
     * @return 结果
     */
    public int updateInvRecord(InvRecord invRecord);

    /**
     * 批量删除面试信息查询
     * 
     * @param ids 需要删除的面试信息查询主键集合
     * @return 结果
     */
    public int deleteInvRecordByIds(Long[] ids);

    /**
     * 删除面试信息查询信息
     * 
     * @param id 面试信息查询主键
     * @return 结果
     */
    public int deleteInvRecordById(Long id);
}
