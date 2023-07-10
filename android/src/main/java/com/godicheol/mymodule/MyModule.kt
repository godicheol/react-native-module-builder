package com.godicheol.mymodule

import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.Promise

// edit "MyModule"
class MyModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {

  // To export a module named NativeModules.MyModule.getName
  @ReactMethod(isBlockingSynchronousMethod = true)
  override fun getName() = "MyModule" // edit "MyModule"

  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  // To export a module named NativeModules.MyModule.multiply
  @ReactMethod fun multiply(a: Double, b: Double, promise: Promise) {
    promise.resolve(a * b);
  }

}