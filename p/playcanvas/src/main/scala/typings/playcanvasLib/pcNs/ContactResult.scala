package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.ContactResult
  * @class Object holding the result of a contact between two Entities
  * @description Create a new ContactResult
  * @param {pc.Entity} other The entity that was involved in the contact with this entity
  * @param {pc.ContactPoint[]} contacts An array of ContactPoints with the other entity
  * @property {pc.Entity} other The entity that was involved in the contact with this entity
  * @property {pc.ContactPoint[]} contacts An array of ContactPoints with the other entity
  */
@JSGlobal("pc.ContactResult")
@js.native
class ContactResult protected () extends js.Object {
  def this(other: Entity, contacts: js.Array[ContactPoint]) = this()
  var contacts: js.Array[ContactPoint] = js.native
  var other: Entity = js.native
}

