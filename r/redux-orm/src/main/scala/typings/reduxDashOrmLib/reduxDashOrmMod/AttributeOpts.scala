package typings
package reduxDashOrmLib.reduxDashOrmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeOpts extends js.Object {
  var getDefault: js.UndefOr[js.Function0[_]] = js.undefined
}

object AttributeOpts {
  @scala.inline
  def apply(getDefault: js.Function0[_] = null): AttributeOpts = {
    val __obj = js.Dynamic.literal()
    if (getDefault != null) __obj.updateDynamic("getDefault")(getDefault)
    __obj.asInstanceOf[AttributeOpts]
  }
}

