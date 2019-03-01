package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgChartLegendMethods extends js.Object {
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
  	 * Destroys the widget.
  	 */
  def destroy(): scala.Unit
  def exportVisualData(): scala.Unit
  /**
  	 * Returns the ID of the DOM element holding the legend.
  	 */
  def id(): java.lang.String
  /**
  	 * Returns the element holding the legend.
  	 */
  def widget(): scala.Unit
}

object IgChartLegendMethods {
  @scala.inline
  def apply(
    changeGlobalLanguage: js.Function0[scala.Unit],
    changeGlobalRegional: js.Function0[scala.Unit],
    changeLocale: js.Function1[js.Object, scala.Unit],
    destroy: js.Function0[scala.Unit],
    exportVisualData: js.Function0[scala.Unit],
    id: js.Function0[java.lang.String],
    widget: js.Function0[scala.Unit]
  ): IgChartLegendMethods = {
    val __obj = js.Dynamic.literal(changeGlobalLanguage = changeGlobalLanguage, changeGlobalRegional = changeGlobalRegional, changeLocale = changeLocale, destroy = destroy, exportVisualData = exportVisualData, id = id, widget = widget)
  
    __obj.asInstanceOf[IgChartLegendMethods]
  }
}

