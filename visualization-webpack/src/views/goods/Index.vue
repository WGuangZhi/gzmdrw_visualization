<template>
    <!--为echarts准备一个具备大小的容器dom-->
	<div id="app">
		<div class="top">
			<h1>货物</h1>
		</div>
		<div id="main" style="width:100%;height: 400px;background-color: #00A65A;">
			
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
                this.charts = echarts.init(document.getElementById(id))
                this.charts.setOption({
                    tooltip: {
                        trigger: 'axis'
                    },
                    legend: {
                        data: ['近七日收益']
                    },
                    grid: {
                        left: '3%',
                        right: '4%',
                        bottom: '3%',
                        containLabel: true
                    },
 
                    toolbox: {
                        feature: {
                            saveAsImage: {}
                        }
                    },
                    xAxis: {
                        type: 'category',
                        boundaryGap: false,
                    data: ["1","2","3","4","5"]
                    
                    },
                    yAxis: {
                        type: 'value'
                    },
 
                    series: [{
                        name: '近七日收益',
                        type: 'line',
                        stack: '总量',
                        data: this.opinionData
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
</style>