package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueNumberVideoTrack extends js.Object {
  /** The video tracks that start at startIndex in the list. */ var items: winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.VideoTrack
  /** The number of video tracks retrieved. */ var returnValue: scala.Double
}

object Anon_ItemsReturnValueNumberVideoTrack {
  @scala.inline
  def apply(items: winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.VideoTrack, returnValue: scala.Double): Anon_ItemsReturnValueNumberVideoTrack = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValueNumberVideoTrack]
  }
}

