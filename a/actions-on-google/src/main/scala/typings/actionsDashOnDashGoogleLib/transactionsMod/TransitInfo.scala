package typings
package actionsDashOnDashGoogleLib.transactionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitInfo extends js.Object {
  /** UTC timestamp of the transit update as an RFC 3339 string. */
  var updatedTime: java.lang.String
}

object TransitInfo {
  @scala.inline
  def apply(updatedTime: java.lang.String): TransitInfo = {
    val __obj = js.Dynamic.literal(updatedTime = updatedTime)
  
    __obj.asInstanceOf[TransitInfo]
  }
}

