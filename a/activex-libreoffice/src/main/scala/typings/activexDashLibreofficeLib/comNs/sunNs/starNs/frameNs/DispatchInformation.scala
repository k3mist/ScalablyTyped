package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides information about a supported command
  * @see XDispatchInformationProvider
  * @see Controller
  * @since OOo 2.0
  */
trait DispatchInformation extends js.Object {
  /** command URL of a supported command. */
  var Command: java.lang.String
  /**
    * group identifier to which the supported command belong.
    * @see CommandGroup
    */
  var GroupId: scala.Double
}

object DispatchInformation {
  @scala.inline
  def apply(Command: java.lang.String, GroupId: scala.Double): DispatchInformation = {
    val __obj = js.Dynamic.literal(Command = Command, GroupId = GroupId)
  
    __obj.asInstanceOf[DispatchInformation]
  }
}

