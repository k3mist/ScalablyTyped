package typings
package baidumapDashWebDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PixelPoint extends js.Object {
  var pixel: baidumapDashWebDashSdkLib.BMapNs.Pixel
  var point: baidumapDashWebDashSdkLib.BMapNs.Point
  var target: js.Any
  var `type`: java.lang.String
  var zoom: scala.Double
}

object Anon_PixelPoint {
  @scala.inline
  def apply(
    pixel: baidumapDashWebDashSdkLib.BMapNs.Pixel,
    point: baidumapDashWebDashSdkLib.BMapNs.Point,
    target: js.Any,
    `type`: java.lang.String,
    zoom: scala.Double
  ): Anon_PixelPoint = {
    val __obj = js.Dynamic.literal(pixel = pixel, point = point, target = target, `type` = `type`, zoom = zoom)
  
    __obj.asInstanceOf[Anon_PixelPoint]
  }
}

