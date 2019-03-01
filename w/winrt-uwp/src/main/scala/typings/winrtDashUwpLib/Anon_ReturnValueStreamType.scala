package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReturnValueStreamType extends js.Object {
  /** The stream identifier for the media stream. */ var returnValue: scala.Double
  /** The type of the media stream. This type can be either Audio or Video. */ var streamType: winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDMediaStreamType
}

object Anon_ReturnValueStreamType {
  @scala.inline
  def apply(
    returnValue: scala.Double,
    streamType: winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDMediaStreamType
  ): Anon_ReturnValueStreamType = {
    val __obj = js.Dynamic.literal(returnValue = returnValue, streamType = streamType)
  
    __obj.asInstanceOf[Anon_ReturnValueStreamType]
  }
}

