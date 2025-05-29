package com.ruoyi.interSys.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.interSys.mapper.InvRecordMapper;
import com.ruoyi.interSys.domain.InvRecord;
import com.ruoyi.interSys.service.IInvRecordService;

/**
 * 面试信息查询Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-05-28
 */
@Service
public class InvRecordServiceImpl implements IInvRecordService 
{
    @Autowired
    private InvRecordMapper invRecordMapper;

    /**
     * 查询面试信息查询
     * 
     * @param id 面试信息查询主键
     * @return 面试信息查询
     */
    @Override
    public InvRecord selectInvRecordById(Long id)
    {
        return invRecordMapper.selectInvRecordById(id);
    }

    /**
     * 查询面试信息查询列表
     * 
     * @param invRecord 面试信息查询
     * @return 面试信息查询
     */
    @Override
    public List<InvRecord> selectInvRecordList(InvRecord invRecord)
    {
        return invRecordMapper.selectInvRecordList(invRecord);
    }

    /**
     * 新增面试信息查询
     * 
     * @param invRecord 面试信息查询
     * @return 结果
     */
    @Override
    public int insertInvRecord(InvRecord invRecord)
    {
        return invRecordMapper.insertInvRecord(invRecord);
    }

    /**
     * 修改面试信息查询
     * 
     * @param invRecord 面试信息查询
     * @return 结果
     */
    @Override
    public int updateInvRecord(InvRecord invRecord)
    {
        return invRecordMapper.updateInvRecord(invRecord);
    }

    /**
     * 批量删除面试信息查询
     * 
     * @param ids 需要删除的面试信息查询主键
     * @return 结果
     */
    @Override
    public int deleteInvRecordByIds(Long[] ids)
    {
        return invRecordMapper.deleteInvRecordByIds(ids);
    }

    /**
     * 删除面试信息查询信息
     * 
     * @param id 面试信息查询主键
     * @return 结果
     */
    @Override
    public int deleteInvRecordById(Long id)
    {
        return invRecordMapper.deleteInvRecordById(id);
    }
}
