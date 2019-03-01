package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoAgeGating extends js.Object {
  /**
    * Indicates whether or not the video has alcoholic beverage content. Only users of legal purchasing age in a particular country, as identified by ICAP,
    * can view the content.
    */
  var alcoholContent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Age-restricted trailers. For redband trailers and adult-rated video-games. Only users aged 18+ can view the content. The the field is true the content
    * is restricted to viewers aged 18+. Otherwise The field won't be present.
    */
  var restricted: js.UndefOr[scala.Boolean] = js.undefined
  /** Video game rating, if any. */
  var videoGameRating: js.UndefOr[java.lang.String] = js.undefined
}

object VideoAgeGating {
  @scala.inline
  def apply(
    alcoholContent: js.UndefOr[scala.Boolean] = js.undefined,
    restricted: js.UndefOr[scala.Boolean] = js.undefined,
    videoGameRating: java.lang.String = null
  ): VideoAgeGating = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alcoholContent)) __obj.updateDynamic("alcoholContent")(alcoholContent)
    if (!js.isUndefined(restricted)) __obj.updateDynamic("restricted")(restricted)
    if (videoGameRating != null) __obj.updateDynamic("videoGameRating")(videoGameRating)
    __obj.asInstanceOf[VideoAgeGating]
  }
}

