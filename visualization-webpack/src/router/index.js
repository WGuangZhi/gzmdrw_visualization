import Vue from 'vue'
import Router from 'vue-router'
import Personal from './personal'

Vue.use(Router)



let RouteList = [
  {
    path: '/',
    component: resolve => require(['@/views/layout/App.vue'], resolve),
    meta: {
      title: '首页',
      keepAlive: false,
    },
    children: [
      {
        path: '/',
        name: 'Dashboard',
        meta: {
          title: '国际GDP对比',
          keepAlive: true
        },
        component: resolve => require(['@/views/home/Index.vue'], resolve),
      },
      {
        path: '/font_awesome',
        name: 'FontAwesome',
        meta: {
          title: 'FontAwesome 图标',
          keepAlive: false
        },
        component: resolve => require(['@/views/icon/FontAwesome.vue'], resolve),
      },
      {
        path: '/element_icon',
        name: 'ElementIcon',
        meta: {
          title: 'Element 图标',
          keepAlive: false
        },
        component: resolve => require(['@/views/icon/ElementIcon.vue'], resolve),
      },
      {
        path: '/post_manage',
        name: 'PostManage',
        meta: {
          title: '文章管理',
          keepAlive: false
        },
        component: resolve => require(['@/views/contentManage/Index.vue'], resolve),
      },
      {
        path: '/user_manage',
        name: 'UserManage',
        meta: {
          title: '用户列表',
          keepAlive: true
        },
        component: resolve => require(['@/views/userManage/Index.vue'], resolve),
      },
      {
        path: '/category_manage',
        name: 'CategoryManage',
        meta: {
          title: '分类列表',
          keepAlive: true
        },
        component: resolve => require(['@/views/categoryManage/Index.vue'], resolve),
      },
      
      //个人中心，可能有修改密码，头像修改等路由
      Personal
    ]
  }
]


export default new Router({routes: RouteList})


