package typings
package videoDotJsLib.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Browser extends js.Object {
  var ANDROID_VERSION: scala.Double | scala.Null
  var CHROME_VERSION: scala.Double
  var IE_VERSION: scala.Double
  var IOS_VERSION: scala.Double | scala.Null
  var IS_ANDROID: scala.Boolean
  var IS_ANY_SAFARI: scala.Boolean
  var IS_CHROME: scala.Boolean
  var IS_EDGE: scala.Boolean
  var IS_IOS: scala.Boolean
  var IS_IPAD: scala.Boolean
  var IS_IPHONE: scala.Boolean
  var IS_IPOD: scala.Boolean
  var IS_NATIVE_ANDROID: scala.Boolean
  var IS_SAFARI: scala.Boolean
  var TOUCH_ENABLED: scala.Boolean
}

object Browser {
  @scala.inline
  def apply(
    CHROME_VERSION: scala.Double,
    IE_VERSION: scala.Double,
    IS_ANDROID: scala.Boolean,
    IS_ANY_SAFARI: scala.Boolean,
    IS_CHROME: scala.Boolean,
    IS_EDGE: scala.Boolean,
    IS_IOS: scala.Boolean,
    IS_IPAD: scala.Boolean,
    IS_IPHONE: scala.Boolean,
    IS_IPOD: scala.Boolean,
    IS_NATIVE_ANDROID: scala.Boolean,
    IS_SAFARI: scala.Boolean,
    TOUCH_ENABLED: scala.Boolean,
    ANDROID_VERSION: scala.Int | scala.Double = null,
    IOS_VERSION: scala.Int | scala.Double = null
  ): Browser = {
    val __obj = js.Dynamic.literal(CHROME_VERSION = CHROME_VERSION, IE_VERSION = IE_VERSION, IS_ANDROID = IS_ANDROID, IS_ANY_SAFARI = IS_ANY_SAFARI, IS_CHROME = IS_CHROME, IS_EDGE = IS_EDGE, IS_IOS = IS_IOS, IS_IPAD = IS_IPAD, IS_IPHONE = IS_IPHONE, IS_IPOD = IS_IPOD, IS_NATIVE_ANDROID = IS_NATIVE_ANDROID, IS_SAFARI = IS_SAFARI, TOUCH_ENABLED = TOUCH_ENABLED)
    if (ANDROID_VERSION != null) __obj.updateDynamic("ANDROID_VERSION")(ANDROID_VERSION.asInstanceOf[js.Any])
    if (IOS_VERSION != null) __obj.updateDynamic("IOS_VERSION")(IOS_VERSION.asInstanceOf[js.Any])
    __obj.asInstanceOf[Browser]
  }
}

