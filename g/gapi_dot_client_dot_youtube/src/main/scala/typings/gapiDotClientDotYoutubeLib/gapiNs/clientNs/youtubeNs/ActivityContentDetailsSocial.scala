package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityContentDetailsSocial extends js.Object {
  /** The author of the social network post. */
  var author: js.UndefOr[java.lang.String] = js.undefined
  /** An image of the post's author. */
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The URL of the social network post. */
  var referenceUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The resourceId object encapsulates information that identifies the resource associated with a social network post. */
  var resourceId: js.UndefOr[ResourceId] = js.undefined
  /** The name of the social network. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ActivityContentDetailsSocial {
  @scala.inline
  def apply(
    author: java.lang.String = null,
    imageUrl: java.lang.String = null,
    referenceUrl: java.lang.String = null,
    resourceId: ResourceId = null,
    `type`: java.lang.String = null
  ): ActivityContentDetailsSocial = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (referenceUrl != null) __obj.updateDynamic("referenceUrl")(referenceUrl)
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ActivityContentDetailsSocial]
  }
}

