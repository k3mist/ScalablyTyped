package typings
package qlikLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_App extends js.Object {
  def getContent(
    variable: java.lang.String,
    callback: js.Function2[/* value */ qlikLib.qlikMod.Variable, /* app */ this.type, scala.Unit]
  ): js.Promise[_]
  def setContent(variable: java.lang.String, value: java.lang.String): scala.Unit
}

object Anon_App {
  @scala.inline
  def apply(
    getContent: js.Function2[
      java.lang.String, 
      js.Function2[/* value */ qlikLib.qlikMod.Variable, Anon_App, scala.Unit], 
      js.Promise[_]
    ],
    setContent: js.Function2[java.lang.String, java.lang.String, scala.Unit]
  ): Anon_App = {
    val __obj = js.Dynamic.literal(getContent = getContent, setContent = setContent)
  
    __obj.asInstanceOf[Anon_App]
  }
}

