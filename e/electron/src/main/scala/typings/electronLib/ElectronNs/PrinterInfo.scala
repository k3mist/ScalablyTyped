package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrinterInfo extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/printer-info
  var description: java.lang.String
  var isDefault: scala.Boolean
  var name: java.lang.String
  var status: scala.Double
}

object PrinterInfo {
  @scala.inline
  def apply(
    description: java.lang.String,
    isDefault: scala.Boolean,
    name: java.lang.String,
    status: scala.Double
  ): PrinterInfo = {
    val __obj = js.Dynamic.literal(description = description, isDefault = isDefault, name = name, status = status)
  
    __obj.asInstanceOf[PrinterInfo]
  }
}

