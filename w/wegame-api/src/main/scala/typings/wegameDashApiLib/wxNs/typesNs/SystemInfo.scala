package typings
package wegameDashApiLib.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// --系统信息
trait SystemInfo extends js.Object {
  /**
    * 客户端基础库版本
    */
  var SDKVersion: java.lang.String
  /**
    * 电量，范围 1 - 100
    */
  var battery: scala.Double
  /**
    * 性能等级
    */
  var benchmarkLevel: scala.Double
  /**
    * 手机品牌
    */
  var brand: java.lang.String
  /**
    * 用户字体大小设置。以“我-设置-通用-字体大小”中的设置为准，单位 px。
    */
  var fontSizeSetting: java.lang.String
  /**
    * 微信设置的语言
    */
  var language: java.lang.String
  /**
    * 手机型号
    */
  var model: java.lang.String
  /**
    * 设备像素比
    */
  var pixelRatio: scala.Double
  /**
    * 客户端平台
    */
  var platform: java.lang.String
  /**
    * 屏幕高度
    */
  var screenHeight: scala.Double
  /**
    * 屏幕宽度
    */
  var screenWidth: scala.Double
  /**
    * 操作系统版本
    */
  var system: java.lang.String
  /**
    * 微信版本号
    */
  var version: java.lang.String
  /**
    * wifi 信号强度，范围 0 - 4
    */
  var wifiSignal: scala.Double
  /**
    * 可使用窗口高度
    */
  var windowHeight: scala.Double
  /**
    * 可使用窗口宽度
    */
  var windowWidth: scala.Double
}

object SystemInfo {
  @scala.inline
  def apply(
    SDKVersion: java.lang.String,
    battery: scala.Double,
    benchmarkLevel: scala.Double,
    brand: java.lang.String,
    fontSizeSetting: java.lang.String,
    language: java.lang.String,
    model: java.lang.String,
    pixelRatio: scala.Double,
    platform: java.lang.String,
    screenHeight: scala.Double,
    screenWidth: scala.Double,
    system: java.lang.String,
    version: java.lang.String,
    wifiSignal: scala.Double,
    windowHeight: scala.Double,
    windowWidth: scala.Double
  ): SystemInfo = {
    val __obj = js.Dynamic.literal(SDKVersion = SDKVersion, battery = battery, benchmarkLevel = benchmarkLevel, brand = brand, fontSizeSetting = fontSizeSetting, language = language, model = model, pixelRatio = pixelRatio, platform = platform, screenHeight = screenHeight, screenWidth = screenWidth, system = system, version = version, wifiSignal = wifiSignal, windowHeight = windowHeight, windowWidth = windowWidth)
  
    __obj.asInstanceOf[SystemInfo]
  }
}

