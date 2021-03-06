package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushtokensResource extends js.Object {
  /** Removes a push token for the current user and application. Removing a non-existent push token will report success. */
  def remove(request: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Registers a push token for the current user and application. */
  def update(request: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
}

object PushtokensResource {
  @scala.inline
  def apply(
    remove: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFields => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    update: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFields => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  ): PushtokensResource = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction1(remove), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[PushtokensResource]
  }
}

