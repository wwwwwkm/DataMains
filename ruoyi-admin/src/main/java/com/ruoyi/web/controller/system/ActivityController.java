package com.ruoyi.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
import com.ruoyi.system.domain.Activity;
import com.ruoyi.system.service.IActivityService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【活动表】Controller
 * 
 * @author zky
 * @date 2024-08-12
 */
@Api("活动表")
@RestController
@RequestMapping("/system/activity")
public class ActivityController extends BaseController
{
    @Autowired
    private IActivityService activityService;

    /**
     * 查询【活动表】列表
     */
    @ApiOperation("获取活动列表")
    @PreAuthorize("@ss.hasPermi('system:activity:list')")
//    @PreAuthorize("@ss.hasPermi('\"*:*:*\"')")
    @GetMapping("/list")
    public TableDataInfo list(Activity activity)
    {
        startPage();
        List<Activity> list = activityService.selectActivityList(activity);
        return getDataTable(list);
    }

    /**
     * 导出【活动表】列表
     */
//    @ApiOperation("导出活动列表")
//    @PreAuthorize("@ss.hasPermi('system:activity:export')")
//    @Log(title = "【活动表】", businessType = BusinessType.EXPORT)
//    @PostMapping("/export")
//    public void export(HttpServletResponse response, Activity activity)
//    {
//        List<Activity> list = activityService.selectActivityList(activity);
//        ExcelUtil<Activity> util = new ExcelUtil<Activity>(Activity.class);
//        util.exportExcel(response, list, "【活动表】数据");
//    }

    /**
     * 获取【活动表】详细信息
     */
    @ApiOperation("获取单个详细活动")
    @PreAuthorize("@ss.hasPermi('system:activity:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(activityService.selectActivityById(id));
    }

    /**
     * 新增【活动表】
     */
    @ApiOperation("添加活动")

    @PreAuthorize("@ss.hasPermi('system:activity:add')")
    @Log(title = "【活动表】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Activity activity)
    {
        return toAjax(activityService.insertActivity(activity));
    }

    /**
     * 修改【活动表】
     */
    @ApiOperation("修改活动")

    @PreAuthorize("@ss.hasPermi('system:activity:edit')")
    @Log(title = "【活动表】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Activity activity)
    {
        return toAjax(activityService.updateActivity(activity));
    }

    /**
     * 删除【活动表】
     */
    @ApiOperation("删除活动")

    @PreAuthorize("@ss.hasPermi('system:activity:remove')")
    @Log(title = "【活动表】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(activityService.deleteActivityByIds(ids));
    }
}
