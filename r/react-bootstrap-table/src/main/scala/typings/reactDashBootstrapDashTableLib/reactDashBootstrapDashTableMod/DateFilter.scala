package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateFilter extends _Filter {
  /**
  	 * Date filter comparators
  	 */
  var dateComparators: js.UndefOr[js.Array[FilterComparator]] = js.undefined
  /**
  	 * Default value for the filter.
  	 */
  var defaultValue: js.UndefOr[reactDashBootstrapDashTableLib.Anon_ComparatorDate] = js.undefined
  /**
  	 * Delay time in milliseconds after the last key press prior to applying the filter. Defaults to 500ms.
  	 */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * CSS Style to use for the select filter.
  	 */
  var style: js.UndefOr[reactDashBootstrapDashTableLib.Anon_ComparatorDateCSSProperties] = js.undefined
  /**
  	 * Filter type must be 'DateFilter'
  	 */
  var `type`: reactDashBootstrapDashTableLib.reactDashBootstrapDashTableLibStrings.DateFilter
}

