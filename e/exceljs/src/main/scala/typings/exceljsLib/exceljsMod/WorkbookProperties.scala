package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookProperties extends js.Object {
  /**
  	 * Set workbook dates to 1904 date system
  	 */
  var date1904: scala.Boolean
}

object WorkbookProperties {
  @scala.inline
  def apply(date1904: scala.Boolean): WorkbookProperties = {
    val __obj = js.Dynamic.literal(date1904 = date1904)
  
    __obj.asInstanceOf[WorkbookProperties]
  }
}

