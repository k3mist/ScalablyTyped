package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormResponse extends js.Object {
  def getEditResponseUrl(): java.lang.String
  def getGradableItemResponses(): js.Array[ItemResponse]
  def getGradableResponseForItem(item: Item): ItemResponse
  def getId(): java.lang.String
  def getItemResponses(): js.Array[ItemResponse]
  def getRespondentEmail(): java.lang.String
  def getResponseForItem(item: Item): ItemResponse
  def getTimestamp(): stdLib.Date
  def submit(): FormResponse
  def toPrefilledUrl(): java.lang.String
  def withItemGrade(gradedResponse: ItemResponse): FormResponse
  def withItemResponse(response: ItemResponse): FormResponse
}

object FormResponse {
  @scala.inline
  def apply(
    getEditResponseUrl: js.Function0[java.lang.String],
    getGradableItemResponses: js.Function0[js.Array[ItemResponse]],
    getGradableResponseForItem: js.Function1[Item, ItemResponse],
    getId: js.Function0[java.lang.String],
    getItemResponses: js.Function0[js.Array[ItemResponse]],
    getRespondentEmail: js.Function0[java.lang.String],
    getResponseForItem: js.Function1[Item, ItemResponse],
    getTimestamp: js.Function0[stdLib.Date],
    submit: js.Function0[FormResponse],
    toPrefilledUrl: js.Function0[java.lang.String],
    withItemGrade: js.Function1[ItemResponse, FormResponse],
    withItemResponse: js.Function1[ItemResponse, FormResponse]
  ): FormResponse = {
    val __obj = js.Dynamic.literal(getEditResponseUrl = getEditResponseUrl, getGradableItemResponses = getGradableItemResponses, getGradableResponseForItem = getGradableResponseForItem, getId = getId, getItemResponses = getItemResponses, getRespondentEmail = getRespondentEmail, getResponseForItem = getResponseForItem, getTimestamp = getTimestamp, submit = submit, toPrefilledUrl = toPrefilledUrl, withItemGrade = withItemGrade, withItemResponse = withItemResponse)
  
    __obj.asInstanceOf[FormResponse]
  }
}

