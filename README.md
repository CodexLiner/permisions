# Permisions Checker For Android

Permisions Checker For Android is a Android library for checking Permissions in Android.

## Installation

Include the library in your build.gradle

```bash
dependencies {
        ...
        implementation 'com.github.CodexLiner:permisions:1.0'
}
```

## Add it in your root build.gradle at the end of repositories:
```bash
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

## Usage
### Request Permissions
```java
     new CodexPerms(this).requestPerms(new String[]{Manifest.permission.READ_EXTERNAL_STORAGE});
```
### Check Permissions
```java
    if (new CodexPerms(this).hasPermision(new String[]{Manifest.permission.READ_EXTERNAL_STORAGE})){
            Toast.makeText(this, "Permission Granted", Toast.LENGTH_SHORT).show();
    }
    else {
            Toast.makeText(this, "Permission Not Granted", Toast.LENGTH_SHORT).show();
    }
```
