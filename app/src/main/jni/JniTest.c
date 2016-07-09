//
// Created by Administrator on 2016/6/22.
//
#include "com_sheepyang_jnidemo_JniUtils.h"
JNIEXPORT jint JNICALL Java_com_sheepyang_jnidemo_JniUtils_addInt
        (JNIEnv *env, jobject obj, jint a, jint b){
    return a + b;
}