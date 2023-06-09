
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import FileManager from "./components/listers/FileCards"
import FileDetail from "./components/listers/FileDetail"

import VideoManager from "./components/listers/VideoCards"
import VideoDetail from "./components/listers/VideoDetail"



import IndexerManager from "./components/listers/IndexerCards"
import IndexerDetail from "./components/listers/IndexerDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/files',
                name: 'FileManager',
                component: FileManager
            },
            {
                path: '/files/:id',
                name: 'FileDetail',
                component: FileDetail
            },

            {
                path: '/videos',
                name: 'VideoManager',
                component: VideoManager
            },
            {
                path: '/videos/:id',
                name: 'VideoDetail',
                component: VideoDetail
            },



            {
                path: '/indexers',
                name: 'IndexerManager',
                component: IndexerManager
            },
            {
                path: '/indexers/:id',
                name: 'IndexerDetail',
                component: IndexerDetail
            },



    ]
})
