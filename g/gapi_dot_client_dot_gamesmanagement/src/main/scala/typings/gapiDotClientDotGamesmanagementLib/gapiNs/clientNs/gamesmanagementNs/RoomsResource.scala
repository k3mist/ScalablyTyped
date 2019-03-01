package typings
package gapiDotClientDotGamesmanagementLib.gapiNs.clientNs.gamesmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomsResource extends js.Object {
  /**
    * Reset all rooms for the currently authenticated player for your application. This method is only accessible to whitelisted tester accounts for your
    * application.
    */
  def reset(request: gapiDotClientDotGamesmanagementLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /**
    * Deletes rooms where the only room participants are from whitelisted tester accounts for your application. This method is only available to user
    * accounts for your developer console.
    */
  def resetForAllPlayers(request: gapiDotClientDotGamesmanagementLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
}

object RoomsResource {
  @scala.inline
  def apply(
    reset: js.Function1[
      gapiDotClientDotGamesmanagementLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    resetForAllPlayers: js.Function1[
      gapiDotClientDotGamesmanagementLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ]
  ): RoomsResource = {
    val __obj = js.Dynamic.literal(reset = reset, resetForAllPlayers = resetForAllPlayers)
  
    __obj.asInstanceOf[RoomsResource]
  }
}

