callhello
=========

An Android Studio Project based on ndkLibPrebuilts from  gradle-samples-0.11.zip in Android Tools Project Site - New Build System.

In this version, the following configuration is used:
Android Studio 0.6
Gradle plugin 0.11

The C code has been built into shared objects.  The shared objects are located in jniLibs under app/src/main.

In ndkLibPrebuilts, the prebuild library is in the same package as the view activity.  I've written a new Java wrapper
for the prebuild library so that it could be in a separate package from the view activity.
