<template>
  <!--为echarts准备一个具备大小的容器dom-->
  <div id="main1">
	  <div id="main" style="width:100%;height: 400px;"></div>
	  <div id="zhexie1" style="width:100%;height: 400px;"></div>
  </div>
</template>
<script>
  import echarts from 'echarts'
  import request from '@/utils/request.js'
    export default {
        name: '',
        data () {
            return {
                charts: '',//拿到dom对象元素
                charts1: '',//拿到dom对象元素
                opinion:['直接访问','邮件营销','联盟广告','视频广告','搜索引擎'],//侧边栏对象数据
                opinionData:[//图表对象数据
                  {value:335, name:'直接访问'},
                  {value:310, name:'邮件营销'},
                  {value:234, name:'联盟广告'},
                  {value:135, name:'视频广告'},
                  {value:1548, name:'搜索引擎'}
                ],
				zexieDat:[],
				country:[{
					yearDate:[]
				}]
            }
        },
        methods:{
			zexie(id){
			this.charts1 = echarts.init(document.getElementById(id))
			this.charts1.setOption({
			backgroundColor: '#FFF0F5',
				/* title: {
				   text: '折线图',
				   subtext: '模拟数据',
				   x: 'center'
				 }, */
				 legend: {
				   // orient 设置布局方式，默认水平布局，可选值：'horizontal'（水平） ¦ 'vertical'（垂直）
				   orient: 'horizontal',
				   // x 设置水平安放位置，默认全图居中，可选值：'center' ¦ 'left' ¦ 'right' ¦ {number}（x坐标，单位px）
				   x: 'left',
				   // y 设置垂直安放位置，默认全图顶端，可选值：'top' ¦ 'bottom' ¦ 'center' ¦ {number}（y坐标，单位px）
				   y: 'top',
				   data: ['预期','实际','假设']
				 },
		  
				 //  图表距边框的距离,可选值：'百分比'¦ {number}（单位px）
				 grid: {
					 top: '16%',   // 等价于 y: '16%'
					 left: '3%', 
					 right: '8%',
					 bottom: '3%',
					 containLabel: true
				 },
		  
				 // 提示框
				 tooltip: {
				   trigger: 'axis'
				 },
		  
				 //工具框，可以选择
				 /* toolbox: {
					 feature: {
						 saveAsImage: {} //下载工具
					 }
				 }, */
		  
				 xAxis: {
				   name: '周几',
				   type: 'category',
				   axisLine: {
					 lineStyle: {
					   // 设置x轴颜色
					   color: '#912CEE'
					 }
				   },
				   // 设置X轴数据旋转倾斜
				   axisLabel: {
					 rotate: 30, // 旋转角度
					 interval: 0  //设置X轴数据间隔几个显示一个，为0表示都显示
					 },
				   // boundaryGap值为false的时候，折线第一个点在y轴上
				   boundaryGap: false,
				   data: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun']
				 },
		  
				 yAxis: {
				   name: '数值',
				   type: 'value',
				   min:0, // 设置y轴刻度的最小值
				   max:1800,  // 设置y轴刻度的最大值
				   splitNumber:9,  // 设置y轴刻度间隔个数
				   axisLine: {
					 lineStyle: {
					   // 设置y轴颜色
					   color: '#87CEFA'
					 }
				   },
				 },
		  
				 series: [
				   {
					 name: '预期',
					 data: [820, 932, 301, 1434, 1290, 1330, 1320],
					 type: 'line',
					 // 设置小圆点消失
					 // 注意：设置symbol: 'none'以后，拐点不存在了，设置拐点上显示数值无效
					 symbol: 'none',
					 // 设置折线弧度，取值：0-1之间
					 smooth: 0.5,
				   },
		  
				   {
					 name: '实际',
					 data: [620, 732, 941, 834, 1690, 1030, 920],
					 type: 'line',
					 // 设置折线上圆点大小
					 symbolSize:8,
					 itemStyle:{
					   normal:{
						 // 拐点上显示数值
						 label : {
						 show: true
						 },
						 borderColor:'red',  // 拐点边框颜色
						 lineStyle:{                 
						   width:5,  // 设置线宽
						   type:'dotted'  //'dotted'虚线 'solid'实线
						 }
					   }
					 }
				   },
		  
				   {
					 name: '假设',
					 data: [120, 232, 541, 134, 290, 130, 120],
					 type: 'line',
					 // 设置折线上圆点大小
					 symbolSize:10,
					 // 设置拐点为实心圆
					 symbol:'circle',            
					 itemStyle: {
					   normal: {
						 // 拐点上显示数值
						 label : {
						   show: true
						 },
						 lineStyle:{
						   // 使用rgba设置折线透明度为0，可以视觉上隐藏折线
						   color: 'rgba(0,0,0,0)'
						 }
					   }
					 }
				   }
				 ],
				 color: ['#00EE00', '#FF9F7F','#FFD700']
			 })
			},
		drawPie(id){
		   this.charts = echarts.init(document.getElementById(id))
		   this.charts.setOption({
			 //Echarts 的悬浮框
			 /* tooltip: {
			   trigger: 'item',
			   formatter: '{a}<br/>{b}:{c} ({d}%)'
			 }, */
			 //侧边栏 图例组件,展现了不同系列的标记(symbol)，颜色和名字。可以通过点击图例控制哪些系列不显示。
			 legend: {
			   orient: 'vertical',//可选值有horizontal(横向)和vertical（竖向）。默认值是horizontal
			   x: 'left',//位置
			   data:this.opinion
			 },
			 //系列列表。我理解为数据列表。这里可以定义每组数据内容，以及数据的展现形式。
			 series: [
			   {
				 name:'访问来源',
				 type:'pie',
				 /* radius:['50%','70%'], */
				 /* avoidLabelOverlap: false, */
				 //名字设置
				 label: {
				   normal: {
					 show: true,//是否显示显示名字，false为鼠标移动过去的时候显示
					 position: 'top'//名字的位置
				   },
				   //鼠标移入动态的时候显示的默认样式
				   emphasis: {
					 color:'green',
					 show: true,
					 textStyle: {
					   fontSize: '30',
					   fontWeight: 'blod'
					 }
				   }
				 },
				 //这里是显示线，图表到name的线的指向
				 //echarts 饼图的指示线(labelline)
				 labelLine: {
				   normal: {
					 show: true
				   }
				 },
				 data:this.opinionData
			   }
			 ]
		   })
		},
		getData(){
			request({
				url:'/country/load/1',
				method:"get"
			}).then(resp=>{
				this.country.yearDate=resp.data.c_years
				for(var i=0;i<resp.data.c_years.length;i++){
					// console.log(resp.data.c_years[i].year)
					// const year1=resp.data.c_years[i].year
				}
				console.log(this.country.yearDate)
			}).catch(err=>{
				console.log(err)
			})
		}
	},
  //调用
mounted(){
	this.drawPie('main')
	this.zexie('zhexie1')
	this.getData()
	/* this.$nextTick(function() {
		
	}) */
}
}
</script>
<style scoped>
    * {
        margin: 0;
        padding: 0;
        list-style: none;
    }
</style>