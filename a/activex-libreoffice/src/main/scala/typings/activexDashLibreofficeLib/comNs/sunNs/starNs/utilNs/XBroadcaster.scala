package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to control notification behavior of a broadcaster.
  * @since OOo 3.0
  */
trait XBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * suspends broadcasts to the registered listeners.
    *
    * The calls to {@link XBroadcaster.lockBroadcasts()} and {@link XBroadcaster.unlockBroadcasts()} may be nested and even overlapping, but they must be in
    * pairs. While there is at least one lock remaining, no broadcasts are sent to registered listeners.
    */
  def lockBroadcasts(): scala.Unit
  /**
    * resumes the broadcasts which were suspended by {@link XBroadcaster.lockBroadcasts()} .
    *
    * The calls to {@link XBroadcaster.lockBroadcasts()} and {@link XBroadcaster.unlockBroadcasts()} may be nested and even overlapping, but they must be in
    * pairs. While there is at least one lock remaining, no broadcasts are sent to registered listeners.
    *
    * Pending broadcasts will be sent immediately after the last call to {@link XBroadcaster.lockBroadcasts()} is matched by a call to {@link
    * XBroadcaster.unlockBroadcasts()} . An implementation can decide to broadcast all pending notification in order or batch them in single broadcasts.
    */
  def unlockBroadcasts(): scala.Unit
}

object XBroadcaster {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    lockBroadcasts: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    unlockBroadcasts: js.Function0[scala.Unit]
  ): XBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire, lockBroadcasts = lockBroadcasts, queryInterface = queryInterface, release = release, unlockBroadcasts = unlockBroadcasts)
  
    __obj.asInstanceOf[XBroadcaster]
  }
}

