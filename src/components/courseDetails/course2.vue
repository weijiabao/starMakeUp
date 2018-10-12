<template>
  <div class="course">
    <div class="coursePic">
      <img src="../../assets/course2Pic1.jpg"/>
    </div>
    <div class="tit">风尚造型提升班</div>
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
    <div class="coursePic">
      <img src="../../assets/course2Pic2.jpg"/>
    </div>
  </div>
</template>

<script>
  export default {
    data(){
      return{
        infoList:[
          {txt:'时间',eTxt:'TIME',text:'每月6日、16日开班'},
          {txt:'学制',eTxt:'ACADEMIC SYSTEM',text:'5天'},
          {txt:'学费',eTxt:'TUITION',text:'2980元/人'}
        ],
        dayList:[
          {id:1,idText:'造型产品的质感，综合技法的结合运用'},
          {id:2,idText:'灵动轻盈卷发造型打理手法'},
          {id:3,idText:'婚纱礼服秀场造型解析'},
          {id:4,idText:'彩妆广告拍摄造型技巧'},
          {id:5,idText:'视觉创作拍摄造型技巧'}
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
      text-align: center;
      font-family:sans-serif;
      color: #b6ccd7;
      letter-spacing:0.1rem;
    }
    .infoList{
      width: 100%;
      padding: 0.12rem 0.5rem;
      box-sizing: border-box;
      background: #edeef0;
      li{
        width: 100%;
        font-family: sans-serif;
        text-align: center;
        color: #333652;
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
        color: #333652;
        font-size: 0.26rem;
        font-family: sans-serif;
        font-weight: bold;
        margin-bottom: 0.1rem;
        .num{
          float: left;
          width: 21%;
          text-align: right;
          box-sizing: border-box;
          padding: 0 0.15rem;
        }
        .text{
          float: left;
          width: 79%;
        }
      }
    }
  }
</style>
