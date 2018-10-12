<template>
  <div class="course">
    <div class="coursePic clearfix">
      <div class="leftPic">
        <img src="../../assets/course6Pic1.jpg"/>
      </div>
      <div class="rightLogo">
        <img src="../../assets/course3Pic2.jpg"/>
      </div>
    </div>
    <div class="tit">个人定制美妆班</div>
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
            <div class="num">{{item.id}}</div>
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
          {txt:'时间',eTxt:'TIME',text:'提前1天预约'},
          {txt:'学制',eTxt:'ACADEMIC SYSTEM',text:'课时'},
          {txt:'学费',eTxt:'TUITION',text:'288元/人'}
        ],
        dayList:[
          {id:'授课方式：',idText:'小班教学/老师手把手一对一实操辅导'},
          {id:'授课内容：',idText:'课堂上与老师沟通妆容与造型的风格，如出席场合、职场办公室、晚宴派对、闺蜜聚会，打造绅士范儿、复古油头等形象，了解适合自身的化妆产品，并根据每个人的气质定制适合自己的妆容和简易发型。'}
        ]
      }
    }
  }
</script>
<style lang="less" scoped>
  .course{
    width: 100%;
    .coursePic{
      width: 100%;
      box-sizing: border-box;
      padding:0.2rem 0.13rem 0;
      .leftPic{
        float: left;
        width: 50%;
      }
      .rightLogo{
        float: left;
        width: 50%;
      }
    }
    img{
      width: 100%;
    }
    .tit{
      height: 1.1rem;
      line-height:1.1rem;
      font-size: 0.56rem;
      font-family:sans-serif;
      color: #efc63b;
      text-indent: 0.1em;
      letter-spacing: 0.1rem;
    }
    .infoList{
      width: 100%;
      padding: 0.12rem 0.5rem;
      box-sizing: border-box;
      background: #fcede7;
      li{
        width: 100%;
        font-family: sans-serif;
        text-align: center;
        color: #964f2d;
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
      padding: 0.38rem 0.26rem;
      li{
        width: 100%;
        color: #964f2d;
        font-size: 0.32rem;
        font-family: sans-serif;
        font-weight: bold;
        margin-bottom: 0.4rem;
        .num{
          float: left;
          width: 30%;
        }
        .text{
          float: left;
          width: 70%;
        }
      }
    }
  }
</style>
