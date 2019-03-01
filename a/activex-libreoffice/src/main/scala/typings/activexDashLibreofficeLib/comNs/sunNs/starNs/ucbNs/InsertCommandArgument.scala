package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The argument for the command "insert".
  * @see XCommandProcessor
  */
trait InsertCommandArgument extends js.Object {
  /**
    * A stream containing document data.
    *
    * This member can be left blank, if no (new) document data shall be written by the implementation of the "insert" command.
    */
  var Data: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream
  /**
    * A flag indicating whether a possibly existing content (and its data) shall be overwritten.
    *
    * Implementations that are not able to detect whether there are previous data may ignore this parameter and will always write the new data.
    */
  var ReplaceExisting: scala.Boolean
}

object InsertCommandArgument {
  @scala.inline
  def apply(
    Data: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    ReplaceExisting: scala.Boolean
  ): InsertCommandArgument = {
    val __obj = js.Dynamic.literal(Data = Data, ReplaceExisting = ReplaceExisting)
  
    __obj.asInstanceOf[InsertCommandArgument]
  }
}

