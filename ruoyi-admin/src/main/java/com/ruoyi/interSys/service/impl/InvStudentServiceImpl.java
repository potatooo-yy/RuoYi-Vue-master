package com.ruoyi.interSys.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.interSys.domain.InvRecord;
import com.ruoyi.interSys.mapper.InvStudentMapper;
import com.ruoyi.interSys.domain.InvStudent;
import com.ruoyi.interSys.service.IInvStudentService;

/**
 * 学生信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-05-28
 */
@Service
public class InvStudentServiceImpl implements IInvStudentService 
{
    @Autowired
    private InvStudentMapper invStudentMapper;

    /**
     * 查询学生信息
     * 
     * @param studentId 学生信息主键
     * @return 学生信息
     */
    @Override
    public InvStudent selectInvStudentByStudentId(Long studentId)
    {
        return invStudentMapper.selectInvStudentByStudentId(studentId);
    }

    /**
     * 查询学生信息列表
     * 
     * @param invStudent 学生信息
     * @return 学生信息
     */
    @Override
    public List<InvStudent> selectInvStudentList(InvStudent invStudent)
    {
        return invStudentMapper.selectInvStudentList(invStudent);
    }

    /**
     * 新增学生信息
     * 
     * @param invStudent 学生信息
     * @return 结果
     */
    @Transactional
    @Override
    public int insertInvStudent(InvStudent invStudent)
    {
        int rows = invStudentMapper.insertInvStudent(invStudent);
        insertInvRecord(invStudent);
        return rows;
    }

    /**
     * 修改学生信息
     * 
     * @param invStudent 学生信息
     * @return 结果
     */
    @Transactional
    @Override
    public int updateInvStudent(InvStudent invStudent)
    {
        invStudentMapper.deleteInvRecordByInvStudentId(invStudent.getStudentId());
        insertInvRecord(invStudent);
        return invStudentMapper.updateInvStudent(invStudent);
    }

    /**
     * 批量删除学生信息
     * 
     * @param studentIds 需要删除的学生信息主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteInvStudentByStudentIds(Long[] studentIds)
    {
        invStudentMapper.deleteInvRecordByInvStudentIds(studentIds);
        return invStudentMapper.deleteInvStudentByStudentIds(studentIds);
    }

    /**
     * 删除学生信息信息
     * 
     * @param studentId 学生信息主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteInvStudentByStudentId(Long studentId)
    {
        invStudentMapper.deleteInvRecordByInvStudentId(studentId);
        return invStudentMapper.deleteInvStudentByStudentId(studentId);
    }

    /**
     * 新增面试信息查询信息
     * 
     * @param invStudent 学生信息对象
     */
    public void insertInvRecord(InvStudent invStudent)
    {
        List<InvRecord> invRecordList = invStudent.getInvRecordList();
        Long studentId = invStudent.getStudentId();
        if (StringUtils.isNotNull(invRecordList))
        {
            List<InvRecord> list = new ArrayList<InvRecord>();
            for (InvRecord invRecord : invRecordList)
            {
                invRecord.setInvStudentId(studentId);
                list.add(invRecord);
            }
            if (list.size() > 0)
            {
                invStudentMapper.batchInvRecord(list);
            }
        }
    }
}
