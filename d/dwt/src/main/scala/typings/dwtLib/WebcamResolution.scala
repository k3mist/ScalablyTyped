package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebcamResolution extends js.Object {
  def Get(index: scala.Double): java.lang.String
  def GetCount(): scala.Double
  def GetCurrent(): java.lang.String
}

object WebcamResolution {
  @scala.inline
  def apply(
    Get: js.Function1[scala.Double, java.lang.String],
    GetCount: js.Function0[scala.Double],
    GetCurrent: js.Function0[java.lang.String]
  ): WebcamResolution = {
    val __obj = js.Dynamic.literal(Get = Get, GetCount = GetCount, GetCurrent = GetCurrent)
  
    __obj.asInstanceOf[WebcamResolution]
  }
}

