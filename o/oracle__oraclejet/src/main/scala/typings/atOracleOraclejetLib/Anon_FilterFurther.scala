package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FilterFurther extends js.Object {
  var filterFurther: js.UndefOr[java.lang.String] = js.undefined
  var noMatchesFound: js.UndefOr[java.lang.String] = js.undefined
  var required: js.UndefOr[Anon_Hint] = js.undefined
}

object Anon_FilterFurther {
  @scala.inline
  def apply(
    filterFurther: java.lang.String = null,
    noMatchesFound: java.lang.String = null,
    required: Anon_Hint = null
  ): Anon_FilterFurther = {
    val __obj = js.Dynamic.literal()
    if (filterFurther != null) __obj.updateDynamic("filterFurther")(filterFurther)
    if (noMatchesFound != null) __obj.updateDynamic("noMatchesFound")(noMatchesFound)
    if (required != null) __obj.updateDynamic("required")(required)
    __obj.asInstanceOf[Anon_FilterFurther]
  }
}

