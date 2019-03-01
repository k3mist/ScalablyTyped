package typings
package twitchDashExtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result object as passed to the onAuthorized callback.
  *
  * @see TwitchExt.onAuthorized
  */
trait TwitchExtAuthorized extends js.Object {
  /**
  	 * Channel ID of the page where the extension is iframe embedded.
  	 */
  var channelId: java.lang.String
  /**
  	 * Client ID of the extension.
  	 */
  var clientId: java.lang.String
  /**
  	 * JWT that should be passed to any EBS call for authentication.
  	 */
  var token: java.lang.String
  /**
  	 * Opaque user ID.
  	 */
  var userId: java.lang.String
}

object TwitchExtAuthorized {
  @scala.inline
  def apply(
    channelId: java.lang.String,
    clientId: java.lang.String,
    token: java.lang.String,
    userId: java.lang.String
  ): TwitchExtAuthorized = {
    val __obj = js.Dynamic.literal(channelId = channelId, clientId = clientId, token = token, userId = userId)
  
    __obj.asInstanceOf[TwitchExtAuthorized]
  }
}

