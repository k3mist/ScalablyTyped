package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Registration extends js.Object {
  /** The Cloud Pub/Sub topic that notifications are to be sent to. */
  var cloudPubsubTopic: js.UndefOr[CloudPubsubTopic] = js.undefined
  /**
    * The time until which the `Registration` is effective.
    *
    * This is a read-only field assigned by the server.
    */
  var expiryTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specification for the class of notifications that Classroom should deliver
    * to the `destination`.
    */
  var feed: js.UndefOr[Feed] = js.undefined
  /**
    * A server-generated unique identifier for this `Registration`.
    *
    * Read-only.
    */
  var registrationId: js.UndefOr[java.lang.String] = js.undefined
}

object Registration {
  @scala.inline
  def apply(
    cloudPubsubTopic: CloudPubsubTopic = null,
    expiryTime: java.lang.String = null,
    feed: Feed = null,
    registrationId: java.lang.String = null
  ): Registration = {
    val __obj = js.Dynamic.literal()
    if (cloudPubsubTopic != null) __obj.updateDynamic("cloudPubsubTopic")(cloudPubsubTopic)
    if (expiryTime != null) __obj.updateDynamic("expiryTime")(expiryTime)
    if (feed != null) __obj.updateDynamic("feed")(feed)
    if (registrationId != null) __obj.updateDynamic("registrationId")(registrationId)
    __obj.asInstanceOf[Registration]
  }
}

