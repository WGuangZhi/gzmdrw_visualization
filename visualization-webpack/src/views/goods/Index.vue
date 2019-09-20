<template>
    <!--为echarts准备一个具备大小的容器dom-->
	<div id="app">
		<div class="top">
			<h1>货物</h1>
		</div>
		<div id="main" style="width:100%;height: 600px;background-color: #D8E8F2;">
			
		</div>
		<div class="buttom" style="hehebackground-color: #00A65A;height: 600px;"></div>
	</div>
</template>
<script>
    import echarts from 'echarts'
	 import request from '@/utils/request.js'
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
				request({
					url:'/goods/load/2017',
					method:"get"
				}).then(resp=>{
					console.log(resp)
                this.charts = echarts.init(document.getElementById(id))
                this.charts.setOption({
                     tooltip: {
                            trigger: 'item',
                            formatter: "{a} <br/>{b}: {c} ({d}%)"
                        },
                        legend: {//左边
                            orient: 'vertical',
                            x: 'left',
                            data:['直达','营销广告','搜索引擎','邮件营销','联盟广告','视频广告','百度','谷歌','必应','其他']
                        },
                        series: [
                            {//饼
                                name:'访问来源',
                                type:'pie',
                                selectedMode: 'single',
                                radius: [0, '50%'],
                    
                                label: {
                                    normal: {
                                        position: 'inner'
                                    }
                                },
                                labelLine: {
                                    normal: {
                                        show: false
                                    }
                                },
                                data:[
                                   {value:335, name:'直达', selected:true},
                                    {value:679, name:'营销广告'},
                                    {value:1548, name:'搜索引擎'}
                                ]
                            },
                            {//提示框
                                name:'访问来源',
                                type:'pie',
                                radius: ['60%', '85%'],//x-圆圈的大小，提示框的大小
                                label: {
                                    normal: {
                                        formatter: '{a|{a}}{abg|}\n{hr|}\n  {b|{b}：}{c}  {per|{d}%}  ',
                                        backgroundColor: '#eee',
                                        borderColor: '#aaa',
                                        borderWidth: 1,
                                        borderRadius: 9,
                                        // shadowBlur:3,
                                        // shadowOffsetX: 2,
                                        // shadowOffsetY: 2,
                                        // shadowColor: '#999',
                                        // padding: [0, 7],
                                        rich: {
                                            a: {
                                                color: '#999',
                                                lineHeight: 22,
                                                align: 'center'
                                            },
                                            abg: {
                                                // backgroundColor: '#333',
                                                width: '100%',
                                                align: 'left',
                                                height: 32,
                                                borderRadius: [4, 4, 0, 0]
                                            },
                                            hr: {
                                                borderColor: '#aaa',
                                                width: '100%',
                                                borderWidth: 0.5,
                                                height: 0
                                            },
                                            b: {//悬浮框属性字体
                                                fontSize: 24,
                                                lineHeight: 33
                                            },
                                            per: {
                                                color: '#eee',
                                                backgroundColor: '#334455',
                                                padding: [2, 4],
                                                borderRadius: 2
                                            }
                                        }
                                    }
                                },
                                data:[//提示框
                                    {value:335, name:'直达1111'},
                                    {value:310, name:'邮件营销'},
                                    {value:234, name:'联盟广告'},
                                    {value:135, name:'视频广告'},
                                    {value:1048, name:'百度'},
                                    {value:251, name:'谷歌'},
                                    {value:147, name:'必应'},
                                    {value:102, name:'其他'}
                                ]
                            }
                        ]
                })
				}).catch(err=>{
					console.log(err)
				});
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
	.top{
		background-color: #D8E8F2;
		padding-left: 20px;
		color: azure;
	}
</style>