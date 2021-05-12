/**
 * 作者：hsicen  5/6/21 20:38
 * 邮箱：codinghuang@163.com
 * 作用：
 * 描述：HencoderPlus
 */

object Versions {
    const val minSdk = 21
    const val compileSdk = 30
    const val targetSdk = 30

    const val versionCode = 1
    const val versionName = "1.0"

    const val kotlin = "1.5.0"
    const val gradle = "4.2.0"
    const val hilt = "2.35"

    const val retrofit = "2.9.0"
    const val coroutine = "1.4.2"
    const val rxBinding = "3.1.0"
}

//依赖库管理
object Deps {
    val fileMap = mapOf("dir" to "libs", "include" to listOf("*.jar"))
    const val kotlinStb = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    const val ktx = "androidx.core:core-ktx:1.3.2"
    const val appCompat = "androidx.appcompat:appcompat:1.2.0"
    const val material = "com.google.android.material:material:1.2.1"
    const val constrainLayout = "androidx.constraintlayout:constraintlayout:2.0.4"

    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val converterGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val adapterRxjava2 = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"

    const val okhttp = "com.squareup.okhttp3:okhttp:4.9.0"
    const val moshiKotlin = "com.squareup.moshi:moshi-kotlin:1.9.2"
    const val moshiKotlinCodegen = "com.squareup.moshi:moshi-kotlin-codegen:1.11.02"

    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutine}"
    const val coroutinesAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutine}"

    const val gson = "com.google.code.gson:gson:2.8.6"
    const val recyclerview = "androidx.recyclerview:recyclerview:1.1.0"
    const val cardview = "androidx.cardview:cardview:1.0.0"

    const val rxjava = "io.reactivex.rxjava2:rxjava:2.2.10"
    const val rxandroid = "io.reactivex.rxjava2:rxandroid:2.1.1"

    const val rxbinding = "com.jakewharton.rxbinding3:rxbinding:${Versions.rxBinding}"
    const val rxbindingCore = "com.jakewharton.rxbinding3:rxbinding-core:${Versions.rxBinding}"
    const val rxbindingAppcompat =
        "com.jakewharton.rxbinding3:rxbinding-appcompat:${Versions.rxBinding}"
    const val rxbindingDrawerlayout =
        "com.jakewharton.rxbinding3:rxbinding-drawerlayout:${Versions.rxBinding}"
    const val rxbindingLeanback =
        "com.jakewharton.rxbinding3:rxbinding-leanback:${Versions.rxBinding}"
    const val rxbindingRecyclerview =
        "com.jakewharton.rxbinding3:rxbinding-recyclerview:${Versions.rxBinding}"
    const val rxbindingSlidingpanelayout =
        "com.jakewharton.rxbinding3:rxbinding-slidingpanelayout:${Versions.rxBinding}"
    const val rxbindingSwiperefreshlayout =
        "com.jakewharton.rxbinding3:rxbinding-swiperefreshlayout:${Versions.rxBinding}"
    const val rxbindingViewpager =
        "com.jakewharton.rxbinding3:rxbinding-viewpager:${Versions.rxBinding}"
    const val rxbindingViewpager2 =
        "com.jakewharton.rxbinding3:rxbinding-viewpager2:${Versions.rxBinding}"
    const val rxbindingMaterial =
        "com.jakewharton.rxbinding3:rxbinding-material:${Versions.rxBinding}"

    const val okio = "'com.squareup.okio:okio:2.8.2"

}

object TestDeps {
    const val runner = "androidx.test.runner.AndroidJUnitRunner"

    const val junit = "junit:junit:4.13.1"
    const val junitExt = "androidx.test.ext:junit:1.1.2"
    const val espresso = "androidx.test.espresso:espresso-core:3.3.0"

    const val mockWebServer = "com.squareup.okhttp3:mockwebserver:4.4.1"
}


