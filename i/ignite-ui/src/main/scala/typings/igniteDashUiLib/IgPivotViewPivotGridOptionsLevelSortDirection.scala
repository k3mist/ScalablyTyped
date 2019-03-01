package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotViewPivotGridOptionsLevelSortDirection
  extends /**
	 * Option for IgPivotViewPivotGridOptionsLevelSortDirection
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Specifies the unique name of the level, which will be sorted.
  	 */
  var levelUniqueName: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * optional="true" Specifies the sort direction. If no direction is specified,the level is going to be sorted in the direction specified by the firstLevelSortDirection option.
  	 *
  	 */
  var sortDirection: js.UndefOr[js.Any] = js.undefined
}

object IgPivotViewPivotGridOptionsLevelSortDirection {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgPivotViewPivotGridOptionsLevelSortDirection
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    levelUniqueName: java.lang.String = null,
    sortDirection: js.Any = null
  ): IgPivotViewPivotGridOptionsLevelSortDirection = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (levelUniqueName != null) __obj.updateDynamic("levelUniqueName")(levelUniqueName)
    if (sortDirection != null) __obj.updateDynamic("sortDirection")(sortDirection)
    __obj.asInstanceOf[IgPivotViewPivotGridOptionsLevelSortDirection]
  }
}

