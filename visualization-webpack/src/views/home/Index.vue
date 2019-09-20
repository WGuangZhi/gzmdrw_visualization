<template>
  <!--为echarts准备一个具备大小的容器dom-->
  <div id="main1">
	  <div class="top" style="width:100%;height: 100px;">
		<h1>2018年各国GDP对比</h1>
	  </div>
	  <div id="main" style="width:100%;height: 400px;"></div>
	  <div class="top" style="width:100%;height: 100px;">
	  		<h2>1969年到2018年各国GDP对比</h2>
	  </div>
	  <div id="zhexie1" style="width:100%;height: 400px;"></div>
	  <div class="buttom" style="width:100%;height: 100px;">
	  </div>
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
				//扇形
                opinion:[],//侧边栏对象数据
                opinionData:[//图表对象数据
                  // {value:335, name:'直接访问'}
                ],
			    countrs:[],//国家列表
				years:[],//年份列表
				cnDGP:[],//中国GDP
				jpDGP:[],//日本GDP
				rkDGP:[],//韩国
				brDGP:[],//英国
				gmDGP:[],//德国
				usDGP:[]//美国GDP
            }
        },
        methods:{
			getData(){
				
			},
			zexie(id){
				request({
					url:'/country/list',
					method:"get"
				}).then(resp=>{
					this.countrs=resp.data.countrs//国家列表
					this.years=resp.data.years//国家列表
					this.cnDGP=resp.data.cnDGP,//中国GDP
					this.jpDGP=resp.data.jpDGP,//日本GDP
					this.rkDGP=resp.data.rkDGP,//韩国
					this.brDGP=resp.data.brDGP,//英国
					this.gmDGP=resp.data.gmDGP,//德国
					this.usDGP=resp.data.usDGP,//美国GDP
					
					//国家数据
					this.charts1 = echarts.init(document.getElementById(id))
					this.charts1.setOption({
					backgroundColor: 'rgba(235, 97, 4, 0.32)',
				 title: {
				   text: '各国GDP对比',
				   subtext: 'GDP',
				   x: 'right'
				 }, 
				 legend: {
				   orient: 'horizontal',
				   // x 设置水平安放位置，默认全图居中，可选值：'center' ¦ 'left' ¦ 'right' ¦ {number}（x坐标，单位px）
				   x: 'left',
				   // y 设置垂直安放位置，默认全图顶端，可选值：'top' ¦ 'bottom' ¦ 'center' ¦ {number}（y坐标，单位px）
				   y: 'top',
				   data: this.countrs
				 },
		  
				 //  图表距边框的距离,可选值：'百分比'¦ {number}（单位px）
				 grid: {
					 top: '15%',   // 等价于 y: '16%'
					 left: '0.5%', 
					 right: '2%',
					 bottom: '3%',
					 containLabel: true
				 },
				 // 提示框
				 tooltip: {
				   trigger: 'axis'
				 },
				 xAxis: {
				   name: '年份',
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
					data:this.years
				 },
		  
				 yAxis: {
				   name: '美元',
				   type: 'value',
				   min:0, // 设置y轴刻度的最小值
				   max:20000000000000,  // 设置y轴刻度的最大值
				   splitNumber:7,  // 设置y轴刻度间隔个数
				   axisLine: {
					 lineStyle: {
					   // 设置y轴颜色
					   color: '#87CEFA'
					 }
				   },
				 },
		  
				 series: [
				   {
					 name: '中国',
					 data:this.cnDGP,
					 type: 'line',
					 // 设置小圆点消失
					 // 注意：设置symbol: 'none'以后，拐点不存在了，设置拐点上显示数值无效
					 symbol: 'none',
					 // 设置折线弧度，取值：0-1之间
					 smooth: 0.5,
				   },
				   {
					 name: '日本',
					 data:this.jpDGP,
					 type: 'line',
					 symbolSize:8,
					 itemStyle:{
					   normal:{
						 label : {
						 show: false
						 },
						 borderColor:'red',
						 lineStyle:{                 
						   width:5,  // 设置线宽
						   type:'dotted'  //'dotted'虚线 'solid'实线
						 }
					   }
					 }
				   },
		  
				   {
					 name: '韩国',
					 data:this.rkDGP,
					 type: 'line',
					 // 设置折线上圆点大小
					 symbolSize:10,
					 // 设置拐点为实心圆
					 symbol:'circle',            
					 itemStyle: {
					   normal: {
						 label : {
						   show: false
						 },
						 lineStyle:{
						   color: 'rgba(0,0,0,0)'
						 }
					   }
					 }
				   },
				   {
				   	 name: '英国',
				   	 data:this.brDGP,
				   	 type: 'line',
				   	 symbol: 'none',
				   	 smooth: 0.5,
				   },
				   {
				   	 name: '德国',
				   	 data:this.gmDGP,
				   	 type: 'line',
				   	 symbol: 'none',
				   	 smooth: 0.5,
				   },
				   {
				   	 name: '美国',
				   	 data:this.usDGP,
				   	 type: 'line',
				   	 symbol: 'none',
				   	 smooth: 0.5,
				   }
				 ],
				 
				 color: ['#00FF00', '#00FFFF','#00FFFF','#EAC100','#484891','#CE0000']//线的颜色
			 })
			 }).catch(err=>{
			 	console.log(err)
			 });
			},
		
		drawPie(id){
			// console.log(this.opinionData)
			request({
				url:'/country/load/2018',
				method:"get"
			}).then(resp=>{
				//console.log(resp)
		    this.opinion=resp.data.opinion
		    this.opinionData=resp.data.opinionData
			//console.log(this.opinionData)
		   this.charts = echarts.init(document.getElementById(id))
		   this.charts.setOption({
			 //Echarts 的悬浮框
			  tooltip: {
			   trigger: 'item',
			   formatter: '{a}<br/>{b}:{c} ({d}%)'
			 }, 
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
		   }).catch(err=>{
		   	console.log(err)
		   });
		}
	},
  //调用
mounted(){
	this.drawPie('main')
	this.zexie('zhexie1')
	// this.gdp('gdp')
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
	.top{
		/* background-image:url(images/home1.jpg);
		background-size:cover; */
	}
</style>