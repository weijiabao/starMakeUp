<template>
    <div class="course">
      <div class="coursePic">
        <img src="../../assets/course1Pic1.jpg"/>
      </div>
      <div class="tit">整体造型班</div>
      <div class="infoList">
        <ul>
          <li class="clearfix" v-for="item in infoList">
            <div class="left">
              <div class="txt">{{item.txt}}</div>
              <div class="english">{{item.eTxt}}</div>
            </div>
            <div class="right">{{item.text}}</div>
          </li>
        </ul>
      </div>
      <div class="timeList">
        <ul class="clearfix">
          <li class="clearfix" v-for="item in dayList" :key="item.id">
            <div class="num">Day{{item.id}}</div>
            <div class="text">{{item.idText}}</div>
          </li>
        </ul>
      </div>
    </div>
</template>

<script>
    export default {
      data(){
        return{
          infoList:[
            {txt:'时间',eTxt:'TIME',text:'每月6日、16日开班'},
            {txt:'学制',eTxt:'ACADEMIC SYSTEM',text:'15天'},
            {txt:'学费',eTxt:'TUITION',text:'3980元/人'}
          ],
          dayList:[
            {id:1,idText:'写真拍摄'},
            {id:2,idText:'平面模特'},
            {id:3,idText:'欧美妆容'},
            {id:4,idText:'时尚商业画册造型'},
            {id:5,idText:'明星艺人妆容'},
            {id:6,idText:'综艺主持人妆容'},
            {id:7,idText:'艺术舞台造型'},
            {id:8,idText:'明星红毯造型'},
            {id:9,idText:'服装秀场造型'},
            {id:10,idText:'老年妆'},
            {id:11,idText:'解读造型产品的质感以及综合技法的结合'},
            {id:12,idText:'灵动轻盈卷发造型打理手法'},
            {id:13,idText:'婚纱礼服秀场造型解析'},
            {id:14,idText:'彩妆广告拍摄造型技巧'},
            {id:15,idText:'视觉创作拍摄造型技巧'}
          ]
        }
      }
    }
</script>
<style lang="less" scoped>
  .course{
    width: 100%;
    img{
      width: 100%;
    }
    .tit{
      height: 1.1rem;
      line-height:1.1rem;
      font-size: 0.74rem;
      font-family:sans-serif;
      color: #4c3824;
      text-indent:0.1em;
      letter-spacing:0.1rem;
    }
    .infoList{
      width: 100%;
      padding: 0.12rem 0.5rem;
      box-sizing: border-box;
      background: #f0e6d7;
      li{
        width: 100%;
        font-family: sans-serif;
        text-align: center;
        color: #836559;
        padding: 0.12rem 0;
        .left{
          float: left;
          width: 34%;
          .txt{
            line-height: 0.4rem;
            font-size: 0.37rem;
          }
          .english{
            line-height: 0.17rem;
            font-size: 0.13rem;
          }
        }
        .right{
          float: left;
          width: 66%;
          font-size: 0.37rem;
          line-height: 0.54rem;
        }
      }
    }
    .coursePic{
      width: 100%;
    }
    .timeList{
      width: 100%;
      box-sizing: border-box;
      padding: 0.24rem 0.18rem;
      li{
        width: 100%;
        color: #836559;
        font-size: 0.26rem;
        font-family: sans-serif;
        font-weight: bold;
        margin-bottom: 0.1rem;
        .num{
          float: left;
          width: 15%;
        }
        .text{
          float: left;
          width: 85%;
        }
      }
    }
  }
</style>
