//
//  MyModule.m
//  MyModule
//
//  Created by Icheol on 2023/01/01.
//  Copyright © 2023 Facebook. All rights reserved.
//

#import <React/RCTBridgeModule.h>

// The first argument is the name of MyModule.swift class
// NativeModules.MyModule
@interface RCT_EXTERN_MODULE(MyModule, NSObject)

// Rename module
// NativeModules.NewName
// @interface RCT_EXTERN_MODULE(NewName, MyModule, NSObject)

// export synchronous method
// The first argument is name of function in swift class
// NativeModules.MyModule.getName
RCT_EXTERN__BLOCKING_SYNCHRONOUS_METHOD(getName)

// export callback method
// NativeModules.MyModule.muliply
// RCT_EXTERN_METHOD(
//   multiply:(nonnull NSNumber *)a
//   b:(nonnull NSNumber *)b
//   callback:(RCTResponseSenderBlock)callback
// )

// export promise method
// NativeModules.MyModule.muliply
RCT_EXTERN_METHOD(
  multiply:(nonnull NSNumber *)a
  b:(nonnull NSNumber *)b
  resolver:(RCTPromiseResolveBlock)resolve
  rejecter:(RCTPromiseRejectBlock)reject
)

// Rename method
// NativeModules.MyModule.newName
// RCT_EXTERN_REMAP_METHOD(newName, getName, false)

@end
