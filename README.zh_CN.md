# Authing - Java / Kotlin

<div align=center>
  <img width="250" src="https://files.authing.co/authing-console/authing-logo-new-20210924.svg" />
</div>

<div align="center">
    <a href="https://forum.authing.cn/" target="_blank"><img src="https://img.shields.io/badge/chat-forum-blue" /></a>
    <a href="https://opensource.org/licenses/MIT" target="_blank"><img src="https://img.shields.io/badge/License-MIT-success" alt="License"></a>
</div>

**English** | [简体中文](./README.zh_CN.md)

## 简介
你可以使用 Authing Java SDK 快速为新开发的或已有的后端应用集成认证能力

## 参考文档
- [Authing - Java / Kotlin](https://docs.authing.cn/v2/reference/sdk-for-java/)

## 安装

### gradle 项目

在 build.gradle 内的 dependencies 中添加：

```
implementation "cn.authing:java-core:<LATEST_VERSION>"
```

> 你可以在 [https://search.maven.org/artifact/cn.authing/java-core](https://search.maven.org/artifact/cn.authing/java-core) 查看最新的版本。

### maven 项目

在 pom.xml 内的 dependencies 中添加：

> 如果你需要在 `spring` 中使用此 SDK，由于 `spring` 依赖的 `OkHttp` 版本过低，所以你需要手动指定一下 `OkHttp` 的版本。

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

## 常见问题

如果需要在线技术支持，可访问[官方论坛](https://forum.authing.cn/). 此仓库的 issue 仅用于上报 Bug 和提交新功能特性。

## 开源共建

- Fork 此仓库
- 创建自己的 git 分支 (git checkout -b my-new-feature)
- 提交你的修改 (git commit -am 'Add some feature')
- 将修改内容推送到远程分支 (git push -u origin my-new-feature)
- 创建一个 Pull Request

## 贡献

https://github.com/Authing/.github/blob/main/CONTRIBUTING.md


## 开源许可

[MIT](https://opensource.org/licenses/MIT)

Copyright (c) 2019-present, Authing
