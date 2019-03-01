package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueNumber extends js.Object {
  /** The timed metadata tracks that start at startIndex in the list. */ var items: winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedMetadataTrack
  /** The number of timed metadata tracks retrieved. */ var returnValue: scala.Double
}

object Anon_ItemsReturnValueNumber {
  @scala.inline
  def apply(items: winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedMetadataTrack, returnValue: scala.Double): Anon_ItemsReturnValueNumber = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValueNumber]
  }
}

