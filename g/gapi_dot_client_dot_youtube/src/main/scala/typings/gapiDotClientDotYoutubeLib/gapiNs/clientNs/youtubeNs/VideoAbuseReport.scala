package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoAbuseReport extends js.Object {
  /** Additional comments regarding the abuse report. */
  var comments: js.UndefOr[java.lang.String] = js.undefined
  /** The language that the content was viewed in. */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /** The high-level, or primary, reason that the content is abusive. The value is an abuse report reason ID. */
  var reasonId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The specific, or secondary, reason that this content is abusive (if available). The value is an abuse report reason ID that is a valid secondary reason
    * for the primary reason.
    */
  var secondaryReasonId: js.UndefOr[java.lang.String] = js.undefined
  /** The ID that YouTube uses to uniquely identify the video. */
  var videoId: js.UndefOr[java.lang.String] = js.undefined
}

object VideoAbuseReport {
  @scala.inline
  def apply(
    comments: java.lang.String = null,
    language: java.lang.String = null,
    reasonId: java.lang.String = null,
    secondaryReasonId: java.lang.String = null,
    videoId: java.lang.String = null
  ): VideoAbuseReport = {
    val __obj = js.Dynamic.literal()
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (language != null) __obj.updateDynamic("language")(language)
    if (reasonId != null) __obj.updateDynamic("reasonId")(reasonId)
    if (secondaryReasonId != null) __obj.updateDynamic("secondaryReasonId")(secondaryReasonId)
    if (videoId != null) __obj.updateDynamic("videoId")(videoId)
    __obj.asInstanceOf[VideoAbuseReport]
  }
}

