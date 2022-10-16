import request from '@/utils/request'

// 查询科室信息列表
export function listDepartment(query) {
  return request({
    url: '/system/department/list',
    method: 'get',
    params: query
  })
}

// 查询科室信息详细
export function getDepartment(departmentId) {
  return request({
    url: '/system/department/' + departmentId,
    method: 'get'
  })
}

// 新增科室信息
export function addDepartment(data) {
  return request({
    url: '/system/department',
    method: 'post',
    data: data
  })
}

// 修改科室信息
export function updateDepartment(data) {
  return request({
    url: '/system/department',
    method: 'put',
    data: data
  })
}

// 删除科室信息
export function delDepartment(departmentId) {
  return request({
    url: '/system/department/' + departmentId,
    method: 'delete'
  })
}
