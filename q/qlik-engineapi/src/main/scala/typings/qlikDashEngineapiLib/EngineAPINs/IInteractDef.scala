package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * InteractDef
  */
trait IInteractDef extends js.Object {
  /**
    * Buttons displayed in the message box dialog.
    * This property is relevant if qType is IT_MSGBOX.
    * One of:
    *
    * - 0 means that the qButtons property is not relevant.
    * - 17 means that the message box contains the OK and Cancel buttons or the stop-sign icon.
    */
  var qButtons: js.UndefOr[scala.Double] = js.undefined
  /**
    * This property is set to true if the returned statement is an hidden script statement.
    */
  var qHidden: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Is not used in Qlik Sense.
    */
  var qInput: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Next script statement to be executed.
    * This property is used if the type of interaction is IT_SCRIPTLINE.
    */
  var qLine: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Message used in the message box dialog.
    * This property is relevant if qType is IT_MSGBOX.
    */
  var qMsg: js.UndefOr[java.lang.String] = js.undefined
  /**
    * First line number of the next statement to be executed.
    * This property is used if the type of interaction is IT_SCRIPTLINE.
    */
  var qNewLineNr: js.UndefOr[scala.Double] = js.undefined
  /**
    * First line number of the previously executed statement.
    * This property is used if the type of interaction is IT_SCRIPTLINE.
    */
  var qOldLineNr: js.UndefOr[scala.Double] = js.undefined
  /**
    * Path specified by the Include script variable.
    * This property is used if the type of interaction is IT_SCRIPTLINE.
    * Example of an Include variable:
    *
    * $(Include=lib:\\MyDataFiles\abc.txt);
    */
  var qPath: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Not relevant for describing the requested user interaction.
    */
  var qResult: scala.Double
  /**
    * Title used in the message box dialog.
    * This property is relevant if qType is IT_MSGBOX.
    */
  var qTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Interaction type.
    */
  var qType: js.UndefOr[InteractionType] = js.undefined
}

object IInteractDef {
  @scala.inline
  def apply(
    qResult: scala.Double,
    qButtons: scala.Int | scala.Double = null,
    qHidden: js.UndefOr[scala.Boolean] = js.undefined,
    qInput: java.lang.String = null,
    qLine: java.lang.String = null,
    qMsg: java.lang.String = null,
    qNewLineNr: scala.Int | scala.Double = null,
    qOldLineNr: scala.Int | scala.Double = null,
    qPath: java.lang.String = null,
    qTitle: java.lang.String = null,
    qType: InteractionType = null
  ): IInteractDef = {
    val __obj = js.Dynamic.literal(qResult = qResult)
    if (qButtons != null) __obj.updateDynamic("qButtons")(qButtons.asInstanceOf[js.Any])
    if (!js.isUndefined(qHidden)) __obj.updateDynamic("qHidden")(qHidden)
    if (qInput != null) __obj.updateDynamic("qInput")(qInput)
    if (qLine != null) __obj.updateDynamic("qLine")(qLine)
    if (qMsg != null) __obj.updateDynamic("qMsg")(qMsg)
    if (qNewLineNr != null) __obj.updateDynamic("qNewLineNr")(qNewLineNr.asInstanceOf[js.Any])
    if (qOldLineNr != null) __obj.updateDynamic("qOldLineNr")(qOldLineNr.asInstanceOf[js.Any])
    if (qPath != null) __obj.updateDynamic("qPath")(qPath)
    if (qTitle != null) __obj.updateDynamic("qTitle")(qTitle)
    if (qType != null) __obj.updateDynamic("qType")(qType)
    __obj.asInstanceOf[IInteractDef]
  }
}

