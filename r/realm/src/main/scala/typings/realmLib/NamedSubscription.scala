package typings
package realmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedSubscription extends js.Object {
  var name: java.lang.String
  var objectType: java.lang.String
  var query: java.lang.String
}

object NamedSubscription {
  @scala.inline
  def apply(name: java.lang.String, objectType: java.lang.String, query: java.lang.String): NamedSubscription = {
    val __obj = js.Dynamic.literal(name = name, objectType = objectType, query = query)
  
    __obj.asInstanceOf[NamedSubscription]
  }
}

