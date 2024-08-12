import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listActivity(query) {
  return request({
    url: '/system/activity/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getActivity(id) {
  return request({
    url: '/system/activity/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addActivity(data) {
  return request({
    url: '/system/activity',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateActivity(data) {
  return request({
    url: '/system/activity',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delActivity(id) {
  return request({
    url: '/system/activity/' + id,
    method: 'delete'
  })
}
