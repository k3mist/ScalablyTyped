package typings
package atAngularCoreLib.srcZoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/zone", "NgZone")
@js.native
class NgZone protected ()
  extends atAngularCoreLib.srcZoneNgUnderscoreZoneMod.NgZone {
  def this(hasEnableLongStackTrace: atAngularCoreLib.Anon_EnableLongStackTrace) = this()
}

/* static members */
@JSImport("@angular/core/src/zone", "NgZone")
@js.native
object NgZone extends js.Object {
  def assertInAngularZone(): scala.Unit = js.native
  def assertNotInAngularZone(): scala.Unit = js.native
  def isInAngularZone(): scala.Boolean = js.native
}

