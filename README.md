# ☕🚀 Employee platform

<img src="https://image.winudf.com/v2/image/Y29tLnNwcmluZy5zcHJpbmdib290X2ljb25fMTUzOTg5MTA2NV8wMzE/icon.png?w=170&fakeurl=1" align="left" width="192px" height="192px"/>
<img align="left" width="0" height="192px" hspace="10"/>

> ⚡ Installation guide

## 💡 Introduction

This is a repository intended to serve as a backend for Remax web project.

## 🧱 Requirements

- Chocolatey (windows users): `More info [here](https://chocolatey.org/install)`
- Brew (Mac users): `More info [here](https://brew.sh/)`
- Make (windows users): `choco install make`
- Install Java 17: `More info [here](https://docs.aws.amazon.com/corretto/latest/corretto-17-ug/downloads-list.html)`
- Set it as your default
  JVM: `export JAVA_HOME='/Library/Java/JavaVirtualMachines/amazon-corretto-17.jdk/Contents/Home'`

## 🏁 How To Start

1. Set your env (More info in application.properties)
2. make databasestart
3. make run

#### Default user credentials
```
username: user
password: password
```

#### Default admin credentials
```
username: admin
password: password
```

## ☝️ How to update dependencies

- Gradle ([releases](https://gradle.org/releases/)): `./gradlew wrapper --gradle-version=WANTED_VERSION
  --distribution-type=bin
