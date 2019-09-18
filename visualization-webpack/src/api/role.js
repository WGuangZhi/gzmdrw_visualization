import request from '../utils/request.js'

//查询全部
export function list(params) {
  return request({
    url: '/pc/user/list',
    method: 'get',
    data: params
  })
}

//分页查询
export function index(params) {
  return request({
    url: '/pc/role/index',
    method: 'post',
    data: params
  })
}

//删除操作
export function del(params) {
  return request({
    url: '/pc/role/delete'+id,
    method: 'post',
    data: params
  })
}

