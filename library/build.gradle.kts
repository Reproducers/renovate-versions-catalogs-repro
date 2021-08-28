plugins {
    alias(libs.plugins.kotlinJvm)
    alias(libs.plugins.kotlinSerialization)
}

dependencies {
    implementation(libs.okHttp)
    implementation(customLibs.okio)
    implementation(customLibs.picasso)
    implementation(libs.retrofit2.retrofit)
}
