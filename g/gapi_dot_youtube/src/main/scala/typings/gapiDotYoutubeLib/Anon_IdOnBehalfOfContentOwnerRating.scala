package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdOnBehalfOfContentOwnerRating extends js.Object {
  /**
    * The id parameter specifies the YouTube video ID.
    */
  var id: java.lang.String
  /**
    * The onBehalfOfContentOwner parameter indicates that the authenticated user is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with needs to be linked to the specified YouTube content owner.
    */
  var onBehalfOfContentOwner: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies the rating to record.
    */
  var rating: java.lang.String
}

object Anon_IdOnBehalfOfContentOwnerRating {
  @scala.inline
  def apply(id: java.lang.String, rating: java.lang.String, onBehalfOfContentOwner: java.lang.String = null): Anon_IdOnBehalfOfContentOwnerRating = {
    val __obj = js.Dynamic.literal(id = id, rating = rating)
    if (onBehalfOfContentOwner != null) __obj.updateDynamic("onBehalfOfContentOwner")(onBehalfOfContentOwner)
    __obj.asInstanceOf[Anon_IdOnBehalfOfContentOwnerRating]
  }
}

