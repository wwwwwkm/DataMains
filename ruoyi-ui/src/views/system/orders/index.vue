<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="文章id" prop="artID">
        <el-input
          v-model="queryParams.artID"
          placeholder="请输入文章id"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="购买用户id" prop="userID">
        <el-input
          v-model="queryParams.userID"
          placeholder="请输入购买用户id"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="订单生成日期" prop="date">
        <el-input
          v-model="queryParams.date"
          placeholder="请输入订单生成日期"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="支付金额" prop="price">
        <el-input
          v-model="queryParams.price"
          placeholder="请输入支付金额"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="实付款" prop="fpay">
        <el-input
          v-model="queryParams.fpay"
          placeholder="请输入实付款"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="是否支付成功" prop="ispay">
        <el-input
          v-model="queryParams.ispay"
          placeholder="请输入是否支付成功"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="退款金额" prop="refundAmount">
        <el-input
          v-model="queryParams.refundAmount"
          placeholder="请输入退款金额"
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
          v-hasPermi="['system:orders:add']"
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
          v-hasPermi="['system:orders:edit']"
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
          v-hasPermi="['system:orders:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:orders:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="ordersList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="${comment}" align="center" prop="id" />
      <el-table-column label="文章id" align="center" prop="artID" />
      <el-table-column label="购买用户id" align="center" prop="userID" />
      <el-table-column label="订单生成日期" align="center" prop="date" />
      <el-table-column label="支付方式" align="center" prop="paytype" />
      <el-table-column label="支付金额" align="center" prop="price" />
      <el-table-column label="实付款" align="center" prop="fpay" />
      <el-table-column label="是否支付成功" align="center" prop="ispay" />
      <el-table-column label="退款状态" align="center" prop="refundStatus" />
      <el-table-column label="退款金额" align="center" prop="refundAmount" />
      <el-table-column label="支付状态 0:未支付，1:已支付" align="center" prop="payStatus" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:orders:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:orders:remove']"
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
        <el-form-item label="文章id" prop="artID">
          <el-input v-model="form.artID" placeholder="请输入文章id" />
        </el-form-item>
        <el-form-item label="购买用户id" prop="userID">
          <el-input v-model="form.userID" placeholder="请输入购买用户id" />
        </el-form-item>
        <el-form-item label="订单生成日期" prop="date">
          <el-input v-model="form.date" placeholder="请输入订单生成日期" />
        </el-form-item>
        <el-form-item label="支付金额" prop="price">
          <el-input v-model="form.price" placeholder="请输入支付金额" />
        </el-form-item>
        <el-form-item label="实付款" prop="fpay">
          <el-input v-model="form.fpay" placeholder="请输入实付款" />
        </el-form-item>
        <el-form-item label="是否支付成功" prop="ispay">
          <el-input v-model="form.ispay" placeholder="请输入是否支付成功" />
        </el-form-item>
        <el-form-item label="退款金额" prop="refundAmount">
          <el-input v-model="form.refundAmount" placeholder="请输入退款金额" />
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
import { listOrders, getOrders, delOrders, addOrders, updateOrders } from "@/api/system/orders";

export default {
  name: "Orders",
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
      ordersList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        artID: null,
        userID: null,
        date: null,
        paytype: null,
        price: null,
        fpay: null,
        ispay: null,
        refundStatus: null,
        refundAmount: null,
        payStatus: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
        artID: [
          { required: true, message: "文章id不能为空", trigger: "blur" }
        ],
        userID: [
          { required: true, message: "购买用户id不能为空", trigger: "blur" }
        ],
        date: [
          { required: true, message: "订单生成日期不能为空", trigger: "blur" }
        ],
        price: [
          { required: true, message: "支付金额不能为空", trigger: "blur" }
        ],
        fpay: [
          { required: true, message: "实付款不能为空", trigger: "blur" }
        ],
        ispay: [
          { required: true, message: "是否支付成功不能为空", trigger: "blur" }
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
      listOrders(this.queryParams).then(response => {
        this.ordersList = response.rows;
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
        artID: null,
        userID: null,
        date: null,
        paytype: null,
        price: null,
        fpay: null,
        ispay: null,
        refundStatus: null,
        refundAmount: null,
        payStatus: null
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
      getOrders(id).then(response => {
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
            updateOrders(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addOrders(this.form).then(response => {
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
        return delOrders(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/orders/export', {
        ...this.queryParams
      }, `orders_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
