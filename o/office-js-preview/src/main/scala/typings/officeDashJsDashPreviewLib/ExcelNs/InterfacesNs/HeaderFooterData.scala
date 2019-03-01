package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "headerFooter.toJSON()". */
trait HeaderFooterData extends js.Object {
  /**
    *
    * Gets or sets the center footer of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/en-us/library/bb225426.aspx.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var centerFooter: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the center header of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/en-us/library/bb225426.aspx.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var centerHeader: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the left footer of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/en-us/library/bb225426.aspx.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var leftFooter: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the left header of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/en-us/library/bb225426.aspx.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var leftHeader: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the right footer of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/en-us/library/bb225426.aspx.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var rightFooter: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the right header of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/en-us/library/bb225426.aspx.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var rightHeader: js.UndefOr[java.lang.String] = js.undefined
}

object HeaderFooterData {
  @scala.inline
  def apply(
    centerFooter: java.lang.String = null,
    centerHeader: java.lang.String = null,
    leftFooter: java.lang.String = null,
    leftHeader: java.lang.String = null,
    rightFooter: java.lang.String = null,
    rightHeader: java.lang.String = null
  ): HeaderFooterData = {
    val __obj = js.Dynamic.literal()
    if (centerFooter != null) __obj.updateDynamic("centerFooter")(centerFooter)
    if (centerHeader != null) __obj.updateDynamic("centerHeader")(centerHeader)
    if (leftFooter != null) __obj.updateDynamic("leftFooter")(leftFooter)
    if (leftHeader != null) __obj.updateDynamic("leftHeader")(leftHeader)
    if (rightFooter != null) __obj.updateDynamic("rightFooter")(rightFooter)
    if (rightHeader != null) __obj.updateDynamic("rightHeader")(rightHeader)
    __obj.asInstanceOf[HeaderFooterData]
  }
}

