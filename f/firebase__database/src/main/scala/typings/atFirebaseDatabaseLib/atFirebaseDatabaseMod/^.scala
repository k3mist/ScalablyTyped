package typings
package atFirebaseDatabaseLib.atFirebaseDatabaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ServerValue: atFirebaseDatabaseLib.Anon_TIMESTAMP = js.native
  def enableLogging(): scala.Unit = js.native
  def enableLogging(logger_ : js.Function1[/* a */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def enableLogging(logger_ : js.Function1[/* a */ java.lang.String, scala.Unit], persistent: scala.Boolean): scala.Unit = js.native
  def enableLogging(logger_ : scala.Boolean): scala.Unit = js.native
  def enableLogging(logger_ : scala.Boolean, persistent: scala.Boolean): scala.Unit = js.native
  def registerDatabase(instance: atFirebaseAppDashTypesLib.atFirebaseAppDashTypesMod.FirebaseNamespace): scala.Unit = js.native
}

