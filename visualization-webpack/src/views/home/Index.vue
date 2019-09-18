<template>
  <!--为echarts准备一个具备大小的容器dom-->
  <div id="main" style="width:100%;height: 400px;"></div>
</template>
<script>
  import echarts from 'echarts'
    export default {
        name: '',
        data () {
            return {
                charts: '',//拿到dom对象元素
                opinion:['直接访问','邮件营销','联盟广告','视频广告','搜索引擎'],//侧边栏对象数据
                opinionData:[//图表对象数据
                  {value:335, name:'直接访问'},
                  {value:310, name:'邮件营销'},
                  {value:234, name:'联盟广告'},
                  {value:135, name:'视频广告'},
                  {value:1548, name:'搜索引擎'}
                ]
            }
        },
        methods:{
            drawPie(id){
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
            }
        },
      //调用
        mounted(){
			this.drawPie('main')
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