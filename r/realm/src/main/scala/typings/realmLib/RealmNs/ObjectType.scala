package typings
package realmLib.RealmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ObjectType
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.html#~ObjectType }
  */
trait ObjectType extends js.Object {
  var `type`: ObjectClass
}

object ObjectType {
  @scala.inline
  def apply(`type`: ObjectClass): ObjectType = {
    val __obj = js.Dynamic.literal(`type` = `type`)
  
    __obj.asInstanceOf[ObjectType]
  }
}

