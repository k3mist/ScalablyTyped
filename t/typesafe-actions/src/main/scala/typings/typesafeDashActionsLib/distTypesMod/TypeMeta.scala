package typings
package typesafeDashActionsLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeMeta[T /* <: StringType */] extends js.Object {
  var getType: js.UndefOr[js.Function0[T]] = js.undefined
}

object TypeMeta {
  @scala.inline
  def apply[T /* <: StringType */](getType: js.Function0[T] = null): TypeMeta[T] = {
    val __obj = js.Dynamic.literal()
    if (getType != null) __obj.updateDynamic("getType")(getType)
    __obj.asInstanceOf[TypeMeta[T]]
  }
}

