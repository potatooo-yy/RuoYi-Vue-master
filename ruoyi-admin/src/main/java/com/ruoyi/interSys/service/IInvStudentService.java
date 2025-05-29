package com.ruoyi.interSys.service;

import java.util.List;
import com.ruoyi.interSys.domain.InvStudent;

/**
 * 学生信息Service接口
 * 
 * @author ruoyi
 * @date 2025-05-28
 */
public interface IInvStudentService 
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
     * 批量删除学生信息
     * 
     * @param studentIds 需要删除的学生信息主键集合
     * @return 结果
     */
    public int deleteInvStudentByStudentIds(Long[] studentIds);

    /**
     * 删除学生信息信息
     * 
     * @param studentId 学生信息主键
     * @return 结果
     */
    public int deleteInvStudentByStudentId(Long studentId);
}
