package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attempts extends js.Object {
  var attempts: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Attempts {
  @scala.inline
  def apply(attempts: scala.Int | scala.Double = null): Anon_Attempts = {
    val __obj = js.Dynamic.literal()
    if (attempts != null) __obj.updateDynamic("attempts")(attempts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Attempts]
  }
}

