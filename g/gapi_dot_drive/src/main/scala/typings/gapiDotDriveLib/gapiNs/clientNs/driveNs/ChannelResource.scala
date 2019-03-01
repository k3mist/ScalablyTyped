package typings
package gapiDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelResource extends js.Object {
  var expiration: scala.Double
  var id: java.lang.String
  var kind: gapiDotDriveLib.gapiDotDriveLibStrings.`api#channel`
  var resourceId: java.lang.String
  var resourceUri: java.lang.String
  var token: java.lang.String
}

object ChannelResource {
  @scala.inline
  def apply(
    expiration: scala.Double,
    id: java.lang.String,
    kind: gapiDotDriveLib.gapiDotDriveLibStrings.`api#channel`,
    resourceId: java.lang.String,
    resourceUri: java.lang.String,
    token: java.lang.String
  ): ChannelResource = {
    val __obj = js.Dynamic.literal(expiration = expiration, id = id, kind = kind, resourceId = resourceId, resourceUri = resourceUri, token = token)
  
    __obj.asInstanceOf[ChannelResource]
  }
}

