package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcludedContentLabel
  extends AdWordsEntity
     with isCampaignChild {
  def getCampaignType(): CampaignType
  def getContentLabelType(): java.lang.String
   // TODO: ContentLabelType
  def getId(): scala.Double
  def getVideoCampaign(): Campaign
   // TODO: VideoCampaign
  def remove(): scala.Unit
}

object ExcludedContentLabel {
  @scala.inline
  def apply(
    getCampaign: js.Function0[Campaign],
    getCampaignType: js.Function0[CampaignType],
    getContentLabelType: js.Function0[java.lang.String],
    getId: js.Function0[scala.Double],
    getVideoCampaign: js.Function0[Campaign],
    remove: js.Function0[scala.Unit],
    getEntityType: js.Function0[java.lang.String] = null
  ): ExcludedContentLabel = {
    val __obj = js.Dynamic.literal(getCampaign = getCampaign, getCampaignType = getCampaignType, getContentLabelType = getContentLabelType, getId = getId, getVideoCampaign = getVideoCampaign, remove = remove)
    if (getEntityType != null) __obj.updateDynamic("getEntityType")(getEntityType)
    __obj.asInstanceOf[ExcludedContentLabel]
  }
}

