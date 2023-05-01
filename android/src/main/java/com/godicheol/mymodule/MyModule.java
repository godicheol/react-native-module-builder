package com.godicheol.mymodule;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;

public class MyModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public MyModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    // To export a module named NativeModules.MyModule.getName
    @Override
    public String getName() {
        return "MyModule";
    }

    // Example method
    // See https://reactnative.dev/docs/native-modules-android
    // To export a module named NativeModules.MyModule.multiply
    @ReactMethod
    public void multiply(double a, double b, Promise promise) {
        promise.resolve(a * b);
    }
}
