package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DurationItem extends js.Object {
  def createResponse(
    hours: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    minutes: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    seconds: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): ItemResponse
  def duplicate(): DurationItem
  def getGeneralFeedback(): QuizFeedback
  def getHelpText(): java.lang.String
  def getId(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getPoints(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getTitle(): java.lang.String
  def getType(): ItemType
  def isRequired(): scala.Boolean
  def setGeneralFeedback(feedback: QuizFeedback): DurationItem
  def setHelpText(text: java.lang.String): DurationItem
  def setPoints(points: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): DurationItem
  def setRequired(enabled: scala.Boolean): DurationItem
  def setTitle(title: java.lang.String): DurationItem
}

object DurationItem {
  @scala.inline
  def apply(
    createResponse: js.Function3[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      ItemResponse
    ],
    duplicate: js.Function0[DurationItem],
    getGeneralFeedback: js.Function0[QuizFeedback],
    getHelpText: js.Function0[java.lang.String],
    getId: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getIndex: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getPoints: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getTitle: js.Function0[java.lang.String],
    getType: js.Function0[ItemType],
    isRequired: js.Function0[scala.Boolean],
    setGeneralFeedback: js.Function1[QuizFeedback, DurationItem],
    setHelpText: js.Function1[java.lang.String, DurationItem],
    setPoints: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, DurationItem],
    setRequired: js.Function1[scala.Boolean, DurationItem],
    setTitle: js.Function1[java.lang.String, DurationItem]
  ): DurationItem = {
    val __obj = js.Dynamic.literal(createResponse = createResponse, duplicate = duplicate, getGeneralFeedback = getGeneralFeedback, getHelpText = getHelpText, getId = getId, getIndex = getIndex, getPoints = getPoints, getTitle = getTitle, getType = getType, isRequired = isRequired, setGeneralFeedback = setGeneralFeedback, setHelpText = setHelpText, setPoints = setPoints, setRequired = setRequired, setTitle = setTitle)
  
    __obj.asInstanceOf[DurationItem]
  }
}

