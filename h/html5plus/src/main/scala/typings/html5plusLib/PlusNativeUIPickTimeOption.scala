package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，时间选择对话框的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
  */
trait PlusNativeUIPickTimeOption extends js.Object {
  /**
    * 是否24小时制模式
    * true表示使用24小时制模式显示，fale表示使用12小时制模式显示，默认值为true。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var is24Hour: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 日期选择对话框弹出指示区域
    * JSON类型对象，格式如{top:10;left:10;width:200;height:200;}，所有值为像素值，其值相对于容器webview的位置。
    * 	如未设置此值，默认在屏幕居中显示。仅在iPad上有效，其它设备忽略此值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var popover: js.UndefOr[js.Any] = js.undefined
  /**
    * 时间选择对话框默认显示的时间
    * 如果未设置标题，则默认显示标题为当前选择的时间。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var time: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * 时间选择对话框显示的标题
    * 如果未设置标题，则默认显示标题为当前选择的时间。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object PlusNativeUIPickTimeOption {
  @scala.inline
  def apply(
    is24Hour: js.UndefOr[scala.Boolean] = js.undefined,
    popover: js.Any = null,
    time: stdLib.Date = null,
    title: java.lang.String = null
  ): PlusNativeUIPickTimeOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(is24Hour)) __obj.updateDynamic("is24Hour")(is24Hour)
    if (popover != null) __obj.updateDynamic("popover")(popover)
    if (time != null) __obj.updateDynamic("time")(time)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PlusNativeUIPickTimeOption]
  }
}

