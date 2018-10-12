<template>
  <div class="course">
    <div class="coursePic clearfix">
      <div class="leftPic">
        <img src="../../assets/course5Pic2.jpg"/>
      </div>
      <div class="rightLogo">
        <img src="../../assets/course5Pic1.jpg"/>
      </div>
    </div>
    <div class="tit">零基础专业美妆班</div>
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
        <img src="../../assets/course5Pic3.jpg"/>
      </div>
      <div class="right">
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
          {txt:'学费',eTxt:'TUITION',text:'1680元/人'}
        ],
        dayList:[
          {id:1,idText:'化妆美学及人物面部基础素描'},
          {id:2,idText:'色彩及专业产品辨别、挑选技巧'},
          {id:3,idText:'实用专业底妆的处理技巧'},
          {id:4,idText:'眼部结构解析及眼影层次晕染'},
          {id:5,idText:'眼线调整的技巧'},
          {id:6,idText:'睫毛的处理及假睫毛的佩戴技巧'},
          {id:7,idText:'腮红的处理'},
          {id:8,idText:'唇形的调整与立体唇妆的画法'},
          {id:9,idText:'清透底妆的处理'},
          {id:10,idText:'整体妆容演示'}
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
      color: #d7a249;
      letter-spacing:0.1rem;
    }
    .infoList{
      width: 100%;
      padding: 0.12rem 0.5rem;
      box-sizing: border-box;
      background: #e3e7e8;
      li{
        width: 100%;
        font-family: sans-serif;
        text-align: center;
        color: #13271a;
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
      padding: 0.3rem 0 0.5rem;
      .left{
        float: left;
        width: 50%;
      }
      .right{
        float: left;
        width: 50%;
        box-sizing: border-box;
        padding: 0 0.2rem;
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
    }
  }
</style>
