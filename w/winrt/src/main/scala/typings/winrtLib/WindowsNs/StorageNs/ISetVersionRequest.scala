package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISetVersionRequest extends js.Object {
  var currentVersion: scala.Double
  var desiredVersion: scala.Double
  def getDeferral(): SetVersionDeferral
}

object ISetVersionRequest {
  @scala.inline
  def apply(
    currentVersion: scala.Double,
    desiredVersion: scala.Double,
    getDeferral: js.Function0[SetVersionDeferral]
  ): ISetVersionRequest = {
    val __obj = js.Dynamic.literal(currentVersion = currentVersion, desiredVersion = desiredVersion, getDeferral = getDeferral)
  
    __obj.asInstanceOf[ISetVersionRequest]
  }
}

