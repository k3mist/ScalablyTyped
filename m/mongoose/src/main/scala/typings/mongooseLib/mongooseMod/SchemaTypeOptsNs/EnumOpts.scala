package typings
package mongooseLib.mongooseMod.SchemaTypeOptsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumOpts[T] extends js.Object {
  var message: js.UndefOr[java.lang.String] = js.undefined
  var values: js.UndefOr[js.Array[T]] = js.undefined
}

object EnumOpts {
  @scala.inline
  def apply[T](message: java.lang.String = null, values: js.Array[T] = null): EnumOpts[T] = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[EnumOpts[T]]
  }
}

