package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivitySnippet extends js.Object {
  /** The ID that YouTube uses to uniquely identify the channel associated with the activity. */
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  /** Channel title for the channel responsible for this activity */
  var channelTitle: js.UndefOr[java.lang.String] = js.undefined
  /** The description of the resource primarily associated with the activity. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The group ID associated with the activity. A group ID identifies user events that are associated with the same user and resource. For example, if a
    * user rates a video and marks the same video as a favorite, the entries for those events would have the same group ID in the user's activity feed. In
    * your user interface, you can avoid repetition by grouping events with the same groupId value.
    */
  var groupId: js.UndefOr[java.lang.String] = js.undefined
  /** The date and time that the video was uploaded. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. */
  var publishedAt: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A map of thumbnail images associated with the resource that is primarily associated with the activity. For each object in the map, the key is the name
    * of the thumbnail image, and the value is an object that contains other information about the thumbnail.
    */
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
  /** The title of the resource primarily associated with the activity. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** The type of activity that the resource describes. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ActivitySnippet {
  @scala.inline
  def apply(
    channelId: java.lang.String = null,
    channelTitle: java.lang.String = null,
    description: java.lang.String = null,
    groupId: java.lang.String = null,
    publishedAt: java.lang.String = null,
    thumbnails: ThumbnailDetails = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null
  ): ActivitySnippet = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (channelTitle != null) __obj.updateDynamic("channelTitle")(channelTitle)
    if (description != null) __obj.updateDynamic("description")(description)
    if (groupId != null) __obj.updateDynamic("groupId")(groupId)
    if (publishedAt != null) __obj.updateDynamic("publishedAt")(publishedAt)
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ActivitySnippet]
  }
}

