import localKey from './localKey'


const devApiUrl = 'http://127.0.0.1:8679';//本地开发环境
const buildDevApiUrl = 'http://127.0.0.1:8679';//打包开发环境
const buildTestApiUrl = 'http://127.0.0.1:8679';//打包测试环境
const buildProApiUrl = 'http://127.0.0.1:8679';//打包正式环境


let useApiUrl;

switch (process.env.NODE_ENV) {
  case 'development':
    useApiUrl = devApiUrl;
    break;
  case 'buildDev':
    useApiUrl = buildDevApiUrl;
    break;
  case 'buildTest':
    useApiUrl = buildTestApiUrl;
    break;
  case 'production':
    useApiUrl = buildProApiUrl;
    break;
}

export default {
  nodeDevEnv: process.env.NODE_ENV == 'development',
  apiUrl: useApiUrl,
  siteName: '贵州民族大学人文科技学院可视化作品展示',
  minSiteMame: 'EUI',
  apiPrefix: "",
  timeout: 5000,
  cookiesExpires: 7,
  requestRetry: 4,
  requestRetryDelay: 800,
  tokenKey: 'ACCESS_TOKEN',
  userInfoKey: 'USER_INFO',
  permissionsKey:'PERMISSION_ARRAY',
  gitHub: '',
  ...localKey
}
