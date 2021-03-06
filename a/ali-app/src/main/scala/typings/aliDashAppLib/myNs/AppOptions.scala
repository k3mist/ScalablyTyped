package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppOptions
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  		 * 全局Data
  		 */
  var globalData: js.UndefOr[js.Object] = js.undefined
  /**
  		 * 错误监听函数
  		 * 当小程序发生脚本错误或者 api 调用失败时
  		 * 会触发 onError 并带上错误信息
  		 */
  var onError: js.UndefOr[js.ThisFunction1[/* this */ App, /* msg */ java.lang.String, scala.Unit]] = js.undefined
  /**
  		 * 监听小程序隐藏。
  		 * 当小程序从前台进入后台，会触发 onHide
  		 * 生命周期函数
  		 */
  var onHide: js.UndefOr[js.ThisFunction0[/* this */ App, scala.Unit]] = js.undefined
  /**
  		 * 监听小程序初始化。
  		 * 当小程序初始化完成时，会触发 onLaunch（全局只触发一次）
  		 * 生命周期函数
  		 */
  var onLaunch: js.UndefOr[js.ThisFunction1[/* this */ App, /* option */ LaunchOptions, scala.Unit]] = js.undefined
  /**
  		 * 监听小程序显示。
  		 * 当小程序启动，或从后台进入前台显示，会触发 onShow
  		 * 生命周期函数
  		 */
  var onShow: js.UndefOr[js.ThisFunction1[/* this */ App, /* option */ LaunchOptions, scala.Unit]] = js.undefined
  /**
  		 * 小程序退出时触发
  		 */
  var onUnlaunch: js.UndefOr[js.ThisFunction0[/* this */ App, scala.Unit]] = js.undefined
}

object AppOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    globalData: js.Object = null,
    onError: js.ThisFunction1[/* this */ App, /* msg */ java.lang.String, scala.Unit] = null,
    onHide: js.ThisFunction0[/* this */ App, scala.Unit] = null,
    onLaunch: js.ThisFunction1[/* this */ App, /* option */ LaunchOptions, scala.Unit] = null,
    onShow: js.ThisFunction1[/* this */ App, /* option */ LaunchOptions, scala.Unit] = null,
    onUnlaunch: js.ThisFunction0[/* this */ App, scala.Unit] = null
  ): AppOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (globalData != null) __obj.updateDynamic("globalData")(globalData)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onHide != null) __obj.updateDynamic("onHide")(onHide)
    if (onLaunch != null) __obj.updateDynamic("onLaunch")(onLaunch)
    if (onShow != null) __obj.updateDynamic("onShow")(onShow)
    if (onUnlaunch != null) __obj.updateDynamic("onUnlaunch")(onUnlaunch)
    __obj.asInstanceOf[AppOptions]
  }
}

