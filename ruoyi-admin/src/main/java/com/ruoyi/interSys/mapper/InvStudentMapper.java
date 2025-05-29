package com.ruoyi.interSys.mapper;

import java.util.List;
import com.ruoyi.interSys.domain.InvStudent;
import com.ruoyi.interSys.domain.InvRecord;

/**
 * 学生信息Mapper接口
 * 
 * @author ruoyi
 * @date 2025-05-28
 */
public interface InvStudentMapper 
{
    /**
     * 查询学生信息
     * 
     * @param studentId 学生信息主键
     * @return 学生信息
     */
    public InvStudent selectInvStudentByStudentId(Long studentId);

    /**
     * 查询学生信息列表
     * 
     * @param invStudent 学生信息
     * @return 学生信息集合
     */
    public List<InvStudent> selectInvStudentList(InvStudent invStudent);

    /**
     * 新增学生信息
     * 
     * @param invStudent 学生信息
     * @return 结果
     */
    public int insertInvStudent(InvStudent invStudent);

    /**
     * 修改学生信息
     * 
     * @param invStudent 学生信息
     * @return 结果
     */
    public int updateInvStudent(InvStudent invStudent);

    /**
     * 删除学生信息
     * 
     * @param studentId 学生信息主键
     * @return 结果
     */
    public int deleteInvStudentByStudentId(Long studentId);

    /**
     * 批量删除学生信息
     * 
     * @param studentIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInvStudentByStudentIds(Long[] studentIds);

    /**
     * 批量删除面试信息查询
     * 
     * @param studentIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInvRecordByInvStudentIds(Long[] studentIds);
    
    /**
     * 批量新增面试信息查询
     * 
     * @param invRecordList 面试信息查询列表
     * @return 结果
     */
    public int batchInvRecord(List<InvRecord> invRecordList);
    

    /**
     * 通过学生信息主键删除面试信息查询信息
     * 
     * @param studentId 学生信息ID
     * @return 结果
     */
    public int deleteInvRecordByInvStudentId(Long studentId);
}
