package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attachment extends js.Object {
  /** Google Drive file attachment. */
  var driveFile: js.UndefOr[DriveFile] = js.undefined
  /** Google Forms attachment. */
  var form: js.UndefOr[Form] = js.undefined
  /** Link attachment. */
  var link: js.UndefOr[Link] = js.undefined
  /** Youtube video attachment. */
  var youTubeVideo: js.UndefOr[YouTubeVideo] = js.undefined
}

object Attachment {
  @scala.inline
  def apply(
    driveFile: DriveFile = null,
    form: Form = null,
    link: Link = null,
    youTubeVideo: YouTubeVideo = null
  ): Attachment = {
    val __obj = js.Dynamic.literal()
    if (driveFile != null) __obj.updateDynamic("driveFile")(driveFile)
    if (form != null) __obj.updateDynamic("form")(form)
    if (link != null) __obj.updateDynamic("link")(link)
    if (youTubeVideo != null) __obj.updateDynamic("youTubeVideo")(youTubeVideo)
    __obj.asInstanceOf[Attachment]
  }
}

