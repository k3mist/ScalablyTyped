package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DATA extends js.Object {
  var DATA: chromeDashAppsLib.chromeDashAppsLibStrings.data
  var EXPLICIT_FEEDBACK: chromeDashAppsLib.chromeDashAppsLibStrings.explicitFeedback
  var FEEDBACK: chromeDashAppsLib.chromeDashAppsLibStrings.feedback
  var NOTIFICATION: chromeDashAppsLib.chromeDashAppsLibStrings.notification
  var PERIODIC: chromeDashAppsLib.chromeDashAppsLibStrings.periodic
}

trait Anon_Data extends js.Object {
  var data: js.Array[chromeDashAppsLib.chromeNs.integer]
  var id: chromeDashAppsLib.chromeNs.integer
}

object Anon_DATA {
  @scala.inline
  def apply(
    DATA: chromeDashAppsLib.chromeDashAppsLibStrings.data,
    EXPLICIT_FEEDBACK: chromeDashAppsLib.chromeDashAppsLibStrings.explicitFeedback,
    FEEDBACK: chromeDashAppsLib.chromeDashAppsLibStrings.feedback,
    NOTIFICATION: chromeDashAppsLib.chromeDashAppsLibStrings.notification,
    PERIODIC: chromeDashAppsLib.chromeDashAppsLibStrings.periodic
  ): Anon_DATA = {
    val __obj = js.Dynamic.literal(DATA = DATA, EXPLICIT_FEEDBACK = EXPLICIT_FEEDBACK, FEEDBACK = FEEDBACK, NOTIFICATION = NOTIFICATION, PERIODIC = PERIODIC)
  
    __obj.asInstanceOf[Anon_DATA]
  }
}

object Anon_Data {
  @scala.inline
  def apply(data: js.Array[chromeDashAppsLib.chromeNs.integer], id: chromeDashAppsLib.chromeNs.integer): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data, id = id)
  
    __obj.asInstanceOf[Anon_Data]
  }
}

