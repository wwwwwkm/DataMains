import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listLevel(query) {
  return request({
    url: '/system/level/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getLevel(id) {
  return request({
    url: '/system/level/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addLevel(data) {
  return request({
    url: '/system/level',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateLevel(data) {
  return request({
    url: '/system/level',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delLevel(id) {
  return request({
    url: '/system/level/' + id,
    method: 'delete'
  })
}
