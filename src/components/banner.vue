<template>
  <div class="banner">
    <el-carousel indicator-position="outside" :height="imgH+'px'">
      <el-carousel-item v-for="item in imgList" :key="item.id">
        <img ref="imgH" :src="item.idView" @load="imgLoad"/>
      </el-carousel-item>
    </el-carousel>
  </div>
</template>

<script>
    export default {
        name: "banner",
      data(){
        return{
          imgH:'',
          imgList:[
            {id: 0, idView: require('../assets/curriculumPic.jpg')},
            {id: 1, idView: require('../assets/curriculumPic.jpg')},
            {id: 2, idView: require('../assets/curriculumPic.jpg')}
          ]
        }
      },
      methods:{
        imgLoad(){
          this.imgH=this.$refs.imgH['0'].height
        }
      },
      mounted(){
        const that = this;
        window.onresize = function temp() {
          that.imgH=that.$refs.imgH['0'].height
        };
      }
    }
</script>

<style scoped>
  .el-carousel__item h3 {
    color: #475669;
    font-size: 18px;
    opacity: 0.75;
    line-height: 300px;
    margin: 0;
  }

  .el-carousel__item:nth-child(2n) {
    background-color: #99a9bf;
  }

  .el-carousel__item:nth-child(2n+1) {
    background-color: #d3dce6;
  }
  img{
    width: 100%;
  }
</style>
