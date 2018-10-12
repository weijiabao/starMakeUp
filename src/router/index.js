import Vue from 'vue'
import Router from 'vue-router'
import home from '@/components/home'
const home1 =resolve=>require(['@/components/home'],resolve);
import course1 from '@/components/courseDetails/course1'
import course2 from '@/components/courseDetails/course2'
import course3 from '@/components/courseDetails/course3'
import course4 from '@/components/courseDetails/course4'
import course5 from '@/components/courseDetails/course5'
import course6 from '@/components/courseDetails/course6'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      component:home1
    },
    {
      path:'*',
      component: home
    },
    {
      path: '/course1',
      component: course1
    },
    {
      path: '/course2',
      component: course2
    },
    {
      path: '/course3',
      component: course3
    },
    {
      path: '/course4',
      component: course4
    },
    {
      path: '/course5',
      component: course5
    },
    {
      path: '/course6',
      component: course6
    }
  ]
})
