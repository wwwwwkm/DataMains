<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="所属栏目" prop="cid">
        <el-input
          v-model="queryParams.cid"
          placeholder="请输入所属栏目"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="推荐热门" prop="tag">
        <el-input
          v-model="queryParams.tag"
          placeholder="请输入推荐热门"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="标题" prop="title">
        <el-input
          v-model="queryParams.title"
          placeholder="请输入标题"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="轮播图片集" prop="pictures">
        <el-input
          v-model="queryParams.pictures"
          placeholder="请输入轮播图片集"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="简介" prop="summary">
        <el-input
          v-model="queryParams.summary"
          placeholder="请输入简介"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="内容" prop="info">
        <el-input
          v-model="queryParams.info"
          placeholder="请输入内容"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="链接" prop="link">
        <el-input
          v-model="queryParams.link"
          placeholder="请输入链接"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="排序" prop="sort">
        <el-input
          v-model="queryParams.sort"
          placeholder="请输入排序"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="付费状态" prop="ispay">
        <el-input
          v-model="queryParams.ispay"
          placeholder="请输入付费状态"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="原价" prop="price1">
        <el-input
          v-model="queryParams.price1"
          placeholder="请输入原价"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="折后价" prop="price2">
        <el-input
          v-model="queryParams.price2"
          placeholder="请输入折后价"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="订阅数" prop="collectionCount">
        <el-input
          v-model="queryParams.collectionCount"
          placeholder="请输入订阅数"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="订阅数" prop="subscriptionCount">
        <el-input
          v-model="queryParams.subscriptionCount"
          placeholder="请输入订阅数"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="分享次数" prop="shareCount">
        <el-input
          v-model="queryParams.shareCount"
          placeholder="请输入分享次数"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="下载次数" prop="downloadCount">
        <el-input
          v-model="queryParams.downloadCount"
          placeholder="请输入下载次数"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="免费等级" prop="freeLevel">
        <el-input
          v-model="queryParams.freeLevel"
          placeholder="请输入免费等级"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          plain
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['system:article:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['system:article:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          plain
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['system:article:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:article:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="articleList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="${comment}" align="center" prop="id" />
      <el-table-column label="所属栏目" align="center" prop="cid" />
      <el-table-column label="推荐热门" align="center" prop="tag" />
      <el-table-column label="标题" align="center" prop="title" />
      <el-table-column label="轮播图片集" align="center" prop="pictures" />
      <el-table-column label="简介" align="center" prop="summary" />
      <el-table-column label="内容" align="center" prop="info" />
      <el-table-column label="链接" align="center" prop="link" />
      <el-table-column label="排序" align="center" prop="sort" />
      <el-table-column label="付费状态" align="center" prop="ispay" />
      <el-table-column label="原价" align="center" prop="price1" />
      <el-table-column label="折后价" align="center" prop="price2" />
      <el-table-column label="订阅数" align="center" prop="collectionCount" />
      <el-table-column label="订阅数" align="center" prop="subscriptionCount" />
      <el-table-column label="分享次数" align="center" prop="shareCount" />
      <el-table-column label="下载次数" align="center" prop="downloadCount" />
      <el-table-column label="免费等级" align="center" prop="freeLevel" />
      <el-table-column label="文件" align="center" prop="file" />
      <el-table-column label="文件类型" align="center" prop="fileType" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:article:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:article:remove']"
          >删除</el-button>
        </template>
      </el-table-column>
    </el-table>
    
    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改【请填写功能名称】对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="所属栏目" prop="cid">
          <el-input v-model="form.cid" placeholder="请输入所属栏目" />
        </el-form-item>
        <el-form-item label="推荐热门" prop="tag">
          <el-input v-model="form.tag" placeholder="请输入推荐热门" />
        </el-form-item>
        <el-form-item label="标题" prop="title">
          <el-input v-model="form.title" placeholder="请输入标题" />
        </el-form-item>
        <el-form-item label="轮播图片集" prop="pictures">
          <el-input v-model="form.pictures" placeholder="请输入轮播图片集" />
        </el-form-item>
        <el-form-item label="简介" prop="summary">
          <el-input v-model="form.summary" placeholder="请输入简介" />
        </el-form-item>
        <el-form-item label="内容" prop="info">
          <el-input v-model="form.info" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="链接" prop="link">
          <el-input v-model="form.link" placeholder="请输入链接" />
        </el-form-item>
        <el-form-item label="排序" prop="sort">
          <el-input v-model="form.sort" placeholder="请输入排序" />
        </el-form-item>
        <el-form-item label="付费状态" prop="ispay">
          <el-input v-model="form.ispay" placeholder="请输入付费状态" />
        </el-form-item>
        <el-form-item label="原价" prop="price1">
          <el-input v-model="form.price1" placeholder="请输入原价" />
        </el-form-item>
        <el-form-item label="折后价" prop="price2">
          <el-input v-model="form.price2" placeholder="请输入折后价" />
        </el-form-item>
        <el-form-item label="订阅数" prop="collectionCount">
          <el-input v-model="form.collectionCount" placeholder="请输入订阅数" />
        </el-form-item>
        <el-form-item label="订阅数" prop="subscriptionCount">
          <el-input v-model="form.subscriptionCount" placeholder="请输入订阅数" />
        </el-form-item>
        <el-form-item label="分享次数" prop="shareCount">
          <el-input v-model="form.shareCount" placeholder="请输入分享次数" />
        </el-form-item>
        <el-form-item label="下载次数" prop="downloadCount">
          <el-input v-model="form.downloadCount" placeholder="请输入下载次数" />
        </el-form-item>
        <el-form-item label="免费等级" prop="freeLevel">
          <el-input v-model="form.freeLevel" placeholder="请输入免费等级" />
        </el-form-item>
        <el-form-item label="文件" prop="file">
          <file-upload v-model="form.file"/>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listArticle, getArticle, delArticle, addArticle, updateArticle } from "@/api/system/article";

export default {
  name: "Article",
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // 【请填写功能名称】表格数据
      articleList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        cid: null,
        tag: null,
        title: null,
        pictures: null,
        summary: null,
        info: null,
        link: null,
        sort: null,
        ispay: null,
        price1: null,
        price2: null,
        collectionCount: null,
        subscriptionCount: null,
        shareCount: null,
        downloadCount: null,
        freeLevel: null,
        file: null,
        fileType: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
        cid: [
          { required: true, message: "所属栏目不能为空", trigger: "blur" }
        ],
        tag: [
          { required: true, message: "推荐热门不能为空", trigger: "blur" }
        ],
        title: [
          { required: true, message: "标题不能为空", trigger: "blur" }
        ],
        pictures: [
          { required: true, message: "轮播图片集不能为空", trigger: "blur" }
        ],
        summary: [
          { required: true, message: "简介不能为空", trigger: "blur" }
        ],
        info: [
          { required: true, message: "内容不能为空", trigger: "blur" }
        ],
        link: [
          { required: true, message: "链接不能为空", trigger: "blur" }
        ],
        sort: [
          { required: true, message: "排序不能为空", trigger: "blur" }
        ],
        price1: [
          { required: true, message: "原价不能为空", trigger: "blur" }
        ],
        price2: [
          { required: true, message: "折后价不能为空", trigger: "blur" }
        ],
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询【请填写功能名称】列表 */
    getList() {
      this.loading = true;
      listArticle(this.queryParams).then(response => {
        this.articleList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        id: null,
        cid: null,
        tag: null,
        title: null,
        pictures: null,
        summary: null,
        info: null,
        link: null,
        sort: null,
        ispay: null,
        price1: null,
        price2: null,
        collectionCount: null,
        subscriptionCount: null,
        shareCount: null,
        downloadCount: null,
        freeLevel: null,
        file: null,
        fileType: null
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.id)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加【请填写功能名称】";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getArticle(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改【请填写功能名称】";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateArticle(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addArticle(this.form).then(response => {
              this.$modal.msgSuccess("新增成功");
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const ids = row.id || this.ids;
      this.$modal.confirm('是否确认删除【请填写功能名称】编号为"' + ids + '"的数据项？').then(function() {
        return delArticle(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/article/export', {
        ...this.queryParams
      }, `article_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
