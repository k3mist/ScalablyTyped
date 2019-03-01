package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait objectTablesStatic extends js.Object {
  /**
    * Return a DataTables API instance for the selected tables (true) or an array (false).
    */
  var api: scala.Boolean
  /**
    * Get only visible tables (true) or all tables regardless of visibility (false).
    */
  var visible: scala.Boolean
}

object objectTablesStatic {
  @scala.inline
  def apply(api: scala.Boolean, visible: scala.Boolean): objectTablesStatic = {
    val __obj = js.Dynamic.literal(api = api, visible = visible)
  
    __obj.asInstanceOf[objectTablesStatic]
  }
}

