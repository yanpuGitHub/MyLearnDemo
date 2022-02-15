package com.yp.learn

/**
 * @author: yp
 * @date: 2022/1/29
 * @version: 1.0.0
 * @description: Androidx依赖
 */
object Androidx {

    object Version {

        // AndroidX--------------------------------------------------------------
        const val AppCompat = "1.2.0"
        const val CoreKtx = "1.3.1"
        const val ConstraintLayout = "2.0.4"                // 约束布局
        const val TestExtJunit = "1.1.2"
        const val TestEspresso = "3.3.0"
        const val ActivityKtx = "1.1.0"
        const val FragmentKtx = "1.2.5"
        const val MultiDex = "2.0.1"
        const val room_version = "2.3.0"
        const val annotation = "1.2.0"

        // Android---------------------------------------------------------------
        const val Junit = "4.13"
        const val Material = "1.4.0"                        // 材料设计UI套件

        // Kotlin----------------------------------------------------------------
        const val Kotlin = "1.5.20"
        const val Coroutines = "1.5.0"                      // 协程
        const val anko_version = "0.10.7"                    //后台运行
        const val kotlin_version = "1.5.0"
        const val koin_version = "2.2.0-rc-3"

        // JetPack---------------------------------------------------------------
        const val Lifecycle =
            "2.3.1"                       // Lifecycle相关（ViewModel & LiveData & Lifecycle）
        const val Hilt = "2.35.1"                           // DI框架-Hilt
        const val HiltAndroidx = "1.0.0"

        // GitHub----------------------------------------------------------------
        const val OkHttp = "4.9.0"                          // OkHttp
        const val OkHttpInterceptorLogging = "4.9.1"        // OkHttp 请求Log拦截器
        const val Retrofit = "2.9.0"                        // Retrofit
        const val RetrofitConverterGson = "2.9.0"           // Retrofit Gson 转换器
        const val RetrofitRxjava2Adapter = "2.4.0"           // Retrofit Rxjava2
        const val Gson = "2.8.7"                            // Gson
        const val MMKV = "1.2.9"                            // 腾讯 MMKV 替代SP
        const val AutoSize = "1.2.1"                        // 屏幕适配
        const val ARoute = "1.5.1"                          // 阿里路由
        const val ARouteCompiler = "1.5.1"                  // 阿里路由 APT
        const val RecyclerViewAdapter = "3.0.4"             // RecyclerViewAdapter
        const val EventBus = "3.2.0"                        // 事件总线
        const val PermissionVersion = "4.9.1"              //权限申请
        const val LeakCanary = "2.7"                        // 检测内存泄漏
        const val AutoService = "1.0"                       // 自动生成SPI暴露服务文件
        const val Coil = "1.3.0"                            // Kotlin图片加载框架

        const val BaseRecyclerViewAdapterHelper = "3.0.4"    //万能适配器

        const val toastUtils = "9.6"                        // 弹出对话框工具类

        const val glide = "4.10.0"                            //Gilde加载框架

        const val design = "28.0.0"                            // design包
        const val smart = "2.0.3"                             // 刷新框架
        const val DSWebView = "3.0-SNAPSHOT"               // DSWebView

        const val PDF = "3.2.0-beta.1"                    // pdf
        const val CropImage = "1.1.8"            // 裁剪image

        // 第三方SDK--------------------------------------------------------------
        const val TencentBugly = "3.3.9"                    // 腾讯Bugly 异常上报
        const val TencentBuglyNative = "3.8.0"              // Bugly native异常上报
        const val TencentTBSX5 = "43939"                    // 腾讯X5WebView
        const val SensorsData = "6.1.1"                    // 神策
        const val QiNiu = "8.4.+"                          // 七牛
        const val svga = "2.5.3"                           // svga动画
        const val x5WebView = "44136"                      // 腾讯x5WebView
    }

    /**
     * AndroidX相关依赖
     */
    object AndroidX {
        const val AndroidJUnitRunner = "androidx.test.runner.AndroidJUnitRunner"
        const val AppCompat = "androidx.appcompat:appcompat:${Version.AppCompat}"
        const val CoreKtx = "androidx.core:core-ktx:${Version.CoreKtx}"
        const val ConstraintLayout =
            "androidx.constraintlayout:constraintlayout:${Version.ConstraintLayout}"
        const val TestExtJunit = "androidx.test.ext:junit:${Version.TestExtJunit}"
        const val TestEspresso = "androidx.test.espresso:espresso-core:${Version.TestEspresso}"
        const val ActivityKtx = "androidx.activity:activity-ktx:${Version.ActivityKtx}"
        const val FragmentKtx = "androidx.fragment:fragment-ktx:${Version.FragmentKtx}"
        const val MultiDex = "androidx.multidex:multidex:${Version.MultiDex}"

        const val annotation = "androidx.annotation:annotation:${Version.annotation}"


        //room
        const val room_runtime = "androidx.room:room-runtime:${Version.room_version}"
        const val room_compiler = "androidx.room:room-compiler:${Version.room_version}"
        const val room_common = "androidx.room:room-common:${Version.room_version}"
        const val room_ktx = "androidx.room:room-ktx:${Version.room_version}"

        const val databinding = "androidx.databinding:databinding-runtime:4.2.1"

    }

    /**
     * Android相关依赖
     */
    object Android {
        const val Junit = "junit:junit:${Version.Junit}"
        const val Material = "com.google.android.material:material:${Version.Material}"
        const val Design = "com.android.support:design:${Version.design}"
    }

    /**
     * JetPack相关依赖
     */
    object JetPack {
        const val ViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Version.Lifecycle}"
        const val ViewModelSavedState =
            "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Version.Lifecycle}"
        const val LiveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Version.Lifecycle}"
        const val Lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:${Version.Lifecycle}"
        const val LifecycleCompilerAPT =
            "androidx.lifecycle:lifecycle-compiler:${Version.Lifecycle}"
        const val HiltCore = "com.google.dagger:hilt-android:${Version.Hilt}"
        const val HiltApt = "com.google.dagger:hilt-compiler:${Version.Hilt}"
        const val HiltAndroidx = "androidx.hilt:hilt-compiler:${Version.HiltAndroidx}"
    }

    /**
     * Kotlin相关依赖
     */
    object Kotlin {
        const val Kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Version.Kotlin}"
        const val CoroutinesCore =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.Coroutines}"
        const val CoroutinesAndroid =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Version.Coroutines}"

        const val anko = "org.jetbrains.anko:anko-commons:${Version.anko_version}"

        // Koin for Kotlin
        const val koin_core = "org.koin:koin-core:${Version.koin_version}"
        const val koin_core_ext = "org.koin:koin-core-ext:${Version.koin_version}"

        // Koin for AndroidX
        const val koin_androidx_scope = "org.koin:koin-androidx-scope:${Version.koin_version}"
        const val koin_androidx_viewmodel =
            "org.koin:koin-androidx-viewmodel:${Version.koin_version}"
        const val koin_androidx_fragment = "org.koin:koin-androidx-fragment:${Version.koin_version}"
        const val koin_androidx_ext = "org.koin:koin-androidx-ext:${Version.koin_version}"

    }

    /**
     * GitHub及其他相关依赖
     */
    object GitHub {
        const val OkHttp = "com.squareup.okhttp3:okhttp:${Version.OkHttp}"
        const val OkHttpInterceptorLogging =
            "com.squareup.okhttp3:logging-interceptor:${Version.OkHttpInterceptorLogging}"
        const val Retrofit = "com.squareup.retrofit2:retrofit:${Version.Retrofit}"
        const val RetrofitConverterGson =
            "com.squareup.retrofit2:converter-gson:${Version.RetrofitConverterGson}"


        const val RetrofitRxjavaAdapter =
            "com.squareup.retrofit2:adapter-rxjava2:${Version.RetrofitRxjava2Adapter}"
        const val Gson = "com.google.code.gson:gson:${Version.Gson}"
        const val MMKV = "com.tencent:mmkv-static:${Version.MMKV}"
        const val AutoSize = "me.jessyan:autosize:${Version.AutoSize}"
        const val ARoute = "com.alibaba:arouter-api:${Version.ARoute}"
        const val ARouteCompiler = "com.alibaba:arouter-compiler:${Version.ARouteCompiler}"
        const val RecyclerViewAdapter =
            "com.github.CymChad:BaseRecyclerViewAdapterHelper:${Version.RecyclerViewAdapter}"
        const val EventBus = "org.greenrobot:eventbus:${Version.EventBus}"
        const val EventBusAPT = "org.greenrobot:eventbus-annotation-processor:${Version.EventBus}"

        // 运行时权限
        const val PermissionDispatcher =
            "com.github.permissions-dispatcher:permissionsdispatcher:${Version.PermissionVersion}"
        const val PermissionDispatcherProcessor =
            "com.github.permissions-dispatcher:permissionsdispatcher-processor:${Version.PermissionVersion}"

        const val LeakCanary = "com.squareup.leakcanary:leakcanary-android:${Version.LeakCanary}"
        const val AutoService = "com.google.auto.service:auto-service:${Version.AutoService}"
        const val AutoServiceAnnotations =
            "com.google.auto.service:auto-service-annotations:${Version.AutoService}"

        const val Coil = "io.coil-kt:coil:${Version.Coil}"
        const val CoilGIF = "io.coil-kt:coil-gif:${Version.Coil}"
        const val CoilSVG = "io.coil-kt:coil-svg:${Version.Coil}"
        const val CoilVideo = "io.coil-kt:coil-video:${Version.Coil}"

        const val Glide = "com.github.bumptech.glide:glide:${Version.glide}"
        const val ToastUtils = "com.github.getActivity:ToastUtils:${Version.toastUtils}"

        // 刷新框架
        const val SmartRefresh = "com.scwang.smart:refresh-layout-kernel:${Version.smart}"// 核心必须依赖
        const val HeaderClassics =
            "com.scwang.smart:refresh-header-classics:${Version.smart}"// 经典刷新头
        const val HeaderMaterial =
            "com.scwang.smart:refresh-header-material:${Version.smart}"// 谷歌刷新头
        const val FooterClassics =
            "com.scwang.smart:refresh-footer-classics:${Version.smart}"// 经典加载

        //万能适配器
        const val BaseRecyclerViewAdapter =
            "com.github.CymChad:BaseRecyclerViewAdapterHelper:${Version.BaseRecyclerViewAdapterHelper}"

        // DSWebView
        const val DSWebView = "com.github.wendux:DSBridge-Android:x5-${Version.DSWebView}"

        //流式布局
        const val Flexbox = "com.google.android.flexbox:flexbox:3.0.0"

        const val PDF = "com.github.barteksc:android-pdf-viewer:${Version.PDF}"

        // 神策
        const val Sensor =
            "com.sensorsdata.analytics.android:SensorsAnalyticsSDK:${Version.SensorsData}"

        // 键盘切换处理
        const val Kpswitch =
            "cn.dreamtobe.kpswitch:library:1.6.0"

        // 指示器
        const val MagicIndicator =
            "com.github.hackware1993:MagicIndicator:1.7.0"

        // 渠道包信息读取【美团 瓦力】
        const val walle =
            "com.meituan.android.walle:payload_reader:1.1.7"

        // 页面加载态
        const val loadsir = "com.kingja.loadsir:loadsir:1.3.8"

        // 裁剪image
        const val CropImage = "com.isseiaoki:simplecropview:${Version.CropImage}"

        // 七牛
        const val QiNiu = "com.qiniu:qiniu-android-sdk:${Version.QiNiu}"

        // SVGA
        const val svga = "com.github.yyued:SVGAPlayer-Android:${Version.svga}"

        // x5WebView
        const val x5WebView = "com.tencent.tbs:tbssdk:${Version.x5WebView}"
    }
}