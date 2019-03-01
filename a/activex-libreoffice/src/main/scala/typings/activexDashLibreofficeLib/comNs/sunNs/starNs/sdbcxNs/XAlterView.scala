package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * implements the possibility to alter aspects of a view's definition
  * @since OOo 2.4
  */
trait XAlterView extends js.Object {
  /**
    * changes the command which constitutes the view
    *
    * The operation should be atomic.
    * @param NewCommand the new command which the view should be based on. Usually an `SELECT` statement.
    * @throws com::sun::star::sdbc::SQLException if an error occurs
    */
  def alterCommand(NewCommand: java.lang.String): scala.Unit
}

object XAlterView {
  @scala.inline
  def apply(alterCommand: js.Function1[java.lang.String, scala.Unit]): XAlterView = {
    val __obj = js.Dynamic.literal(alterCommand = alterCommand)
  
    __obj.asInstanceOf[XAlterView]
  }
}

