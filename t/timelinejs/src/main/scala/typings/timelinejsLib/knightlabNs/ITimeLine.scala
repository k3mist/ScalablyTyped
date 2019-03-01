package typings
package timelinejsLib.knightlabNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimeLine extends js.Object {
  var asset: js.UndefOr[ITimeLineAsset] = js.undefined
  var date: js.UndefOr[js.Array[ITimelineDate]] = js.undefined
  var era: js.UndefOr[js.Array[ITimelineEra]] = js.undefined
  var headline: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ITimeLine {
  @scala.inline
  def apply(
    asset: ITimeLineAsset = null,
    date: js.Array[ITimelineDate] = null,
    era: js.Array[ITimelineEra] = null,
    headline: java.lang.String = null,
    text: java.lang.String = null,
    `type`: java.lang.String = null
  ): ITimeLine = {
    val __obj = js.Dynamic.literal()
    if (asset != null) __obj.updateDynamic("asset")(asset)
    if (date != null) __obj.updateDynamic("date")(date)
    if (era != null) __obj.updateDynamic("era")(era)
    if (headline != null) __obj.updateDynamic("headline")(headline)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ITimeLine]
  }
}

