package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ObjectLockEnabled extends js.Object {
  var objectLockEnabled: java.lang.String
  var rule: js.UndefOr[Anon_DefaultRetention] = js.undefined
}

object Anon_ObjectLockEnabled {
  @scala.inline
  def apply(objectLockEnabled: java.lang.String, rule: Anon_DefaultRetention = null): Anon_ObjectLockEnabled = {
    val __obj = js.Dynamic.literal(objectLockEnabled = objectLockEnabled)
    if (rule != null) __obj.updateDynamic("rule")(rule)
    __obj.asInstanceOf[Anon_ObjectLockEnabled]
  }
}

