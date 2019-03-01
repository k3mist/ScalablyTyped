package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppRestrictionsSchema extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#appRestrictionsSchema". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The set of restrictions that make up this schema. */
  var restrictions: js.UndefOr[js.Array[AppRestrictionsSchemaRestriction]] = js.undefined
}

object AppRestrictionsSchema {
  @scala.inline
  def apply(kind: java.lang.String = null, restrictions: js.Array[AppRestrictionsSchemaRestriction] = null): AppRestrictionsSchema = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (restrictions != null) __obj.updateDynamic("restrictions")(restrictions)
    __obj.asInstanceOf[AppRestrictionsSchema]
  }
}

