package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotViewMethods extends js.Object {
  /**
  	 * Changes the widget language to global language. Global language is the value in $.ig.util.language
  	 */
  def changeGlobalLanguage(): scala.Unit
  /**
  	 * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
  	 */
  def changeGlobalRegional(): scala.Unit
  /**
  	 * Changes the all locales contained into a specified container to the language specified in [options.language](ui.igwidget#options:language)
  	 * Note that this method is for rare scenarios, use [language](ui.igwidget#options:language) or [locale](ui.igwidget#options:locale) option setter
  	 *
  	 * @param $container Optional parameter - if not set it would use the element of the widget as $container
  	 */
  def changeLocale($container: js.Object): scala.Unit
  /**
  	 * Returns the igPivotDataSelector instance of the pivot view.
  	 */
  def dataSelector(): js.Object
  /**
  	 * Destroy is part of the jQuery UI widget API and does the following:
  	 * 1. Remove custom CSS classes that were added.
  	 * 2. Unwrap any wrapping elements such as scrolling divs and other containers.
  	 * 3. Unbind all events that were bound.
  	 */
  def destroy(): scala.Unit
  /**
  	 * Returns the igPivotGrid instance of the pivot view.
  	 */
  def pivotGrid(): js.Object
  /**
  	 * Returns the igSplitter instance used to separate the pivot grid and the data selector.
  	 */
  def splitter(): js.Object
}

object IgPivotViewMethods {
  @scala.inline
  def apply(
    changeGlobalLanguage: js.Function0[scala.Unit],
    changeGlobalRegional: js.Function0[scala.Unit],
    changeLocale: js.Function1[js.Object, scala.Unit],
    dataSelector: js.Function0[js.Object],
    destroy: js.Function0[scala.Unit],
    pivotGrid: js.Function0[js.Object],
    splitter: js.Function0[js.Object]
  ): IgPivotViewMethods = {
    val __obj = js.Dynamic.literal(changeGlobalLanguage = changeGlobalLanguage, changeGlobalRegional = changeGlobalRegional, changeLocale = changeLocale, dataSelector = dataSelector, destroy = destroy, pivotGrid = pivotGrid, splitter = splitter)
  
    __obj.asInstanceOf[IgPivotViewMethods]
  }
}

