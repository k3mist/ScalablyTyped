package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Expression extends js.Object {
  var expression: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
}

object Anon_Expression {
  @scala.inline
  def apply(`type`: java.lang.String, expression: java.lang.String = null): Anon_Expression = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    __obj.asInstanceOf[Anon_Expression]
  }
}

