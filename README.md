# Page

## BasePage
BasePage 项目是 Servlet 下的一个非 ajax 分页 Demo，提供了带查询条件的分页。对查询条件进行了封装。

## BaseAjaxPage
BaseAjaxPage 项目是一个纯前端的分页，使用的是 datatables，具体可以参看 https://datatables.net/。
ajax 请求返回的是一个 List<Object> 转后的 Json 数组字符串。对于数据量较小的情况下，可以借鉴使用此种方式。

## 说明
考虑到现在大部分的企业开发中，分页插件都是由公司前端来封装的，所以这里就不班门弄斧了。
只对各个流行框架是如何进行后端分页做出相应的 Demo，来达到这次总结的目的。
