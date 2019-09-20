<template>
    <!--为echarts准备一个具备大小的容器dom-->
    <div id="app">
    	<div class="top">
    		<h1>财政</h1>
    	</div>
    	<div id="main" style="width:100%;height: 400px;background-color:#3CBCBC;">
    		
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
                      title: {
                            text: '漏斗图',
                            subtext: '纯属虚构',
                            left: 'left',
                            top: 'bottom'
                        },
                        tooltip: {
                            trigger: 'item',
                            formatter: "{a} <br/>{b} : {c}%"
                        },
                        toolbox: {
                            orient: 'vertical',
                            top: 'center',
                            feature: {
                                dataView: {readOnly: false},
                                restore: {},
                                saveAsImage: {}
                            }
                        },
                        legend: {
                            orient: 'vertical',
                            left: 'left',
                            data: ['展现','点击','访问','咨询','订单']
                        },
                        calculable: true,
                        series: [
                            {
                                name: '漏斗图',
                                type: 'funnel',
                                width: '40%',
                                height: '45%',
                                left: '5%',
                                top: '50%',
                                data:[
                                    {value: 60, name:'访问'},
                                    {value: 30, name:'咨询'},
                                    {value: 10, name:'订单'},
                                    {value: 80, name:'点击'},
                                    {value: 100, name:'展现'}
                                ]
                            },
                            {
                                name: '金字塔',
                                type: 'funnel',
                                width: '40%',
                                height: '45%',
                                left: '5%',
                                top: '5%',
                                sort: 'ascending',
                                data:[
                                    {value: 60, name:'访问'},
                                    {value: 30, name:'咨询'},
                                    {value: 10, name:'订单'},
                                    {value: 80, name:'点击'},
                                    {value: 100, name:'展现'}
                                ]
                            },
                            {
                                name: '漏斗图',
                                type:'funnel',
                                width: '40%',
                                height: '45%',
                                left: '55%',
                                top: '5%',
                                label: {
                                    normal: {
                                        position: 'left'
                                    }
                                },
                                data:[
                                    {value: 60, name: '访问'},
                                    {value: 30, name: '咨询'},
                                    {value: 10, name: '订单'},
                                    {value: 80, name: '点击'},
                                    {value: 100, name: '展现'}
                                ]
                            },
                            {
                                name: '金字塔',
                                type:'funnel',
                                width: '40%',
                                height: '45%',
                                left: '55%',
                                top: '50%',
                                sort: 'ascending',
                                label: {
                                    normal: {
                                        position: 'left'
                                    }
                                },
                                data:[
                                    {value: 60, name: '访问'},
                                    {value: 30, name: '咨询'},
                                    {value: 10, name: '订单'},
                                    {value: 80, name: '点击'},
                                    {value: 100, name: '展现'}
                                ]
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