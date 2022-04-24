

了解github项目管理机制，包括：pull request，评论，CI/CD、测试机制等。
尝试构建初始化项目，并用自己提供的服务器配置好CI/CD。
（注意，并不是所有我们的项目的人提交了mr后，都会触发CI/CD，如果这样的话，我们的服务器受不了）

确定合作机制，包括：核心成员的沟通机制、普通成员的沟通管理机制、代码的规范、账号的规范、提交的规范、准入准出机制等


https://docs.github.com/cn/actions/using-workflows/triggering-a-workflow


# Github Action简述

## Github提供的环境

[https://docs.github.com/cn/actions/using-github-hosted-runners/about-github-hosted-runners](https://docs.github.com/cn/actions/using-github-hosted-runners/about-github-hosted-runners)

能选择的操作系统和资源配置:

![image](https://user-images.githubusercontent.com/17684996/164966532-43af7832-ea67-407a-89ae-c9a5e227f7c7.png)

### Github自带环境的使用限制

[https://docs.github.com/cn/actions/learn-github-actions/usage-limits-billing-and-administration](https://docs.github.com/cn/actions/learn-github-actions/usage-limits-billing-and-administration)

* 每个工作流中的Job最多能运行6小时
* 免费版每月最多用2000分钟，存储空间为500MB

更多的费用信息：[https://docs.github.com/en/billing/managing-billing-for-github-actions/about-billing-for-github-actions](https://docs.github.com/en/billing/managing-billing-for-github-actions/about-billing-for-github-actions)

### Maven构建配置

有现成的Java环境可用：[https://docs.github.com/en/actions/automating-builds-and-tests/building-and-testing-java-with-maven](https://docs.github.com/en/actions/automating-builds-and-tests/building-and-testing-java-with-maven)

可以参考 [Geomesa的配置文件](https://github.com/locationtech/geomesa/blob/main/.github/workflows/build-and-test-2.12.yml)

## 自定义CI环境

文档：[https://docs.github.com/cn/actions/hosting-your-own-runners/adding-self-hosted-runners](https://docs.github.com/cn/actions/hosting-your-own-runners/adding-self-hosted-runners)

如果要用自己的构建环境，可以在settings里面可以看到操作步骤：

需要在自己机器上安装 `Github Action Runner`的客户端，其原理是客户端不断轮询Github仓库，发现有构建请求后，就拉取代码构建，并反馈信息。

注意事项（[更多信息](https://docs.github.com/cn/actions/hosting-your-own-runners/about-self-hosted-runners)）：

* 自建环境如果30天没有连接，会被自动移除
* 建议是私有仓库，因为公共仓库存在安全问题，提交的代码可能影响构建机器




