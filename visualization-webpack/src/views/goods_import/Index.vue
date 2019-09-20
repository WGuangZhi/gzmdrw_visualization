<template>
    <!--为echarts准备一个具备大小的容器dom-->
	<div id="app">
		<div class="top">
			<h1>货物进口</h1>
		</div>
		<div id="main" style="width:100%;height: 600px;">
			
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
				var category = [];
				var dottedBase = +new Date();
				var lineData = [];
				var barData = [];
				
				for (var i = 0; i < 20; i++) {
				    var date = new Date(dottedBase += 3600 * 24 * 1000);
				    category.push([
				        date.getFullYear(),
				        date.getMonth() + 1,
				        date.getDate()
				    ].join('-'));
				    var b = Math.random() * 200;
				    var d = Math.random() * 200;
				    barData.push(b)
				    lineData.push(d + b);
				}
                this.charts = echarts.init(document.getElementById(id))
                this.charts.setOption({
                    backgroundColor: '#0f375f',
                        tooltip: {
                            trigger: 'axis',
                            axisPointer: {
                                type: 'shadow'
                            }
                        },
                        legend: {
                            data: ['line', 'bar'],
                            textStyle: {
                                color: '#ccc'
                            }
                        },
                        xAxis: {
                            data: category,
                            axisLine: {
                                lineStyle: {
                                    color: '#ccc'
                                }
                            }
                        },
                        yAxis: {
                            splitLine: {show: false},
                            axisLine: {
                                lineStyle: {
                                    color: '#ccc'
                                }
                            }
                        },
                        series: [{
                            name: 'line',
                            type: 'line',
                            smooth: true,
                            showAllSymbol: true,
                            symbol: 'emptyCircle',
                            symbolSize: 15,
                            data: lineData
                        }, {
                            name: 'bar',
                            type: 'bar',
                            barWidth: 10,
                            itemStyle: {
                                normal: {
                                    barBorderRadius: 5,
                                    color: new echarts.graphic.LinearGradient(
                                        0, 0, 0, 1,
                                        [
                                            {offset: 0, color: '#14c8d4'},
                                            {offset: 1, color: '#43eec6'}
                                        ]
                                    )
                                }
                            },
                            data: barData
                        }, {
                            name: 'line',
                            type: 'bar',
                            barGap: '-100%',
                            barWidth: 10,
                            itemStyle: {
                                normal: {
                                    color: new echarts.graphic.LinearGradient(
                                        0, 0, 0, 1,
                                        [
                                            {offset: 0, color: 'rgba(20,200,212,0.5)'},
                                            {offset: 0.2, color: 'rgba(20,200,212,0.2)'},
                                            {offset: 1, color: 'rgba(20,200,212,0)'}
                                        ]
                                    )
                                }
                            },
                            z: -12,
                            data: lineData
                        }, {
                            name: 'dotted',
                            type: 'pictorialBar',
                            symbol: 'rect',
                            itemStyle: {
                                normal: {
                                    color: '#0f375f'
                                }
                            },
                            symbolRepeat: true,
                            symbolSize: [12, 4],
                            symbolMargin: 1,
                            z: -10,
                            data: lineData
                        }]
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
	#app{
		margin: -6px -6px -6px -6px;
	}
	.top{
		background-color: #0f375f;
		color: #E4E7ED;
	}
</style>