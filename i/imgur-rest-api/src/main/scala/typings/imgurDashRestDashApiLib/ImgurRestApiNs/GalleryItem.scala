package typings
package imgurDashRestDashApiLib.ImgurRestApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GalleryItem extends js.Object {
  var account_id: js.UndefOr[scala.Double] = js.undefined
  var account_url: js.UndefOr[java.lang.String] = js.undefined
  var comment_count: scala.Double
  var datetime: scala.Double
  var description: java.lang.String
  var downs: scala.Double
  var favorite: scala.Boolean
  var id: java.lang.String
  var is_album: scala.Boolean
  var link: java.lang.String
  var nsfw: js.UndefOr[scala.Boolean] = js.undefined
  var score: scala.Double
  var title: java.lang.String
  var topic: java.lang.String
  var topic_id: scala.Double
  var ups: scala.Double
  var views: scala.Double
  var vote: js.UndefOr[java.lang.String] = js.undefined
}

object GalleryItem {
  @scala.inline
  def apply(
    comment_count: scala.Double,
    datetime: scala.Double,
    description: java.lang.String,
    downs: scala.Double,
    favorite: scala.Boolean,
    id: java.lang.String,
    is_album: scala.Boolean,
    link: java.lang.String,
    score: scala.Double,
    title: java.lang.String,
    topic: java.lang.String,
    topic_id: scala.Double,
    ups: scala.Double,
    views: scala.Double,
    account_id: scala.Int | scala.Double = null,
    account_url: java.lang.String = null,
    nsfw: js.UndefOr[scala.Boolean] = js.undefined,
    vote: java.lang.String = null
  ): GalleryItem = {
    val __obj = js.Dynamic.literal(comment_count = comment_count, datetime = datetime, description = description, downs = downs, favorite = favorite, id = id, is_album = is_album, link = link, score = score, title = title, topic = topic, topic_id = topic_id, ups = ups, views = views)
    if (account_id != null) __obj.updateDynamic("account_id")(account_id.asInstanceOf[js.Any])
    if (account_url != null) __obj.updateDynamic("account_url")(account_url)
    if (!js.isUndefined(nsfw)) __obj.updateDynamic("nsfw")(nsfw)
    if (vote != null) __obj.updateDynamic("vote")(vote)
    __obj.asInstanceOf[GalleryItem]
  }
}

