package typings
package amqplibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mechanism extends js.Object {
  var mechanism: java.lang.String
  def response(): nodeLib.Buffer
}

object Anon_Mechanism {
  @scala.inline
  def apply(mechanism: java.lang.String, response: () => nodeLib.Buffer): Anon_Mechanism = {
    val __obj = js.Dynamic.literal(mechanism = mechanism, response = js.Any.fromFunction0(response))
  
    __obj.asInstanceOf[Anon_Mechanism]
  }
}

