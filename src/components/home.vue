<template>
  <div>
    <v-head></v-head>
    <div class="container">
      <v-banner></v-banner>
      <div class="curriculum">
        <div class="list">
          <ul class="clearfix">
            <li>
              <router-link to="/course1">
                <div class="pic"><img src="../assets/curriculumPic.jpg"/></div>
                <div class="info">
                  <div class="tit">整体造型班</div>
                  <div class="price">学费 3980元/人</div>
                  <div class="text">时间 每月6日、16日开班   15天</div>
                </div>
              </router-link>
            </li>
            <li>
              <router-link to="/course2">
                <div class="pic"><img src="../assets/curriculumPic.jpg"/></div>
                <div class="info">
                  <div class="tit">风尚造型提升班</div>
                  <div class="price">学费 2980元/人</div>
                  <div class="text">时间 每月6日、16日开班   5天</div>
                </div>
              </router-link>
            </li>
            <li>
              <router-link to="/course3">
                <div class="pic"><img src="../assets/curriculumPic.jpg"/></div>
                <div class="info">
                  <div class="tit">时尚新娘造型进阶班</div>
                  <div class="price">学费 2680元/人</div>
                  <div class="text">时间 每月6日、16日开班   10天</div>
                </div>
              </router-link>
            </li>
            <li>
              <router-link to="/course4">
                <div class="pic"><img src="../assets/curriculumPic.jpg"/></div>
                <div class="info">
                  <div class="tit">零基础专业造型班</div>
                  <div class="price">学费 1980元/人</div>
                  <div class="text">时间 每月6日、16日开班   10天</div>
                </div>
              </router-link>
            </li>
            <li>
              <router-link to="/course5">
                <div class="pic"><img src="../assets/curriculumPic.jpg"/></div>
                <div class="info">
                  <div class="tit">零基础专业美妆班</div>
                  <div class="price">学费 1680元/人</div>
                  <div class="text">时间 每月6日、16日开班   10天</div>
                </div>
              </router-link>
            </li>
            <li>
              <router-link to="/course6">
                <div class="pic"><img src="../assets/curriculumPic.jpg"/></div>
                <div class="info">
                  <div class="tit">个人定制美妆班</div>
                  <div class="price">学费 288元/人</div>
                  <div class="text">时间 提前一天预约   课时</div>
                </div>
              </router-link>
            </li>
          </ul>
        </div>
      </div>
    </div>
    <v-footer></v-footer>
  </div>
</template>
<script>
  import vHead from './head'
  import vFooter from './footer'
  import vBanner from './banner'
    export default {
      name: "home",
      components:{
        vBanner,
        vHead,
        vFooter
      }
    }
</script>

<style scoped>

</style>
