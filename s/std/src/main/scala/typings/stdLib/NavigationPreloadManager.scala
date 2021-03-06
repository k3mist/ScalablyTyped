package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationPreloadManager extends js.Object {
  def disable(): js.Promise[scala.Unit]
  def enable(): js.Promise[scala.Unit]
  def getState(): js.Promise[NavigationPreloadState]
  def setHeaderValue(value: java.lang.String): js.Promise[scala.Unit]
}

@JSGlobal("NavigationPreloadManager")
@js.native
object NavigationPreloadManager
  extends org.scalablytyped.runtime.Instantiable0[NavigationPreloadManager]

