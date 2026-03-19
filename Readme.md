# Easytransac Android SDK

## Overview

The Easytransac Android SDK allows you to securely process payments from your Android application by sending a payment request to the Easytransac app, directly from your app.

The integration is simple and provides your users with an optimal payment experience.

Our Android SDK **allows you to use NFC, card scanning, manual entry, remote payments via Email, SMS and QR Code, as well as multiple payments**, all very easily by sending a list of parameters to the Easytransac application from your mobile app using a URL.

You can also discover the iOS version of this SDK here:  
https://github.com/easytransac/easytransac-ios-sdk/

## Requirements

- Easytransac application installed on the device  
- Easytransac version 7.9.0 or higher  

To download the application and use the SDK:  
https://play.google.com/store/apps/details?id=com.movidone.easytransac

## How it works

The SDK is embedded directly within the Easytransac application available on the Google Play Store. To use it, you need to call the application using the following URL scheme:

easytransac://pay

## Documentation and parameters

The parameters related to the SDK configuration are available in our public documentation:  
https://www.easytransac.com/en/documentation#tag/Appendices/Android-iOS-SDK

## General information

- All dates are based on the Europe/Paris timezone (UTC/GMT +1)  
- Character encoding is ISO 8859-1  

## Sample app

This project includes an Android application demonstrating how to integrate the SDK.

You can clone the repository and build the sample app to test the integration.
