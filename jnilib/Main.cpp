
#include "Main.h"

JNIEXPORT jint JNICALL Java_Main_add
  (JNIEnv *env, jobject obj, jint a, jint b) 
  {
  	return a + b + a + b;
  }
