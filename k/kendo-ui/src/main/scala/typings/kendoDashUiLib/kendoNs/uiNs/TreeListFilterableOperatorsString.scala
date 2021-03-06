package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListFilterableOperatorsString extends js.Object {
  var contains: js.UndefOr[java.lang.String] = js.undefined
  var doesnotcontain: js.UndefOr[java.lang.String] = js.undefined
  var endswith: js.UndefOr[java.lang.String] = js.undefined
  @JSName("eq")
  var eq_FTreeListFilterableOperatorsString: js.UndefOr[java.lang.String] = js.undefined
  var isempty: js.UndefOr[java.lang.String] = js.undefined
  var isnotempty: js.UndefOr[java.lang.String] = js.undefined
  var isnotnull: js.UndefOr[java.lang.String] = js.undefined
  var isnull: js.UndefOr[java.lang.String] = js.undefined
  var neq: js.UndefOr[java.lang.String] = js.undefined
  var startswith: js.UndefOr[java.lang.String] = js.undefined
}

object TreeListFilterableOperatorsString {
  @scala.inline
  def apply(
    contains: java.lang.String = null,
    doesnotcontain: java.lang.String = null,
    endswith: java.lang.String = null,
    eq: java.lang.String = null,
    isempty: java.lang.String = null,
    isnotempty: java.lang.String = null,
    isnotnull: java.lang.String = null,
    isnull: java.lang.String = null,
    neq: java.lang.String = null,
    startswith: java.lang.String = null
  ): TreeListFilterableOperatorsString = {
    val __obj = js.Dynamic.literal()
    if (contains != null) __obj.updateDynamic("contains")(contains)
    if (doesnotcontain != null) __obj.updateDynamic("doesnotcontain")(doesnotcontain)
    if (endswith != null) __obj.updateDynamic("endswith")(endswith)
    if (eq != null) __obj.updateDynamic("eq")(eq)
    if (isempty != null) __obj.updateDynamic("isempty")(isempty)
    if (isnotempty != null) __obj.updateDynamic("isnotempty")(isnotempty)
    if (isnotnull != null) __obj.updateDynamic("isnotnull")(isnotnull)
    if (isnull != null) __obj.updateDynamic("isnull")(isnull)
    if (neq != null) __obj.updateDynamic("neq")(neq)
    if (startswith != null) __obj.updateDynamic("startswith")(startswith)
    __obj.asInstanceOf[TreeListFilterableOperatorsString]
  }
}

