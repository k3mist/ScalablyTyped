package typings
package reactDashNativeDashSqliteDashStorageLib.reactDashNativeDashSqliteDashStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultSetRowList extends js.Object {
  var length: scala.Double
  def item(index: scala.Double): js.Any
}

object ResultSetRowList {
  @scala.inline
  def apply(item: js.Function1[scala.Double, js.Any], length: scala.Double): ResultSetRowList = {
    val __obj = js.Dynamic.literal(item = item, length = length)
  
    __obj.asInstanceOf[ResultSetRowList]
  }
}

