package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accesses extends js.Object {
  var accesses: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var grantee: js.UndefOr[java.lang.String] = js.undefined
  var granteeType: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Accesses {
  @scala.inline
  def apply(
    accesses: js.Array[java.lang.String] = null,
    grantee: java.lang.String = null,
    granteeType: java.lang.String = null
  ): Anon_Accesses = {
    val __obj = js.Dynamic.literal()
    if (accesses != null) __obj.updateDynamic("accesses")(accesses)
    if (grantee != null) __obj.updateDynamic("grantee")(grantee)
    if (granteeType != null) __obj.updateDynamic("granteeType")(granteeType)
    __obj.asInstanceOf[Anon_Accesses]
  }
}

