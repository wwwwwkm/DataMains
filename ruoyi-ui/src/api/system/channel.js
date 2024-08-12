import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listChannel(query) {
  return request({
    url: '/system/channel/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getChannel(id) {
  return request({
    url: '/system/channel/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addChannel(data) {
  return request({
    url: '/system/channel',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateChannel(data) {
  return request({
    url: '/system/channel',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delChannel(id) {
  return request({
    url: '/system/channel/' + id,
    method: 'delete'
  })
}
