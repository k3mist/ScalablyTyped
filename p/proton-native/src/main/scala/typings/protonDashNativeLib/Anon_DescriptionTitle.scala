package typings
package protonDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DescriptionTitle extends js.Object {
  var description: java.lang.String
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_DescriptionTitle {
  @scala.inline
  def apply(description: java.lang.String, title: java.lang.String = null): Anon_DescriptionTitle = {
    val __obj = js.Dynamic.literal(description = description)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_DescriptionTitle]
  }
}

