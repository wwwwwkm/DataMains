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
import com.ruoyi.system.domain.Article;
import com.ruoyi.system.service.IArticleService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【文章表】Controller
 *
 * @author zky
 * @date 2024-08-11
 */
@Api("文章表")
@RestController
@RequestMapping("/system/article")
public class ArticleController extends BaseController
{
    @Autowired
    private IArticleService articleService;

    /**
     * 查询【文章表】列表
     */
    @ApiOperation("查询文章列表")
    @PreAuthorize("@ss.hasPermi('system:article:list')")
    @GetMapping("/list")
    public TableDataInfo list(Article article)
    {
        startPage();
        List<Article> list = articleService.selectArticleList(article);
        return getDataTable(list);
    }

    /**
     * 导出【文章表】列表
     */
//    @PreAuthorize("@ss.hasPermi('system:article:export')")
//    @Log(title = "【文章表】", businessType = BusinessType.EXPORT)
//    @PostMapping("/export")
//    public void export(HttpServletResponse response, Article article)
//    {
//        List<Article> list = articleService.selectArticleList(article);
//        ExcelUtil<Article> util = new ExcelUtil<Article>(Article.class);
//        util.exportExcel(response, list, "【文章表】数据");
//    }

    /**
     * 获取【文章表】详细信息
     */
    @ApiOperation("获得单篇文章")
    @PreAuthorize("@ss.hasPermi('system:article:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(articleService.selectArticleById(id));
    }

    /**
     * 新增【文章表】
     */    @ApiOperation("新增")
    @PreAuthorize("@ss.hasPermi('system:article:add')")
    @Log(title = "【文章表】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Article article)
    {
        return toAjax(articleService.insertArticle(article));
    }

    /**
     * 修改【文章表】
     */
    @ApiOperation("修改文章")
    @PreAuthorize("@ss.hasPermi('system:article:edit')")
    @Log(title = "【文章表】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Article article)
    {
        return toAjax(articleService.updateArticle(article));
    }

    /**
     * 删除【文章表】
     */
    @ApiOperation("删除")
    @PreAuthorize("@ss.hasPermi('system:article:remove')")
    @Log(title = "【文章表】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(articleService.deleteArticleByIds(ids));
    }
}
