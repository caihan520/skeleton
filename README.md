# Skeleton

Skeleton 中文名称为 骨架 ，项目主要致力于如何进行快速开发，提高开发效率。并将模块组件化，达到开箱即食的境界

主要技术栈

|名称| 版本 |
|:--|:--|
| Spring Boot | 2.1.5.RELEASE |
| TKMybatis| 2.1.0 |
| Druid | 1.1.14 |
| mybatis-generator | 1.3.7 |
| Shiro | 1.4.1 |
| Swagger2 | 2.8.0 |

## 模块简介

- TKMybatis 持久层

持久层采用封装了Mybatis的通用Mapper的形式，俗称的TkMybatis，一种封装力度更强的框架，使用起来非常简便，支持多种格式的数据处理，并且自带基本CRUD和构造条件的操作接口，Mapper层直接写接口 + 注解、或者XML 映射文件处理

查看文档 →

- Shiro 权限控制

基于经典RBAC设计模式，user，user-role，role，role-resource，resource五张表控制全局权限。实现认证，授权账号不可同时登录等操作

查看文档 →

- GenCode 代码生成器

采用 mybatis-generator + freemarker 的形式，制作输入表名字即可一键生成entity、controller、service、serviceImpl，mapper，xml 文件。并且定制 lombok 插件是的entity的代码浓缩90%

查看文档 →

- Global 全局处理

该模块包含两个主要子模块，全局异常处理、公共结果集。解决前后端数据格式问题，和全局异常处理问题

查看文档 →

- Base 公共层

通过将常用的方法，接口，Mapper抽离出来，从而达到实际业务控制层无需一行代码，实现功能逻辑。抽离的层有：BaseController<T>，BaseService<T>，BaseServiceImpl<T>，MyMapper<T>

查看文档 →

- Swagger 文档

该项目骨架支持前后端分离，比如说前端采用 jsp，thymeleaf，Freemark，Vue 等模板引擎，并不会对骨架造成影响

查看文档 →
