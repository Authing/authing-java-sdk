# Authing - Java / Kotlin

<div align=center>
  <img width="250" src="https://files.authing.co/authing-console/authing-logo-new-20210924.svg" />
</div>

<div align="center">
    <a href="https://forum.authing.cn/" target="_blank"><img src="https://img.shields.io/badge/chat-forum-blue" /></a>
    <a href="https://opensource.org/licenses/MIT" target="_blank"><img src="https://img.shields.io/badge/License-MIT-success" alt="License"></a>
</div>

**English** | [简体中文](./README.zh_CN.md)

## Introduction

You can use the Authing Java SDK to quickly integrate authentication capabilities for new or existing Back End applications
## Documentation
- [Authing - Java / Kotlin](https://docs.authing.cn/v2/en/reference/sdk-for-java/)

## Install

### gradle project

Add to dependencies in build.gradle:

```
implementation "cn.authing:java-core:<LATEST_VERSION>"
```

> You can check the latest version at [https://search.maven.org/artifact/cn.authing/java-core](https://search.maven.org/artifact/cn.authing/java-core).

### maven project

Add to dependencies in pom.xml:

> If you need to use this SDK in `spring`, since the `spring` relies on old version of `OkHttp` , you need to manually specify the version of `OkHttp` .

```
<dependency>
    <groupId>cn.authing</groupId>
    <artifactId>java-core</artifactId>
    <version><LATEST_VERSION></version>
</dependency>
<properties>
    <okhttp3.version>4.8.0</okhttp3.version>
</properties>
```

## Questions

For questions and support please use the [official forum](https://forum.authing.cn/). The issue list of this repo is exclusively for bug reports and feature requests.

## Contribution

- Fork it
- Create your feature branch (git checkout -b my-new-feature)
- Commit your changes (git commit -am 'Add some feature')
- Push to the branch (git push -u origin my-new-feature)
- Create new Pull Request
## Contribute

https://github.com/Authing/.github/blob/main/CONTRIBUTING.md#English


## License

[MIT](https://opensource.org/licenses/MIT)

Copyright (c) 2019-present, Authing
