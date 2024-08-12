package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Article;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2024-08-11
 */
public interface ArticleMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Article selectArticleById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param article 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Article> selectArticleList(Article article);

    /**
     * 新增【请填写功能名称】
     * 
     * @param article 【请填写功能名称】
     * @return 结果
     */
    public int insertArticle(Article article);

    /**
     * 修改【请填写功能名称】
     * 
     * @param article 【请填写功能名称】
     * @return 结果
     */
    public int updateArticle(Article article);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteArticleById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteArticleByIds(Long[] ids);
}
