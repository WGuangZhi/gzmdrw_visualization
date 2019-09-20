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
      {
        path: '/role_manage',
        name: 'RoleManage',
        meta: {
          title: '角色列表',
          keepAlive: true
        },
        component: resolve => require(['@/views/permissionManage/role/Role.vue'], resolve),
      },
      {
        path: '/financia',
        name: 'financia',
        meta: {
          title: 'financia',
          keepAlive: true
        },
        component: resolve => require(['@/views/permissionManage/financia/Index.vue'], resolve),
      },
	  {
	    path: '/financia_income',//
	    name: 'financia_income',
	    meta: {
	      title: '财政收入',
	      keepAlive: true
	    },
	    component: resolve => require(['@/views/financia_income/Index.vue'], resolve),
	  },
	  {
	    path: '/financia_expenditure',//
	    name: 'financia_expenditure',
	    meta: {
	      title: '财政支出',
	      keepAlive: true
	    },
	    component: resolve => require(['@/views/financia_expenditure/Index.vue'], resolve),
	  },
	  {
	    path: '/goods',//
	    name: 'goods',
	    meta: {
	      title: '货物',
	      keepAlive: true
	    },
	    component: resolve => require(['@/views/goods/Index.vue'], resolve),
	  },
	  {
	    path: '/goods_export',//
	    name: 'goods_export',
	    meta: {
	      title: '货物出口',
	      keepAlive: true
	    },
	    component: resolve => require(['@/views/goods_export/Index.vue'], resolve),
	  },
	  {
	    path: '/goods_import',//
	    name: 'goods_import',
	    meta: {
	      title: '货物进口',
	      keepAlive: true
	    },
	    component: resolve => require(['@/views/goods_import/Index.vue'], resolve),
	  },
	  {
	    path: '/product',//
	    name: 'product',
	    meta: {
	      title: '生产总值',
	      keepAlive: true
	    },
	    component: resolve => require(['@/views/product/Index.vue'], resolve),
	  },
	  {
	    path: '/product_index_up',//
	    name: 'product_index_up',
	    meta: {
	      title: '生产总值上半年',
	      keepAlive: true
	    },
	    component: resolve => require(['@/views/product_index_up/Index.vue'], resolve),
	  },
	  {
	    path: '/product_index_down',//
	    name: 'product_index_down',
	    meta: {
	      title: '生产总值下半年',
	      keepAlive: true
	    },
	    component: resolve => require(['@/views/product_index_down/Index.vue'], resolve),
	  },
      //个人中心，可能有修改密码，头像修改等路由
      Personal
    ]
  },
  {
    path: '/login',
    name: 'Login',
    meta: {
      title: '后台登录',
      keepAlive: false
    },
    components: {
      blank: resolve => require(['@/views/login/Login.vue'], resolve),
    }
  },

]


RouteList[0].children.push({
  path: '/build_code',
  name: 'BuildCode',
  meta: {
    title: '构建代码',
    keepAlive: true
  },
  component: resolve => require(['@/views/developmentTool/Build.vue'], resolve),
});

export default new Router({routes: RouteList})


