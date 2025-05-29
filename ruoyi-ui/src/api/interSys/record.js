import request from '@/utils/request'

// 查询面试信息查询列表
export function listRecord(query) {
  return request({
    url: '/interSys/record/list',
    method: 'get',
    params: query
  })
}

// 查询面试信息查询详细
export function getRecord(id) {
  return request({
    url: '/interSys/record/' + id,
    method: 'get'
  })
}

// 新增面试信息查询
export function addRecord(data) {
  return request({
    url: '/interSys/record',
    method: 'post',
    data: data
  })
}

// 修改面试信息查询
export function updateRecord(data) {
  return request({
    url: '/interSys/record',
    method: 'put',
    data: data
  })
}

// 删除面试信息查询
export function delRecord(id) {
  return request({
    url: '/interSys/record/' + id,
    method: 'delete'
  })
}
