package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgLoading
  extends /**
	 * Option for igLoading
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var cssClass: js.UndefOr[js.Any] = js.undefined
  var includeVerticalOffset: js.UndefOr[scala.Boolean] = js.undefined
}

object IgLoading {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igLoading
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    cssClass: js.Any = null,
    includeVerticalOffset: js.UndefOr[scala.Boolean] = js.undefined
  ): IgLoading = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (!js.isUndefined(includeVerticalOffset)) __obj.updateDynamic("includeVerticalOffset")(includeVerticalOffset)
    __obj.asInstanceOf[IgLoading]
  }
}

