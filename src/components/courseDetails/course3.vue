<template>
  <div class="course">
    <div class="coursePic clearfix">
      <div class="leftPic">
        <img src="../../assets/course3Pic1.jpg"/>
      </div>
      <div class="rightLogo">
        <img src="../../assets/course3Pic2.jpg"/>
      </div>
    </div>
    <div class="tit">时尚新娘造型进阶班</div>
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
    <div class="timeBox clearfix">
      <div class="left">
        <div class="title">课程内容</div>
        <div class="timeList">
          <ul class="clearfix">
            <li class="clearfix" v-for="item in dayList" :key="item.id">
              <div class="num">Day{{item.id}}</div>
              <div class="text">{{item.idText}}</div>
            </li>
          </ul>
        </div>
      </div>
      <div class="right">
        <img src="../../assets/course3Pic3.jpg"/>
      </div>
    </div>
  </div>
</template>

<script>
  export default {
    data(){
      return{
        infoList:[
          {txt:'时间',eTxt:'TIME',text:'每月6日、16日开班'},
          {txt:'学制',eTxt:'ACADEMIC SYSTEM',text:'10天'},
          {txt:'学费',eTxt:'TUITION',text:'2680元/人'}
        ],
        dayList:[
          {id:1,idText:'柔美长发新娘造型'},
          {id:2,idText:'简约清新新娘造型'},
          {id:3,idText:'轻式复古新娘造型'},
          {id:4,idText:'高贵复古新娘造型'},
          {id:5,idText:'日系田园新娘造型'},
          {id:6,idText:'韩式精致新娘造型'},
          {id:7,idText:'萝莉少女新娘造型'},
          {id:8,idText:'法式优雅新娘造型'},
          {id:9,idText:'灵动甜美新娘造型'},
          {id:10,idText:'影楼新娘样片欣赏解析'}
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
      text-align: center;
      font-family:sans-serif;
      color: #efc63b;
      letter-spacing:0.1rem;
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
    .timeBox{
      box-sizing: border-box;
      padding: 0.12rem 0.12rem 0.5rem;
      .left{
        float: left;
        width: 50%;
        .title{
          font-size: 0.47rem;
          padding-bottom: 0.12rem;
          color: #efc63b;
          text-align: center;
        }
        .timeList{
          width: 100%;
          li{
            width: 100%;
            color: #964f2d;
            font-size: 0.2rem;
            font-family: sans-serif;
            font-weight: bold;
            margin-bottom: 0.1rem;
            .num{
              float: left;
              width: 25%;
            }
            .text{
              float: left;
              width: 75%;
            }
          }
        }
      }
      .right{
        float: left;
        width: 50%;
      }
    }
  }
</style>
