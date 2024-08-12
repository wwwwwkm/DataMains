import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listOrders(query) {
  return request({
    url: '/system/orders/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getOrders(id) {
  return request({
    url: '/system/orders/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addOrders(data) {
  return request({
    url: '/system/orders',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateOrders(data) {
  return request({
    url: '/system/orders',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delOrders(id) {
  return request({
    url: '/system/orders/' + id,
    method: 'delete'
  })
}
