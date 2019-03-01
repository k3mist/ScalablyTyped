package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridSummariesLocale
  extends /**
	 * Option for IgGridSummariesLocale
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Text of the button Cancel in the summaries dropdown
  	 *
  	 */
  var dialogButtonCancelText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Text of the button OK in the summaries dropdown
  	 *
  	 */
  var dialogButtonOKText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Empty text template to be shown for empty cells
  	 *
  	 */
  var emptyCellText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get or set text that is shown in the feature chooser dropdown when summaries are hidden
  	 *
  	 */
  var featureChooserText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get or set text that is shown in the feauture chooser dropdown when summaries are shown
  	 *
  	 */
  var featureChooserTextHide: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Tooltip text for header cell button
  	 *
  	 */
  var summariesHeaderButtonTooltip: js.UndefOr[java.lang.String] = js.undefined
}

object IgGridSummariesLocale {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgGridSummariesLocale
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    dialogButtonCancelText: java.lang.String = null,
    dialogButtonOKText: java.lang.String = null,
    emptyCellText: java.lang.String = null,
    featureChooserText: java.lang.String = null,
    featureChooserTextHide: java.lang.String = null,
    summariesHeaderButtonTooltip: java.lang.String = null
  ): IgGridSummariesLocale = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (dialogButtonCancelText != null) __obj.updateDynamic("dialogButtonCancelText")(dialogButtonCancelText)
    if (dialogButtonOKText != null) __obj.updateDynamic("dialogButtonOKText")(dialogButtonOKText)
    if (emptyCellText != null) __obj.updateDynamic("emptyCellText")(emptyCellText)
    if (featureChooserText != null) __obj.updateDynamic("featureChooserText")(featureChooserText)
    if (featureChooserTextHide != null) __obj.updateDynamic("featureChooserTextHide")(featureChooserTextHide)
    if (summariesHeaderButtonTooltip != null) __obj.updateDynamic("summariesHeaderButtonTooltip")(summariesHeaderButtonTooltip)
    __obj.asInstanceOf[IgGridSummariesLocale]
  }
}

