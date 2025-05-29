package com.ruoyi.interSys.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.interSys.domain.InvRecord;
import com.ruoyi.interSys.service.IInvRecordService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 面试信息查询Controller
 * 
 * @author ruoyi
 * @date 2025-05-28
 */
@RestController
@RequestMapping("/interSys/record")
public class InvRecordController extends BaseController
{
    @Autowired
    private IInvRecordService invRecordService;

    /**
     * 查询面试信息查询列表
     */
    @PreAuthorize("@ss.hasPermi('interSys:record:list')")
    @GetMapping("/list")
    public TableDataInfo list(InvRecord invRecord)
    {
        startPage();
        List<InvRecord> list = invRecordService.selectInvRecordList(invRecord);
        return getDataTable(list);
    }

    /**
     * 导出面试信息查询列表
     */
    @PreAuthorize("@ss.hasPermi('interSys:record:export')")
    @Log(title = "面试信息查询", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, InvRecord invRecord)
    {
        List<InvRecord> list = invRecordService.selectInvRecordList(invRecord);
        ExcelUtil<InvRecord> util = new ExcelUtil<InvRecord>(InvRecord.class);
        util.exportExcel(response, list, "面试信息查询数据");
    }

    /**
     * 获取面试信息查询详细信息
     */
    @PreAuthorize("@ss.hasPermi('interSys:record:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(invRecordService.selectInvRecordById(id));
    }

    /**
     * 新增面试信息查询
     */
    @PreAuthorize("@ss.hasPermi('interSys:record:add')")
    @Log(title = "面试信息查询", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody InvRecord invRecord)
    {
        return toAjax(invRecordService.insertInvRecord(invRecord));
    }

    /**
     * 修改面试信息查询
     */
    @PreAuthorize("@ss.hasPermi('interSys:record:edit')")
    @Log(title = "面试信息查询", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody InvRecord invRecord)
    {
        return toAjax(invRecordService.updateInvRecord(invRecord));
    }

    /**
     * 删除面试信息查询
     */
    @PreAuthorize("@ss.hasPermi('interSys:record:remove')")
    @Log(title = "面试信息查询", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(invRecordService.deleteInvRecordByIds(ids));
    }
}
