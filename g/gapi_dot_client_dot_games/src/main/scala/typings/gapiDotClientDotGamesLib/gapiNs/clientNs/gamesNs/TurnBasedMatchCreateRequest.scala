package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TurnBasedMatchCreateRequest extends js.Object {
  /** Criteria for auto-matching players into this match. */
  var autoMatchingCriteria: js.UndefOr[TurnBasedAutoMatchingCriteria] = js.undefined
  /** The player ids to invite to the match. */
  var invitedPlayerIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#turnBasedMatchCreateRequest. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** A randomly generated numeric ID. This number is used at the server to ensure that the request is handled correctly across retries. */
  var requestId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The variant / mode of the application to be played. This can be any integer value, or left blank. You should use a small number of variants to keep the
    * auto-matching pool as large as possible.
    */
  var variant: js.UndefOr[scala.Double] = js.undefined
}

object TurnBasedMatchCreateRequest {
  @scala.inline
  def apply(
    autoMatchingCriteria: TurnBasedAutoMatchingCriteria = null,
    invitedPlayerIds: js.Array[java.lang.String] = null,
    kind: java.lang.String = null,
    requestId: java.lang.String = null,
    variant: scala.Int | scala.Double = null
  ): TurnBasedMatchCreateRequest = {
    val __obj = js.Dynamic.literal()
    if (autoMatchingCriteria != null) __obj.updateDynamic("autoMatchingCriteria")(autoMatchingCriteria)
    if (invitedPlayerIds != null) __obj.updateDynamic("invitedPlayerIds")(invitedPlayerIds)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (requestId != null) __obj.updateDynamic("requestId")(requestId)
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[TurnBasedMatchCreateRequest]
  }
}

