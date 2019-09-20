<template>
    <!--为echarts准备一个具备大小的容器dom-->
	<div id="app">
		<div class="top">
			<h1>货物出口</h1>
		</div>
		<div id="main" style="width:100%;height: 600px;background-color: #00A65A;">
			
		</div>
	</div>
</template>
<script>
    import echarts from 'echarts'
    export default {
        name: '',
        data() {
            return {
                charts: '',
                // opinion: ["1", "3", "3", "4", "5"],
                opinionData: ["3", "2", "4", "4", "5"],
            }
        },
        methods: {
            drawLine(id) {
				app.title = '柱状图框选';
				
				var xAxisData = [];
				var data1 = [];
				var data2 = [];
				var data3 = [];
				var data4 = [];
				
				for (var i = 0; i < 10; i++) {
				    xAxisData.push('Class' + i);
				    data1.push((Math.random() * 2).toFixed(2));
				    data2.push(-Math.random().toFixed(2));
				    data3.push((Math.random() * 5).toFixed(2));
				    data4.push((Math.random() + 0.3).toFixed(2));
				}
				
				var itemStyle = {
				    normal: {
				    },
				    emphasis: {
				        barBorderWidth: 1,
				        shadowBlur: 10,
				        shadowOffsetX: 0,
				        shadowOffsetY: 0,
				        shadowColor: 'rgba(0,0,0,0.5)'
				    }
				};
                this.charts = echarts.init(document.getElementById(id))
                this.charts.setOption({
                   backgroundColor: '#eee',
                       legend: {
                           data: ['bar', 'bar2', 'bar3', 'bar4'],
                           align: 'left',
                           left: 10
                       },
                       brush: {
                           toolbox: ['rect', 'polygon', 'lineX', 'lineY', 'keep', 'clear'],
                           xAxisIndex: 0
                       },
                       toolbox: {
                           feature: {
                               magicType: {
                                   type: ['stack', 'tiled']
                               },
                               dataView: {}
                           }
                       },
                       tooltip: {},
                       xAxis: {
                           data: xAxisData,
                           name: 'X Axis',
                           silent: false,
                           axisLine: {onZero: true},
                           splitLine: {show: false},
                           splitArea: {show: false}
                       },
                       yAxis: {
                           inverse: true,
                           splitArea: {show: false}
                       },
                       grid: {
                           left: 100
                       },
                       visualMap: {
                           type: 'continuous',
                           dimension: 1,
                           text: ['High', 'Low'],
                           inverse: true,
                           itemHeight: 200,
                           calculable: true,
                           min: -2,
                           max: 6,
                           top: 60,
                           left: 10,
                           inRange: {
                               colorLightness: [0.4, 0.8]
                           },
                           outOfRange: {
                               color: '#bbb'
                           },
                           controller: {
                               inRange: {
                                   color: '#2f4554'
                               }
                           }
                       },
                       series: [
                           {
                               name: 'bar',
                               type: 'bar',
                               stack: 'one',
                               itemStyle: itemStyle,
                               data: data1
                           },
                           {
                               name: 'bar2',
                               type: 'bar',
                               stack: 'one',
                               itemStyle: itemStyle,
                               data: data2
                           },
                           {
                               name: 'bar3',
                               type: 'bar',
                               stack: 'two',
                               itemStyle: itemStyle,
                               data: data3
                           },
                           {
                               name: 'bar4',
                               type: 'bar',
                               stack: 'two',
                               itemStyle: itemStyle,
                               data: data4
                           }
                       ]
                })
            }
        },
        //调用
        mounted() {
            this.$nextTick(function() {
                this.drawLine('main')
            })
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