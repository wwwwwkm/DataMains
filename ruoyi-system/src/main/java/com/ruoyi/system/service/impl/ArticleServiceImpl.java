package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ArticleMapper;
import com.ruoyi.system.domain.Article;
import com.ruoyi.system.service.IArticleService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-08-11
 */
@Service
public class ArticleServiceImpl implements IArticleService 
{
    @Autowired
    private ArticleMapper articleMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Article selectArticleById(Long id)
    {
        return articleMapper.selectArticleById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param article 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Article> selectArticleList(Article article)
    {
        return articleMapper.selectArticleList(article);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param article 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertArticle(Article article)
    {
        return articleMapper.insertArticle(article);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param article 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateArticle(Article article)
    {
        return articleMapper.updateArticle(article);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteArticleByIds(Long[] ids)
    {
        return articleMapper.deleteArticleByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteArticleById(Long id)
    {
        return articleMapper.deleteArticleById(id);
    }
}
