package typings
package qiniuDashJsLib.qiniuDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageView2Options extends js.Object {
  	// 新图的图像质量，取值范围：1-100
  var format: qiniuDashJsLib.qiniuDashJsLibStrings.jpg | qiniuDashJsLib.qiniuDashJsLibStrings.gif | qiniuDashJsLib.qiniuDashJsLibStrings.png | qiniuDashJsLib.qiniuDashJsLibStrings.webp | java.lang.String
  	// 具体含义由缩略模式决定
  var h: scala.Double
  var mode: qiniuDashJsLib.qiniuDashJsLibNumbers.`0` | qiniuDashJsLib.qiniuDashJsLibNumbers.`1` | qiniuDashJsLib.qiniuDashJsLibNumbers.`2` | qiniuDashJsLib.qiniuDashJsLibNumbers.`3` | qiniuDashJsLib.qiniuDashJsLibNumbers.`4` | qiniuDashJsLib.qiniuDashJsLibNumbers.`5`
  	// 具体含义由缩略模式决定
  var q: scala.Double
  	// 缩略模式，共6种[0-5]
  var w: scala.Double
}

object ImageView2Options {
  @scala.inline
  def apply(
    format: qiniuDashJsLib.qiniuDashJsLibStrings.jpg | qiniuDashJsLib.qiniuDashJsLibStrings.gif | qiniuDashJsLib.qiniuDashJsLibStrings.png | qiniuDashJsLib.qiniuDashJsLibStrings.webp | java.lang.String,
    h: scala.Double,
    mode: qiniuDashJsLib.qiniuDashJsLibNumbers.`0` | qiniuDashJsLib.qiniuDashJsLibNumbers.`1` | qiniuDashJsLib.qiniuDashJsLibNumbers.`2` | qiniuDashJsLib.qiniuDashJsLibNumbers.`3` | qiniuDashJsLib.qiniuDashJsLibNumbers.`4` | qiniuDashJsLib.qiniuDashJsLibNumbers.`5`,
    q: scala.Double,
    w: scala.Double
  ): ImageView2Options = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], h = h, mode = mode.asInstanceOf[js.Any], q = q, w = w)
  
    __obj.asInstanceOf[ImageView2Options]
  }
}

