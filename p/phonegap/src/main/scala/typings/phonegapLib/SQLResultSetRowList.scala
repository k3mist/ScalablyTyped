package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SQLResultSetRowList extends js.Object {
  var length: scala.Double
  def item(index: scala.Double): js.Any
}

object SQLResultSetRowList {
  @scala.inline
  def apply(item: js.Function1[scala.Double, js.Any], length: scala.Double): SQLResultSetRowList = {
    val __obj = js.Dynamic.literal(item = item, length = length)
  
    __obj.asInstanceOf[SQLResultSetRowList]
  }
}

