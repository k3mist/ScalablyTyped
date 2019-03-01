package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for customizing what data is returned and how it is formatted.
  */
trait GetSelectedDataOptions extends js.Object {
  /**
    * A user-defined item of any type that is returned, unchanged, in the asyncContext property of the AsyncResult object that is passed to a callback.
    */
  var asyncContext: js.UndefOr[js.Any] = js.undefined
  /**
    * Specify whether to get only the visible (that is, filtered-in) data or all the data. Useful when filtering data. 
    * Use {@link Office.FilterType} or string equivalent. This parameter is ignored in Word documents.
    */
  var filterType: js.UndefOr[FilterType | java.lang.String] = js.undefined
  /**
    * Specify whether the data is formatted. Use Office.ValueFormat or string equivalent.
    */
  var valueFormat: js.UndefOr[ValueFormat | java.lang.String] = js.undefined
}

object GetSelectedDataOptions {
  @scala.inline
  def apply(
    asyncContext: js.Any = null,
    filterType: FilterType | java.lang.String = null,
    valueFormat: ValueFormat | java.lang.String = null
  ): GetSelectedDataOptions = {
    val __obj = js.Dynamic.literal()
    if (asyncContext != null) __obj.updateDynamic("asyncContext")(asyncContext)
    if (filterType != null) __obj.updateDynamic("filterType")(filterType.asInstanceOf[js.Any])
    if (valueFormat != null) __obj.updateDynamic("valueFormat")(valueFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSelectedDataOptions]
  }
}

