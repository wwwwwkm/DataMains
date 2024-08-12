package com.ruoyi.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.system.service.IminiUserService;
import io.swagger.annotations.Api;
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
import com.ruoyi.system.domain.miniUser;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 小程序用户Controller
 *
 * @author zky
 * @date 2024-08-11
 */
@Api("小程序用户表")
@RestController
@RequestMapping("/system/miniUser")
public class miniUserController extends BaseController
{
    @Autowired
    private IminiUserService miniUserService;

    /**
     * 查询小程序用户列表
     */
    @PreAuthorize("@ss.hasPermi('system:miniUser:list')")
    @GetMapping("/list")
    public TableDataInfo list(miniUser miniUser)
    {
        startPage();
        List<miniUser> list = miniUserService.selectminiUserList(miniUser);
        return getDataTable(list);
    }

    /**
     * 导出小程序用户列表
     */
    @PreAuthorize("@ss.hasPermi('system:miniUser:export')")
    @Log(title = "小程序用户", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, miniUser miniUser)
    {
        List<miniUser> list = miniUserService.selectminiUserList(miniUser);
        ExcelUtil<miniUser> util = new ExcelUtil<miniUser>(miniUser.class);
        util.exportExcel(response, list, "小程序用户数据");
    }

    /**
     * 获取小程序用户详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:miniUser:query')")
    @GetMapping(value = "/{userId}")
    public AjaxResult getInfo(@PathVariable("userId") Long userId)
    {
        return success(miniUserService.selectminiUserByUserId(userId));
    }

    /**
     * 新增小程序用户
     */
    @PreAuthorize("@ss.hasPermi('system:miniUser:add')")
    @Log(title = "小程序用户", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody miniUser miniUser)
    {
        return toAjax(miniUserService.insertminiUser(miniUser));
    }

    /**
     * 修改小程序用户
     */
    @PreAuthorize("@ss.hasPermi('system:miniUser:edit')")
    @Log(title = "小程序用户", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody miniUser miniUser)
    {
        return toAjax(miniUserService.updateminiUser(miniUser));
    }

    /**
     * 删除小程序用户
     */
    @PreAuthorize("@ss.hasPermi('system:miniUser:remove')")
    @Log(title = "小程序用户", businessType = BusinessType.DELETE)
	@DeleteMapping("/{userIds}")
    public AjaxResult remove(@PathVariable Long[] userIds)
    {
        return toAjax(miniUserService.deleteminiUserByUserIds(userIds));
    }
}
