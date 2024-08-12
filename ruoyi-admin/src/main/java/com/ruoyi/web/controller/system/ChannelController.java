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
import com.ruoyi.system.domain.Channel;
import com.ruoyi.system.service.IChannelService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【栏目表】Controller
 *
 * @author zky
 * @date 2024-08-11
 */
@Api("栏目表")
@RestController
@RequestMapping("/system/channel")
public class ChannelController extends BaseController
{
    @Autowired
    private IChannelService channelService;

    /**
     * 查询【栏目表】列表
     */
    @ApiOperation("查询栏目列表")
    @PreAuthorize("@ss.hasPermi('system:channel:list')")
    @GetMapping("/list")
    public TableDataInfo list(Channel channel)
    {
        startPage();
        List<Channel> list = channelService.selectChannelList(channel);
        return getDataTable(list);
    }

    /**
     * 导出【栏目表】列表
     */
//    @PreAuthorize("@ss.hasPermi('system:channel:export')")
//    @Log(title = "【栏目表】", businessType = BusinessType.EXPORT)
//    @PostMapping("/export")
//    public void export(HttpServletResponse response, Channel channel)
//    {
//        List<Channel> list = channelService.selectChannelList(channel);
//        ExcelUtil<Channel> util = new ExcelUtil<Channel>(Channel.class);
//        util.exportExcel(response, list, "【栏目表】数据");
//    }

    /**
     * 获取【栏目表】详细信息
     */
    @ApiOperation("获得单篇栏目")
    @PreAuthorize("@ss.hasPermi('system:channel:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(channelService.selectChannelById(id));
    }

    /**
     * 新增【栏目表】
     */
    @ApiOperation("新增")
    @PreAuthorize("@ss.hasPermi('system:channel:add')")
    @Log(title = "【栏目表】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Channel channel)
    {
        return toAjax(channelService.insertChannel(channel));
    }

    /**
     * 修改【栏目表】
     */
    @PreAuthorize("@ss.hasPermi('system:channel:edit')")
    @Log(title = "【栏目表】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Channel channel)
    {
        return toAjax(channelService.updateChannel(channel));
    }

    /**
     * 删除【栏目表】
     */
    @PreAuthorize("@ss.hasPermi('system:channel:remove')")
    @Log(title = "【栏目表】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(channelService.deleteChannelByIds(ids));
    }
}
