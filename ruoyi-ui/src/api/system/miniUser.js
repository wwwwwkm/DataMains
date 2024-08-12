import request from '@/utils/request'

// 查询小程序用户列表
export function listMiniUser(query) {
  return request({
    url: '/system/miniUser/list',
    method: 'get',
    params: query
  })
}

// 查询小程序用户详细
export function getMiniUser(userId) {
  return request({
    url: '/system/miniUser/' + userId,
    method: 'get'
  })
}

// 新增小程序用户
export function addMiniUser(data) {
  return request({
    url: '/system/miniUser',
    method: 'post',
    data: data
  })
}

// 修改小程序用户
export function updateMiniUser(data) {
  return request({
    url: '/system/miniUser',
    method: 'put',
    data: data
  })
}

// 删除小程序用户
export function delMiniUser(userId) {
  return request({
    url: '/system/miniUser/' + userId,
    method: 'delete'
  })
}
