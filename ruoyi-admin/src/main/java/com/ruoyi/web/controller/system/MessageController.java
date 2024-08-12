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
import com.ruoyi.system.domain.Message;
import com.ruoyi.system.service.IMessageService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【消息表】Controller
 * 
 * @author zky
 * @date 2024-08-12
 */
@Api("消息表")
@RestController
@RequestMapping("/system/message")
public class MessageController extends BaseController
{
    @Autowired
    private IMessageService messageService;

    /**
     * 查询【消息表】列表
     */
    @ApiOperation("查询【消息表】列表")
    @PreAuthorize("@ss.hasPermi('system:message:list')")
    @GetMapping("/list")
    public TableDataInfo list(Message message)
    {
        startPage();
        List<Message> list = messageService.selectMessageList(message);
        return getDataTable(list);
    }

    /**
     * 导出【消息表】列表
     */
//    @PreAuthorize("@ss.hasPermi('system:message:export')")
//    @Log(title = "【消息表】", businessType = BusinessType.EXPORT)
//    @PostMapping("/export")
//    public void export(HttpServletResponse response, Message message)
//    {
//        List<Message> list = messageService.selectMessageList(message);
//        ExcelUtil<Message> util = new ExcelUtil<Message>(Message.class);
//        util.exportExcel(response, list, "【消息表】数据");
//    }

    /**
     * 获取【消息表】详细信息
     */
    @ApiOperation("获取【消息表】详细信息")
    @PreAuthorize("@ss.hasPermi('system:message:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(messageService.selectMessageById(id));
    }

    /**
     * 新增【消息表】
     */
    @ApiOperation("新增【消息表】")
    @PreAuthorize("@ss.hasPermi('system:message:add')")
    @Log(title = "【消息表】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Message message)
    {
        return toAjax(messageService.insertMessage(message));
    }

    /**
     * 修改【消息表】
     */
    @ApiOperation("修改【消息表】")
    @PreAuthorize("@ss.hasPermi('system:message:edit')")
    @Log(title = "【消息表】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Message message)
    {
        return toAjax(messageService.updateMessage(message));
    }

    /**
     * 删除【消息表】
     */
    @ApiOperation("删除【消息表】")
    @PreAuthorize("@ss.hasPermi('system:message:remove')")
    @Log(title = "【消息表】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(messageService.deleteMessageByIds(ids));
    }
}
